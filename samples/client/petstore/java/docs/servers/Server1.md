org.openapijsonschematools.client.servers.Server1
# Server Server1
public class Server1

A class that stores a server url

## Description
The local server

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1()<br>Creates a server using default values for variables |
| Server1([Variables.VariablesMap](#variablesmap) variables)<br>Creates a server using input values for variables |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| String            | url = "https://localhost:8080/{version}"     |
| [Variables.VariablesMap](#variablesmap) | variables |

## Variables
public class Variables

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

### Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Variables.Variables1Boxed](#variables1boxed)<br> sealed validated payload class |
| static class | [Variables.Variables1](#variables1)<br> schema class |
| static class | [Variables.VariablesMapBuilder](#variablesmapbuilder)<br> builder for Map payloads |
| static class | [Variables.VariablesMap](#variablesmap)<br> output class for Map payloads |
| static class | [Variables.VersionBoxed](#versionboxed)<br> sealed validated payload class |
| static class | [Variables.Version](#version)<br> schema class |
| enum | [Variables.StringVersionEnums](#stringversionenums)<br>String enum |
| static class | [Variables.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [Variables.AdditionalProperties](#additionalproperties)<br> schema class |

### Variables1Boxed
public static abstract sealed class Variables1Boxed<br>

### Variables1
public static class Variables1<br>
extends JsonSchema

A schema class that validates payloads

#### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Variables.VariablesMap validatedPayload =
    Variables.Variables1.validate(
    new Variables.VariablesMapBuilder()
        .version("v1")

    .build(),
    configuration
);
```

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("version", [Version.class](#version)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"version"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap](#variablesmap) | validate([Map&lt;?, ?&gt;](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
### VariablesMap0Builder
public class VariablesMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

### VariablesMapBuilder
public class VariablesMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMapBuilder()<br>Creates a builder that contains an empty map |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap0Builder](#variablesmap0builder) | version(String value) |
| [VariablesMap0Builder](#variablesmap0builder) | version([StringVersionEnums](#stringversionenums) value) |

### VariablesMap
public static class VariablesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [VariablesMap](#variablesmap) | of([Map<String, String>](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| String | version()<br> must be one of ["v1", "v2"] if omitted the server will use the default value of v2 |

### VersionBoxed
public static abstract sealed class VersionBoxed<br>

### Version
public static class Version<br>
extends JsonSchema

A schema class that validates payloads

#### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = Variables.Version.validate(
    "v1",
    configuration
);
```

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"v1",<br>&nbsp;&nbsp;&nbsp;&nbsp;"v2"<br>)<br> |
| @Nullable Object | defaultValue = "v2" |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringVersionEnums](#stringversionenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
### StringVersionEnums
public enum StringVersionEnums<br>
extends `Enum<StringVersionEnums>`

A class that stores String enum values

#### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| V1 | value = "v1" |
| V2 | value = "v2" |

### AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>

### AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)
