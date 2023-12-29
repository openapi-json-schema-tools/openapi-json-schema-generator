# RefInItems
org.openapijsonschematools.client.components.schemas.RefInItems.java
public class RefInItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInItems.RefInItems1](#refinitems1)<br> schema class |
| static class | [RefInItems.RefInItemsListBuilder](#refinitemslistbuilder)<br> builder for List payloads |
| static class | [RefInItems.RefInItemsList](#refinitemslist)<br> output class for List payloads |

## RefInItems1
public static class RefInItems1<br>
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
RefInItems.RefInItemsList validatedPayload =
    RefInItems.RefInItems1.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInItemsList](#refinitemslist) | validate([List<?>](#refinitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RefInItemsListBuilder
public class RefInItemsListBuilder<br>
builder for `List<? extends @Nullable Object>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInItemsListBuilder()<br>Creates an empty list |
| RefInItemsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RefInItemsListBuilder | add(Void item) |
| RefInItemsListBuilder | add(boolean item) |
| RefInItemsListBuilder | add(String item) |
| RefInItemsListBuilder | add(int item) |
| RefInItemsListBuilder | add(float item) |
| RefInItemsListBuilder | add(long item) |
| RefInItemsListBuilder | add(double item) |
| RefInItemsListBuilder | add(List<?> item) |
| RefInItemsListBuilder | add(Map<String, ?> item) |
| List<? extends @Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| ? extends @Nullable Object |  | |

## RefInItemsList
public class RefInItemsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInItemsList](#refinitemslist) | of([List<? extends @Nullable Object>](#refinitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
