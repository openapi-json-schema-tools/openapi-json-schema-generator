org.openapijsonschematools.client.servers.Server0
# Server Server0
public class Server0

A class that stores a server url

## Description
petstore server

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0()<br>Creates a server using default values for variables |
| Server0([Variables.VariablesMap](#variablesmap) variables)<br>Creates a server using input values for variables |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| String            | url = "http://{server}.swagger.io:{port}/v2"     |
| [Variables.VariablesMap](#variablesmap) | variables |

## Variables
public class Variables

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
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
| static class | [Variables.PortBoxed](#portboxed)<br> sealed validated payload class |
| static class | [Variables.Port](#port)<br> schema class |
| enum | [Variables.StringPortEnums](#stringportenums)<br>String enum |
| static class | [Variables.ServerBoxed](#serverboxed)<br> sealed validated payload class |
| static class | [Variables.Server](#server)<br> schema class |
| enum | [Variables.StringServerEnums](#stringserverenums)<br>String enum |
| static class | [Variables.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [Variables.AdditionalProperties](#additionalproperties)<br> schema class |

### Variables1Boxed
public static abstract sealed class Variables1Boxed<br>
permits<br>
[Variables1BoxedMap](#variables1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
        .port("80")

        .server("petstore")

    .build(),
    configuration
);
```

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("server", [Server.class](#server))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("port", [Port.class](#port)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"port",<br>&nbsp;&nbsp;&nbsp;&nbsp;"server"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap](#variablesmap) | validate([Map&lt;?, ?&gt;](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
### VariablesMap00Builder
public class VariablesMap00Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap00Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

### VariablesMap01Builder
public class VariablesMap01Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap01Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap00Builder](#variablesmap00builder) | server(String value) |
| [VariablesMap00Builder](#variablesmap00builder) | server([StringServerEnums](#stringserverenums) value) |

### VariablesMap10Builder
public class VariablesMap10Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap10Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap00Builder](#variablesmap00builder) | port(String value) |
| [VariablesMap00Builder](#variablesmap00builder) | port([StringPortEnums](#stringportenums) value) |

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
| [VariablesMap01Builder](#variablesmap01builder) | port(String value) |
| [VariablesMap01Builder](#variablesmap01builder) | port([StringPortEnums](#stringportenums) value) |
| [VariablesMap10Builder](#variablesmap10builder) | server(String value) |
| [VariablesMap10Builder](#variablesmap10builder) | server([StringServerEnums](#stringserverenums) value) |

### VariablesMap
public static class VariablesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [VariablesMap](#variablesmap) | of([Map<String, String>](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| String | port()<br> must be one of ["80", "8080"] if omitted the server will use the default value of 80 |
| String | server()<br> must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the server will use the default value of petstore |

### PortBoxed
public static abstract sealed class PortBoxed<br>
permits<br>
[PortBoxedString](#portboxedstring)

A sealed class that stores validated payloads using boxed classes

### PortBoxedString
public static final class PortBoxedString<br>
extends PortBoxed

a boxed class to store validated String payloads, sealed permits class implementation

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PortBoxedString(String data)<br>Creates an instance, private visibility |

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

### Port
public static class Port<br>
extends JsonSchema

A schema class that validates payloads

### Description
the port

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
String validatedPayload = Variables.Port.validate(
    "80",
    configuration
);
```

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"80",<br>&nbsp;&nbsp;&nbsp;&nbsp;"8080"<br>)<br> |
| @Nullable Object | defaultValue = "80" |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringPortEnums](#stringportenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
### StringPortEnums
public enum StringPortEnums<br>
extends `Enum<StringPortEnums>`

A class that stores String enum values

#### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_80 | value = "80" |
| POSITIVE_8080 | value = "8080" |

### ServerBoxed
public static abstract sealed class ServerBoxed<br>
permits<br>
[ServerBoxedString](#serverboxedstring)

A sealed class that stores validated payloads using boxed classes

### ServerBoxedString
public static final class ServerBoxedString<br>
extends ServerBoxed

a boxed class to store validated String payloads, sealed permits class implementation

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ServerBoxedString(String data)<br>Creates an instance, private visibility |

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

### Server
public static class Server<br>
extends JsonSchema

A schema class that validates payloads

### Description
server host prefix

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
String validatedPayload = Variables.Server.validate(
    "petstore",
    configuration
);
```

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petstore",<br>&nbsp;&nbsp;&nbsp;&nbsp;"qa-petstore",<br>&nbsp;&nbsp;&nbsp;&nbsp;"dev-petstore"<br>)<br> |
| @Nullable Object | defaultValue = "petstore" |

#### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringServerEnums](#stringserverenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
### StringServerEnums
public enum StringServerEnums<br>
extends `Enum<StringServerEnums>`

A class that stores String enum values

#### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PETSTORE | value = "petstore" |
| QA_HYPHEN_MINUS_PETSTORE | value = "qa-petstore" |
| DEV_HYPHEN_MINUS_PETSTORE | value = "dev-petstore" |

### AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

A sealed class that stores validated payloads using boxed classes

### AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated null payloads, sealed permits class implementation

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

### AdditionalPropertiesBoxedBoolean
public static final class AdditionalPropertiesBoxedBoolean<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

### AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated String payloads, sealed permits class implementation

#### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

#### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

### AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)
