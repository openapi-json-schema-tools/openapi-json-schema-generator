# ComponentRefSchemaStringWithValidation
ComponentRefSchemaStringWithValidation.java

public class ComponentRefSchemaStringWithValidation

A class that contains necessary nested parameter classes
- a class that implements MediaType to store content schema info
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the parameter value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| record | [ComponentRefSchemaStringWithValidation.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [ComponentRefSchemaStringWithValidation.ComponentRefSchemaStringWithValidation1](#componentrefschemastringwithvalidation1)<br>class that deserializes a parameter |


## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../components/parameters/componentrefschemastringwithvalidation/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../components/parameters/componentrefschemastringwithvalidation/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## ComponentRefSchemaStringWithValidation1
public static class ComponentRefSchemaStringWithValidation1 extends ContentParameter<br>

a class that deserializes a parameter value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComponentRefSchemaStringWithValidation1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| String | name = "CRSstringWithValidation"<br>the parameter name |
| ParameterInType | inType = ParameterInType.PATH<br>the parameter in value |
| boolean | required = true<br>whether the parameter is required |
| @Nullable Boolean explode | null |
| @Nullable ParameterStyle | null |
| @Nullable Boolean allowReserved | false |
| Map<String, [ApplicationjsonMediaType](#applicationjsonmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the parameter value |

[[Back to top]](#top) [[Back to Component Parameters]](../../../README.md#Component-Parameters) [[Back to README]](../../../README.md)
