# RefInProperty
org.openapijsonschematools.client.components.schemas.RefInProperty.java
public class RefInProperty

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInProperty.RefInProperty1](#refinproperty1)<br> schema class |
| static class | [RefInProperty.RefInPropertyMapBuilder](#refinpropertymapbuilder)<br> builder for Map payloads |
| static class | [RefInProperty.RefInPropertyMap](#refinpropertymap)<br> output class for Map payloads |

## RefInProperty1
public static class RefInProperty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1))<br>)<br> |

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
| [RefInPropertyMap](#refinpropertymap) | validate([Map&lt;?, ?&gt;](#refinpropertymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RefInPropertyMapBuilder
public class RefInPropertyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(Void value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(boolean value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(String value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(int value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(float value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(long value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(double value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(List<?> value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(Map<String, ?> value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, Void value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, boolean value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, String value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, int value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, float value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, long value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, double value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, List<?> value) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## RefInPropertyMap
public static class RefInPropertyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInPropertyMap](#refinpropertymap) | of([Map<String, ? extends @Nullable Object>](#refinpropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | a()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
