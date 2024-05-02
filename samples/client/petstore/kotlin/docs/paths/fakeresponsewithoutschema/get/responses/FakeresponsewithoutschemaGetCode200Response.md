# FakeresponsewithoutschemaGetCode200Response

public class FakeresponsewithoutschemaGetCode200Response

A class that contains necessary nested response classes
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [FakeresponsewithoutschemaGetCode200Response.FakeresponsewithoutschemaGetCode200Response1](#fakeresponsewithoutschemagetcode200response1)<br>class that deserializes responses |

## FakeresponsewithoutschemaGetCode200Response1
public static class FakeresponsewithoutschemaGetCode200Response1<br>
extends ResponseDeserializer<Nothing?, Nothing?, Nothing?>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeresponsewithoutschemaGetCode200Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, Nothing?> | content =  MapUtils.makeMap(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", null),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/xml", null)<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<Nothing?, Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
