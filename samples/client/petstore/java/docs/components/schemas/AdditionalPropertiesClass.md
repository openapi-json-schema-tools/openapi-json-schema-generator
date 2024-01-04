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
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMap](#additionalpropertiesclassmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesString](#mapwithundeclaredpropertiesstring)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMapBuilder](#mapwithundeclaredpropertiesstringmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties5](#additionalproperties5)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMap](#emptymap)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMapMapBuilder](#emptymapmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.EmptyMapMap](#emptymapmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4](#additionalproperties4)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3](#mapwithundeclaredpropertiesanytype3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2](#mapwithundeclaredpropertiesanytype2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1](#mapwithundeclaredpropertiesanytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.Anytype1](#anytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapProperty](#mapofmapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMapBuilder](#mapofmappropertymapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMap](#mapofmappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMapBuilder2](#additionalpropertiesmapbuilder2)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapProperty](#mapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapPropertyMapBuilder](#mappropertymapbuilder)<br> builder for Map payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.AdditionalPropertiesClassMap validatedPayload =
    AdditionalPropertiesClass.AdditionalPropertiesClass1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_property",
            MapUtils.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_of_map_property",
            MapUtils.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_with_undeclared_properties_anytype_3",
            MapUtils.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "empty_map",
            MapUtils.makeMap(
            )
        ),
        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
            "map_with_undeclared_properties_string",
            MapUtils.makeMap(
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_property", [MapProperty.class](#mapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_map_property", [MapOfMapProperty.class](#mapofmapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anytype_1", [Anytype1.class](#anytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_1", [MapWithUndeclaredPropertiesAnytype1.class](#mapwithundeclaredpropertiesanytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_2", [MapWithUndeclaredPropertiesAnytype2.class](#mapwithundeclaredpropertiesanytype2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_3", [MapWithUndeclaredPropertiesAnytype3.class](#mapwithundeclaredpropertiesanytype3))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("empty_map", [EmptyMap.class](#emptymap))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_string", [MapWithUndeclaredPropertiesString.class](#mapwithundeclaredpropertiesstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesClassMapBuilder
public class AdditionalPropertiesClassMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesClassMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_property(Map<String, String> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_of_map_property(Map<String, Map<String, String>> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(Void value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(boolean value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(String value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(int value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(float value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(long value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(double value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(List<?> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | anytype_1(Map<String, ?> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_with_undeclared_properties_anytype_1(Map<String, @Nullable Object> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_with_undeclared_properties_anytype_2(Map<String, @Nullable Object> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_with_undeclared_properties_anytype_3(Map<String, @Nullable Object> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | empty_map(Map<String, @Nullable Object> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | map_with_undeclared_properties_string(Map<String, String> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, Void value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, boolean value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, String value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, int value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, float value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, long value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, double value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, List<?> value) |
| [AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## AdditionalPropertiesClassMap
public static class AdditionalPropertiesClassMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| [MapPropertyMap](#mappropertymap) | map_property()<br>[optional] |
| [MapOfMapPropertyMap](#mapofmappropertymap) | map_of_map_property()<br>[optional] |
| @Nullable Object | anytype_1()<br>[optional] |
| FrozenMap<?> | map_with_undeclared_properties_anytype_1()<br>[optional] |
| FrozenMap<?> | map_with_undeclared_properties_anytype_2()<br>[optional] |
| [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | map_with_undeclared_properties_anytype_3()<br>[optional] |
| [EmptyMapMap](#emptymapmap) | empty_map()<br>[optional] |
| [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | map_with_undeclared_properties_string()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MapWithUndeclaredPropertiesString
public static class MapWithUndeclaredPropertiesString<br>
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
AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap validatedPayload =
    AdditionalPropertiesClass.MapWithUndeclaredPropertiesString.validate(
    MapUtils.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties5.class](#additionalproperties5) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | validate([Map&lt;?, ?&gt;](#mapwithundeclaredpropertiesstringmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesStringMapBuilder
public class MapWithUndeclaredPropertiesStringMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [MapWithUndeclaredPropertiesStringMapBuilder](#mapwithundeclaredpropertiesstringmapbuilder) | additionalProperty(String key, String value) |

## MapWithUndeclaredPropertiesStringMap
public static class MapWithUndeclaredPropertiesStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | of([Map<String, String>](#mapwithundeclaredpropertiesstringmapbuilder) arg, SchemaConfiguration configuration) |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.EmptyMapMap validatedPayload =
    AdditionalPropertiesClass.EmptyMap.validate(
    MapUtils.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties4.class](#additionalproperties4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EmptyMapMap](#emptymapmap) | validate([Map&lt;?, ?&gt;](#emptymapmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EmptyMapMapBuilder
public class EmptyMapMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyMapMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## EmptyMapMap
public static class EmptyMapMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EmptyMapMap](#emptymapmap) | of([Map<String, Object>](#emptymapmapbuilder) arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map validatedPayload =
    AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3.validate(
    MapUtils.makeMap(
    ),
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
| [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | validate([Map&lt;?, ?&gt;](#mapwithundeclaredpropertiesanytype3mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesAnytype3MapBuilder
public class MapWithUndeclaredPropertiesAnytype3MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesAnytype3MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, Void value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, boolean value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, String value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, int value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, float value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, long value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, double value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, List<?> value) |
| [MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## MapWithUndeclaredPropertiesAnytype3Map
public static class MapWithUndeclaredPropertiesAnytype3Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | of([Map<String, ? extends @Nullable Object>](#mapwithundeclaredpropertiesanytype3mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.MapOfMapPropertyMap validatedPayload =
    AdditionalPropertiesClass.MapOfMapProperty.validate(
    MapUtils.makeMap(
    ),
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
| [MapOfMapPropertyMap](#mapofmappropertymap) | validate([Map&lt;?, ?&gt;](#mapofmappropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapOfMapPropertyMapBuilder
public class MapOfMapPropertyMapBuilder<br>
builder for `Map<String, Map<String, String>>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapOfMapPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, String>> | build()<br>Returns map input that should be used with Schema.validate |
| [MapOfMapPropertyMapBuilder](#mapofmappropertymapbuilder) | additionalProperty(String key, Map<String, String> value) |

## MapOfMapPropertyMap
public static class MapOfMapPropertyMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfMapPropertyMap](#mapofmappropertymap) | of([Map<String, Map<String, String>>](#mapofmappropertymapbuilder) arg, SchemaConfiguration configuration) |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.AdditionalPropertiesMap validatedPayload =
    AdditionalPropertiesClass.AdditionalProperties1.validate(
    MapUtils.makeMap(
    ),
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
| [AdditionalPropertiesMap](#additionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesmapbuilder2) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesMapBuilder2
public class AdditionalPropertiesMapBuilder2<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesMapBuilder2()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalPropertiesMapBuilder2](#additionalpropertiesmapbuilder2) | additionalProperty(String key, String value) |

## AdditionalPropertiesMap
public static class AdditionalPropertiesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | of([Map<String, String>](#additionalpropertiesmapbuilder2) arg, SchemaConfiguration configuration) |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalPropertiesClass.MapPropertyMap validatedPayload =
    AdditionalPropertiesClass.MapProperty.validate(
    MapUtils.makeMap(
    ),
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
| [MapPropertyMap](#mappropertymap) | validate([Map&lt;?, ?&gt;](#mappropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapPropertyMapBuilder
public class MapPropertyMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [MapPropertyMapBuilder](#mappropertymapbuilder) | additionalProperty(String key, String value) |

## MapPropertyMap
public static class MapPropertyMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapPropertyMap](#mappropertymap) | of([Map<String, String>](#mappropertymapbuilder) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
