# RootServer0Variables
public class RootServer0Variables<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RootServer0Variables.RootServer0Variables1Boxed](#rootserver0variables1boxed)<br> sealed interface for validated payloads |
| record | [RootServer0Variables.RootServer0Variables1BoxedMap](#rootserver0variables1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RootServer0Variables.RootServer0Variables1](#rootserver0variables1)<br> schema class |
| static class | [RootServer0Variables.VariablesMapBuilder](#variablesmapbuilder)<br> builder for Map payloads |
| static class | [RootServer0Variables.VariablesMap](#variablesmap)<br> output class for Map payloads |
| sealed interface | [RootServer0Variables.PortBoxed](#portboxed)<br> sealed interface for validated payloads |
| record | [RootServer0Variables.PortBoxedString](#portboxedstring)<br> boxed class to store validated String payloads |
| static class | [RootServer0Variables.Port](#port)<br> schema class |
| enum | [RootServer0Variables.StringPortEnums](#stringportenums)<br>String enum |
| sealed interface | [RootServer0Variables.ServerBoxed](#serverboxed)<br> sealed interface for validated payloads |
| record | [RootServer0Variables.ServerBoxedString](#serverboxedstring)<br> boxed class to store validated String payloads |
| static class | [RootServer0Variables.Server](#server)<br> schema class |
| enum | [RootServer0Variables.StringServerEnums](#stringserverenums)<br>String enum |
| sealed interface | [RootServer0Variables.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [RootServer0Variables.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [RootServer0Variables.AdditionalProperties](#additionalproperties)<br> schema class |

## RootServer0Variables1Boxed
public sealed interface RootServer0Variables1Boxed<br>
permits<br>
[RootServer0Variables1BoxedMap](#rootserver0variables1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RootServer0Variables1BoxedMap
public record RootServer0Variables1BoxedMap<br>
implements [RootServer0Variables1Boxed](#rootserver0variables1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RootServer0Variables1BoxedMap([VariablesMap](#variablesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap](#variablesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RootServer0Variables1
public static class RootServer0Variables1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.servers.rootserver0.RootServer0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
RootServer0Variables.VariablesMap validatedPayload =
    RootServer0Variables.RootServer0Variables1.validate(
    new RootServer0Variables.VariablesMapBuilder()
        .port("80")

        .server("petstore")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("server", [Server.class](#server))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("port", [Port.class](#port)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"port",<br>&nbsp;&nbsp;&nbsp;&nbsp;"server"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap](#variablesmap) | validate([Map&lt;?, ?&gt;](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| [RootServer0Variables1BoxedMap](#rootserver0variables1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| [RootServer0Variables1Boxed](#rootserver0variables1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## VariablesMap00Builder
public class VariablesMap00Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap00Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## VariablesMap01Builder
public class VariablesMap01Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap01Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap00Builder](#variablesmap00builder) | server(String value) |
| [VariablesMap00Builder](#variablesmap00builder) | server([StringServerEnums](#stringserverenums) value) |

## VariablesMap10Builder
public class VariablesMap10Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMap10Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap00Builder](#variablesmap00builder) | port(String value) |
| [VariablesMap00Builder](#variablesmap00builder) | port([StringPortEnums](#stringportenums) value) |

## VariablesMapBuilder
public class VariablesMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| VariablesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [VariablesMap01Builder](#variablesmap01builder) | port(String value) |
| [VariablesMap01Builder](#variablesmap01builder) | port([StringPortEnums](#stringportenums) value) |
| [VariablesMap10Builder](#variablesmap10builder) | server(String value) |
| [VariablesMap10Builder](#variablesmap10builder) | server([StringServerEnums](#stringserverenums) value) |

## VariablesMap
public static class VariablesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [VariablesMap](#variablesmap) | of([Map<String, String>](#variablesmapbuilder) arg, SchemaConfiguration configuration) |
| String | port()<br> must be one of ["80", "8080"] if omitted the server will use the default value of 80 |
| String | server()<br> must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the server will use the default value of petstore |

## PortBoxed
public sealed interface PortBoxed<br>
permits<br>
[PortBoxedString](#portboxedstring)

sealed interface that stores validated payloads using boxed classes

## PortBoxedString
public record PortBoxedString<br>
implements [PortBoxed](#portboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PortBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Port
public static class Port<br>
extends JsonSchema

A schema class that validates payloads

## Description
the port

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.servers.rootserver0.RootServer0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = RootServer0Variables.Port.validate(
    "80",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"80",<br>&nbsp;&nbsp;&nbsp;&nbsp;"8080"<br>)<br> |
| @Nullable Object | defaultValue = "80" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringPortEnums](#stringportenums) arg, SchemaConfiguration configuration) |
| [PortBoxedString](#portboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PortBoxed](#portboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringPortEnums
public enum StringPortEnums<br>
extends `Enum<StringPortEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_80 | value = "80" |
| POSITIVE_8080 | value = "8080" |

## ServerBoxed
public sealed interface ServerBoxed<br>
permits<br>
[ServerBoxedString](#serverboxedstring)

sealed interface that stores validated payloads using boxed classes

## ServerBoxedString
public record ServerBoxedString<br>
implements [ServerBoxed](#serverboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ServerBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server
public static class Server<br>
extends JsonSchema

A schema class that validates payloads

## Description
server host prefix

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.servers.rootserver0.RootServer0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = RootServer0Variables.Server.validate(
    "petstore",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petstore",<br>&nbsp;&nbsp;&nbsp;&nbsp;"qa-petstore",<br>&nbsp;&nbsp;&nbsp;&nbsp;"dev-petstore"<br>)<br> |
| @Nullable Object | defaultValue = "petstore" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringServerEnums](#stringserverenums) arg, SchemaConfiguration configuration) |
| [ServerBoxedString](#serverboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ServerBoxed](#serverboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServerEnums
public enum StringServerEnums<br>
extends `Enum<StringServerEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PETSTORE | value = "petstore" |
| QA_HYPHEN_MINUS_PETSTORE | value = "qa-petstore" |
| DEV_HYPHEN_MINUS_PETSTORE | value = "dev-petstore" |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
