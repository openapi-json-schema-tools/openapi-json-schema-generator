# PropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PropertiesWithNullValuedInstanceProperties.java
public class PropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1](#propertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap)<br> output class for Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithNullValuedInstanceProperties.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.Foo](#foo)<br> schema class |

## PropertiesWithNullValuedInstanceProperties1Boxed
public static abstract sealed class PropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid),
[PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean),
[PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber),
[PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring),
[PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist),
[PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PropertiesWithNullValuedInstanceProperties1BoxedVoid
public static final class PropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedBoolean
public static final class PropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedNumber
public static final class PropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedString
public static final class PropertiesWithNullValuedInstanceProperties1BoxedString<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedList
public static final class PropertiesWithNullValuedInstanceProperties1BoxedList<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedMap
public static final class PropertiesWithNullValuedInstanceProperties1BoxedMap<br>
extends [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedMap([PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | validate([Map&lt;?, ?&gt;](#propertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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

## FooBoxed
public static abstract sealed class FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## FooBoxedVoid
public static final class FooBoxedVoid<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Foo
public static class Foo<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
