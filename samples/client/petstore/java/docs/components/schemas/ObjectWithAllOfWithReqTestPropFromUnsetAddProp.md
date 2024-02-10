# ObjectWithAllOfWithReqTestPropFromUnsetAddProp
org.openapijsonschematools.client.components.schemas.ObjectWithAllOfWithReqTestPropFromUnsetAddProp.java
public class ObjectWithAllOfWithReqTestPropFromUnsetAddProp

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed](#objectwithallofwithreqtestpropfromunsetaddprop1boxed)<br> sealed validated payload class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid](#objectwithallofwithreqtestpropfromunsetaddprop1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean](#objectwithallofwithreqtestpropfromunsetaddprop1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber](#objectwithallofwithreqtestpropfromunsetaddprop1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString](#objectwithallofwithreqtestpropfromunsetaddprop1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList](#objectwithallofwithreqtestpropfromunsetaddprop1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap](#objectwithallofwithreqtestpropfromunsetaddprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.ObjectWithAllOfWithReqTestPropFromUnsetAddProp1](#objectwithallofwithreqtestpropfromunsetaddprop1)<br> schema class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1](#schema1)<br> schema class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.NameBoxed](#nameboxed)<br> sealed validated payload class |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithAllOfWithReqTestPropFromUnsetAddProp.Name](#name)<br> schema class |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed
public static abstract sealed class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed<br>
permits<br>
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid](#objectwithallofwithreqtestpropfromunsetaddprop1boxedvoid),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean](#objectwithallofwithreqtestpropfromunsetaddprop1boxedboolean),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber](#objectwithallofwithreqtestpropfromunsetaddprop1boxednumber),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString](#objectwithallofwithreqtestpropfromunsetaddprop1boxedstring),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList](#objectwithallofwithreqtestpropfromunsetaddprop1boxedlist),
[ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap](#objectwithallofwithreqtestpropfromunsetaddprop1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap
public static final class ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap<br>
extends ObjectWithAllOfWithReqTestPropFromUnsetAddProp1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithAllOfWithReqTestPropFromUnsetAddProp1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends Schema1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(Schema1Map data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Schema1Map | data<br>validated payload |

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
public static abstract sealed class NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

A sealed class that stores validated payloads using boxed classes

## NameBoxedString
public static final class NameBoxedString<br>
extends NameBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
