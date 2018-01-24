#/bin/sh
PATH=$PATH:$(pwd)/runtime_macOS/bebop2/bin
cp -f ./MacOS/DroneDSLEditor ./DroneDSLEditor.app/Contents/MacOS/
xattr -d com.apple.quarantine ./* 2> /dev/null
echo $(pwd)/DroneDSLEditor.app
open $(pwd)/DroneDSLEditor.app
