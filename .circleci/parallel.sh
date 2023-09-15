#!/bin/bash
#
# A bash script to run CircleCI node/test in parallel
#

JOB_ID=${CIRCLE_JOB_ID:-"unset"}

set -e

export NODE_ENV=test

if [ "$JOB_ID" = "ensureSamplesAndGeneratorDocsUpToDate" ]; then
  echo "Running job $JOB_ID"
  ./bin/utils/ensure-up-to-date

elif [ "$JOB_ID" = "mvnCleanInstall" ]; then
  echo "Running job $JOB_ID"
  mvn --no-snapshot-updates --quiet clean install -Dorg.slf4j.simpleLogger.defaultLogLevel=error

elif [ "$JOB_ID" = "testPythonClientSamples" ]; then
  echo "Running job $JOB_ID ..."
  (cd samples/client/petstore/python && make test)
  (cd samples/client/3_0_3_unit_test/python && make test)
  (cd samples/client/3_1_0_unit_test/python && make test)
  (cd samples/client/openapi_features/nonCompliantUseDiscriminatorIfCompositionFails/python && make test)
  (cd samples/client/openapi_features/security/python && make test)
  (cd samples/client/3_1_0_json_schema/python && make test)

else
  echo "Running job $JOB_ID"

fi


