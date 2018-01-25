package fr.idmteam1.idmproject.dronedsl.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DroneDSLGenerationHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator2 generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("DroneDSLGenerationHandler");
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
		if (file != null) {
			IProject project = file.getProject();
			IFolder srcFolder = project.getFolder("src");
			if (!srcFolder.exists()) {
				try {
					srcFolder.create(true, true, new NullProgressMonitor());
				} catch (CoreException e) {
					return null;
				}
			}

			final EclipseResourceFileSystemAccess fsa = fileAccessProvider.get();
			fsa.setOutputPath(srcFolder.getFullPath().toString());

			if (activeEditor instanceof XtextEditor) {
				((XtextEditor) activeEditor).getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {

					@Override
					public Boolean exec(XtextResource state) throws Exception {
						System.out.println("XtextResource exec");
						generator.doGenerate(state, fsa, null);
						return Boolean.TRUE;
					}
				});

			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
