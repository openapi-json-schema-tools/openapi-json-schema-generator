# ItemsDoesNotLookInApplicatorsValidCase
org.openapijsonschematools.client.components.schemas.ItemsDoesNotLookInApplicatorsValidCase.java
public class ItemsDoesNotLookInApplicatorsValidCase

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1](#itemsdoesnotlookinapplicatorsvalidcase1)<br> schema class |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder)<br> builder for List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist)<br> output class for List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.Items](#items)<br> schema class |

## ItemsDoesNotLookInApplicatorsValidCase1
public static class ItemsDoesNotLookInApplicatorsValidCase1<br>
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
ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList validatedPayload =
    ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.validate(
    new ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | validate([List<?>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ItemsDoesNotLookInApplicatorsValidCaseListBuilder
public class ItemsDoesNotLookInApplicatorsValidCaseListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder()<br>Creates an empty list |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(Void item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(boolean item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(String item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(int item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(float item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(long item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(double item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(List<?> item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsDoesNotLookInApplicatorsValidCaseList
public class ItemsDoesNotLookInApplicatorsValidCaseList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | of([List<? extends @Nullable Object>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 5 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
