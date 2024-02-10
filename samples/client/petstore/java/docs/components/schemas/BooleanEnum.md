# BooleanEnum
org.openapijsonschematools.client.components.schemas.BooleanEnum.java
public class BooleanEnum

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BooleanEnum.BooleanEnum1Boxed](#booleanenum1boxed)<br> abstract sealed validated payload class |
| static class | [BooleanEnum.BooleanEnum1BoxedBoolean](#booleanenum1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [BooleanEnum.BooleanEnum1](#booleanenum1)<br> schema class |
| enum | [BooleanEnum.BooleanBooleanEnumEnums](#booleanbooleanenumenums)<br>boolean enum |

## BooleanEnum1Boxed
public static abstract sealed class BooleanEnum1Boxed<br>
permits<br>
[BooleanEnum1BoxedBoolean](#booleanenum1boxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## BooleanEnum1BoxedBoolean
public static final class BooleanEnum1BoxedBoolean<br>
extends [BooleanEnum1Boxed](#booleanenum1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BooleanEnum1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## BooleanEnum1
public static class BooleanEnum1<br>
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

// boolean validation
boolean validatedPayload = BooleanEnum.BooleanEnum1.validate(
    true,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Boolean.class) |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;true<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| boolean | validate([BooleanBooleanEnumEnums](#booleanbooleanenumenums) arg, SchemaConfiguration configuration) |
| [BooleanEnum1BoxedBoolean](#booleanenum1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BooleanBooleanEnumEnums
public enum BooleanBooleanEnumEnums<br>
extends `Enum<BooleanBooleanEnumEnums>`

A class that stores boolean enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRUE | value = true |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
