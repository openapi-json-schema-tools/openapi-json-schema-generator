# PetfindbystatusGetCode400Response

public class PetfindbystatusGetCode400Response

A class that contains necessary nested response classes
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetfindbystatusGetCode400Response.PetfindbystatusGetCode400Response1](#petfindbystatusgetcode400response1)<br>class that deserializes responses |

## PetfindbystatusGetCode400Response1
public static class PetfindbystatusGetCode400Response1<br>
extends ResponseDeserializer<Nothing?, Nothing?, Nothing?>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetCode400Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, Nothing?> | content =  MapUtils.makeMap(<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<Nothing?, Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
