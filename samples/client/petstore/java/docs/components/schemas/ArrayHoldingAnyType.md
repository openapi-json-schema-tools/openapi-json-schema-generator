# ArrayHoldingAnyType
org.openapijsonschematools.client.components.schemas.ArrayHoldingAnyType.java
public class ArrayHoldingAnyType

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyType1](#arrayholdinganytype1)<br> schema class |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeListInput](#arrayholdinganytypelistinput)<br> builder for List payloads |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeList](#arrayholdinganytypelist)<br> output class for List payloads |
| static class | [ArrayHoldingAnyType.Items](#items)<br> schema class |

## ArrayHoldingAnyType1
public static class ArrayHoldingAnyType1<br>
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
ArrayHoldingAnyType.ArrayHoldingAnyTypeList validatedPayload =
    ArrayHoldingAnyType.ArrayHoldingAnyType1.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | validate([List<? extends @Nullable Object>](#arrayholdinganytypelistinput) arg, SchemaConfiguration configuration) |

## ArrayHoldingAnyTypeListInput
public class ArrayHoldingAnyTypeListInput<br>
builder for `List<? extends @Nullable Object>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
? extends @Nullable Object | any type can be stored here |

## ArrayHoldingAnyTypeList
public class ArrayHoldingAnyTypeList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | of([List<? extends @Nullable Object>](#arrayholdinganytypelistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

## Description
any type can be stored here

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
