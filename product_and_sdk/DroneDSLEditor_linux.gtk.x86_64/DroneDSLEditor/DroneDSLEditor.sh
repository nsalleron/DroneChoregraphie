#/bin/sh

#PLATFORM
platform='unknown'
unamestr=`uname`

#Vérification des dépendances
if [ "$1" == "install" ]; then
	if [[ "$unamestr" == 'Linux' ]]; then
		echo -> Installation des dépendances.
		apt-get install bash
		apt-get install coreutils
		apt-get install gettext
		apt-get install pkgconfig
		apt-get install wget
		apt-get install python
		apt-get install python3
		apt-get install autoconf
		apt-get install libtool
		apt-get upgrade
	elif [[ "$unamestr" == 'Darwin' ]]; then
		echo "-> Vérification de brew"
		if ! type "brew" > /dev/null; then
			/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
		fi
		echo "-> Installation des dépendances."
		brew install bash coreutils gettext pkgconfig wget python python3 autoconf libtool 2> ./logfile_brew
	fi
	rm -rf SDK_PARROT 2> /dev/null
fi

mkdir SDK_PARROT 2> /dev/null
cd SDK_PARROT/

if [ -e ./packages/Samples/Unix/BebopSample/BebopSample.c ]
then
	echo "La configuration est bonne."
else
	echo "Les fichiers ne sont pas présent."
	# Récupération de la commande repo
	mkdir ~/bin
	PATH=~/bin:$PATH
	curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
	chmod a+x ~/bin/repo

	# Récupération du git et MAJ via repo
	repo init -u https://github.com/Parrot-Developers/arsdk_manifests.git -m release.xml 2> ../logfile_repo
	repo sync
	
	# Copie des fichiers BebopSample Runtime
	rm ./packages/Samples/Unix/BebopSample/BebopSample.c
	cp ../runtime/BebopSample.c ./packages/Samples/Unix/BebopSample/
	cp ../runtime/BebopSample.h ./packages/Samples/Unix/BebopSample/
	
	
	# Build du sdk
	echo "-> Vérification du sdk"
	./build.sh -p arsdk-native -t build-sample-BebopSample -j 2> ../logfile_build
	mv ./out/arsdk-native/staging/usr/bin/BebopSample ./out/arsdk-native/staging/usr/bin/les_roboticiens_runtime_bebop2

fi




#IF MACOS
if [[ "$unamestr" == 'Linux' ]]; then
   source ./out/arsdk-native/staging/native-wrapper.sh
elif [[ "$unamestr" == 'Darwin' ]]; then
   source ./out/arsdk-native/staging/native-darwin-wrapper.sh
fi

ROBOTICIENS_TMP=/usr/bin/
SYSROOT=${SCRIPT_PATH}${ROBOTICIENS_TMP}
export ROBOTICIENS_PATH=${SYSROOT}
echo ${ROBOTICIENS_PATH}

cd ..
if [[ "$unamestr" == 'Linux' ]]; then
	./DroneDSLEditor
elif [[ "$unamestr" == 'Darwin' ]]; then
	cp -f ./MacOS/DroneDSLEditor ./DroneDSLEditor.app/Contents/MacOS/
	xattr -d com.apple.quarantine ./* 2> /dev/null
	echo $(pwd)/DroneDSLEditor.app
	open $(pwd)/DroneDSLEditor.app
fi
