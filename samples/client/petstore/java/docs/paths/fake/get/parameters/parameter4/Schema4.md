# Schema4
org.openapijsonschematools.client.paths.fake.get.parameters.parameter4.Schema4.java
public class Schema4

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41](#schema41)<br> schema class |
| enum | [Schema4.IntegerSchemaEnums4](#integerschemaenums4)<br>Integer enum |
| enum | [Schema4.LongSchemaEnums4](#longschemaenums4)<br>Long enum |
| enum | [Schema4.FloatSchemaEnums4](#floatschemaenums4)<br>Float enum |
| enum | [Schema4.DoubleSchemaEnums4](#doubleschemaenums4)<br>Double enum |

## Schema41
public static class Schema41<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = Schema4.Schema41.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| String | &nbsp;&nbsp;&nbsp;&nbsp;type = "int32";<br> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1,&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-2)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| int | validate(int arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerSchemaEnums4
public enum IntegerSchemaEnums4<br>
extends `Enum<IntegerSchemaEnums4>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |
| NEGATIVE_2 | value = -2 |

## LongSchemaEnums4
public enum LongSchemaEnums4<br>
extends `Enum<LongSchemaEnums4>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1L |
| NEGATIVE_2 | value = -2L |

## FloatSchemaEnums4
public enum FloatSchemaEnums4<br>
extends `Enum<FloatSchemaEnums4>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0f |
| NEGATIVE_2 | value = -2.0f |

## DoubleSchemaEnums4
public enum DoubleSchemaEnums4<br>
extends `Enum<DoubleSchemaEnums4>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0d |
| NEGATIVE_2 | value = -2.0d |
