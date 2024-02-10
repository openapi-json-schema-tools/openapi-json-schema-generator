# AdditionalPropertiesClass
org.openapijsonschematools.client.components.schemas.AdditionalPropertiesClass.java
public class AdditionalPropertiesClass

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClass1Boxed](#additionalpropertiesclass1boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClass1BoxedMap](#additionalpropertiesclass1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClass1](#additionalpropertiesclass1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMapBuilder](#additionalpropertiesclassmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMap](#additionalpropertiesclassmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringBoxed](#mapwithundeclaredpropertiesstringboxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringBoxedMap](#mapwithundeclaredpropertiesstringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesString](#mapwithundeclaredpropertiesstring)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMapBuilder](#mapwithundeclaredpropertiesstringmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties5Boxed](#additionalproperties5boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalProperties5BoxedString](#additionalproperties5boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties5](#additionalproperties5)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMapBoxed](#emptymapboxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.EmptyMapBoxedMap](#emptymapboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.EmptyMap](#emptymap)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMapMapBuilder](#emptymapmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.EmptyMapMap](#emptymapmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4Boxed](#additionalproperties4boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedVoid](#additionalproperties4boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedBoolean](#additionalproperties4boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedNumber](#additionalproperties4boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedString](#additionalproperties4boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedList](#additionalproperties4boxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4BoxedMap](#additionalproperties4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4](#additionalproperties4)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Boxed](#mapwithundeclaredpropertiesanytype3boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3BoxedMap](#mapwithundeclaredpropertiesanytype3boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3](#mapwithundeclaredpropertiesanytype3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3MapBuilder](#mapwithundeclaredpropertiesanytype3mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3Boxed](#additionalproperties3boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedVoid](#additionalproperties3boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedNumber](#additionalproperties3boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedString](#additionalproperties3boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedList](#additionalproperties3boxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3BoxedMap](#additionalproperties3boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2Boxed](#mapwithundeclaredpropertiesanytype2boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2BoxedMap](#mapwithundeclaredpropertiesanytype2boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2](#mapwithundeclaredpropertiesanytype2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1Boxed](#mapwithundeclaredpropertiesanytype1boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1BoxedMap](#mapwithundeclaredpropertiesanytype1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1](#mapwithundeclaredpropertiesanytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.Anytype1Boxed](#anytype1boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.Anytype1BoxedVoid](#anytype1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalPropertiesClass.Anytype1BoxedBoolean](#anytype1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalPropertiesClass.Anytype1BoxedNumber](#anytype1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalPropertiesClass.Anytype1BoxedString](#anytype1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.Anytype1BoxedList](#anytype1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalPropertiesClass.Anytype1BoxedMap](#anytype1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.Anytype1](#anytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyBoxed](#mapofmappropertyboxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyBoxedMap](#mapofmappropertyboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapOfMapProperty](#mapofmapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMapBuilder](#mapofmappropertymapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMap](#mapofmappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties1Boxed](#additionalproperties1boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalProperties1BoxedMap](#additionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMapBuilder2](#additionalpropertiesmapbuilder2)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties2Boxed](#additionalproperties2boxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalProperties2BoxedString](#additionalproperties2boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapPropertyBoxed](#mappropertyboxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.MapPropertyBoxedMap](#mappropertyboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesClass.MapProperty](#mapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapPropertyMapBuilder](#mappropertymapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesClass.MapPropertyMap](#mappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalPropertiesClass1Boxed
public static abstract sealed class AdditionalPropertiesClass1Boxed<br>
permits<br>
[AdditionalPropertiesClass1BoxedMap](#additionalpropertiesclass1boxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesClass1BoxedMap
public static final class AdditionalPropertiesClass1BoxedMap<br>
extends AdditionalPropertiesClass1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesClass1BoxedMap(AdditionalPropertiesClassMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| AdditionalPropertiesClassMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.AdditionalPropertiesClassMapBuilder()
        .map_property(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "someAdditionalProperty",
                    "a"
                )
            )
        )
        .map_of_map_property(
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
        .map_with_undeclared_properties_anytype_3(
            MapUtils.makeMap(
            )
        )
        .empty_map(
            MapUtils.makeMap(
            )
        )
        .map_with_undeclared_properties_string(
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_property", [MapProperty.class](#mapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_map_property", [MapOfMapProperty.class](#mapofmapproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anytype_1", [Anytype1.class](#anytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_1", [MapWithUndeclaredPropertiesAnytype1.class](#mapwithundeclaredpropertiesanytype1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_2", [MapWithUndeclaredPropertiesAnytype2.class](#mapwithundeclaredpropertiesanytype2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_3", [MapWithUndeclaredPropertiesAnytype3.class](#mapwithundeclaredpropertiesanytype3))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("empty_map", [EmptyMap.class](#emptymap))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_string", [MapWithUndeclaredPropertiesString.class](#mapwithundeclaredpropertiesstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesClass1BoxedMap](#additionalpropertiesclass1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesClassMapBuilder
public class AdditionalPropertiesClassMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

## MapWithUndeclaredPropertiesStringBoxed
public static abstract sealed class MapWithUndeclaredPropertiesStringBoxed<br>
permits<br>
[MapWithUndeclaredPropertiesStringBoxedMap](#mapwithundeclaredpropertiesstringboxedmap)

A sealed class that stores validated payloads using boxed classes

## MapWithUndeclaredPropertiesStringBoxedMap
public static final class MapWithUndeclaredPropertiesStringBoxedMap<br>
extends MapWithUndeclaredPropertiesStringBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesStringBoxedMap(MapWithUndeclaredPropertiesStringMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapWithUndeclaredPropertiesStringMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMapBuilder()
        .additionalProperty("someAdditionalProperty", "a")

    .build(),
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
| [MapWithUndeclaredPropertiesStringBoxedMap](#mapwithundeclaredpropertiesstringboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapwithundeclaredpropertiesstringmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesStringMapBuilder
public class MapWithUndeclaredPropertiesStringMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
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

## AdditionalProperties5Boxed
public static abstract sealed class AdditionalProperties5Boxed<br>
permits<br>
[AdditionalProperties5BoxedString](#additionalproperties5boxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties5BoxedString
public static final class AdditionalProperties5BoxedString<br>
extends AdditionalProperties5Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties5BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties5
public static class AdditionalProperties5<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## EmptyMapBoxed
public static abstract sealed class EmptyMapBoxed<br>
permits<br>
[EmptyMapBoxedMap](#emptymapboxedmap)

A sealed class that stores validated payloads using boxed classes

## EmptyMapBoxedMap
public static final class EmptyMapBoxedMap<br>
extends EmptyMapBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyMapBoxedMap(EmptyMapMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| EmptyMapMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.EmptyMapMapBuilder()
    .build(),
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
| [EmptyMapBoxedMap](#emptymapboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#emptymapmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EmptyMapMapBuilder
public class EmptyMapMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

## AdditionalProperties4Boxed
public static abstract sealed class AdditionalProperties4Boxed<br>
permits<br>
[AdditionalProperties4BoxedVoid](#additionalproperties4boxedvoid),
[AdditionalProperties4BoxedBoolean](#additionalproperties4boxedboolean),
[AdditionalProperties4BoxedNumber](#additionalproperties4boxednumber),
[AdditionalProperties4BoxedString](#additionalproperties4boxedstring),
[AdditionalProperties4BoxedList](#additionalproperties4boxedlist),
[AdditionalProperties4BoxedMap](#additionalproperties4boxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties4BoxedVoid
public static final class AdditionalProperties4BoxedVoid<br>
extends AdditionalProperties4Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AdditionalProperties4BoxedBoolean
public static final class AdditionalProperties4BoxedBoolean<br>
extends AdditionalProperties4Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalProperties4BoxedNumber
public static final class AdditionalProperties4BoxedNumber<br>
extends AdditionalProperties4Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalProperties4BoxedString
public static final class AdditionalProperties4BoxedString<br>
extends AdditionalProperties4Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties4BoxedList
public static final class AdditionalProperties4BoxedList<br>
extends AdditionalProperties4Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalProperties4BoxedMap
public static final class AdditionalProperties4BoxedMap<br>
extends AdditionalProperties4Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AdditionalProperties4
public static class AdditionalProperties4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapWithUndeclaredPropertiesAnytype3Boxed
public static abstract sealed class MapWithUndeclaredPropertiesAnytype3Boxed<br>
permits<br>
[MapWithUndeclaredPropertiesAnytype3BoxedMap](#mapwithundeclaredpropertiesanytype3boxedmap)

A sealed class that stores validated payloads using boxed classes

## MapWithUndeclaredPropertiesAnytype3BoxedMap
public static final class MapWithUndeclaredPropertiesAnytype3BoxedMap<br>
extends MapWithUndeclaredPropertiesAnytype3Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesAnytype3BoxedMap(MapWithUndeclaredPropertiesAnytype3Map data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapWithUndeclaredPropertiesAnytype3Map | data<br>validated payload |

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
    new AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3MapBuilder()
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
| [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | validate([Map&lt;?, ?&gt;](#mapwithundeclaredpropertiesanytype3mapbuilder) arg, SchemaConfiguration configuration) |
| [MapWithUndeclaredPropertiesAnytype3BoxedMap](#mapwithundeclaredpropertiesanytype3boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapwithundeclaredpropertiesanytype3mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapWithUndeclaredPropertiesAnytype3MapBuilder
public class MapWithUndeclaredPropertiesAnytype3MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

## AdditionalProperties3Boxed
public static abstract sealed class AdditionalProperties3Boxed<br>
permits<br>
[AdditionalProperties3BoxedVoid](#additionalproperties3boxedvoid),
[AdditionalProperties3BoxedBoolean](#additionalproperties3boxedboolean),
[AdditionalProperties3BoxedNumber](#additionalproperties3boxednumber),
[AdditionalProperties3BoxedString](#additionalproperties3boxedstring),
[AdditionalProperties3BoxedList](#additionalproperties3boxedlist),
[AdditionalProperties3BoxedMap](#additionalproperties3boxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties3BoxedVoid
public static final class AdditionalProperties3BoxedVoid<br>
extends AdditionalProperties3Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

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

## AdditionalProperties3BoxedNumber
public static final class AdditionalProperties3BoxedNumber<br>
extends AdditionalProperties3Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalProperties3BoxedString
public static final class AdditionalProperties3BoxedString<br>
extends AdditionalProperties3Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties3BoxedList
public static final class AdditionalProperties3BoxedList<br>
extends AdditionalProperties3Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalProperties3BoxedMap
public static final class AdditionalProperties3BoxedMap<br>
extends AdditionalProperties3Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties3BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapWithUndeclaredPropertiesAnytype2Boxed
public static abstract sealed class MapWithUndeclaredPropertiesAnytype2Boxed<br>
permits<br>
[MapWithUndeclaredPropertiesAnytype2BoxedMap](#mapwithundeclaredpropertiesanytype2boxedmap)

A sealed class that stores validated payloads using boxed classes

## MapWithUndeclaredPropertiesAnytype2BoxedMap
public static final class MapWithUndeclaredPropertiesAnytype2BoxedMap<br>
extends MapWithUndeclaredPropertiesAnytype2Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesAnytype2BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MapWithUndeclaredPropertiesAnytype2
public static class MapWithUndeclaredPropertiesAnytype2<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapWithUndeclaredPropertiesAnytype1Boxed
public static abstract sealed class MapWithUndeclaredPropertiesAnytype1Boxed<br>
permits<br>
[MapWithUndeclaredPropertiesAnytype1BoxedMap](#mapwithundeclaredpropertiesanytype1boxedmap)

A sealed class that stores validated payloads using boxed classes

## MapWithUndeclaredPropertiesAnytype1BoxedMap
public static final class MapWithUndeclaredPropertiesAnytype1BoxedMap<br>
extends MapWithUndeclaredPropertiesAnytype1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapWithUndeclaredPropertiesAnytype1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MapWithUndeclaredPropertiesAnytype1
public static class MapWithUndeclaredPropertiesAnytype1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Anytype1Boxed
public static abstract sealed class Anytype1Boxed<br>
permits<br>
[Anytype1BoxedVoid](#anytype1boxedvoid),
[Anytype1BoxedBoolean](#anytype1boxedboolean),
[Anytype1BoxedNumber](#anytype1boxednumber),
[Anytype1BoxedString](#anytype1boxedstring),
[Anytype1BoxedList](#anytype1boxedlist),
[Anytype1BoxedMap](#anytype1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Anytype1BoxedVoid
public static final class Anytype1BoxedVoid<br>
extends Anytype1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Anytype1BoxedBoolean
public static final class Anytype1BoxedBoolean<br>
extends Anytype1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Anytype1BoxedNumber
public static final class Anytype1BoxedNumber<br>
extends Anytype1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Anytype1BoxedString
public static final class Anytype1BoxedString<br>
extends Anytype1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Anytype1BoxedList
public static final class Anytype1BoxedList<br>
extends Anytype1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Anytype1BoxedMap
public static final class Anytype1BoxedMap<br>
extends Anytype1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anytype1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Anytype1
public static class Anytype1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapOfMapPropertyBoxed
public static abstract sealed class MapOfMapPropertyBoxed<br>
permits<br>
[MapOfMapPropertyBoxedMap](#mapofmappropertyboxedmap)

A sealed class that stores validated payloads using boxed classes

## MapOfMapPropertyBoxedMap
public static final class MapOfMapPropertyBoxedMap<br>
extends MapOfMapPropertyBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapOfMapPropertyBoxedMap(MapOfMapPropertyMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapOfMapPropertyMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.MapOfMapPropertyMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties1.class](#additionalproperties1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapOfMapPropertyMap](#mapofmappropertymap) | validate([Map&lt;?, ?&gt;](#mapofmappropertymapbuilder) arg, SchemaConfiguration configuration) |
| [MapOfMapPropertyBoxedMap](#mapofmappropertyboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapofmappropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapOfMapPropertyMapBuilder
public class MapOfMapPropertyMapBuilder<br>
builder for `Map<String, Map<String, String>>`

A class that builds the Map input type

### Constructor Summary
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

## AdditionalProperties1Boxed
public static abstract sealed class AdditionalProperties1Boxed<br>
permits<br>
[AdditionalProperties1BoxedMap](#additionalproperties1boxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties1BoxedMap
public static final class AdditionalProperties1BoxedMap<br>
extends AdditionalProperties1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedMap(AdditionalPropertiesMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| AdditionalPropertiesMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.AdditionalPropertiesMapBuilder2()
        .additionalProperty("someAdditionalProperty", "a")

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
| [AdditionalPropertiesMap](#additionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesmapbuilder2) arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedMap](#additionalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesmapbuilder2) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesMapBuilder2
public class AdditionalPropertiesMapBuilder2<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
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
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## MapPropertyBoxed
public static abstract sealed class MapPropertyBoxed<br>
permits<br>
[MapPropertyBoxedMap](#mappropertyboxedmap)

A sealed class that stores validated payloads using boxed classes

## MapPropertyBoxedMap
public static final class MapPropertyBoxedMap<br>
extends MapPropertyBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapPropertyBoxedMap(MapPropertyMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| MapPropertyMap | data<br>validated payload |

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
    new AdditionalPropertiesClass.MapPropertyMapBuilder()
        .additionalProperty("someAdditionalProperty", "a")

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
| [MapPropertyMap](#mappropertymap) | validate([Map&lt;?, ?&gt;](#mappropertymapbuilder) arg, SchemaConfiguration configuration) |
| [MapPropertyBoxedMap](#mappropertyboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mappropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MapPropertyMapBuilder
public class MapPropertyMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
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

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
