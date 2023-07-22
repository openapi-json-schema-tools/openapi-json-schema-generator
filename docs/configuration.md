---
id: configuration
title: Configuration Options
---

Our tooling supports the following types of configuration:

* [global properties](./global-properties.md)
  - properties with cross-cutting concerns which control generation, but  _don't_ belong to individual generators
  - Example: `debugSupportingFiles` prints the contents of template data bound to supporting files
* config options
  - configuration specific to each individual [generator](./generators/README.md)
  - these options are susceptible to validation within the defining generator; a config option of the same name across multiple generators may be validated differently in each
  - NOTE: The CLI accepts config options as "additional properties"
* additional properties
  - these are the properties which will be passed to templates
  - generally used to pass user-defined properties to custom templates
  - many config options may also be passed as additional properties, however generators will read/modify/rewrite config options
  - users may pass custom additional properties and use these within templates (e.g. a custom `generatedBy` key with a value of `Jim Schubert` for inclusion in a custom CVS-like header)
* top-level properties specific to individual tools/plugins used to bootstrap our tooling

## Discovering Options

Refer to [global properties](./global-properties.md) for a list of available global properties and their usage.

Top-level tooling options are defined in [CLI usage](https://openapi-generator.tech/docs/usage/#generate). Many of these options directly map to camel case options in other tools, but do refer to [plugin documentation](https://openapi-generator.tech/docs/plugins) for full details or plugin-specific differences.

Config options for generators are available in [documentation online](https://openapi-generator.tech/docs/generators). You may also use the CLI to query config options for a target generator using `openapi-generator config-help -g <generator-name>`. For example:

```
$ openapi-generator config-help -g mysql-schema

CONFIG OPTIONS

	defaultDatabaseName
	    Default database name for all MySQL queries (Default: )

	identifierNamingConvention
	    Naming convention of MySQL identifiers(table names and column names). This is not related to database name which is defined by defaultDatabaseName option (Default: original)
	        original - Do not transform original names
	        snake_case - Use snake_case names

	jsonDataTypeEnabled
	    Use special JSON MySQL data type for complex model properties. Requires MySQL version 5.7.8. Generates TEXT data type when disabled (Default: true)

	namedParametersEnabled
	    Generates model prepared SQLs with named parameters, eg. :petName. Question mark placeholder used when option disabled. (Default: false)
```

This output provides the name of the configuration option. A set of acceptable values for any constrained values will print as an indented list (e.g. `identifierNamingConvention` above).

Suppose you want to apply snake case naming to mysql schema outputs. Your configuration might resemble the following examples.

**CLI**

```
openapi-generator -g mysql-schema -o out -i spec.yaml --additional-properties=identifierNamingConvention=snake_case
```

It may seem like a typo but there are two `=` signs in the above example.

**Maven Plugin**

```
<execution>
	<id>mysql-schema</id>
	<phase>generate-sources</phase>
	<goals>
		<goal>generate</goal>
	</goals>
	<configuration>
		<inputSpec>spec.yaml</inputSpec>
		<generatorName>mysql-schema</generatorName>
		<configOptions>
			<identifierNamingConvention>snake_case</identifierNamingConvention>
		</configOptions>
		<output>${project.build.directory}/generated-sources/mysql</output>
	</configuration>
</execution>
```

**Gradle Plugin**

```
openApiGenerate {
    generatorName = "mysql-schema"
    inputSpec = "$rootDir/spec.yaml".toString()
    outputDir = "$buildDir/mysql".toString()
    configOptions = [
            identifierNamingConvention: "snake_case"
    ]
}
```

