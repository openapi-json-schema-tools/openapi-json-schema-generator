# ArrayWithValidationsInItems
org.openapijsonschematools.components.schemas.ArrayWithValidationsInItems.java
public class ArrayWithValidationsInItems

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayWithValidationsInItems.ArrayWithValidationsInItems1](#arraywithvalidationsinitems1)<br> schema class |
| static class | [ArrayWithValidationsInItems.ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist)<br> output class for List payloads |
| static class | [ArrayWithValidationsInItems.Items](#items)<br> schema class |

## ArrayWithValidationsInItems1
public static class ArrayWithValidationsInItems1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
<br/>
        new KeywordEntry("items", new ItemsValidator(Items.class))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) | validate(List<Long> arg, SchemaConfiguration configuration) |

## ArrayWithValidationsInItemsList
public class ArrayWithValidationsInItemsList<br>
extends FrozenList<Long>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithValidationsInItemsList](#arraywithvalidationsinitemslist) | of(List<Long> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Long>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Long |  | value must be a 64 bit integer

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(
        Integer.class,
        Long.class,
        Float.class,
        Double.class
    ))),
<br/>
        new KeywordEntry("format", new FormatValidator("int64"))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
