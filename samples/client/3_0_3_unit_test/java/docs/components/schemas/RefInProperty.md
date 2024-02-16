# RefInProperty
org.openapijsonschematools.client.components.schemas.RefInProperty.java
public class RefInProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInProperty.RefInProperty1Boxed](#refinproperty1boxed)<br> abstract sealed validated payload class |
| static class | [RefInProperty.RefInProperty1BoxedVoid](#refinproperty1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefInProperty.RefInProperty1BoxedBoolean](#refinproperty1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefInProperty.RefInProperty1BoxedNumber](#refinproperty1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefInProperty.RefInProperty1BoxedString](#refinproperty1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefInProperty.RefInProperty1BoxedList](#refinproperty1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefInProperty.RefInProperty1BoxedMap](#refinproperty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInProperty.RefInProperty1](#refinproperty1)<br> schema class |
| static class | [RefInProperty.RefInPropertyMapBuilder](#refinpropertymapbuilder)<br> builder for Map payloads |
| static class | [RefInProperty.RefInPropertyMap](#refinpropertymap)<br> output class for Map payloads |

## RefInProperty1Boxed
public static abstract sealed class RefInProperty1Boxed<br>
permits<br>
[RefInProperty1BoxedVoid](#refinproperty1boxedvoid),
[RefInProperty1BoxedBoolean](#refinproperty1boxedboolean),
[RefInProperty1BoxedNumber](#refinproperty1boxednumber),
[RefInProperty1BoxedString](#refinproperty1boxedstring),
[RefInProperty1BoxedList](#refinproperty1boxedlist),
[RefInProperty1BoxedMap](#refinproperty1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RefInProperty1BoxedVoid
public static final class RefInProperty1BoxedVoid<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefInProperty1BoxedBoolean
public static final class RefInProperty1BoxedBoolean<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefInProperty1BoxedNumber
public static final class RefInProperty1BoxedNumber<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefInProperty1BoxedString
public static final class RefInProperty1BoxedString<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefInProperty1BoxedList
public static final class RefInProperty1BoxedList<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefInProperty1BoxedMap
public static final class RefInProperty1BoxedMap<br>
extends [RefInProperty1Boxed](#refinproperty1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedMap([RefInPropertyMap](#refinpropertymap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [RefInPropertyMap](#refinpropertymap) | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [RefInPropertyMap](#refinpropertymap) | validate([Map&lt;?, ?&gt;](#refinpropertymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedString](#refinproperty1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedVoid](#refinproperty1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedNumber](#refinproperty1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedBoolean](#refinproperty1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedMap](#refinproperty1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#refinpropertymapbuilder) arg, SchemaConfiguration configuration) |
| [RefInProperty1BoxedList](#refinproperty1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RefInPropertyMapBuilder
public class RefInPropertyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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
