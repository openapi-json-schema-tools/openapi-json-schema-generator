# OpenAPI JSON Schema Generator

[![CI Tests](https://dl.circleci.com/status-badge/img/gh/openapi-json-schema-tools/openapi-json-schema-generator/tree/master.svg?style=shield)](https://dl.circleci.com/status-badge/redirect/gh/openapi-json-schema-tools/openapi-json-schema-generator/tree/master)
[![Apache 2.0 License](https://img.shields.io/badge/License-Apache%202.0-orange)](./LICENSE)

Auto generate a client sdk from your openapi 3.0.0-3.1.0 document using Openapi JSON Schema Generator. 
This project is a code generator that focuses on supporting all openapi and json schema features.

## Overview
OpenAPI JSON Schema Generator allows auto-generation of API client libraries (SDK generation) given an
[OpenAPI document](https://github.com/OAI/OpenAPI-Specification) (3.0.0-[3.1.0*](#openapi-v310-support) are supported).
This project focuses on making the output 100% compliant with openapi + JSON schema specs.
The goal is to fully support everything defined in openapi + the included JSON schema specs
so developers can use all of those features.

Currently, the following languages/frameworks are supported:

| Feature                                                                                            | [Python](docs/generators/python.md) | [Java](docs/generators/java.md) | [Kotlin](docs/generators/kotlin.md) |
|----------------------------------------------------------------------------------------------------|-------------------------------------|---------------------------------|-------------------------------------|
| Generator status                                                                                   | stable                              | stable                          | experimental                        |
| Openapi v3.0.0-3.1.0 ingestion                                                                     | X                                   | X                               | X                                   |
| Json Schema 2020-12 Support (components/schemas)                                                   | X                                   | X                               | X                                   |
| Component schemas documentation produced                                                           | X                                   | X                               | X                                   |
| Documentation produced for other component types:<br>headers, parameters,requestBodies, ressponses | X                                   | X                               |                                     |
| Endpoints that send/receive json + docs generated for them                                         | X                                   | X                               |                                     |

## Reasons To Use the Generators
- Openapi spec support for v3.0.0-3.1.0
  - thorough tests run in CI using json schema test suite, see 3_0_0 and 3_1_0 sample clients
- Static analysis:
  - Python: mypy run in CI against python petstore sample
  - Java: checker framework run w/ NullnessChecker, ensures no null pointer exceptions
- Format support for: int32, int64, float, double, binary, date, datetime, uuid
- Invalid (in language) property names supported like `from`, `1var`, `hi-there` etc in
  - schema property names
  - endpoint parameter names
- Openapi document inline schemas supported at any depth in any location
- Generated Code: Class + method inputs are typed
- Generated Code: Static type checking done in static languages suing builder inputs and class property access
- Generated Code: run-time type checking done in all generators (a payload can be validated against n schemas)
- Generated Code re-use built in from the ground up
  - components/schemas/headers etc are generated as separate classes and imported when used via $ref
- Payload values are not coerced when validated, so a date/date-time value can pass other validations that describe the payload only as type string
- String transmission of numbers supported with type: string, format: number, value can be accessed as a Decimal with schemas.as_decimal(inst)
- Multiple content types supported for request and response bodies
- Endpoint response always also includes the raw response
- Interfaces kept consistent across generated languages

## Join Our Community
We use a Discord server as a place to ask questions and help each other. It offers functionality very similar to Slack.
You can join us here: https://discord.gg/mHB8WEQuYQ

### Can I build here?

Yes; contributions are welcome!
Submit a PR if you want to add a new server scaffold, client sdk, or documentation generator in any language.

## Table of contents

  - [OpenAPI JSON Schema Generator](#openapi-json-schema-generator)
  - [Overview](#overview)
  - [Table of Contents](#table-of-contents)
  - [Installation](#installation)
    - [Compatibility](#compatibility)
    - [Build Projects](#build-projects)
    - [Docker](#docker)
  - [Getting Started](#getting-started)
  - [Usage](#usage)
    - [Customization](#customization)
    - [Workflow Integration](#workflow-integration)
    - [License Information](#license-information)
  - [Companies/Projects using OpenAPI JSON Schema Generator](#companiesprojects-using-openapi-json-schema-generator)
  - [About Us](#about-us)
    - [History of OpenAPI JSON Schema Generator](#history-of-openapi-json-schema-generator)
  - [License](#license)

## Installation

### Compatibility

The OpenAPI Specification has undergone 3 revisions since initial creation in 2010.  The openapi-json-schema-generator project has the following compatibilities with the OpenAPI Specification:

| OpenAPI JSON Schema Generator Version | OpenAPI Spec compatibility                   |
|---------------------------------------|----------------------------------------------|
| 3.3.0+                                | 3.0.0 - [3.1.0*](#openapi-v310-support) |
| 3.1.0 - 3.2.1                         | 3.0.0 - [3.1.0](https://github.com/openapi-json-schema-tools/openapi-json-schema-generator/blob/3.1.0/docs/generators/python.md#schema-feature) |
| 1.0.0 - 3.0.0                         | 3.0.0 - 3.0.3                                |

#### OpenAPI v3.1.0 support
OpenAPI v3.1.0 specification support includes these new/updated 2020-12 json schema keywords:
1. const: only string values are working because of bugs in swagger parser
2. contains
3. dependentRequired
4. dependentSchemas
5. else
6. if
7. maxContains
8. minContains
9. patternProperties
10. prefixItems
11. propertyNames
12. then
13. type (array of types supported in addition to one non-array value)
14. unevaluatedItems
15. unevaluatedProperties

Note: these features can also be seen in the generator documentation [schema features](docs/generators/python.md#schema-feature)

### Build Projects

To build from source, you need the following installed and available in your `$PATH:`

* [Java 11](https://www.oracle.com/technetwork/java/index.html)

* [Apache Maven 3.9.3 or greater](https://maven.apache.org/)

After cloning the project, you can build it from source with this command:
```sh
mvn clean install
```

The default build contains minimal static analysis (via CheckStyle). To run your build with PMD and Spotbugs, use the `static-analysis` profile:

```sh
mvn -Pstatic-analysis clean install
```

### Docker

#### Public Pre-built Docker images

 - [https://hub.docker.com/r/openapijsonschematools/openapi-json-schema-generator-cli/](https://hub.docker.com/r/openapijsonschematools/openapi-json-schema-generator-cli/) (official CLI)

#### OpenAPI JSON Schema Generator CLI Docker Image

The docker image acts as a standalone executable. It can be used as an alternative to installing via homebrew, or for developers who are unable to install Java or upgrade the installed version.

To generate code with this image, you'll need to mount a local location as a volume.

Example:

```sh
docker run --rm -v "${PWD}:/local" openapijsonschematools/openapi-json-schema-generator-cli generate \
    -i https://raw.githubusercontent.com/openapi-json-schema-tools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml \
    -g python \
    -o /local/out/python
```

The generated code will be located under `./out/python` in the current directory.

#### Development in docker

You can use `bin/run-in-docker.sh` to do all development. This script maps your local repository to `/gen`
in the docker container. It also maps `~/.m2/repository` to the appropriate container location.

To execute `mvn package`:

```sh
git clone https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
cd openapi-json-schema-generator
./bin/run-in-docker.sh mvn package
```

Build artifacts are now accessible in your working directory.

Once built, `run-in-docker.sh` will act as an executable for openapi-json-schema-generator-cli. To generate code, you'll need to output to a directory under `/gen` (e.g. `/gen/out`). For example:

```sh
./bin/run-in-docker.sh help # Executes 'help' command for openapi-json-schema-generator-cli
./bin/run-in-docker.sh list # Executes 'list' command for openapi-json-schema-generator-cli
./bin/run-in-docker.sh /gen/bin/python-petstore.sh  # Builds the Go client
./bin/run-in-docker.sh generate -i src/test/resources/3_0/petstore.yaml \
    -g go -o /gen/out/python-petstore -p packageName=petstore_api # generates python client, outputs locally to ./out/python-petstore
```

##### Troubleshooting

If an error like this occurs, just execute the **mvn clean install -U** command:

> org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.19.1:test (default-test) on project openapi-json-schema-generator: A type incompatibility occurred while executing org.apache.maven.plugins:maven-surefire-plugin:2.19.1:test: java.lang.ExceptionInInitializerError cannot be cast to java.io.IOException

```sh
./run-in-docker.sh mvn clean install -U
```

> Failed to execute goal org.fortasoft:gradle-maven-plugin:1.0.8:invoke (default) on project openapi-json-schema-generator-gradle-plugin-mvn-wrapper: org.gradle.tooling.BuildException: Could not execute build using Gradle distribution 'https://services.gradle.org/distributions/gradle-4.7-bin.zip'

Right now: no solution for this one :|

<!-- /RELEASE_VERSION -->
## Getting Started

To generate a python client for [petstore.yaml](https://raw.githubusercontent.com/openapi-json-schema-tools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml), please run the following
```sh
git clone https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
cd openapi-json-schema-generator
mvn clean package
java -jar target/openapi-json-schema-generator-cli.jar generate \
   -i https://raw.githubusercontent.com/openapi-json-schema-tools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml \
   -g python \
   -o /var/tmp/python_api_client
```
(if you're on Windows, replace the last command with `java -jar target\openapi-json-schema-generator-cli.jar generate -i https://raw.githubusercontent.com/openapi-json-schema-tools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml -g python -o c:\temp\python_api_client`)

To get a list of **general** options available, please run `java -jar target/openapi-json-schema-generator-cli.jar help generate`

To get a list of python specified options (which can be passed to the generator with a config file via the `-c` option), please run `java -jar target/openapi-json-schema-generator-cli.jar config-help -g python`

## Usage

### To generate a sample client library
You can build a client against the [Petstore API](https://raw.githubusercontent.com/openapijsonschematools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml) as follows:

```sh
./bin/generate-samples.sh ./bin/generate_samples_configs/python.yaml
```

(On Windows, please install [GIT Bash for Windows](https://gitforwindows.org/) to run the command above)

This script will run the generator with this command:

```sh
java -jar target/openapi-json-schema-generator-cli.jar generate \
  -i https://raw.githubusercontent.com/openapijsonschematools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml \
  -g python \
  -t src/main/resources/python \
  --additional-properties packageName=petstore_api \
  -o samples/client/petstore/python
```

with a number of options. [The python options are documented here.](docs/generators/python.md)

You can also get the options with the `help generate` command (below only shows partial results):

```
NAME
        openapi-json-schema-generator-cli generate - Generate code with the specified
        generator.

SYNOPSIS
        openapi-json-schema-generator-cli generate
                [(-a <authorization> | --auth <authorization>)]
                [--api-name-suffix <api name suffix>] [--api-package <api package>]
                [--artifact-id <artifact id>] [--artifact-version <artifact version>]
                [(-c <configuration file> | --config <configuration file>)] [--dry-run]
                [(-e <templating engine> | --engine <templating engine>)]
                [--enable-post-process-file]
                [(-g <generator name> | --generator-name <generator name>)]
                [--git-host <git host>] [--git-repo-id <git repo id>]
                [--git-user-id <git user id>] [--global-property <global properties>...]
                [--group-id <group id>] [--hide-generation-timestamp]
                [--http-user-agent <http user agent>]
                [(-i <spec file> | --input-spec <spec file>)]
                [--ignore-file-override <ignore file override location>]
                [--ints-allowed-for-float-double-formats]
                [--invoker-package <invoker package>] [--minimal-update]
                [--model-name-prefix <model name prefix>]
                [--model-name-suffix <model name suffix>]
                [(-o <output directory> | --output <output directory>)] [(-p <additional properties> | --additional-properties <additional properties>)...]
                [--package-name <package name>] [--release-note <release note>]
                [--remove-enum-value-prefix] [--remove-operation-id-prefix]
                [(-s | --skip-overwrite)] [--skip-operation-example]
                [--skip-validate-spec] [--strict-spec <true/false strict behavior>]
                [(-t <template directory> | --template-dir <template directory>)]
                [(-v | --verbose)]
```
<details>
<summary>generate OPTIONS</summary>

```text
OPTIONS
        -a <authorization>, --auth <authorization>
            adds authorization headers when fetching the OpenAPI definitions
            remotely. Pass in a URL-encoded string of name:header with a comma
            separating multiple values

        --api-name-suffix <api name suffix>
            Suffix that will be appended to all API names ('tags'). Default:
            Api. e.g. Pet => PetApi. Note: Only ruby, python, jaxrs generators
            support this feature at the moment.

        --api-package <api package>
            package for generated api classes

        --artifact-id <artifact id>
            artifactId in generated pom.xml. This also becomes part of the
            generated library's filename

        --artifact-version <artifact version>
            artifact version in generated pom.xml. This also becomes part of the
            generated library's filename

        -c <configuration file>, --config <configuration file>
            Path to configuration file. It can be JSON or YAML. If file is JSON,
            the content should have the format {"optionKey":"optionValue",
            "optionKey1":"optionValue1"...}. If file is YAML, the content should
            have the format optionKey: optionValue. Supported options can be
            different for each language. Run config-help -g {generator name}
            command for language-specific config options.

        --dry-run
            Try things out and report on potential changes (without actually
            making changes).

        -e <templating engine>, --engine <templating engine>
            templating engine: "handlebars"(default) or "mustache"

        --enable-post-process-file
            Enable post-processing file using environment variables.

        -g <generator name>, --generator-name <generator name>
            generator to use (see list command for list)

        --git-host <git host>
            Git host, e.g. gitlab.com.

        --git-repo-id <git repo id>
            Git repo ID, e.g. openapi-generator.

        --git-user-id <git user id>
            Git user ID, e.g. openapijsonschematools.

        --global-property <global properties>
            sets specified global properties (previously called 'system
            properties') in the format of name=value,name=value (or multiple
            options, each with name=value)

        --group-id <group id>
            groupId in generated pom.xml

        --hide-generation-timestamp
            Hides the generation timestamp when files are generated.

        --http-user-agent <http user agent>
            HTTP user agent, e.g. codegen_csharp_api_client, default to
            'OpenAPI-Generator/{packageVersion}/{language}'

        -i <spec file>, --input-spec <spec file>
            location of the OpenAPI spec, as URL or file (required if not loaded
            via config using -c)

        --ignore-file-override <ignore file override location>
            Specifies an override location for the .openapi-generator-ignore
            file. Most useful on initial generation.

        --ints-allowed-for-float-double-formats
            Integers are allowed in for type: number format:float/double
            payloads

        --invoker-package <invoker package>
            root package for generated code

        --minimal-update
            Only write output files that have changed.

        --model-name-prefix <model name prefix>
            Prefix that will be prepended to all model names.

        --model-name-suffix <model name suffix>
            Suffix that will be appended to all model names.

        -o <output directory>, --output <output directory>
            where to write the generated files (current dir by default)

        -p <additional properties>, --additional-properties <additional
        properties>
            sets additional properties that can be referenced by the mustache
            templates in the format of name=value,name=value. You can also have
            multiple occurrences of this option.

        --package-name <package name>
            package for generated classes (where supported)

        --release-note <release note>
            Release note, default to 'Minor update'.

        --remove-enum-value-prefix
            Remove the common prefix of enum values

        --remove-operation-id-prefix
            Remove prefix of operationId, e.g. config_getId => getId

        -s, --skip-overwrite
            specifies if the existing files should be overwritten during the
            generation.

        --skip-operation-example
            Skip examples defined in operations to avoid out of memory errors.

        --skip-validate-spec
            Skips the default behavior of validating an input specification.

        --strict-spec <true/false strict behavior>
            'MUST' and 'SHALL' wording in OpenAPI spec is strictly adhered to.
            e.g. when false, no fixes will be applied to documents which pass
            validation but don't follow the spec.

        -t <template directory>, --template-dir <template directory>
            folder containing the template files

        -v, --verbose
            verbose mode
```

</details>

You can then use the auto-generated client. The README.md is a good starting point.

Other generators have [samples](samples) too.

### Customization

Please refer to [customization.md](docs/customization.md) on how to customize the output (e.g. package name, version)

### Workflow Integration

Please refer to [integration.md](docs/integration.md) on how to integrate OpenAPI generator with Maven, Gradle,  Github and CI/CD.

### License Information

The OpenAPI JSON Schema Generator project is intended as a benefit for users of the Open API Specification.  The project itself has the [License](#license) as specified. In addition, please understand the following points:

* The templates included with this project are subject to the [License](#license).
* Generated code is intentionally _not_ subject to the parent project license

When code is generated from this project, it shall be considered **AS IS** and owned by the user of the software.  There are no warranties--expressed or implied--for generated code.  You can do what you wish with it, and once generated, the code is your responsibility and subject to the licensing terms that you deem appropriate.

## Companies/Projects using OpenAPI JSON Schema Generator

[Github code search](https://github.com/search?q=DateSchema+DateTimeSchema+language%3APython+path%3A**%2Fschemas.py&type=code)

## About Us

This repo is based on v6.2.0 of OpenAPI Generator. This project focuses on making the output 100% compliant with JSON schema as part of the OpenAPI 3.1 specification with a focus on complex cases (top-down approach). The goal is to fully support everything defined in JSON schema so that developers can leverage JSON schema as well as OpenAPI specification in their API design. Building here allows for more rapid progress supporting new features in OpenAPI 3.X without having to support many older generators which don't use the new features.

### History of OpenAPI JSON Schema Generator

OpenAPI JSON Schema Generator is based on OpenAPI Generator v6.2.0.
The project was created here because the openapi-generator core team required the removal of the python generator 
from their project. The author of the python generator (@spacether) preferred to keep building 
in the openapi-generator repo, but core team refused to consider keeping python in openapi-generator.
Below is a timeline of those events and some of their reasons:

#### Timeline of python generator development
- Jan 4, 2021 - [openapi-generator v5.4.0: python-experimental created](https://github.com/OpenAPITools/openapi-generator/pull/8325). This generator is the beginning of the current python generator in this repo.
- Sept 19, 2022 - meeting to discuss openapi 3.1.0 + python client, removal of python client mentioned as an option, not a requirement
- Sept 22, 2022 - [openapi-generator v6.2.0: new python-experimental switched in as the primary python client](https://github.com/OpenAPITools/openapi-generator/pull/13501)
- Sept 23, 2022 - communication clarified that removal of the python generator is required
- Sept 24, 2022 - [openapi-generator v6.2.0: removal of python generator mentioned in v6.2.0 release](https://github.com/OpenAPITools/openapi-generator/releases/tag/v6.2.0)
- Sept 26, 2022 - [different new repo made for openapi json schema generator in OpenapiTools org](https://github.com/OpenAPITools/openapi-json-schema-generator)
- Oct 2, 2022 - [moved project to this repo](https://github.com/openapi-json-schema-tools/openapi-json-schema-generator) I moved the generator to the new repo because full ownership privledges were not granted on the new repo to me, which had been promised, and because I was not given privledges that allowed docker distribution from the new repo
- May 14, 2023 - [openapi-generator v7.0.0: python generator removed, a diffferent generator becomes the only python client](https://github.com/OpenAPITools/openapi-generator/pull/15486)


#### Removal Reasons
- Core team and @wing328 felt adoption of the python client was reduced from 5.0.0 and onward due to python-prior + python generators
- Some python users in the community did not prefer the new python code
- The fact that other users + companies are using it does not warrant keeping it in the repo
- The fact that it is more fully passing json schema tests (including the feature keywords oneOf/anyOf/allOf/additionalProperties) does not warrant keeping it in the repo
- The openapi-generator core team refused to consider the option of keeping the python generator as another generator option in their repo, and building another python generator that looks more conventional and making that generator primary

## License

-------
Copyright 2023 OpenAPI-Json-Schema-Generator Contributors
Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
Copyright 2018 SmartBear Software

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at [apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

---
