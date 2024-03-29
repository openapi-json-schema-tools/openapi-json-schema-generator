#!/bin/bash

# grep for '<<<<<<< HEAD' in openapi-generator
grep -RUIl '<<<<<<< HEAD' src

if [ $? -ne 1 ]; then
    echo "src contain merge conflicts '<<<<<<< HEAD'. Please remove it and try again."
    exit 1;
fi

# grep for '<<<<<<< HEAD' in the samples
grep -RUIl '<<<<<<< HEAD' samples/

if [ $? -ne 1 ]; then
    echo "samples/ contain merge conflicts '<<<<<<< HEAD'. Please remove it and try again."
    exit 1;
fi
