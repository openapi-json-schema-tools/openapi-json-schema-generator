# ObjectWithDifficultlyNamedProps
org.openapijsonschematools.client.components.schemas.ObjectWithDifficultlyNamedProps.java
public class ObjectWithDifficultlyNamedProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1Boxed](#objectwithdifficultlynamedprops1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1](#objectwithdifficultlynamedprops1)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMapBuilder](#objectwithdifficultlynamedpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap)<br> output class for Map payloads |
| sealed interface | [ObjectWithDifficultlyNamedProps.Schema123NumberBoxed](#schema123numberboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDifficultlyNamedProps.Schema123NumberBoxedNumber](#schema123numberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123Number](#schema123number)<br> schema class |
| sealed interface | [ObjectWithDifficultlyNamedProps.Schema123listBoxed](#schema123listboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDifficultlyNamedProps.Schema123listBoxedString](#schema123listboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123list](#schema123list)<br> schema class |
| sealed interface | [ObjectWithDifficultlyNamedProps.SpecialpropertynameBoxed](#specialpropertynameboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDifficultlyNamedProps.SpecialpropertynameBoxedNumber](#specialpropertynameboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithDifficultlyNamedProps.Specialpropertyname](#specialpropertyname)<br> schema class |

## ObjectWithDifficultlyNamedProps1Boxed
public sealed interface ObjectWithDifficultlyNamedProps1Boxed<br>
permits<br>
[ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithDifficultlyNamedProps1BoxedMap
public record ObjectWithDifficultlyNamedProps1BoxedMap<br>
implements [ObjectWithDifficultlyNamedProps1Boxed](#objectwithdifficultlynamedprops1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDifficultlyNamedProps1BoxedMap([ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.ObjectWithDifficultlyNamedProps;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap validatedPayload =
    ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1.validate(
    new ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMapBuilder()
        .digitOne23HyphenMinusList("a")

        .dollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(1L)

        .digitOne23number(1)

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
| [ObjectWithDifficultlyNamedProps1BoxedMap](#objectwithdifficultlynamedprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithdifficultlynamedpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithDifficultlyNamedProps1Boxed](#objectwithdifficultlynamedprops1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | dollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(int value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | dollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(float value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | dollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(long value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | dollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(double value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | digitOne23number(int value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | digitOne23number(float value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | digitOne23number(long value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | digitOne23number(double value) |
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | additionalProperty(String key, Nothing? value) |
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
| [ObjectWithDifficultlyNamedPropsMap0Builder](#objectwithdifficultlynamedpropsmap0builder) | digitOne23HyphenMinusList(String value) |

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
public sealed interface Schema123NumberBoxed<br>
permits<br>
[Schema123NumberBoxedNumber](#schema123numberboxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema123NumberBoxedNumber
public record Schema123NumberBoxedNumber<br>
implements [Schema123NumberBoxed](#schema123numberboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema123NumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema123Number
public static class Schema123Number<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema123listBoxed
public sealed interface Schema123listBoxed<br>
permits<br>
[Schema123listBoxedString](#schema123listboxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema123listBoxedString
public record Schema123listBoxedString<br>
implements [Schema123listBoxed](#schema123listboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema123listBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema123list
public static class Schema123list<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SpecialpropertynameBoxed
public sealed interface SpecialpropertynameBoxed<br>
permits<br>
[SpecialpropertynameBoxedNumber](#specialpropertynameboxednumber)

sealed interface that stores validated payloads using boxed classes

## SpecialpropertynameBoxedNumber
public record SpecialpropertynameBoxedNumber<br>
implements [SpecialpropertynameBoxed](#specialpropertynameboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SpecialpropertynameBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Specialpropertyname
public static class Specialpropertyname<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
