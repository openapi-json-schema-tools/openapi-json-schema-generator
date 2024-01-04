# ObjectWithDifficultlyNamedProps
org.openapijsonschematools.client.components.schemas.ObjectWithDifficultlyNamedProps.java
public class ObjectWithDifficultlyNamedProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1](#objectwithdifficultlynamedprops1)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMapBuilder](#objectwithdifficultlynamedpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap)<br> output class for Map payloads |
| static class | [ObjectWithDifficultlyNamedProps.Schema123Number](#schema123number)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.Schema123list](#schema123list)<br> schema class |
| static class | [ObjectWithDifficultlyNamedProps.Specialpropertyname](#specialpropertyname)<br> schema class |

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
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "123-list",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "$special[property.name]",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "123Number",
            1L
        )
    ),
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
| [ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) | validate([Map<?, ?>](#objectwithdifficultlynamedpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithDifficultlyNamedPropsMap0Builder
public class ObjectWithDifficultlyNamedPropsMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
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
## ObjectWithDifficultlyNamedPropsMapBuilder
public class ObjectWithDifficultlyNamedPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
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
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema123Number
public static class Schema123Number<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema123list
public static class Schema123list<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Specialpropertyname
public static class Specialpropertyname<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
