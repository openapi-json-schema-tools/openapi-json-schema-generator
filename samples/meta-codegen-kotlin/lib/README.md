# my-client-codegen-openapi-generator

## Requirements

* Gradle 5.x
* Java 8+

## Getting Started

* Initialize the gradle wrapper:
  ```bash
  gradle wrapper --gradle-version 5.6.2
  ```
* Modify the codegen class and associated templates
* Compile with `./gradlew standalone`
* Verify:
  ```bash
  java -jar build/libs/my-client-codegen-openapi-generator-standalone.jar config-help -g myClientCodegen
  ```
  
## Building

### Standalone

As seen in "Getting Started", the generator may be built as a standalone customized version of OpenAPI Generator's CLI. This may be the simplest option for developers who are unfamiliar with working in the JVM. Please be aware of any licensing concerns before distributing this "uber-jar".

To build as a standalone, run:

```bash
./gradlew standalone
```

To list generators via OpenAPI Generator CLI:

```bash
java -jar build/libs/my-client-codegen-openapi-generator-standalone.jar list --include all
```

### ShadowJar

This generator supports building as a lightweight "fat-jar". This option includes Kotlin or any other `implementation` dependencies you'll add. This will simplify publishing if your generator has many dependencies.

To build as a shadowJar, run:

```bash
./gradlew shadowJar
```

To list generators via OpenAPI Generator CLI, you must refer to the CLI jar explicitly. We add a custom copy task which includes the CLI jar in the build output directory:

```bash
java -cp build/libs/openapi-generator-cli-4.1.3.jar:build/libs/my-client-codegen-openapi-generator-1.0-SNAPSHOT-all.jar OpenAPIGenerator list
```

Notice that this command _must_ pass classpath via `-cp` and include OpenAPI Generator CLI as well as the artifact built from this project. Also notice that the manifest class must be passed explicitly as `OpenAPIGenerator`.

## See Also

* [Customization docs](https://openapi-generator.tech/docs/customization)
* [Templating docs](https://openapi-generator.tech/docs/templating)
