#!/bin/bash
#
# A bash script to run CircleCI node/test in parallel
#

NODE_INDEX=${CIRCLE_NODE_INDEX:-0}

set -e

export NODE_ENV=test

function cleanup {
  # Show logs of 'petstore.swagger' container to troubleshoot Unit Test failures, if any.
  if [ "$NODE_INDEX" != "4" ]; then
    docker logs petstore.swagger # container name specified in circle.yml
  fi
}

trap cleanup EXIT

if [ "$NODE_INDEX" = "1" ]; then
  echo "Running node $NODE_INDEX"

elif [ "$NODE_INDEX" = "2" ]; then
  echo "Running node $NODE_INDEX"

elif [ "$NODE_INDEX" = "3" ]; then

  echo "Running node $NODE_INDEX to test 'samples.circleci.node3' defined in pom.xml ..."
  #wget https://www.python.org/ftp/python/3.8.9/Python-3.8.9.tgz
  #tar -xf Python-3.8.9.tgz
  #cd Python-3.8.9
  #./configure --enable-optimizations
  #sudo make altinstall
  pyenv install --list 
  pyenv install 3.6.3
  pyenv install 2.7.14
  pyenv global 3.6.3

  # Install node@stable (for angular 6)
  set +e
  curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.11/install.sh | bash
  export NVM_DIR="/opt/circleci/.nvm"
  [ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"
  #nvm install stable
  # install v16 instead of the latest stable version
  nvm install 16
  nvm alias default 16
  node --version

  # Each step uses the same `$BASH_ENV`, so need to modify it
  echo 'export NVM_DIR="/opt/circleci/.nvm"' >> $BASH_ENV
  echo "[ -s \"$NVM_DIR/nvm.sh\" ] && . \"$NVM_DIR/nvm.sh\"" >> $BASH_ENV

  mvn --no-snapshot-updates --quiet verify -Psamples.circleci.node3 -Dorg.slf4j.simpleLogger.defaultLogLevel=error

elif [ "$NODE_INDEX" = "4" ]; then
  echo "Running node $NODE_INDEX to test 'samples.circleci.node4' defined in pom.xml ..."

  #mvn --no-snapshot-updates --quiet verify -Psamples.circleci.node4 -Dorg.slf4j.simpleLogger.defaultLogLevel=error
  (cd samples/openapi3/client/petstore/python && make test)
  (cd samples/openapi3/client/petstore/python-prior && make test)
  (cd samples/openapi3/client/3_0_3_unit_test/python && make test)

else
  echo "Running node $NODE_INDEX"

fi


