# UnevaluatedpropertiesNotAffectedByPropertynames
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesNotAffectedByPropertynames.java
public class UnevaluatedpropertiesNotAffectedByPropertynames

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1](#unevaluatedpropertiesnotaffectedbypropertynames1)<br> schema class |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxed](#propertynamesboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxedString](#propertynamesboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNames](#propertynames)<br> schema class |

## UnevaluatedpropertiesNotAffectedByPropertynames1Boxed
public static abstract sealed class UnevaluatedpropertiesNotAffectedByPropertynames1Boxed<br>
permits<br>
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap
public static final class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap<br>
extends [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedPropertiesBoxed
public static abstract sealed class UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedNumber
public static final class UnevaluatedPropertiesBoxedNumber<br>
extends [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PropertyNamesBoxed
public static abstract sealed class PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## PropertyNamesBoxedString
public static final class PropertyNamesBoxedString<br>
extends [PropertyNamesBoxed](#propertynamesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PropertyNames
public static class PropertyNames<br>
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
