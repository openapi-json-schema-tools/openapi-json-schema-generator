# PatternpropertiesWithNullValuedInstanceProperties
unit_test_api.components.schemas.PatternpropertiesWithNullValuedInstanceProperties.java
public class PatternpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1](#patternpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| sealed interface | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.Bar](#bar)<br> schema class |

## PatternpropertiesWithNullValuedInstanceProperties1Boxed
public sealed interface PatternpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedString
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedString<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedList
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedList<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedMap
public record PatternpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
public record BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
