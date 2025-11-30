#!/bin/bash

SRC_DIR=$(pwd)
cd ../box2d-native/build-wasm

emmake make -j8

cp -v box2d-wasm.mjs $SRC_DIR/dist/
cp -v box2d-wasm.wasm $SRC_DIR/dist/
