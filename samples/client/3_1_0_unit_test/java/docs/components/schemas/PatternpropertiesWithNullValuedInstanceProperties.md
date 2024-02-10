# PatternpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PatternpropertiesWithNullValuedInstanceProperties.java
public class PatternpropertiesWithNullValuedInstanceProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)<br> abstract sealed validated payload class |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1](#patternpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxed](#barboxed)<br> abstract sealed validated payload class |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.Bar](#bar)<br> schema class |

## PatternpropertiesWithNullValuedInstanceProperties1Boxed
public static abstract sealed class PatternpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedString
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedString<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedList
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedList<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedMap
public static final class PatternpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
extends [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1
public static class PatternpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("^.*bar$"), [Bar.class](#bar)))<br>)<br> |

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
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BarBoxed
public static abstract sealed class BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## BarBoxedVoid
public static final class BarBoxedVoid<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Bar
public static class Bar<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
