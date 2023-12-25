# AdditionalPropertiesClass
org.openapijsonschematools.client.components.schemas.AdditionalPropertiesClass.java
public class AdditionalPropertiesClass

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClass1](#additionalpropertiesclass1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMapInput](#additionalpropertiesclassmapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMap](#additionalpropertiesclassmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesString](#mapwithundeclaredpropertiesstring)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMapInput](#mapwithundeclaredpropertiesstringmapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties5](#additionalproperties5)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMap](#emptymap)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMapMapInput](#emptymapmapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.EmptyMapMap](#emptymapmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4](#additionalproperties4)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3](#mapwithundeclaredpropertiesanytype3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3MapInput](#mapwithundeclaredpropertiesanytype3mapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2](#mapwithundeclaredpropertiesanytype2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1](#mapwithundeclaredpropertiesanytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.Anytype1](#anytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapProperty](#mapofmapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMapInput](#mapofmappropertymapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMap](#mapofmappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMapInput](#additionalpropertiesmapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapProperty](#mapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapPropertyMapInput](#mappropertymapinput)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapPropertyMap](#mappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalPropertiesClass1
public static class AdditionalPropertiesClass1<br>
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
AdditionalPropertiesClass.AdditionalPropertiesClassMap validatedPayload =
    AdditionalPropertiesClass.AdditionalPropertiesClass1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_property",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_of_map_property",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_with_undeclared_properties_anytype_3",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "empty_map",
            MapMaker.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_with_undeclared_properties_string",
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
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_property", [MapProperty.class](#mapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_map_property", [MapOfMapProperty.class](#mapofmapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anytype_1", [Anytype1.class](#anytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_1", [MapWithUndeclaredPropertiesAnytype1.class](#mapwithundeclaredpropertiesanytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_2", [MapWithUndeclaredPropertiesAnytype2.class](#mapwithundeclaredpropertiesanytype2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_3", [MapWithUndeclaredPropertiesAnytype3.class](#mapwithundeclaredpropertiesanytype3))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("empty_map", [EmptyMap.class](#emptymap))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_string", [MapWithUndeclaredPropertiesString.class](#mapwithundeclaredpropertiesstring)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | validate([Map<?, ?>](#additionalpropertiesclassmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesClassMapInput
public class AdditionalPropertiesClassMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **map_property** | Map<String, String> |  | [optional] |
| **map_of_map_property** | Map<String, Map<String, String>> |  | [optional] |
| **anytype_1** | ? extends @Nullable Object |  | [optional] |
| **map_with_undeclared_properties_anytype_1** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **map_with_undeclared_properties_anytype_2** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **map_with_undeclared_properties_anytype_3** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **empty_map** | Map<String, ? extends @Nullable Object> | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional] |
| **map_with_undeclared_properties_string** | Map<String, String> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AdditionalPropertiesClassMap
public static class AdditionalPropertiesClassMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertiesclassmapinput) arg, SchemaConfiguration configuration) |
| [MapPropertyMap](#mappropertymap) | map_property()<br>[optional] |
| [MapOfMapPropertyMap](#mapofmappropertymap) | map_of_map_property()<br>[optional] |
| @Nullable Object | anytype_1()<br>[optional] |
| FrozenMap<?> | map_with_undeclared_properties_anytype_1()<br>[optional] |
| FrozenMap<?> | map_with_undeclared_properties_anytype_2()<br>[optional] |
| [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | map_with_undeclared_properties_anytype_3()<br>[optional] |
| [EmptyMapMap](#emptymapmap) | empty_map()<br>[optional] |
| [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | map_with_undeclared_properties_string()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MapWithUndeclaredPropertiesString
public static class MapWithUndeclaredPropertiesString<br>
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
AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap validatedPayload =
    AdditionalPropertiesClass.MapWithUndeclaredPropertiesString.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties5.class](#additionalproperties5)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | validate([Map<?, ?>](#mapwithundeclaredpropertiesstringmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesStringMapInput
public class MapWithUndeclaredPropertiesStringMapInput<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## MapWithUndeclaredPropertiesStringMap
public static class MapWithUndeclaredPropertiesStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | of([Map<String, String>](#mapwithundeclaredpropertiesstringmapinput) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties5
public static class AdditionalProperties5<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## EmptyMap
public static class EmptyMap<br>
extends JsonSchema

A schema class that validates payloads

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

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
AdditionalPropertiesClass.EmptyMapMap validatedPayload =
    AdditionalPropertiesClass.EmptyMap.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties4.class](#additionalproperties4)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EmptyMapMap](#emptymapmap) | validate([Map<?, ?>](#emptymapmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EmptyMapMapInput
public class EmptyMapMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |

## EmptyMapMap
public static class EmptyMapMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EmptyMapMap](#emptymapmap) | of([Map<String, Object>](#emptymapmapinput) arg, SchemaConfiguration configuration) |

## AdditionalProperties4
public static class AdditionalProperties4<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapWithUndeclaredPropertiesAnytype3
public static class MapWithUndeclaredPropertiesAnytype3<br>
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
AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map validatedPayload =
    AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3.validate(
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
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | validate([Map<?, ?>](#mapwithundeclaredpropertiesanytype3mapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesAnytype3MapInput
public class MapWithUndeclaredPropertiesAnytype3MapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## MapWithUndeclaredPropertiesAnytype3Map
public static class MapWithUndeclaredPropertiesAnytype3Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | of([Map<String, ? extends @Nullable Object>](#mapwithundeclaredpropertiesanytype3mapinput) arg, SchemaConfiguration configuration) |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapWithUndeclaredPropertiesAnytype2
public static class MapWithUndeclaredPropertiesAnytype2<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapWithUndeclaredPropertiesAnytype1
public static class MapWithUndeclaredPropertiesAnytype1<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Anytype1
public static class Anytype1<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapOfMapProperty
public static class MapOfMapProperty<br>
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
AdditionalPropertiesClass.MapOfMapPropertyMap validatedPayload =
    AdditionalPropertiesClass.MapOfMapProperty.validate(
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
| static [MapOfMapPropertyMap](#mapofmappropertymap) | validate([Map<?, ?>](#mapofmappropertymapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapOfMapPropertyMapInput
public class MapOfMapPropertyMapInput<br>
builder for `Map<String, Map<String, String>>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional] |

## MapOfMapPropertyMap
public static class MapOfMapPropertyMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfMapPropertyMap](#mapofmappropertymap) | of([Map<String, Map<String, String>>](#mapofmappropertymapinput) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties1
public static class AdditionalProperties1<br>
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
AdditionalPropertiesClass.AdditionalPropertiesMap validatedPayload =
    AdditionalPropertiesClass.AdditionalProperties1.validate(
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
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | validate([Map<?, ?>](#additionalpropertiesmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## MapProperty
public static class MapProperty<br>
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
AdditionalPropertiesClass.MapPropertyMap validatedPayload =
    AdditionalPropertiesClass.MapProperty.validate(
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
| static [MapPropertyMap](#mappropertymap) | validate([Map<?, ?>](#mappropertymapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapPropertyMapInput
public class MapPropertyMapInput<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## MapPropertyMap
public static class MapPropertyMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapPropertyMap](#mappropertymap) | of([Map<String, String>](#mappropertymapinput) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
