# PropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PropertiesWithNullValuedInstanceProperties.java
public class PropertiesWithNullValuedInstanceProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1](#propertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap)<br> output class for Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.Foo](#foo)<br> schema class |

## PropertiesWithNullValuedInstanceProperties1
public static class PropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |

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
| [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | validate([Map&lt;?, ?&gt;](#propertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertiesWithNullValuedInstancePropertiesMapBuilder
public class PropertiesWithNullValuedInstancePropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstancePropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | foo(Void value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, String value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, double value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PropertiesWithNullValuedInstancePropertiesMap
public static class PropertiesWithNullValuedInstancePropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | of([Map<String, ? extends @Nullable Object>](#propertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Void | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
