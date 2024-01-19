# NullableClass
org.openapijsonschematools.client.components.schemas.NullableClass.java
public class NullableClass

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullableClass.NullableClass1](#nullableclass1)<br> schema class |
| static class | [NullableClass.NullableClassMapBuilder](#nullableclassmapbuilder)<br> builder for Map payloads |
| static class | [NullableClass.NullableClassMap](#nullableclassmap)<br> output class for Map payloads |
| static class | [NullableClass.ObjectItemsNullable](#objectitemsnullable)<br> schema class |
| static class | [NullableClass.ObjectItemsNullableMapBuilder](#objectitemsnullablemapbuilder)<br> builder for Map payloads |
| static class | [NullableClass.ObjectItemsNullableMap](#objectitemsnullablemap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [NullableClass.ObjectAndItemsNullableProp](#objectanditemsnullableprop)<br> schema class |
| static class | [NullableClass.ObjectAndItemsNullablePropMapBuilder](#objectanditemsnullablepropmapbuilder)<br> builder for Map payloads |
| static class | [NullableClass.ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [NullableClass.ObjectNullableProp](#objectnullableprop)<br> schema class |
| static class | [NullableClass.ObjectNullablePropMapBuilder](#objectnullablepropmapbuilder)<br> builder for Map payloads |
| static class | [NullableClass.ObjectNullablePropMap](#objectnullablepropmap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [NullableClass.ArrayItemsNullable](#arrayitemsnullable)<br> schema class |
| static class | [NullableClass.ArrayItemsNullableListBuilder](#arrayitemsnullablelistbuilder)<br> builder for List payloads |
| static class | [NullableClass.ArrayItemsNullableList](#arrayitemsnullablelist)<br> output class for List payloads |
| static class | [NullableClass.Items2](#items2)<br> schema class |
| static class | [NullableClass.ArrayAndItemsNullableProp](#arrayanditemsnullableprop)<br> schema class |
| static class | [NullableClass.ArrayAndItemsNullablePropListBuilder](#arrayanditemsnullableproplistbuilder)<br> builder for List payloads |
| static class | [NullableClass.ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist)<br> output class for List payloads |
| static class | [NullableClass.Items1](#items1)<br> schema class |
| static class | [NullableClass.ArrayNullableProp](#arraynullableprop)<br> schema class |
| static class | [NullableClass.ArrayNullablePropListBuilder](#arraynullableproplistbuilder)<br> builder for List payloads |
| static class | [NullableClass.ArrayNullablePropList](#arraynullableproplist)<br> output class for List payloads |
| static class | [NullableClass.Items](#items)<br> schema class |
| static class | [NullableClass.DatetimeProp](#datetimeprop)<br> schema class |
| static class | [NullableClass.DateProp](#dateprop)<br> schema class |
| static class | [NullableClass.StringProp](#stringprop)<br> schema class |
| static class | [NullableClass.BooleanProp](#booleanprop)<br> schema class |
| static class | [NullableClass.NumberProp](#numberprop)<br> schema class |
| static class | [NullableClass.IntegerProp](#integerprop)<br> schema class |
| static class | [NullableClass.AdditionalProperties3](#additionalproperties3)<br> schema class |

## NullableClass1
public static class NullableClass1<br>
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
NullableClass.NullableClassMap validatedPayload =
    NullableClass.NullableClass1.validate(
    new NullableClass.NullableClassMapBuilder()
        .integer_prop(null)

        .number_prop(null)

        .boolean_prop(null)

        .string_prop(null)

        .date_prop(null)

        .datetime_prop(null)

        .array_nullable_prop(null)

        .array_and_items_nullable_prop(null)

        .array_items_nullable(
            Arrays.asList(
                null
            )
        )
        .object_nullable_prop(null)

        .object_and_items_nullable_prop(null)

        .object_items_nullable(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Void>(
                    "someAdditionalProperty",
                    null
                )
            )
        )
        .additionalProperty("someAdditionalProperty", null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer_prop", [IntegerProp.class](#integerprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number_prop", [NumberProp.class](#numberprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("boolean_prop", [BooleanProp.class](#booleanprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string_prop", [StringProp.class](#stringprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date_prop", [DateProp.class](#dateprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("datetime_prop", [DatetimeProp.class](#datetimeprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_nullable_prop", [ArrayNullableProp.class](#arraynullableprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_and_items_nullable_prop", [ArrayAndItemsNullableProp.class](#arrayanditemsnullableprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_items_nullable", [ArrayItemsNullable.class](#arrayitemsnullable))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_nullable_prop", [ObjectNullableProp.class](#objectnullableprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_and_items_nullable_prop", [ObjectAndItemsNullableProp.class](#objectanditemsnullableprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_items_nullable", [ObjectItemsNullable.class](#objectitemsnullable)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties3.class](#additionalproperties3) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NullableClassMap](#nullableclassmap) | validate([Map&lt;?, ?&gt;](#nullableclassmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NullableClassMapBuilder
public class NullableClassMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableClassMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | integer_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | integer_prop(int value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | integer_prop(float value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | integer_prop(long value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | integer_prop(double value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | number_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | number_prop(int value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | number_prop(float value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | number_prop(long value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | number_prop(double value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | boolean_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | boolean_prop(boolean value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | string_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | string_prop(String value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | date_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | date_prop(String value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | datetime_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | datetime_prop(String value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | array_nullable_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | array_nullable_prop(List<Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | array_and_items_nullable_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | array_and_items_nullable_prop(List<@Nullable Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | array_items_nullable(List<@Nullable Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | object_nullable_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | object_nullable_prop(Map<String, Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | object_and_items_nullable_prop(Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | object_and_items_nullable_prop(Map<String, @Nullable Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | object_items_nullable(Map<String, @Nullable Map<String, @Nullable Object>> value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | additionalProperty(String key, Void value) |
| [NullableClassMapBuilder](#nullableclassmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## NullableClassMap
public static class NullableClassMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NullableClassMap](#nullableclassmap) | of([Map<String, ? extends @Nullable Object>](#nullableclassmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Number | integer_prop()<br>[optional] |
| @Nullable Number | number_prop()<br>[optional] |
| @Nullable Boolean | boolean_prop()<br>[optional] |
| @Nullable String | string_prop()<br>[optional] |
| @Nullable String | date_prop()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| @Nullable String | datetime_prop()<br>[optional] value must conform to RFC-3339 date-time |
| [ArrayNullablePropList](#arraynullableproplist) | array_nullable_prop()<br>[optional] |
| [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | array_and_items_nullable_prop()<br>[optional] |
| [ArrayItemsNullableList](#arrayitemsnullablelist) | array_items_nullable()<br>[optional] |
| [ObjectNullablePropMap](#objectnullablepropmap) | object_nullable_prop()<br>[optional] |
| [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | object_and_items_nullable_prop()<br>[optional] |
| [ObjectItemsNullableMap](#objectitemsnullablemap) | object_items_nullable()<br>[optional] |
| @Nullable FrozenMap<?> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ObjectItemsNullable
public static class ObjectItemsNullable<br>
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
NullableClass.ObjectItemsNullableMap validatedPayload =
    NullableClass.ObjectItemsNullable.validate(
    new NullableClass.ObjectItemsNullableMapBuilder()
        .additionalProperty("someAdditionalProperty", null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties2.class](#additionalproperties2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectItemsNullableMap](#objectitemsnullablemap) | validate([Map&lt;?, ?&gt;](#objectitemsnullablemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectItemsNullableMapBuilder
public class ObjectItemsNullableMapBuilder<br>
builder for `Map<String, @Nullable Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectItemsNullableMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectItemsNullableMapBuilder](#objectitemsnullablemapbuilder) | additionalProperty(String key, Void value) |
| [ObjectItemsNullableMapBuilder](#objectitemsnullablemapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## ObjectItemsNullableMap
public static class ObjectItemsNullableMap<br>
extends FrozenMap<String, @Nullable FrozenMap<?>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectItemsNullableMap](#objectitemsnullablemap) | of([Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>>](#objectitemsnullablemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable FrozenMap<?> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties2
public static class AdditionalProperties2<br>
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

// null validation
Void validatedPayload = NullableClass.AdditionalProperties2.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectAndItemsNullableProp
public static class ObjectAndItemsNullableProp<br>
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

// null validation
Void validatedPayload = NullableClass.ObjectAndItemsNullableProp.validate(
    (Void) null,
    configuration
);

// Map validation
NullableClass.ObjectAndItemsNullablePropMap validatedPayload =
    NullableClass.ObjectAndItemsNullableProp.validate(
    new NullableClass.ObjectAndItemsNullablePropMapBuilder()
        .additionalProperty("someAdditionalProperty", null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties1.class](#additionalproperties1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | validate([Map&lt;?, ?&gt;](#objectanditemsnullablepropmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectAndItemsNullablePropMapBuilder
public class ObjectAndItemsNullablePropMapBuilder<br>
builder for `Map<String, @Nullable Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectAndItemsNullablePropMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectAndItemsNullablePropMapBuilder](#objectanditemsnullablepropmapbuilder) | additionalProperty(String key, Void value) |
| [ObjectAndItemsNullablePropMapBuilder](#objectanditemsnullablepropmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## ObjectAndItemsNullablePropMap
public static class ObjectAndItemsNullablePropMap<br>
extends FrozenMap<String, @Nullable FrozenMap<?>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | of([Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>>](#objectanditemsnullablepropmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable FrozenMap<?> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties1
public static class AdditionalProperties1<br>
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

// null validation
Void validatedPayload = NullableClass.AdditionalProperties1.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectNullableProp
public static class ObjectNullableProp<br>
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

// null validation
Void validatedPayload = NullableClass.ObjectNullableProp.validate(
    (Void) null,
    configuration
);

// Map validation
NullableClass.ObjectNullablePropMap validatedPayload =
    NullableClass.ObjectNullableProp.validate(
    new NullableClass.ObjectNullablePropMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [ObjectNullablePropMap](#objectnullablepropmap) | validate([Map&lt;?, ?&gt;](#objectnullablepropmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectNullablePropMapBuilder
public class ObjectNullablePropMapBuilder<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectNullablePropMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectNullablePropMapBuilder](#objectnullablepropmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## ObjectNullablePropMap
public static class ObjectNullablePropMap<br>
extends FrozenMap<String, FrozenMap<?>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectNullablePropMap](#objectnullablepropmap) | of([Map<String, Map<String, ? extends @Nullable Object>>](#objectnullablepropmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenMap<?> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ArrayItemsNullable
public static class ArrayItemsNullable<br>
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

// List validation
NullableClass.ArrayItemsNullableList validatedPayload =
    NullableClass.ArrayItemsNullable.validate(
    new NullableClass.ArrayItemsNullableListBuilder()
        .add((Void) null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items2.class](#items2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayItemsNullableList](#arrayitemsnullablelist) | validate([List<?>](#arrayitemsnullablelistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayItemsNullableListBuilder
public class ArrayItemsNullableListBuilder<br>
builder for `List<@Nullable Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayItemsNullableListBuilder()<br>Creates an empty list |
| ArrayItemsNullableListBuilder(List<@Nullable Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayItemsNullableListBuilder | add(Void item) |
| ArrayItemsNullableListBuilder | add(Map<String, @Nullable Object> item) |
| List<@Nullable Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayItemsNullableList
public class ArrayItemsNullableList<br>
extends `FrozenList<@Nullable FrozenMap<?>>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayItemsNullableList](#arrayitemsnullablelist) | of([List<? extends @Nullable Map<String, ? extends @Nullable Object>>](#arrayitemsnullablelistbuilder) arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
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

// null validation
Void validatedPayload = NullableClass.Items2.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayAndItemsNullableProp
public static class ArrayAndItemsNullableProp<br>
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

// null validation
Void validatedPayload = NullableClass.ArrayAndItemsNullableProp.validate(
    (Void) null,
    configuration
);

// List validation
NullableClass.ArrayAndItemsNullablePropList validatedPayload =
    NullableClass.ArrayAndItemsNullableProp.validate(
    new NullableClass.ArrayAndItemsNullablePropListBuilder()
        .add((Void) null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;List.class<br/>)<br/> |
| Class<? extends JsonSchema> | items = [Items1.class](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | validate([List<?>](#arrayanditemsnullableproplistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayAndItemsNullablePropListBuilder
public class ArrayAndItemsNullablePropListBuilder<br>
builder for `List<@Nullable Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayAndItemsNullablePropListBuilder()<br>Creates an empty list |
| ArrayAndItemsNullablePropListBuilder(List<@Nullable Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayAndItemsNullablePropListBuilder | add(Void item) |
| ArrayAndItemsNullablePropListBuilder | add(Map<String, @Nullable Object> item) |
| List<@Nullable Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayAndItemsNullablePropList
public class ArrayAndItemsNullablePropList<br>
extends `FrozenList<@Nullable FrozenMap<?>>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | of([List<? extends @Nullable Map<String, ? extends @Nullable Object>>](#arrayanditemsnullableproplistbuilder) arg, SchemaConfiguration configuration) |

## Items1
public static class Items1<br>
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

// null validation
Void validatedPayload = NullableClass.Items1.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayNullableProp
public static class ArrayNullableProp<br>
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

// null validation
Void validatedPayload = NullableClass.ArrayNullableProp.validate(
    (Void) null,
    configuration
);

// List validation
NullableClass.ArrayNullablePropList validatedPayload =
    NullableClass.ArrayNullableProp.validate(
    new NullableClass.ArrayNullablePropListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;List.class<br/>)<br/> |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [ArrayNullablePropList](#arraynullableproplist) | validate([List<?>](#arraynullableproplistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayNullablePropListBuilder
public class ArrayNullablePropListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayNullablePropListBuilder()<br>Creates an empty list |
| ArrayNullablePropListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayNullablePropListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayNullablePropList
public class ArrayNullablePropList<br>
extends `FrozenList<FrozenMap<?>>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNullablePropList](#arraynullableproplist) | of([List<Map<String, ? extends @Nullable Object>>](#arraynullableproplistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## DatetimeProp
public static class DatetimeProp<br>
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

// null validation
Void validatedPayload = NullableClass.DatetimeProp.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = NullableClass.DatetimeProp.validate(
    "1970-01-01T00:00:00.00Z",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DateProp
public static class DateProp<br>
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

// null validation
Void validatedPayload = NullableClass.DateProp.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = NullableClass.DateProp.validate(
    "2020-12-13",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringProp
public static class StringProp<br>
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

// null validation
Void validatedPayload = NullableClass.StringProp.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = NullableClass.StringProp.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BooleanProp
public static class BooleanProp<br>
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

// null validation
Void validatedPayload = NullableClass.BooleanProp.validate(
    (Void) null,
    configuration
);

// boolean validation
boolean validatedPayload = NullableClass.BooleanProp.validate(
    true,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Boolean.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberProp
public static class NumberProp<br>
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

// null validation
Void validatedPayload = NullableClass.NumberProp.validate(
    (Void) null,
    configuration
);

// int validation
int validatedPayload = NullableClass.NumberProp.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerProp
public static class IntegerProp<br>
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

// null validation
Void validatedPayload = NullableClass.IntegerProp.validate(
    (Void) null,
    configuration
);

// int validation
int validatedPayload = NullableClass.IntegerProp.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalProperties3
public static class AdditionalProperties3<br>
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

// null validation
Void validatedPayload = NullableClass.AdditionalProperties3.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
