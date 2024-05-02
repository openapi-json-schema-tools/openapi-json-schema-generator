# StoreorderorderidDeleteCode400Response

public class StoreorderorderidDeleteCode400Response

A class that contains necessary nested response classes
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [StoreorderorderidDeleteCode400Response.StoreorderorderidDeleteCode400Response1](#storeorderorderiddeletecode400response1)<br>class that deserializes responses |

## StoreorderorderidDeleteCode400Response1
public static class StoreorderorderidDeleteCode400Response1<br>
extends ResponseDeserializer<Nothing?, Nothing?, Nothing?>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteCode400Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, Nothing?> | content =  MapUtils.makeMap(<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<Nothing?, Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
