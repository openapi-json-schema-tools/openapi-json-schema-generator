# MapTest
org.openapijsonschematools.client.components.schemas.MapTest.java
public class MapTest<br>

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
| sealed interface | [MapTest.MapTest1Boxed](#maptest1boxed)<br> sealed interface for validated payloads |
| record | [MapTest.MapTest1BoxedMap](#maptest1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapTest1](#maptest1)<br> schema class |
| static class | [MapTest.MapTestMapBuilder](#maptestmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapTestMap](#maptestmap)<br> output class for Map payloads |
| sealed interface | [MapTest.DirectMapBoxed](#directmapboxed)<br> sealed interface for validated payloads |
| record | [MapTest.DirectMapBoxedMap](#directmapboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.DirectMap](#directmap)<br> schema class |
| static class | [MapTest.DirectMapMapBuilder](#directmapmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.DirectMapMap](#directmapmap)<br> output class for Map payloads |
| sealed interface | [MapTest.AdditionalProperties3Boxed](#additionalproperties3boxed)<br> sealed interface for validated payloads |
| record | [MapTest.AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MapTest.AdditionalProperties3](#additionalproperties3)<br> schema class |
| sealed interface | [MapTest.MapOfEnumStringBoxed](#mapofenumstringboxed)<br> sealed interface for validated payloads |
| record | [MapTest.MapOfEnumStringBoxedMap](#mapofenumstringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapOfEnumString](#mapofenumstring)<br> schema class |
| static class | [MapTest.MapOfEnumStringMapBuilder](#mapofenumstringmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapOfEnumStringMap](#mapofenumstringmap)<br> output class for Map payloads |
| sealed interface | [MapTest.AdditionalProperties2Boxed](#additionalproperties2boxed)<br> sealed interface for validated payloads |
| record | [MapTest.AdditionalProperties2BoxedString](#additionalproperties2boxedstring)<br> boxed class to store validated String payloads |
| static class | [MapTest.AdditionalProperties2](#additionalproperties2)<br> schema class |
| enum | [MapTest.StringAdditionalPropertiesEnums](#stringadditionalpropertiesenums)<br>String enum |
| sealed interface | [MapTest.MapMapOfStringBoxed](#mapmapofstringboxed)<br> sealed interface for validated payloads |
| record | [MapTest.MapMapOfStringBoxedMap](#mapmapofstringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.MapMapOfString](#mapmapofstring)<br> schema class |
| static class | [MapTest.MapMapOfStringMapBuilder](#mapmapofstringmapbuilder)<br> builder for Map payloads |
| static class | [MapTest.MapMapOfStringMap](#mapmapofstringmap)<br> output class for Map payloads |
| sealed interface | [MapTest.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [MapTest.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MapTest.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [MapTest.AdditionalPropertiesMapBuilder1](#additionalpropertiesmapbuilder1)<br> builder for Map payloads |
| static class | [MapTest.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| sealed interface | [MapTest.AdditionalProperties1Boxed](#additionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [MapTest.AdditionalProperties1BoxedString](#additionalproperties1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MapTest.AdditionalProperties1](#additionalproperties1)<br> schema class |

## MapTest1Boxed
public sealed interface MapTest1Boxed<br>
permits<br>
[MapTest1BoxedMap](#maptest1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MapTest1BoxedMap
public record MapTest1BoxedMap<br>
implements [MapTest1Boxed](#maptest1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapTest1BoxedMap([MapTestMap](#maptestmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapTestMap](#maptestmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [MapTest1BoxedMap](#maptest1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#maptestmapbuilder) arg, SchemaConfiguration configuration) |
| [MapTest1Boxed](#maptest1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface DirectMapBoxed<br>
permits<br>
[DirectMapBoxedMap](#directmapboxedmap)

sealed interface that stores validated payloads using boxed classes

## DirectMapBoxedMap
public record DirectMapBoxedMap<br>
implements [DirectMapBoxed](#directmapboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DirectMapBoxedMap([DirectMapMap](#directmapmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DirectMapMap](#directmapmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [DirectMapBoxedMap](#directmapboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#directmapmapbuilder) arg, SchemaConfiguration configuration) |
| [DirectMapBoxed](#directmapboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface AdditionalProperties3Boxed<br>
permits<br>
[AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean)

sealed interface that stores validated payloads using boxed classes

## AdditionalProperties3BoxedBoolean
public record AdditionalProperties3BoxedBoolean<br>
implements [AdditionalProperties3Boxed](#additionalproperties3boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapOfEnumStringBoxed
public sealed interface MapOfEnumStringBoxed<br>
permits<br>
[MapOfEnumStringBoxedMap](#mapofenumstringboxedmap)

sealed interface that stores validated payloads using boxed classes

## MapOfEnumStringBoxedMap
public record MapOfEnumStringBoxedMap<br>
implements [MapOfEnumStringBoxed](#mapofenumstringboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapOfEnumStringBoxedMap([MapOfEnumStringMap](#mapofenumstringmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapOfEnumStringMap](#mapofenumstringmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [MapOfEnumStringBoxedMap](#mapofenumstringboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapofenumstringmapbuilder) arg, SchemaConfiguration configuration) |
| [MapOfEnumStringBoxed](#mapofenumstringboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface AdditionalProperties2Boxed<br>
permits<br>
[AdditionalProperties2BoxedString](#additionalproperties2boxedstring)

sealed interface that stores validated payloads using boxed classes

## AdditionalProperties2BoxedString
public record AdditionalProperties2BoxedString<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [AdditionalProperties2BoxedString](#additionalproperties2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalProperties2Boxed](#additionalproperties2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface MapMapOfStringBoxed<br>
permits<br>
[MapMapOfStringBoxedMap](#mapmapofstringboxedmap)

sealed interface that stores validated payloads using boxed classes

## MapMapOfStringBoxedMap
public record MapMapOfStringBoxedMap<br>
implements [MapMapOfStringBoxed](#mapmapofstringboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapMapOfStringBoxedMap([MapMapOfStringMap](#mapmapofstringmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapMapOfStringMap](#mapmapofstringmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [MapMapOfStringBoxedMap](#mapmapofstringboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapmapofstringmapbuilder) arg, SchemaConfiguration configuration) |
| [MapMapOfStringBoxed](#mapmapofstringboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap([AdditionalPropertiesMap](#additionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesmapbuilder1) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesBoxed](#additionalpropertiesboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface AdditionalProperties1Boxed<br>
permits<br>
[AdditionalProperties1BoxedString](#additionalproperties1boxedstring)

sealed interface that stores validated payloads using boxed classes

## AdditionalProperties1BoxedString
public record AdditionalProperties1BoxedString<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
