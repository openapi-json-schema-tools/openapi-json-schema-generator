# MapTest
org.openapijsonschematools.client.components.schemas.MapTest.java
public class MapTest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MapTest.MapTest1](#maptest1)<br> schema class |
| static class | [MapTest.MapTestMapInput](#maptestmapinput)<br> builder for Map payloads |
| static class | [MapTest.MapTestMap](#maptestmap)<br> output class for Map payloads |
| static class | [MapTest.DirectMap](#directmap)<br> schema class |
| static class | [MapTest.DirectMapMapInput](#directmapmapinput)<br> builder for Map payloads |
| static class | [MapTest.DirectMapMap](#directmapmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [MapTest.MapOfEnumString](#mapofenumstring)<br> schema class |
| static class | [MapTest.MapOfEnumStringMapInput](#mapofenumstringmapinput)<br> builder for Map payloads |
| static class | [MapTest.MapOfEnumStringMap](#mapofenumstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [MapTest.MapMapOfString](#mapmapofstring)<br> schema class |
| static class | [MapTest.MapMapOfStringMapInput](#mapmapofstringmapinput)<br> builder for Map payloads |
| static class | [MapTest.MapMapOfStringMap](#mapmapofstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [MapTest.AdditionalPropertiesMapInput](#additionalpropertiesmapinput)<br> builder for Map payloads |
| static class | [MapTest.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties1](#additionalproperties1)<br> schema class |

## MapTest1
public static class MapTest1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MapTest.MapTestMap validatedPayload =
    MapTest.MapTest1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_map_of_string",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_of_enum_string",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "direct_map",
            MapMaker.makeMap(
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_map_of_string", [MapMapOfString.class](#mapmapofstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_enum_string", [MapOfEnumString.class](#mapofenumstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("direct_map", [DirectMap.class](#directmap))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("indirect_map", [StringBooleanMap.StringBooleanMap1.class](../../components/schemas/StringBooleanMap.md#stringbooleanmap1))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | validate([Map<String, ? extends @Nullable Object>](#maptestmapinput) arg, SchemaConfiguration configuration) |

## MapTestMapInput
public class MapTestMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **map_map_of_string** | Map<String, Map<String, String>> |  | [optional] |
| **map_of_enum_string** | Map<String, String> |  | [optional] |
| **direct_map** | Map<String, boolean> |  | [optional] |
| **indirect_map** | Map<String, boolean> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## MapTestMap
public static class MapTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | of([Map<String, ? extends @Nullable Object>](#maptestmapinput) arg, SchemaConfiguration configuration) |
| [MapMapOfStringMap](#mapmapofstringmap) | map_map_of_string()<br>[optional] |
| [MapOfEnumStringMap](#mapofenumstringmap) | map_of_enum_string()<br>[optional] |
| [DirectMapMap](#directmapmap) | direct_map()<br>[optional] |
| [StringBooleanMap.StringBooleanMapMap](../../components/schemas/StringBooleanMap.md#stringbooleanmapmap) | indirect_map()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DirectMap
public static class DirectMap<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MapTest.DirectMapMap validatedPayload =
    MapTest.DirectMap.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties3.class](#additionalproperties3)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | validate([Map<String, Boolean>](#directmapmapinput) arg, SchemaConfiguration configuration) |

## DirectMapMapInput
public class DirectMapMapInput<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional] |

## DirectMapMap
public static class DirectMapMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | of([Map<String, Boolean>](#directmapmapinput) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapOfEnumString
public static class MapOfEnumString<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MapTest.MapOfEnumStringMap validatedPayload =
    MapTest.MapOfEnumString.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties2.class](#additionalproperties2)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | validate([Map<String, String>](#mapofenumstringmapinput) arg, SchemaConfiguration configuration) |

## MapOfEnumStringMapInput
public class MapOfEnumStringMapInput<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"] |

## MapOfEnumStringMap
public static class MapOfEnumStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | of([Map<String, String>](#mapofenumstringmapinput) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
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
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"UPPER",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"lower"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## MapMapOfString
public static class MapMapOfString<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MapTest.MapMapOfStringMap validatedPayload =
    MapTest.MapMapOfString.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | validate([Map<String, Map<String, String>>](#mapmapofstringmapinput) arg, SchemaConfiguration configuration) |

## MapMapOfStringMapInput
public class MapMapOfStringMapInput<br>
builder for `Map<String, Map<String, String>>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional] |

## MapMapOfStringMap
public static class MapMapOfStringMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | of([Map<String, Map<String, String>>](#mapmapofstringmapinput) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MapTest.AdditionalPropertiesMap validatedPayload =
    MapTest.AdditionalProperties.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties1.class](#additionalproperties1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | validate([Map<String, String>](#additionalpropertiesmapinput) arg, SchemaConfiguration configuration) |

## AdditionalPropertiesMapInput
public class AdditionalPropertiesMapInput<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## AdditionalPropertiesMap
public static class AdditionalPropertiesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | of([Map<String, String>](#additionalpropertiesmapinput) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
