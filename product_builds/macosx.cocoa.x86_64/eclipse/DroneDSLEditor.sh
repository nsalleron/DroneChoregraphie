#/bin/sh
cp -f ./MacOS/DroneDSLEditor ./DroneDSLEditor.app/Contents/MacOS/
xattr -d com.apple.quarantine ./* 2> /dev/null
echo $(pwd)/DroneDSLEditor.app
open -a $(pwd)/DroneDSLEditor.app
