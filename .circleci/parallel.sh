#!/bin/bash
#
# A bash script to run CircleCI node/test in parallel
#

JOB_ID=${CIRCLE_JOB_ID:-0}

set -e

export NODE_ENV=test

function cleanup {
  # Show logs of 'petstore.swagger' container to troubleshoot Unit Test failures, if any.
  if [ "$JOB_ID" != "3" ]; then
    docker logs petstore.swagger # container name specified in circle.yml
  fi
}

trap cleanup EXIT

if [ "$JOB_ID" = "1" ]; then
  # node1
  # ensures samples + docs up to date
  echo "Running job $JOB_ID"

  ./bin/utils/ensure-up-to-date

elif [ "$NODE_ID" = "2" ]; then
  # node2
  echo "Running job $JOB_ID"

elif [ "$NODE_ID" = "3" ]; then
  # node4

  echo "Running job $JOB_ID to test python client samples ..."

  (cd samples/client/petstore/python && make test)
  (cd samples/client/3_0_3_unit_test/python && make test)
  (cd samples/client/openapi_features/nonCompliantUseDiscriminatorIfCompositionFails/python && make test)
  (cd samples/client/openapi_features/security/python && make test)

else
  echo "Running job $JOB_ID"

fi


