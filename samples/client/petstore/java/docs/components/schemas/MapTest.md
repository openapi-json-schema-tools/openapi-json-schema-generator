# MapTest
org.openapijsonschematools.client.components.schemas.MapTest.java
public class MapTest

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MapTest.MapTest1Boxed](#maptest1boxed)<br> sealed validated payload class |
| static class | [MapTest.MapTest1BoxedMap](#maptest1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapTest1](#maptest1)<br> schema class |
| static class | [MapTest.MapTestMapBuilder](#maptestmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapTestMap](#maptestmap)<br> output class for Map payloads |
| static class | [MapTest.DirectMapBoxed](#directmapboxed)<br> sealed validated payload class |
| static class | [MapTest.DirectMapBoxedMap](#directmapboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.DirectMap](#directmap)<br> schema class |
| static class | [MapTest.DirectMapMapBuilder](#directmapmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.DirectMapMap](#directmapmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties3Boxed](#additionalproperties3boxed)<br> sealed validated payload class |
| static class | [MapTest.AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MapTest.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [MapTest.MapOfEnumStringBoxed](#mapofenumstringboxed)<br> sealed validated payload class |
| static class | [MapTest.MapOfEnumStringBoxedMap](#mapofenumstringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapOfEnumString](#mapofenumstring)<br> schema class |
| static class | [MapTest.MapOfEnumStringMapBuilder](#mapofenumstringmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapOfEnumStringMap](#mapofenumstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties2Boxed](#additionalproperties2boxed)<br> sealed validated payload class |
| static class | [MapTest.AdditionalProperties2BoxedString](#additionalproperties2boxedstring)<br> boxed class to store validated String payloads |
| static class | [MapTest.AdditionalProperties2](#additionalproperties2)<br> schema class |
| enum | [MapTest.StringAdditionalPropertiesEnums](#stringadditionalpropertiesenums)<br>String enum |
| static class | [MapTest.MapMapOfStringBoxed](#mapmapofstringboxed)<br> sealed validated payload class |
| static class | [MapTest.MapMapOfStringBoxedMap](#mapmapofstringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapMapOfString](#mapmapofstring)<br> schema class |
| static class | [MapTest.MapMapOfStringMapBuilder](#mapmapofstringmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapMapOfStringMap](#mapmapofstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [MapTest.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [MapTest.AdditionalPropertiesMapBuilder1](#additionalpropertiesmapbuilder1)<br> builder for Map payloads |
| static class | [MapTest.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties1Boxed](#additionalproperties1boxed)<br> sealed validated payload class |
| static class | [MapTest.AdditionalProperties1BoxedString](#additionalproperties1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MapTest.AdditionalProperties1](#additionalproperties1)<br> schema class |

## MapTest1Boxed
public static abstract sealed class MapTest1Boxed<br>
permits<br>
[MapTest1BoxedMap](#maptest1boxedmap)

A sealed class that stores validated payloads using boxed classes

## MapTest1BoxedMap
public static final class MapTest1BoxedMap<br>
extends MapTest1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapTest1BoxedMap(MapTestMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapTestMap | data<br>validated payload |

## MapTest1
public static class MapTest1<br>
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
MapTest.MapTestMap validatedPayload =
    MapTest.MapTest1.validate(
    new MapTest.MapTestMapBuilder()
        .map_map_of_string(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                    "someAdditionalProperty",
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "someAdditionalProperty",
                            "a"
                        )
                    )
                )
            )
        )
        .map_of_enum_string(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "someAdditionalProperty",
                    "UPPER"
                )
            )
        )
        .direct_map(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Boolean>(
                    "someAdditionalProperty",
                    true
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_map_of_string", [MapMapOfString.class](#mapmapofstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_enum_string", [MapOfEnumString.class](#mapofenumstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("direct_map", [DirectMap.class](#directmap))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("indirect_map", [StringBooleanMap.StringBooleanMap1.class](../../components/schemas/StringBooleanMap.md#stringbooleanmap1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapTestMap](#maptestmap) | validate([Map&lt;?, ?&gt;](#maptestmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapTestMapBuilder
public class MapTestMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapTestMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MapTestMapBuilder](#maptestmapbuilder) | map_map_of_string(Map<String, Map<String, String>> value) |
| [MapTestMapBuilder](#maptestmapbuilder) | map_of_enum_string(Map<String, String> value) |
| [MapTestMapBuilder](#maptestmapbuilder) | direct_map(Map<String, Boolean> value) |
| [MapTestMapBuilder](#maptestmapbuilder) | indirect_map(Map<String, Boolean> value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, Void value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, boolean value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, String value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, int value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, float value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, long value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, double value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, List<?> value) |
| [MapTestMapBuilder](#maptestmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## MapTestMap
public static class MapTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | of([Map<String, ? extends @Nullable Object>](#maptestmapbuilder) arg, SchemaConfiguration configuration) |
| [MapMapOfStringMap](#mapmapofstringmap) | map_map_of_string()<br>[optional] |
| [MapOfEnumStringMap](#mapofenumstringmap) | map_of_enum_string()<br>[optional] |
| [DirectMapMap](#directmapmap) | direct_map()<br>[optional] |
| [StringBooleanMap.StringBooleanMapMap](../../components/schemas/StringBooleanMap.md#stringbooleanmapmap) | indirect_map()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DirectMapBoxed
public static abstract sealed class DirectMapBoxed<br>
permits<br>
[DirectMapBoxedMap](#directmapboxedmap)

A sealed class that stores validated payloads using boxed classes

## DirectMapBoxedMap
public static final class DirectMapBoxedMap<br>
extends DirectMapBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DirectMapBoxedMap(DirectMapMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| DirectMapMap | data<br>validated payload |

## DirectMap
public static class DirectMap<br>
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
MapTest.DirectMapMap validatedPayload =
    MapTest.DirectMap.validate(
    new MapTest.DirectMapMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties3.class](#additionalproperties3) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DirectMapMap](#directmapmap) | validate([Map&lt;?, ?&gt;](#directmapmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DirectMapMapBuilder
public class DirectMapMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DirectMapMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [DirectMapMapBuilder](#directmapmapbuilder) | additionalProperty(String key, boolean value) |

## DirectMapMap
public static class DirectMapMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | of([Map<String, Boolean>](#directmapmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties3Boxed
public static abstract sealed class AdditionalProperties3Boxed<br>
permits<br>
[AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties3BoxedBoolean
public static final class AdditionalProperties3BoxedBoolean<br>
extends AdditionalProperties3Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapOfEnumStringBoxed
public static abstract sealed class MapOfEnumStringBoxed<br>
permits<br>
[MapOfEnumStringBoxedMap](#mapofenumstringboxedmap)

A sealed class that stores validated payloads using boxed classes

## MapOfEnumStringBoxedMap
public static final class MapOfEnumStringBoxedMap<br>
extends MapOfEnumStringBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapOfEnumStringBoxedMap(MapOfEnumStringMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapOfEnumStringMap | data<br>validated payload |

## MapOfEnumString
public static class MapOfEnumString<br>
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
MapTest.MapOfEnumStringMap validatedPayload =
    MapTest.MapOfEnumString.validate(
    new MapTest.MapOfEnumStringMapBuilder()
        .additionalProperty("someAdditionalProperty", "UPPER")

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
| [MapOfEnumStringMap](#mapofenumstringmap) | validate([Map&lt;?, ?&gt;](#mapofenumstringmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapOfEnumStringMapBuilder
public class MapOfEnumStringMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapOfEnumStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [MapOfEnumStringMapBuilder](#mapofenumstringmapbuilder) | additionalProperty(String key, String value) |
| [MapOfEnumStringMapBuilder](#mapofenumstringmapbuilder) | additionalProperty(String key, [StringAdditionalPropertiesEnums](#stringadditionalpropertiesenums) value) |

## MapOfEnumStringMap
public static class MapOfEnumStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | of([Map<String, String>](#mapofenumstringmapbuilder) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties2Boxed
public static abstract sealed class AdditionalProperties2Boxed<br>
permits<br>
[AdditionalProperties2BoxedString](#additionalproperties2boxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties2BoxedString
public static final class AdditionalProperties2BoxedString<br>
extends AdditionalProperties2Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

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

// String validation
String validatedPayload = MapTest.AdditionalProperties2.validate(
    "UPPER",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"UPPER",<br>&nbsp;&nbsp;&nbsp;&nbsp;"lower"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringAdditionalPropertiesEnums](#stringadditionalpropertiesenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringAdditionalPropertiesEnums
public enum StringAdditionalPropertiesEnums<br>
extends `Enum<StringAdditionalPropertiesEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| UPPER | value = "UPPER" |
| LOWER | value = "lower" |

## MapMapOfStringBoxed
public static abstract sealed class MapMapOfStringBoxed<br>
permits<br>
[MapMapOfStringBoxedMap](#mapmapofstringboxedmap)

A sealed class that stores validated payloads using boxed classes

## MapMapOfStringBoxedMap
public static final class MapMapOfStringBoxedMap<br>
extends MapMapOfStringBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapMapOfStringBoxedMap(MapMapOfStringMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapMapOfStringMap | data<br>validated payload |

## MapMapOfString
public static class MapMapOfString<br>
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
MapTest.MapMapOfStringMap validatedPayload =
    MapTest.MapMapOfString.validate(
    new MapTest.MapMapOfStringMapBuilder()
        .additionalProperty(
            "someAdditionalProperty",
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "someAdditionalProperty",
                    "a"
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapMapOfStringMap](#mapmapofstringmap) | validate([Map&lt;?, ?&gt;](#mapmapofstringmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapMapOfStringMapBuilder
public class MapMapOfStringMapBuilder<br>
builder for `Map<String, Map<String, String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapMapOfStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, String>> | build()<br>Returns map input that should be used with Schema.validate |
| [MapMapOfStringMapBuilder](#mapmapofstringmapbuilder) | additionalProperty(String key, Map<String, String> value) |

## MapMapOfStringMap
public static class MapMapOfStringMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | of([Map<String, Map<String, String>>](#mapmapofstringmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedMap
public static final class AdditionalPropertiesBoxedMap<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(AdditionalPropertiesMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| AdditionalPropertiesMap | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
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
MapTest.AdditionalPropertiesMap validatedPayload =
    MapTest.AdditionalProperties.validate(
    new MapTest.AdditionalPropertiesMapBuilder1()
        .additionalProperty("someAdditionalProperty", "a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties1.class](#additionalproperties1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesmapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesMapBuilder1
public class AdditionalPropertiesMapBuilder1<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalPropertiesMapBuilder1](#additionalpropertiesmapbuilder1) | additionalProperty(String key, String value) |

## AdditionalPropertiesMap
public static class AdditionalPropertiesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | of([Map<String, String>](#additionalpropertiesmapbuilder1) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties1Boxed
public static abstract sealed class AdditionalProperties1Boxed<br>
permits<br>
[AdditionalProperties1BoxedString](#additionalproperties1boxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties1BoxedString
public static final class AdditionalProperties1BoxedString<br>
extends AdditionalProperties1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
