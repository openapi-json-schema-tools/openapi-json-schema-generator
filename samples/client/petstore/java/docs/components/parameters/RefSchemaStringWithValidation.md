# RefSchemaStringWithValidation
RefSchemaStringWithValidation.java

public class RefSchemaStringWithValidation

A class that contains necessary nested parameter classes
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the parameter value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [RefSchemaStringWithValidation.RefSchemaStringWithValidation1](#refschemastringwithvalidation1)<br>class that deserializes a parameter |


## RefSchemaStringWithValidation1
public static class RefSchemaStringWithValidation1 extends SchemaParameter<br>

a class that deserializes a parameter value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaStringWithValidation1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| String | name = "RSstringWithValidation"<br>the parameter name |
| ParameterInType | inType = ParameterInType.PATH<br>the parameter in value |
| boolean | required = true<br>whether the parameter is required |
| @Nullable Boolean explode | false |
| @Nullable ParameterStyle | ParameterStyle.SIMPLE |
| @Nullable Boolean allowReserved | false |
| JsonSchema<?> | schema = [Schema.Schema1](../../components/parameters/refschemastringwithvalidation/Schema.md#schema1)().getInstance()

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the parameter value |

[[Back to top]](#top) [[Back to Component Parameters]](../../../README.md#Component-Parameters) [[Back to README]](../../../README.md)
