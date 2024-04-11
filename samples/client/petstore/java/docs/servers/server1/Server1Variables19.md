# Server1Variables
public class Server1Variables<br>

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
| sealed interface | [Server1Variables.Server1Variables1Boxed](#server1variables1boxed)<br> sealed interface for validated payloads |
| record | [Server1Variables.Server1Variables1BoxedMap](#server1variables1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Server1Variables.Server1Variables1](#server1variables1)<br> schema class |
| static class | [Server1Variables.Server1Variables15](#server1variables15)<br> builder for Map payloads |
| static class | [Server1Variables.Server1Variables16](#server1variables16)<br> output class for Map payloads |
| sealed interface | [Server1Variables.Server1Variables4Boxed](#server1variables4boxed)<br> sealed interface for validated payloads |
| record | [Server1Variables.Server1Variables4BoxedString](#server1variables4boxedstring)<br> boxed class to store validated String payloads |
| static class | [Server1Variables.Server1Variables4](#server1variables4)<br> schema class |
| enum | [Server1Variables.StringServer1Variables6](#stringserver1variables6)<br>String enum |
| sealed interface | [Server1Variables.Server1Variables9Boxed](#server1variables9boxed)<br> sealed interface for validated payloads |
| record | [Server1Variables.Server1Variables9BoxedVoid](#server1variables9boxedvoid)<br> boxed class to store validated null payloads |
| record | [Server1Variables.Server1Variables9BoxedBoolean](#server1variables9boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Server1Variables.Server1Variables9BoxedNumber](#server1variables9boxednumber)<br> boxed class to store validated Number payloads |
| record | [Server1Variables.Server1Variables9BoxedString](#server1variables9boxedstring)<br> boxed class to store validated String payloads |
| record | [Server1Variables.Server1Variables9BoxedList](#server1variables9boxedlist)<br> boxed class to store validated List payloads |
| record | [Server1Variables.Server1Variables9BoxedMap](#server1variables9boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Server1Variables.Server1Variables9](#server1variables9)<br> schema class |

## Server1Variables1Boxed
public sealed interface Server1Variables1Boxed<br>
permits<br>
[Server1Variables1BoxedMap](#server1variables1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Server1Variables1BoxedMap
public record Server1Variables1BoxedMap<br>
implements [Server1Variables1Boxed](#server1variables1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables1BoxedMap([Server1Variables16](#server1variables16) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server1Variables16](#server1variables16) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables1
public static class Server1Variables1<br>
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
import org.openapijsonschematools.client.servers.server1.Server1Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Server1Variables.Server1Variables16 validatedPayload =
    Server1Variables.Server1Variables1.validate(
    new Server1Variables.Server1Variables15()
        .version("v1")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("version", [Server1Variables4.class](#server1variables4)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"version"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Server1Variables9.class](#server1variables9) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server1Variables16](#server1variables16) | validate([Map&lt;?, ?&gt;](#server1variables15) arg, SchemaConfiguration configuration) |
| [Server1Variables1BoxedMap](#server1variables1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#server1variables15) arg, SchemaConfiguration configuration) |
| [Server1Variables1Boxed](#server1variables1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Server1Variables17
public class Server1Variables17<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables17(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## Server1Variables15
public class Server1Variables15<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables15()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Server1Variables17](#server1variables17) | version(String value) |
| [Server1Variables17](#server1variables17) | version([StringServer1Variables6](#stringserver1variables6) value) |

## Server1Variables16
public static class Server1Variables16<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Server1Variables16](#server1variables16) | of([Map<String, String>](#server1variables15) arg, SchemaConfiguration configuration) |
| String | version()<br> must be one of ["v1", "v2"] if omitted the server will use the default value of v2 |

## Server1Variables4Boxed
public sealed interface Server1Variables4Boxed<br>
permits<br>
[Server1Variables4BoxedString](#server1variables4boxedstring)

sealed interface that stores validated payloads using boxed classes

## Server1Variables4BoxedString
public record Server1Variables4BoxedString<br>
implements [Server1Variables4Boxed](#server1variables4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables4
public static class Server1Variables4<br>
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
import org.openapijsonschematools.client.servers.server1.Server1Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Server1Variables.Server1Variables4.validate(
    "v1",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"v1",<br>&nbsp;&nbsp;&nbsp;&nbsp;"v2"<br>)<br> |
| @Nullable Object | defaultValue = "v2" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringServer1Variables6](#stringserver1variables6) arg, SchemaConfiguration configuration) |
| [Server1Variables4BoxedString](#server1variables4boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Server1Variables4Boxed](#server1variables4boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringServer1Variables6
public enum StringServer1Variables6<br>
extends `Enum<StringServer1Variables6>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| V1 | value = "v1" |
| V2 | value = "v2" |

## Server1Variables9Boxed
public sealed interface Server1Variables9Boxed<br>
permits<br>
[Server1Variables9BoxedVoid](#server1variables9boxedvoid),
[Server1Variables9BoxedBoolean](#server1variables9boxedboolean),
[Server1Variables9BoxedNumber](#server1variables9boxednumber),
[Server1Variables9BoxedString](#server1variables9boxedstring),
[Server1Variables9BoxedList](#server1variables9boxedlist),
[Server1Variables9BoxedMap](#server1variables9boxedmap)

sealed interface that stores validated payloads using boxed classes

## Server1Variables9BoxedVoid
public record Server1Variables9BoxedVoid<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9BoxedBoolean
public record Server1Variables9BoxedBoolean<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9BoxedNumber
public record Server1Variables9BoxedNumber<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9BoxedString
public record Server1Variables9BoxedString<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9BoxedList
public record Server1Variables9BoxedList<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9BoxedMap
public record Server1Variables9BoxedMap<br>
implements [Server1Variables9Boxed](#server1variables9boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Server1Variables9BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Server1Variables9
public static class Server1Variables9<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
