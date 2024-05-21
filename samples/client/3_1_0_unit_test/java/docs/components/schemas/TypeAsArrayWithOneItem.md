# TypeAsArrayWithOneItem
org.openapijsonschematools.client.components.schemas.TypeAsArrayWithOneItem.java
public class TypeAsArrayWithOneItem<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1Boxed](#typeasarraywithoneitem1boxed)<br> sealed interface for validated payloads |
| record | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1BoxedString](#typeasarraywithoneitem1boxedstring)<br> boxed class to store validated String payloads |
| static class | [TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1](#typeasarraywithoneitem1)<br> schema class |

## TypeAsArrayWithOneItem1Boxed
public sealed interface TypeAsArrayWithOneItem1Boxed<br>
permits<br>
[TypeAsArrayWithOneItem1BoxedString](#typeasarraywithoneitem1boxedstring)

sealed interface that stores validated payloads using boxed classes

## TypeAsArrayWithOneItem1BoxedString
public record TypeAsArrayWithOneItem1BoxedString<br>
implements [TypeAsArrayWithOneItem1Boxed](#typeasarraywithoneitem1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeAsArrayWithOneItem1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TypeAsArrayWithOneItem1
public static class TypeAsArrayWithOneItem1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
