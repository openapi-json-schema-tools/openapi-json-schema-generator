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
| static class | [Server0Variables.Server0Variables13](#server0variables13)<br> builder for Map payloads |
| static class | [Server0Variables.Server0Variables14](#server0variables14)<br> output class for Map payloads |
| sealed interface | [Server0Variables.Server0Variables5Boxed](#server0variables5boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables5BoxedString](#server0variables5boxedstring)<br> boxed class to store validated String payloads |
| static class | [Server0Variables.Server0Variables5](#server0variables5)<br> schema class |
| enum | [Server0Variables.StringServer0Variables6](#stringserver0variables6)<br>String enum |
| sealed interface | [Server0Variables.Server0Variables2Boxed](#server0variables2boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables2BoxedString](#server0variables2boxedstring)<br> boxed class to store validated String payloads |
| static class | [Server0Variables.Server0Variables2](#server0variables2)<br> schema class |
| enum | [Server0Variables.StringServer0Variables3](#stringserver0variables3)<br>String enum |
| sealed interface | [Server0Variables.Server0Variables9Boxed](#server0variables9boxed)<br> sealed interface for validated payloads |
| record | [Server0Variables.Server0Variables9BoxedVoid](#server0variables9boxedvoid)<br> boxed class to store validated null payloads |
| record | [Server0Variables.Server0Variables9BoxedBoolean](#server0variables9boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Server0Variables.Server0Variables9BoxedNumber](#server0variables9boxednumber)<br> boxed class to store validated Number payloads |
| record | [Server0Variables.Server0Variables9BoxedString](#server0variables9boxedstring)<br> boxed class to store validated String payloads |
| record | [Server0Variables.Server0Variables9BoxedList](#server0variables9boxedlist)<br> boxed class to store validated List payloads |
| record | [Server0Variables.Server0Variables9BoxedMap](#server0variables9boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Server0Variables.Server0Variables9](#server0variables9)<br> schema class |

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
| Server0Variables1BoxedMap([Server0Variables14](#server0variables14) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables14](#server0variables14) | data()<br>validated payload |
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
Server0Variables.Server0Variables14 validatedPayload =
    Server0Variables.Server0Variables1.validate(
    new Server0Variables.Server0Variables13()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("server", [Server0Variables2.class](#server0variables2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("port", [Server0Variables5.class](#server0variables5)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"port",<br>&nbsp;&nbsp;&nbsp;&nbsp;"server"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Server0Variables9.class](#server0variables9) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables14](#server0variables14) | validate([Map&lt;?, ?&gt;](#server0variables13) arg, SchemaConfiguration configuration) |
| [Server0Variables1BoxedMap](#server0variables1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#server0variables13) arg, SchemaConfiguration configuration) |
| [Server0Variables1Boxed](#server0variables1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Server0Variables15
public class Server0Variables15<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables15(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## Server0Variables16
public class Server0Variables16<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables16(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables15](#server0variables15) | server(String value) |
| [Server0Variables15](#server0variables15) | server([StringServer0Variables3](#stringserver0variables3) value) |

## Server0Variables17
public class Server0Variables17<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables17(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables15](#server0variables15) | port(String value) |
| [Server0Variables15](#server0variables15) | port([StringServer0Variables6](#stringserver0variables6) value) |

## Server0Variables13
public class Server0Variables13<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables13()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server0Variables16](#server0variables16) | port(String value) |
| [Server0Variables16](#server0variables16) | port([StringServer0Variables6](#stringserver0variables6) value) |
| [Server0Variables17](#server0variables17) | server(String value) |
| [Server0Variables17](#server0variables17) | server([StringServer0Variables3](#stringserver0variables3) value) |

## Server0Variables14
public static class Server0Variables14<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Server0Variables14](#server0variables14) | of([Map<String, String>](#server0variables13) arg, SchemaConfiguration configuration) |
| String | port()<br> must be one of ["80", "8080"] if omitted the server will use the default value of 80 |
| String | server()<br> must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the server will use the default value of petstore |

## Server0Variables5Boxed
public sealed interface Server0Variables5Boxed<br>
permits<br>
[Server0Variables5BoxedString](#server0variables5boxedstring)

sealed interface that stores validated payloads using boxed classes

## Server0Variables5BoxedString
public record Server0Variables5BoxedString<br>
implements [Server0Variables5Boxed](#server0variables5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables5
public static class Server0Variables5<br>
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
String validatedPayload = Server0Variables.Server0Variables5.validate(
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
| String | validate([StringServer0Variables6](#stringserver0variables6) arg, SchemaConfiguration configuration) |
| [Server0Variables5BoxedString](#server0variables5boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Server0Variables5Boxed](#server0variables5boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServer0Variables6
public enum StringServer0Variables6<br>
extends `Enum<StringServer0Variables6>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_80 | value = "80" |
| POSITIVE_8080 | value = "8080" |

## Server0Variables2Boxed
public sealed interface Server0Variables2Boxed<br>
permits<br>
[Server0Variables2BoxedString](#server0variables2boxedstring)

sealed interface that stores validated payloads using boxed classes

## Server0Variables2BoxedString
public record Server0Variables2BoxedString<br>
implements [Server0Variables2Boxed](#server0variables2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables2
public static class Server0Variables2<br>
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
String validatedPayload = Server0Variables.Server0Variables2.validate(
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
| String | validate([StringServer0Variables3](#stringserver0variables3) arg, SchemaConfiguration configuration) |
| [Server0Variables2BoxedString](#server0variables2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Server0Variables2Boxed](#server0variables2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServer0Variables3
public enum StringServer0Variables3<br>
extends `Enum<StringServer0Variables3>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PETSTORE | value = "petstore" |
| QA_HYPHEN_MINUS_PETSTORE | value = "qa-petstore" |
| DEV_HYPHEN_MINUS_PETSTORE | value = "dev-petstore" |

## Server0Variables9Boxed
public sealed interface Server0Variables9Boxed<br>
permits<br>
[Server0Variables9BoxedVoid](#server0variables9boxedvoid),
[Server0Variables9BoxedBoolean](#server0variables9boxedboolean),
[Server0Variables9BoxedNumber](#server0variables9boxednumber),
[Server0Variables9BoxedString](#server0variables9boxedstring),
[Server0Variables9BoxedList](#server0variables9boxedlist),
[Server0Variables9BoxedMap](#server0variables9boxedmap)

sealed interface that stores validated payloads using boxed classes

## Server0Variables9BoxedVoid
public record Server0Variables9BoxedVoid<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9BoxedBoolean
public record Server0Variables9BoxedBoolean<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9BoxedNumber
public record Server0Variables9BoxedNumber<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9BoxedString
public record Server0Variables9BoxedString<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9BoxedList
public record Server0Variables9BoxedList<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9BoxedMap
public record Server0Variables9BoxedMap<br>
implements [Server0Variables9Boxed](#server0variables9boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server0Variables9BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server0Variables9
public static class Server0Variables9<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
