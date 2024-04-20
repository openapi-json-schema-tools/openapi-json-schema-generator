---
id: usage
title: Usage
---

Options for OpenAPI Generator are the same whether you're using the CLI, Maven/Gradle Plugins, or Online generation options.
This page demonstrates navigating the options via CLI. Commands are presented here in a logical progression as a tutorial, but you're welcome to skip directly to the [generate](#generate) command.

## help

The `help` option lists all commands available to the CLI.

```text
openapi-json-schema-generator-cli help
usage: openapi-json-schema-generator-cli <command> [<args>]

The most commonly used openapi-json-schema-generator-cli commands are:
    author        Utilities for authoring generators or customizing templates.
    batch         Generate code in batch via external configs.
    config-help   Config help for chosen lang
    generate      Generate code with the specified generator.
    help          Display help information about openapi-generator
    list          Lists the available generators
    meta          MetaGenerator. Generator for creating a new template set and configuration for Codegen.  The output will be based on the language you specify, and includes default templates to include.
    validate      Validate specification
    version       Show version information used in tooling

See 'openapi-json-schema-generator-cli help <command>' for more information on a specific
command.
```

## version

The version command provides version information, returning either the version by default, the git commit sha when passed `--sha`, or verbose output when passed `--full`.

```text
NAME
        openapi-json-schema-generator-cli version - Show version information used in tooling

SYNOPSIS
        openapi-json-schema-generator-cli version [--full] [--sha]

OPTIONS
        --full
            Full version details

        --sha
            Git commit SHA version
```

## list

The `list` command outputs a formatted list of every available generator. Pass the `-s/--short` option if you would like a CSV output for easy parsing.

```text
openapi-json-schema-generator-cli help list
NAME
        openapi-json-schema-generator-cli list - Lists the available generators

SYNOPSIS
        openapi-json-schema-generator-cli list [(-i <include> | --include <include>)]
                [(-s | --short)]

OPTIONS
        -i <include>, --include <include>
            comma-separated list of stability indexes to include (value:
            all,beta,stable,experimental,deprecated). Excludes deprecated by
            default.

        -s, --short
            shortened output (suitable for scripting)
```

Example:

```bash
openapi-json-schema-generator-cli list -s | tr ',' '\n'
```

For the full list of generators, refer to the [Generators List](./generators.md).

## config-help

The `config-help` option provides details about 

```text
openapi-json-schema-generator-cli help config-help
NAME
        openapi-json-schema-generator-cli config-help - Config help for chosen lang

SYNOPSIS
        openapi-json-schema-generator-cli config-help
                [(-f <output format> | --format <output format>)] [--feature-set]
                [--full-details]
                [(-g <generator name> | --generator-name <generator name>)]
                [--language-specific-primitive] [--markdown-header] [--named-header]
                [(-o <output location> | --output <output location>)] [--reserved-words]

OPTIONS
        -f <output format>, --format <output format>
            Write output files in the desired format. Options are 'text',
            'markdown' or 'yamlsample'. Default is 'text'.

        --feature-set
            displays feature set as supported by the generator

        --full-details
            displays CLI options as well as other configs/mappings (implies
            --reserved-words,
            --supporting-files)

        -g <generator name>, --generator-name <generator name>
            generator to get config help for

        --language-specific-primitive
            displays the language specific primitives (types which require no
            additional imports, or which may conflict with user defined model
            names)

        --markdown-header
            When format=markdown, include this option to write out markdown
            headers (e.g. for docusaurus).

        --named-header
            Header includes the generator name, for clarity in output

        -o <output location>, --output <output location>
            Optionally write help to this location, otherwise default is
            standard output

        --reserved-words
            displays the reserved words which may result in renamed model or
            property names
```

The option of note is `-g/--generator-name` (other options are exposed for tooling).

You may pass any generator name (see [list](#list) command) to `-g`, and options specific to that generator will be displayed. Some generators have _many_ options, while others may have only a few.

Example:

```bash
openapi-json-schema-generator-cli config-help -g go
```

Outputs:

```text
CONFIG OPTIONS
	packageName
	    Go package name (convention: lowercase). (Default: openapi)

	hideGenerationTimestamp
	    Hides the generation timestamp when files are generated. (Default: true)

	packageVersion
	    Go package version. (Default: 1.0.0)

	withGoCodegenComment
	    whether to include Go codegen comment to disable Go Lint and collapse by default in GitHub PRs and diffs (Default: false)

```

To pass these go client generator-specific options to the `generate` command for a go client, use the `--additional-properties` option. See the [generate](#generate) command section for an example.

## meta

The `meta` command creates a new Java class and template files, used for creating your own custom templates.

```text
openapi-json-schema-generator-cli help meta
NAME
        openapi-json-schema-generator-cli meta - MetaGenerator. Generator for creating a new
        template set and configuration for Codegen. The output will be based on
        the language you specify, and includes default templates to include.

SYNOPSIS
        openapi-json-schema-generator-cli meta [(-l <language> | --language <language>)]
                [(-n <name> | --name <name>)]
                [(-o <output directory> | --output <output directory>)]
                [(-p <package> | --package <package>)] [(-t <type> | --type <type>)]

OPTIONS
        -l <language>, --language <language>
            the implementation language for the generator class

        -n <name>, --name <name>
            the human-readable name of the generator

        -o <output directory>, --output <output directory>
            where to write the generated files (current dir by default)

        -p <package>, --package <package>
            the package to put the main class into (defaults to
            org.openapijsonschematools.codegen)

        -t <type>, --type <type>
            the type of generator that is created
```

For an in-depth example of using the `meta` command, see [Customization](./customization.md).

## validate

The `validate` command allows you to validate an input specification, optionally providing recommendations for error fixes or other improvements (if available).

```text
openapi-json-schema-generator-cli help validate
NAME
        openapi-json-schema-generator-cli validate - Validate specification

SYNOPSIS
        openapi-json-schema-generator-cli validate
                (-i <spec file> | --input-spec <spec file>) [--recommend]

OPTIONS
        -i <spec file>, --input-spec <spec file>
            location of the OpenAPI spec, as URL or file (required)

        --recommend
```
```text
Validating spec (petstore-v3.0-invalid.yaml)
Errors:
	-attribute info is missing

[error] Spec has 1 errors.
```

## generate

The `generate` command is the workhorse of the generator toolset. As such, it has _many_ more options available than the previous commands. The abbreviated options are below, but you may expand the full descriptions.


```text
openapi-json-schema-generator-cli help generate
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


At a minimum, `generate` requires:

* `-g` to specify the generator
* `-o` to specify a meaningful output directory (defaults to the current directory!)
* `-i` to specify the input OpenAPI document

> **NOTE** You may also pass `-Dcolor` as a system property to colorize terminal outputs.

### Examples

The following examples use [petstore.yaml](https://raw.githubusercontent.com/openapi-json-schema-tools/openapi-json-schema-generator/master/src/test/resources/3_0/petstore.yaml).

#### Additional Properties

Generator-specific options should be passed as `--additional-properties`:

```bash
openapi-json-schema-generator-cli generate -g go --additional-properties=prependFormOrBodyParameters=true \
    -o out -i petstore.yaml
```

Pass more options via comma delimited key/value pairs:

```bash
--additional-properties=key1=value1,key2=value2
```

For the full list of generator-specific parameters, refer to [generators docs](./generators.md).

#### File Post-Processing

The `--enable-post-process-file` option enables specific generators to invoke some external language-specific formatting script. Each filename is passed _individually_ to this external script, allowing for linting, formatting, or other custom clean-up.

For more details, see [File Post-Processing](./file-post-processing.md).

#### Configuration File

Rather than passing generator options in a CSV of `--additional-properties`, you may also provide the settings via JSON file or YAML file.

For example, one of our typescript samples has the following configuration file:

```json
{
  "npmName": "@swagger/typescript-fetch-petstore",
  "npmVersion": "1.0.0",
  "npmRepository" : "https://skimdb.npmjs.com/registry",
  "snapshot" : false,
  "supportsES6": true
}
```

These settings can be passed via `-c filename`. Here, we've saved the above as `config.json`:

```bash
openapi-json-schema-generator-cli generate -i petstore.yaml -g typescript-fetch -o out \
    -c config.json
```

Same configuration file can be passed into YAML format having following equivalent content:

```yaml
npmName: "@swagger/typescript-fetch-petstore"
npmVersion: "1.0.0"
npmRepository: "https://skimdb.npmjs.com/registry"
snapshot: false
supportsES6: true
```

The settings are passed exactly the same as for `config.json`. The most important part is the file extension. Supported values are `yml` or `yaml`. 
The name of the file should be `config.yml` or `config.yaml` (in our example it will be `config.yaml`.

```bash
openapi-json-schema-generator-cli generate -i petstore.yaml -g typescript-fetch -o out \
    -c config.yaml
```


## batch

The `batch` command allows you to move all CLI arguments supported by the `generate` command into a YAML or JSON file.

*NOTE*: This command supports an additional `!include` property which may point to another "shared" file, the base path to which can be
modified by `--includes-base-dir`. Starting with 5.0.0, the `!batch` command supports multiple `!include` properties, either sequential or nested. In order to support multiple `!include` properties in a JSON file, the property name can have a suffix, e.g. `!include1`, `!include2`, etc. The suffix have no meaning other than providing unique property names.

```text
openapi-json-schema-generator-cli help batch
NAME
        openapi-json-schema-generator-cli batch - Generate code in batch via external
        configs.

SYNOPSIS
        openapi-json-schema-generator-cli batch [--clean] [--fail-fast]
                [--includes-base-dir <includes>] [(-r <threads> | --threads <threads>)]
                [--root-dir <root>] [--timeout <timeout>] [(-v | --verbose)] [--]
                <configs>...

OPTIONS
        --clean
            clean output of previously written files before generation

        --fail-fast
            fail fast on any errors

        --includes-base-dir <includes>
            base directory used for includes

        -r <threads>, --threads <threads>
            thread count

        --root-dir <root>
            root directory used output/includes (includes can be overridden)

        --timeout <timeout>
            execution timeout (minutes)

        -v, --verbose
            verbose mode

        --
            This option can be used to separate command-line options from the
            list of argument, (useful when arguments might be mistaken for
            command-line options

        <configs>
            Generator configuration files.
```

Example:

```bash
# create "shared" config
mkdir shared && cat > shared/common.yaml <<EOF
inputSpec: https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/src/test/resources/3_0/petstore.yaml
additionalProperties:
    x-ext-name: "Your Name"
EOF

# create "standard" configs
cat > kotlin.yaml <<EOF
'!include': 'shared/common.yaml'
outputDir: out/kotlin
generatorName: kotlin
artifactId: kotlin-petstore-string
additionalProperties:
  serializableModel: "true"
EOF

cat > csharp.yaml <<EOF
'!include': 'shared/common.yaml'
outputDir: out/csharp-netcore
generatorName: csharp-netcore
additionalProperties:
  packageGuid: "{321C8C3F-0156-40C1-AE42-D59761FB9B6C}"
  useCompareNetObjects: "true"
EOF

# Generate them
openapi-json-schema-generator-cli batch *.yaml
```

## author

This command group contains utilities for authoring generators or customizing templates.

```text
openapi-json-schema-generator-cli help author
NAME
        openapi-json-schema-generator-cli author - Utilities for authoring generators or
        customizing templates.

SYNOPSIS
        openapi-json-schema-generator-cli author
        openapi-json-schema-generator-cli author template 
                [(-v | --verbose)]
                [(-o <output directory> | --output <output directory>)]
                (-g <generator name> | --generator-name <generator name>)

OPTIONS
        --help
            Display help about the tool

        --version
            Display full version output

COMMANDS
        With no arguments, Display help information about openapi-generator

        template
            Retrieve templates for local modification

            With --verbose option, verbose mode

            With --output option, where to write the template files (defaults to
            'out')

            With --generator-name option, generator to use (see list command for
            list)
```

### template

This command allows user to extract templates from the CLI jar which simplifies customization efforts.

```text
openapi-json-schema-generator-cli help author template
NAME
        openapi-json-schema-generator-cli author template - Retrieve templates for local
        modification

SYNOPSIS
        openapi-json-schema-generator-cli author template
                (-g <generator name> | --generator-name <generator name>)
                [(-o <output directory> | --output <output directory>)]
                [(-v | --verbose)]

OPTIONS
        -g <generator name>, --generator-name <generator name>
            generator to use (see list command for list)

        -o <output directory>, --output <output directory>
            where to write the template files (defaults to 'out')

        -v, --verbose
            verbose mode
```

Example:

Extract Java templates, limiting to the `webclient` library.

```bash
openapi-json-schema-generator-cli author template -g java
```

Extract all Java templates:

```bash
openapi-json-schema-generator-cli author template -g java
```
