# FooGetServer1Variables
public class FooGetServer1Variables<br>

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
| sealed interface | [FooGetServer1Variables.FooGetServer1Variables1Boxed](#foogetserver1variables1boxed)<br> sealed interface for validated payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables1BoxedMap](#foogetserver1variables1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FooGetServer1Variables.FooGetServer1Variables1](#foogetserver1variables1)<br> schema class |
| static class | [FooGetServer1Variables.FooGetServer1Variables10](#foogetserver1variables10)<br> builder for Map payloads |
| static class | [FooGetServer1Variables.FooGetServer1Variables11](#foogetserver1variables11)<br> output class for Map payloads |
| sealed interface | [FooGetServer1Variables.FooGetServer1Variables2Boxed](#foogetserver1variables2boxed)<br> sealed interface for validated payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables2BoxedString](#foogetserver1variables2boxedstring)<br> boxed class to store validated String payloads |
| static class | [FooGetServer1Variables.FooGetServer1Variables2](#foogetserver1variables2)<br> schema class |
| enum | [FooGetServer1Variables.StringFooGetServer1Variables3](#stringfoogetserver1variables3)<br>String enum |
| sealed interface | [FooGetServer1Variables.FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)<br> sealed interface for validated payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedVoid](#foogetserver1variables6boxedvoid)<br> boxed class to store validated null payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedBoolean](#foogetserver1variables6boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedNumber](#foogetserver1variables6boxednumber)<br> boxed class to store validated Number payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedString](#foogetserver1variables6boxedstring)<br> boxed class to store validated String payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedList](#foogetserver1variables6boxedlist)<br> boxed class to store validated List payloads |
| record | [FooGetServer1Variables.FooGetServer1Variables6BoxedMap](#foogetserver1variables6boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FooGetServer1Variables.FooGetServer1Variables6](#foogetserver1variables6)<br> schema class |

## FooGetServer1Variables1Boxed
public sealed interface FooGetServer1Variables1Boxed<br>
permits<br>
[FooGetServer1Variables1BoxedMap](#foogetserver1variables1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FooGetServer1Variables1BoxedMap
public record FooGetServer1Variables1BoxedMap<br>
implements [FooGetServer1Variables1Boxed](#foogetserver1variables1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables1BoxedMap([FooGetServer1Variables11](#foogetserver1variables11) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooGetServer1Variables11](#foogetserver1variables11) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables1
public static class FooGetServer1Variables1<br>
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
import org.openapijsonschematools.client.paths.foo.get.servers.server1.FooGetServer1Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FooGetServer1Variables.FooGetServer1Variables11 validatedPayload =
    FooGetServer1Variables.FooGetServer1Variables1.validate(
    new FooGetServer1Variables.FooGetServer1Variables10()
        .version("v1")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("version", [FooGetServer1Variables2.class](#foogetserver1variables2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"version"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FooGetServer1Variables6.class](#foogetserver1variables6) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooGetServer1Variables11](#foogetserver1variables11) | validate([Map&lt;?, ?&gt;](#foogetserver1variables10) arg, SchemaConfiguration configuration) |
| [FooGetServer1Variables1BoxedMap](#foogetserver1variables1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#foogetserver1variables10) arg, SchemaConfiguration configuration) |
| [FooGetServer1Variables1Boxed](#foogetserver1variables1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FooGetServer1Variables12
public class FooGetServer1Variables12<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables12(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## FooGetServer1Variables10
public class FooGetServer1Variables10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables10()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooGetServer1Variables12](#foogetserver1variables12) | version(String value) |
| [FooGetServer1Variables12](#foogetserver1variables12) | version([StringFooGetServer1Variables3](#stringfoogetserver1variables3) value) |

## FooGetServer1Variables11
public static class FooGetServer1Variables11<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FooGetServer1Variables11](#foogetserver1variables11) | of([Map<String, String>](#foogetserver1variables10) arg, SchemaConfiguration configuration) |
| String | version()<br> must be one of ["v1", "v2"] if omitted the server will use the default value of v1 |

## FooGetServer1Variables2Boxed
public sealed interface FooGetServer1Variables2Boxed<br>
permits<br>
[FooGetServer1Variables2BoxedString](#foogetserver1variables2boxedstring)

sealed interface that stores validated payloads using boxed classes

## FooGetServer1Variables2BoxedString
public record FooGetServer1Variables2BoxedString<br>
implements [FooGetServer1Variables2Boxed](#foogetserver1variables2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables2
public static class FooGetServer1Variables2<br>
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
import org.openapijsonschematools.client.paths.foo.get.servers.server1.FooGetServer1Variables;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = FooGetServer1Variables.FooGetServer1Variables2.validate(
    "v1",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"v1",<br>&nbsp;&nbsp;&nbsp;&nbsp;"v2"<br>)<br> |
| @Nullable Object | defaultValue = "v1" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringFooGetServer1Variables3](#stringfoogetserver1variables3) arg, SchemaConfiguration configuration) |
| [FooGetServer1Variables2BoxedString](#foogetserver1variables2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FooGetServer1Variables2Boxed](#foogetserver1variables2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringFooGetServer1Variables3
public enum StringFooGetServer1Variables3<br>
extends `Enum<StringFooGetServer1Variables3>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| V1 | value = "v1" |
| V2 | value = "v2" |

## FooGetServer1Variables6Boxed
public sealed interface FooGetServer1Variables6Boxed<br>
permits<br>
[FooGetServer1Variables6BoxedVoid](#foogetserver1variables6boxedvoid),
[FooGetServer1Variables6BoxedBoolean](#foogetserver1variables6boxedboolean),
[FooGetServer1Variables6BoxedNumber](#foogetserver1variables6boxednumber),
[FooGetServer1Variables6BoxedString](#foogetserver1variables6boxedstring),
[FooGetServer1Variables6BoxedList](#foogetserver1variables6boxedlist),
[FooGetServer1Variables6BoxedMap](#foogetserver1variables6boxedmap)

sealed interface that stores validated payloads using boxed classes

## FooGetServer1Variables6BoxedVoid
public record FooGetServer1Variables6BoxedVoid<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6BoxedBoolean
public record FooGetServer1Variables6BoxedBoolean<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6BoxedNumber
public record FooGetServer1Variables6BoxedNumber<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6BoxedString
public record FooGetServer1Variables6BoxedString<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6BoxedList
public record FooGetServer1Variables6BoxedList<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6BoxedMap
public record FooGetServer1Variables6BoxedMap<br>
implements [FooGetServer1Variables6Boxed](#foogetserver1variables6boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServer1Variables6BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooGetServer1Variables6
public static class FooGetServer1Variables6<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
