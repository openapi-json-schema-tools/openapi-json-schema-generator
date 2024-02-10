# PropertyNamedRefThatIsNotAReference
org.openapijsonschematools.client.components.schemas.PropertyNamedRefThatIsNotAReference.java
public class PropertyNamedRefThatIsNotAReference

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)<br> abstract sealed validated payload class |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1](#propertynamedrefthatisnotareference1)<br> schema class |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder)<br> builder for Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap)<br> output class for Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.RefBoxed](#refboxed)<br> abstract sealed validated payload class |
| static class | [PropertyNamedRefThatIsNotAReference.RefBoxedString](#refboxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertyNamedRefThatIsNotAReference.Ref](#ref)<br> schema class |

## PropertyNamedRefThatIsNotAReference1Boxed
public static abstract sealed class PropertyNamedRefThatIsNotAReference1Boxed<br>
permits<br>
[PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid),
[PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean),
[PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber),
[PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring),
[PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist),
[PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PropertyNamedRefThatIsNotAReference1BoxedVoid
public static final class PropertyNamedRefThatIsNotAReference1BoxedVoid<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedBoolean
public static final class PropertyNamedRefThatIsNotAReference1BoxedBoolean<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedNumber
public static final class PropertyNamedRefThatIsNotAReference1BoxedNumber<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedString
public static final class PropertyNamedRefThatIsNotAReference1BoxedString<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedList
public static final class PropertyNamedRefThatIsNotAReference1BoxedList<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedMap
public static final class PropertyNamedRefThatIsNotAReference1BoxedMap<br>
extends [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedMap([PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | data<br>validated payload |

## PropertyNamedRefThatIsNotAReference1
public static class PropertyNamedRefThatIsNotAReference1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("$ref", [Ref.class](#ref)))<br>)<br> |

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
| [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | validate([Map&lt;?, ?&gt;](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertyNamedRefThatIsNotAReferenceMapBuilder
public class PropertyNamedRefThatIsNotAReferenceMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReferenceMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | setDollarSignRef(String value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, Void value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, boolean value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, String value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, int value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, float value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, long value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, double value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, List<?> value) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PropertyNamedRefThatIsNotAReferenceMap
public static class PropertyNamedRefThatIsNotAReferenceMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | of([Map<String, ? extends @Nullable Object>](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["$ref"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RefBoxed
public static abstract sealed class RefBoxed<br>
permits<br>
[RefBoxedString](#refboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## RefBoxedString
public static final class RefBoxedString<br>
extends [RefBoxed](#refboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Ref
public static class Ref<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
