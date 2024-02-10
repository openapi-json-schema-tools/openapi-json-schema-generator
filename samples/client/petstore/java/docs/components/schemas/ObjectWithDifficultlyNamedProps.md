# ObjectWithDifficultlyNamedProps
org.openapijsonschematools.client.components.schemas.ObjectWithDifficultlyNamedProps.java
public class ObjectWithDifficultlyNamedProps

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1Boxed](#objectwithdifficultlynamedprops1boxed)<br> sealed validated payload class |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1](#objectwithdifficultlynamedprops1)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMapBuilder](#objectwithdifficultlynamedpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap)<br> output class for Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123NumberBoxed](#schema123numberboxed)<br> sealed validated payload class |
| static class | [ObjectWithDifficultlyNamedProps.Schema123NumberBoxedNumber](#schema123numberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123Number](#schema123number)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.Schema123listBoxed](#schema123listboxed)<br> sealed validated payload class |
| static class | [ObjectWithDifficultlyNamedProps.Schema123listBoxedString](#schema123listboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123list](#schema123list)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.SpecialpropertynameBoxed](#specialpropertynameboxed)<br> sealed validated payload class |
| static class | [ObjectWithDifficultlyNamedProps.SpecialpropertynameBoxedNumber](#specialpropertynameboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithDifficultlyNamedProps.Specialpropertyname](#specialpropertyname)<br> schema class |

## ObjectWithDifficultlyNamedProps1Boxed
public static abstract sealed class ObjectWithDifficultlyNamedProps1Boxed<br>
permits<br>
[ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithDifficultlyNamedProps1BoxedMap
public static final class ObjectWithDifficultlyNamedProps1BoxedMap<br>
extends ObjectWithDifficultlyNamedProps1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDifficultlyNamedProps1BoxedMap(ObjectWithDifficultlyNamedPropsMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ObjectWithDifficultlyNamedPropsMap | data<br>validated payload |

## ObjectWithDifficultlyNamedProps1
public static class ObjectWithDifficultlyNamedProps1<br>
extends JsonSchema

A schema class that validates payloads

## Description
model with properties that have invalid names for python

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
ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap validatedPayload =
    ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1.validate(
    new ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMapBuilder()
        .set123HyphenMinusList("a")

        .setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(1L)

        .set123number(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("$special[property.name]", [Specialpropertyname.class](#specialpropertyname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("123-list", [Schema123list.class](#schema123list))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("123Number", [Schema123Number.class](#schema123number)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"123-list"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) | validate([Map&lt;?, ?&gt;](#objectwithdifficultlynamedpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap) | validateAndBox([ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithDifficultlyNamedPropsMap0Builder
public class ObjectWithDifficultlyNamedPropsMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDifficultlyNamedPropsMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(int value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(float value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(long value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(double value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | set123number(int value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | set123number(float value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | set123number(long value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | set123number(double value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, Void value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, boolean value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, String value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, int value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, float value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, long value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, double value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, List<?> value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectWithDifficultlyNamedPropsMapBuilder
public class ObjectWithDifficultlyNamedPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDifficultlyNamedPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | set123HyphenMinusList(String value) |

## ObjectWithDifficultlyNamedPropsMap
public static class ObjectWithDifficultlyNamedPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) | of([Map<String, ? extends @Nullable Object>](#objectwithdifficultlynamedpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema123NumberBoxed
public static abstract sealed class Schema123NumberBoxed<br>
permits<br>
[Schema123NumberBoxedNumber](#schema123numberboxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema123NumberBoxedNumber
public static final class Schema123NumberBoxedNumber<br>
extends Schema123NumberBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema123NumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema123Number
public static class Schema123Number<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema123listBoxed
public static abstract sealed class Schema123listBoxed<br>
permits<br>
[Schema123listBoxedString](#schema123listboxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema123listBoxedString
public static final class Schema123listBoxedString<br>
extends Schema123listBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema123listBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema123list
public static class Schema123list<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SpecialpropertynameBoxed
public static abstract sealed class SpecialpropertynameBoxed<br>
permits<br>
[SpecialpropertynameBoxedNumber](#specialpropertynameboxednumber)

A sealed class that stores validated payloads using boxed classes

## SpecialpropertynameBoxedNumber
public static final class SpecialpropertynameBoxedNumber<br>
extends SpecialpropertynameBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SpecialpropertynameBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Specialpropertyname
public static class Specialpropertyname<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
