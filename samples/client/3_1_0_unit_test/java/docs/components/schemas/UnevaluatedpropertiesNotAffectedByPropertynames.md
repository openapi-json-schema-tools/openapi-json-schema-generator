# UnevaluatedpropertiesNotAffectedByPropertynames
unit_test_api.components.schemas.UnevaluatedpropertiesNotAffectedByPropertynames.java
public class UnevaluatedpropertiesNotAffectedByPropertynames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1](#unevaluatedpropertiesnotaffectedbypropertynames1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxed](#propertynamesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxedString](#propertynamesboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNames](#propertynames)<br> schema class |

## UnevaluatedpropertiesNotAffectedByPropertynames1Boxed
public sealed interface UnevaluatedpropertiesNotAffectedByPropertynames1Boxed<br>
permits<br>
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap
public record UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1
public static class UnevaluatedpropertiesNotAffectedByPropertynames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | propertyNames = [PropertyNames.class](#propertynames) |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties.class](#unevaluatedproperties) |

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
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UnevaluatedPropertiesBoxed
public sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedNumber
public record UnevaluatedPropertiesBoxedNumber<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PropertyNamesBoxed
public sealed interface PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

sealed interface that stores validated payloads using boxed classes

## PropertyNamesBoxedString
public record PropertyNamesBoxedString<br>
implements [PropertyNamesBoxed](#propertynamesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertyNames
public static class PropertyNames<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.UnevaluatedpropertiesNotAffectedByPropertynames;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNames.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | maxLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [PropertyNamesBoxedString](#propertynamesboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertyNamesBoxed](#propertynamesboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
