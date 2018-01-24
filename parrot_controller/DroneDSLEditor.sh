#/bin/sh
executed=0
if [ "$(basename $0)" = "native-darwin-wrapper.sh" ]; then
	echo $(dirname $0)
	SCRIPT_PATH=$(cd $(dirname $0) && pwd -P)
	executed=1
elif [ -n "${BASH_SOURCE}" ]; then
	# Sourced by bash
	SCRIPT_PATH=$(cd $(dirname ${BASH_SOURCE}) && pwd -P)
elif [ -n "${ZSH_VERSION}" ]; then
	# Sourced by zsh
	SCRIPT_PATH=$(cd $(dirname ${(%):-%N}) && pwd -P)
else
	echo "Unsupported shell"
fi

ROBOTICIENS_TMP=/runtime_macOS/bebop2/bin
SYSROOT=${SCRIPT_PATH}${ROBOTICIENS_TMP}
export ROBOTICIENS_PATH=${SYSROOT}
echo ${ROBOTICIENS_PATH}
cp -f ./MacOS/DroneDSLEditor ./DroneDSLEditor.app/Contents/MacOS/
xattr -d com.apple.quarantine ./* 2> /dev/null
echo $(pwd)/DroneDSLEditor.app
open $(pwd)/DroneDSLEditor.app
