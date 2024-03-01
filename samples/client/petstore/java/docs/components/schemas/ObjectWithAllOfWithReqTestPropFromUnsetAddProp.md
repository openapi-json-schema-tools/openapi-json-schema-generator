# ObjectWithAllOfWithReqTestPropFromUnsetAddProp
org.openapijsonschematools.client.components.schemas.ObjectWithAllOfWithReqTestPropFromUnsetAddProp.java
public class ObjectWithAllOfWithReqTestPropFromUnsetAddProp<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid](#objectwithallofwithreqtestpropfromunsetaddprop1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean](#objectwithallofwithreqtestpropfromunsetaddprop1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber](#objectwithallofwithreqtestpropfromunsetaddprop1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString](#objectwithallofwithreqtestpropfromunsetaddprop1boxedstring)<br> boxed class to store validated String payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList](#objectwithallofwithreqtestpropfromunsetaddprop1boxedlist)<br> boxed class to store validated List payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap](#objectwithallofwithreqtestpropfromunsetaddprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1](#objectwithallofwithreqtestpropfromunsetaddprop1)<br> schema class |
| sealed interface | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1](#schema1)<br> schema class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.NameBoxed](#nameboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Name](#name)<br> schema class |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed
public sealed interface ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed<br>
permits<br>
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid](#objectwithallofwithreqtestpropfromunsetaddprop1boxedvoid),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean](#objectwithallofwithreqtestpropfromunsetaddprop1boxedboolean),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber](#objectwithallofwithreqtestpropfromunsetaddprop1boxednumber),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString](#objectwithallofwithreqtestpropfromunsetaddprop1boxedstring),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList](#objectwithallofwithreqtestpropfromunsetaddprop1boxedlist),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap](#objectwithallofwithreqtestpropfromunsetaddprop1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap
public record ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap<br>
implements [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1
public static class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1.class](../../components/schemas/ObjectWithOptionalTestProp.md#objectwithoptionaltestprop1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString](#objectwithallofwithreqtestpropfromunsetaddprop1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid](#objectwithallofwithreqtestpropfromunsetaddprop1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber](#objectwithallofwithreqtestpropfromunsetaddprop1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean](#objectwithallofwithreqtestpropfromunsetaddprop1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap](#objectwithallofwithreqtestpropfromunsetaddprop1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList](#objectwithallofwithreqtestpropfromunsetaddprop1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
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
import org.openapijsonschematools.client.components.schemas.ObjectWithAllOfWithReqTestPropFromUnsetAddProp;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1Map validatedPayload =
    ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1.validate(
    new ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1MapBuilder()
        .name("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"test"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Map0Builder
public class Schema1Map0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1Map0Builder](#schema1map0builder) | name(String value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, Void value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, boolean value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, String value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, int value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, float value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, long value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, double value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, List<?> value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map0Builder](#schema1map0builder) | test(Void value) |
| [Schema1Map0Builder](#schema1map0builder) | test(boolean value) |
| [Schema1Map0Builder](#schema1map0builder) | test(String value) |
| [Schema1Map0Builder](#schema1map0builder) | test(int value) |
| [Schema1Map0Builder](#schema1map0builder) | test(float value) |
| [Schema1Map0Builder](#schema1map0builder) | test(long value) |
| [Schema1Map0Builder](#schema1map0builder) | test(double value) |
| [Schema1Map0Builder](#schema1map0builder) | test(List<?> value) |
| [Schema1Map0Builder](#schema1map0builder) | test(Map<String, ?> value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | test()<br> |
| String | name()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NameBoxed
public sealed interface NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

sealed interface that stores validated payloads using boxed classes

## NameBoxedString
public record NameBoxedString<br>
implements [NameBoxed](#nameboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
