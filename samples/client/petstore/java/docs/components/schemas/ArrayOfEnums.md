# ArrayOfEnums
org.openapijsonschematools.client.components.schemas.ArrayOfEnums.java
public class ArrayOfEnums

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfEnums.ArrayOfEnums1Boxed](#arrayofenums1boxed)<br> sealed validated payload class |
| static class | [ArrayOfEnums.ArrayOfEnums1BoxedList](#arrayofenums1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayOfEnums.ArrayOfEnums1](#arrayofenums1)<br> schema class |
| static class | [ArrayOfEnums.ArrayOfEnumsListBuilder](#arrayofenumslistbuilder)<br> builder for List payloads |
| static class | [ArrayOfEnums.ArrayOfEnumsList](#arrayofenumslist)<br> output class for List payloads |

## ArrayOfEnums1Boxed
public static abstract sealed class ArrayOfEnums1Boxed<br>
permits<br>
[ArrayOfEnums1BoxedList](#arrayofenums1boxedlist)

A sealed class that stores validated payloads using boxed classes

## ArrayOfEnums1BoxedList
public static final class ArrayOfEnums1BoxedList<br>
extends ArrayOfEnums1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfEnums1BoxedList(ArrayOfEnumsList data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ArrayOfEnumsList | data<br>validated payload |

## ArrayOfEnums1
public static class ArrayOfEnums1<br>
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

// List validation
ArrayOfEnums.ArrayOfEnumsList validatedPayload =
    ArrayOfEnums.ArrayOfEnums1.validate(
    new ArrayOfEnums.ArrayOfEnumsListBuilder()
        .add((Void) null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [StringEnum.StringEnum1.class](../../components/schemas/StringEnum.md#stringenum1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayOfEnumsList](#arrayofenumslist) | validate([List<?>](#arrayofenumslistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfEnums1BoxedList](#arrayofenums1boxedlist) | validateAndBox([List<?>](#arrayofenumslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayOfEnumsListBuilder
public class ArrayOfEnumsListBuilder<br>
builder for `List<@Nullable String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfEnumsListBuilder()<br>Creates an empty list |
| ArrayOfEnumsListBuilder(List<@Nullable String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayOfEnumsListBuilder | add(Void item) |
| ArrayOfEnumsListBuilder | add(String item) |
| ArrayOfEnumsListBuilder | add([StringEnum.StringStringEnumEnums](../../components/schemas/StringEnum.md#stringstringenumenums) item) |
| ArrayOfEnumsListBuilder | add([StringEnum.NullStringEnumEnums](../../components/schemas/StringEnum.md#nullstringenumenums) item) |
| List<@Nullable String> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayOfEnumsList
public class ArrayOfEnumsList<br>
extends `FrozenList<@Nullable String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfEnumsList](#arrayofenumslist) | of([List<? extends @Nullable String>](#arrayofenumslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
