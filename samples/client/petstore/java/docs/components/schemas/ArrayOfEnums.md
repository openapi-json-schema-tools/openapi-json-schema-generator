# ArrayOfEnums
org.openapijsonschematools.client.components.schemas.ArrayOfEnums.java
public class ArrayOfEnums

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfEnums.ArrayOfEnums1](#arrayofenums1)<br> schema class |
| static class | [ArrayOfEnums.ArrayOfEnumsListInput](#arrayofenumslistinput)<br> builder for List payloads |
| static class | [ArrayOfEnums.ArrayOfEnumsList](#arrayofenumslist)<br> output class for List payloads |

## ArrayOfEnums1
public static class ArrayOfEnums1<br>
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

// List validation
ArrayOfEnums.ArrayOfEnumsList validatedPayload =
    ArrayOfEnums.ArrayOfEnums1.validate(
    Arrays.asList(
        null
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [StringEnum.StringEnum1.class](../../components/schemas/StringEnum.md#stringenum1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfEnumsList](#arrayofenumslist) | validate([List<?>](#arrayofenumslistinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayOfEnumsListInput
public class ArrayOfEnumsListInput<br>
builder for `List<? extends @Nullable String>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
? extends @Nullable String |  |

## ArrayOfEnumsList
public class ArrayOfEnumsList<br>
extends `FrozenList<@Nullable String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfEnumsList](#arrayofenumslist) | of([List<? extends @Nullable String>](#arrayofenumslistinput) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
