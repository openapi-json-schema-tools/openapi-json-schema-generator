#!/bin/bash

SETUP_OUT=*.egg-info
VENV=venv
DEACTIVE=false

export LC_ALL=en_US.UTF-8
export LANG=en_US.UTF-8

# set virtualenv
if [ -z "$VENVV" ]; then
		python3 -m venv $VENV
		source $VENV/bin/activate
    DEACTIVE=true
fi

# install dependencies
pip install tox
# locally install the package, needed for pycharm problem checking
python -m pip install .

# run tests
tox || exit 1
pip install mypy==1.8.0
# run mypy, static type checking
mypy src/petstore_api

# static analysis of code
#flake8 --show-source petstore_api/

# deactivate virtualenv
#if [ $DEACTIVE == true ]; then
#    deactivate
#fi
