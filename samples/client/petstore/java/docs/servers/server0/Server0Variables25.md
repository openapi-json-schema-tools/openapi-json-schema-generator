# Server0Variables
public class Server0Variables<br>

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
| sealed interface | [Server0Variables.Server0Variables1Boxed](#server0variables1boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables1BoxedMap](#server0variables1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Server0Variables.Server0Variables1](#server0variables1)<br> schema class |
| static class | [Server0Variables.Server0Variables19](#server0variables19)<br> builder for Map payloads |
| static class | [Server0Variables.Server0Variables20](#server0variables20)<br> output class for Map payloads |
| sealed interface | [Server0Variables.Server0Variables8Boxed](#server0variables8boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables8BoxedString](#server0variables8boxedstring)<br> boxed class to store validated String payloads |
| static class | [Server0Variables.Server0Variables8](#server0variables8)<br> schema class |
| enum | [Server0Variables.StringServer0Variables10](#stringserver0variables10)<br>String enum |
| sealed interface | [Server0Variables.Server0Variables4Boxed](#server0variables4boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables4BoxedString](#server0variables4boxedstring)<br> boxed class to store validated String payloads |
| static class | [Server0Variables.Server0Variables4](#server0variables4)<br> schema class |
| enum | [Server0Variables.StringServer0Variables6](#stringserver0variables6)<br>String enum |
| sealed interface | [Server0Variables.Server0Variables13Boxed](#server0variables13boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables13BoxedVoid](#server0variables13boxedvoid)<br> boxed class to store validated null payloads |
| record | [Server0Variables.Server0Variables13BoxedBoolean](#server0variables13boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Server0Variables.Server0Variables13BoxedNumber](#server0variables13boxednumber)<br> boxed class to store validated Number payloads |
| record | [Server0Variables.Server0Variables13BoxedString](#server0variables13boxedstring)<br> boxed class to store validated String payloads |
| record | [Server0Variables.Server0Variables13BoxedList](#server0variables13boxedlist)<br> boxed class to store validated List payloads |
| record | [Server0Variables.Server0Variables13BoxedMap](#server0variables13boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Server0Variables.Server0Variables13](#server0variables13)<br> schema class |

## Server0Variables1Boxed
public sealed interface Server0Variables1Boxed<br>
permits<br>
[Server0Variables1BoxedMap](#server0variables1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Server0Variables1BoxedMap
public record Server0Variables1BoxedMap<br>
implements [Server0Variables1Boxed](#server0variables1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables1BoxedMap([Server0Variables20](#server0variables20) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables20](#server0variables20) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables1
public static class Server0Variables1<br>
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
import org.openapijsonschematools.client.servers.server0.Server0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Server0Variables.Server0Variables20 validatedPayload =
    Server0Variables.Server0Variables1.validate(
    new Server0Variables.Server0Variables19()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("server", [Server0Variables4.class](#server0variables4))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("port", [Server0Variables8.class](#server0variables8)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"port",<br>&nbsp;&nbsp;&nbsp;&nbsp;"server"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Server0Variables13.class](#server0variables13) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables20](#server0variables20) | validate([Map&lt;?, ?&gt;](#server0variables19) arg, SchemaConfiguration configuration) |
| [Server0Variables1BoxedMap](#server0variables1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#server0variables19) arg, SchemaConfiguration configuration) |
| [Server0Variables1Boxed](#server0variables1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Server0Variables21
public class Server0Variables21<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables21(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## Server0Variables22
public class Server0Variables22<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables22(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables21](#server0variables21) | server(String value) |
| [Server0Variables21](#server0variables21) | server([StringServer0Variables6](#stringserver0variables6) value) |

## Server0Variables23
public class Server0Variables23<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables23(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables21](#server0variables21) | port(String value) |
| [Server0Variables21](#server0variables21) | port([StringServer0Variables10](#stringserver0variables10) value) |

## Server0Variables19
public class Server0Variables19<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables19()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables22](#server0variables22) | port(String value) |
| [Server0Variables22](#server0variables22) | port([StringServer0Variables10](#stringserver0variables10) value) |
| [Server0Variables23](#server0variables23) | server(String value) |
| [Server0Variables23](#server0variables23) | server([StringServer0Variables6](#stringserver0variables6) value) |

## Server0Variables20
public static class Server0Variables20<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Server0Variables20](#server0variables20) | of([Map<String, String>](#server0variables19) arg, SchemaConfiguration configuration) |
| String | port()<br> must be one of ["80", "8080"] if omitted the server will use the default value of 80 |
| String | server()<br> must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the server will use the default value of petstore |

## Server0Variables8Boxed
public sealed interface Server0Variables8Boxed<br>
permits<br>
[Server0Variables8BoxedString](#server0variables8boxedstring)

sealed interface that stores validated payloads using boxed classes

## Server0Variables8BoxedString
public record Server0Variables8BoxedString<br>
implements [Server0Variables8Boxed](#server0variables8boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables8BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables8
public static class Server0Variables8<br>
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
import org.openapijsonschematools.client.servers.server0.Server0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Server0Variables.Server0Variables8.validate(
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
| String | validate([StringServer0Variables10](#stringserver0variables10) arg, SchemaConfiguration configuration) |
| [Server0Variables8BoxedString](#server0variables8boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Server0Variables8Boxed](#server0variables8boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServer0Variables10
public enum StringServer0Variables10<br>
extends `Enum<StringServer0Variables10>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_80 | value = "80" |
| POSITIVE_8080 | value = "8080" |

## Server0Variables4Boxed
public sealed interface Server0Variables4Boxed<br>
permits<br>
[Server0Variables4BoxedString](#server0variables4boxedstring)

sealed interface that stores validated payloads using boxed classes

## Server0Variables4BoxedString
public record Server0Variables4BoxedString<br>
implements [Server0Variables4Boxed](#server0variables4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables4
public static class Server0Variables4<br>
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
import org.openapijsonschematools.client.servers.server0.Server0Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Server0Variables.Server0Variables4.validate(
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
| String | validate([StringServer0Variables6](#stringserver0variables6) arg, SchemaConfiguration configuration) |
| [Server0Variables4BoxedString](#server0variables4boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Server0Variables4Boxed](#server0variables4boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServer0Variables6
public enum StringServer0Variables6<br>
extends `Enum<StringServer0Variables6>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PETSTORE | value = "petstore" |
| QA_HYPHEN_MINUS_PETSTORE | value = "qa-petstore" |
| DEV_HYPHEN_MINUS_PETSTORE | value = "dev-petstore" |

## Server0Variables13Boxed
public sealed interface Server0Variables13Boxed<br>
permits<br>
[Server0Variables13BoxedVoid](#server0variables13boxedvoid),
[Server0Variables13BoxedBoolean](#server0variables13boxedboolean),
[Server0Variables13BoxedNumber](#server0variables13boxednumber),
[Server0Variables13BoxedString](#server0variables13boxedstring),
[Server0Variables13BoxedList](#server0variables13boxedlist),
[Server0Variables13BoxedMap](#server0variables13boxedmap)

sealed interface that stores validated payloads using boxed classes

## Server0Variables13BoxedVoid
public record Server0Variables13BoxedVoid<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13BoxedBoolean
public record Server0Variables13BoxedBoolean<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13BoxedNumber
public record Server0Variables13BoxedNumber<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13BoxedString
public record Server0Variables13BoxedString<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13BoxedList
public record Server0Variables13BoxedList<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13BoxedMap
public record Server0Variables13BoxedMap<br>
implements [Server0Variables13Boxed](#server0variables13boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables13
public static class Server0Variables13<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
