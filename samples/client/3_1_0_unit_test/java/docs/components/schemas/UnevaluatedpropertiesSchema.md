# UnevaluatedpropertiesSchema
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesSchema.java
public class UnevaluatedpropertiesSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1Boxed](#unevaluatedpropertiesschema1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1](#unevaluatedpropertiesschema1)<br> schema class |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |

## UnevaluatedpropertiesSchema1Boxed
public static abstract sealed class UnevaluatedpropertiesSchema1Boxed<br>
permits<br>
[UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedpropertiesSchema1BoxedMap
public static final class UnevaluatedpropertiesSchema1BoxedMap<br>
extends [UnevaluatedpropertiesSchema1Boxed](#unevaluatedpropertiesschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UnevaluatedpropertiesSchema1
public static class UnevaluatedpropertiesSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties.class](#unevaluatedproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedPropertiesBoxed
public static abstract sealed class UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedString
public static final class UnevaluatedPropertiesBoxedString<br>
extends [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
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
String validatedPayload = UnevaluatedpropertiesSchema.UnevaluatedProperties.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
