# UserPostCodedefaultResponse

public class UserPostCodedefaultResponse

A class that contains necessary nested response classes
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [UserPostCodedefaultResponse.UserPostCodedefaultResponse1](#userpostcodedefaultresponse1)<br>class that deserializes responses |

## UserPostCodedefaultResponse1
public static class UserPostCodedefaultResponse1<br>
extends ResponseDeserializer<Nothing?, Nothing?, Nothing?>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserPostCodedefaultResponse1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, Nothing?> | content =  MapUtils.makeMap(<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<Nothing?, Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
