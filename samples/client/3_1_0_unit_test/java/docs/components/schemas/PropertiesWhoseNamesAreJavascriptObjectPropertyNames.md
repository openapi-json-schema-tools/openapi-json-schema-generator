# PropertiesWhoseNamesAreJavascriptObjectPropertyNames
org.openapijsonschematools.client.components.schemas.PropertiesWhoseNamesAreJavascriptObjectPropertyNames.java
public class PropertiesWhoseNamesAreJavascriptObjectPropertyNames

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1](#propertieswhosenamesarejavascriptobjectpropertynames1)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap)<br> output class for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Constructor](#constructor)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToString](#tostring)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMapBuilder](#tostringmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMap](#tostringmap)<br> output class for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Length](#length)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Proto](#proto)<br> schema class |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1
public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("__proto__", [Proto.class](#proto))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("toString", [ToString.class](#tostring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("constructor", [Constructor.class](#constructor)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | validate([Map&lt;?, ?&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder
public class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setProto(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setProto(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setProto(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setProto(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(Void value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(boolean value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(String value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(List<?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(Map<String, ?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, Void value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, boolean value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, String value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, List<?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap
public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | of([Map<String, ? extends @Nullable Object>](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | toString()<br>[optional] |
| Number | constructor()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["__proto__"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Constructor
public static class Constructor<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ToString
public static class ToString<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("length", [Length.class](#length)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [ToStringMap](#tostringmap) | validate([Map&lt;?, ?&gt;](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ToStringMapBuilder
public class ToStringMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ToStringMapBuilder](#tostringmapbuilder) | length(String value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, Void value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, boolean value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, String value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, int value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, float value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, long value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, double value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, List<?> value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ToStringMap
public static class ToStringMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ToStringMap](#tostringmap) | of([Map<String, ? extends @Nullable Object>](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Length
public static class Length<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Proto
public static class Proto<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
