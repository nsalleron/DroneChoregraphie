#!/bin/bash

echo "--- Generating toStrings for DroneDSL grammar ---"
bash ./scriptAddToStringMain.sh
echo "--- Generating toStrings for DroneDSLLib grammar ---"
bash ./scriptAddToStringLib.sh