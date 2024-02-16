# TypeAsArrayWithOneItem
org.openapijsonschematools.client.components.schemas.TypeAsArrayWithOneItem.java
public class TypeAsArrayWithOneItem<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1Boxed](#typeasarraywithoneitem1boxed)<br> abstract sealed validated payload class |
| static class | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1BoxedString](#typeasarraywithoneitem1boxedstring)<br> boxed class to store validated String payloads |
| static class | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1](#typeasarraywithoneitem1)<br> schema class |

## TypeAsArrayWithOneItem1Boxed
public static abstract sealed class TypeAsArrayWithOneItem1Boxed<br>
permits<br>
[TypeAsArrayWithOneItem1BoxedString](#typeasarraywithoneitem1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## TypeAsArrayWithOneItem1BoxedString
public static final class TypeAsArrayWithOneItem1BoxedString<br>
extends [TypeAsArrayWithOneItem1Boxed](#typeasarraywithoneitem1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeAsArrayWithOneItem1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## TypeAsArrayWithOneItem1
public static class TypeAsArrayWithOneItem1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
