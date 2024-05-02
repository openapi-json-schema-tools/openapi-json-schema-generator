# PetpetiduploadimagePostRequestBody

public class PetpetiduploadimagePostRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [PetpetiduploadimagePostRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [PetpetiduploadimagePostRequestBody.MultipartformdataMediaType](#multipartformdatamediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [PetpetiduploadimagePostRequestBody.PetpetiduploadimagePostRequestBody1](#petpetiduploadimagepostrequestbody1)<br>class that serializes request bodies |
| sealed interface | [PetpetiduploadimagePostRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [PetpetiduploadimagePostRequestBody.MultipartformdataRequestBody](#multipartformdatarequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[MultipartformdataMediaType](#multipartformdatamediatype)

sealed interface that stores schema and encoding info


## MultipartformdataMediaType
public record MultipartformdataMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[MultipartformdataSchema.MultipartformdataSchema1](../../../paths/petpetiduploadimage/post/requestbody/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchema.MultipartformdataSchema1](../../../paths/petpetiduploadimage/post/requestbody/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## PetpetiduploadimagePostRequestBody1
public static class PetpetiduploadimagePostRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("multipart/form-data", new [MultipartformdataMediaType](#multipartformdatamediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[MultipartformdataRequestBody](#multipartformdatarequestbody)

sealed interface that stores request contentType + validated schema data

## MultipartformdataRequestBody
public record MultipartformdataRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<MultipartformdataSchema.[MultipartformdataSchema1Boxed](../../../paths/petpetiduploadimage/post/requestbody/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1boxed)><br>

A record class to store request body input for contentType="multipart/form-data"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataRequestBody(MultipartformdataSchema.[MultipartformdataSchema1Boxed](../../../paths/petpetiduploadimage/post/requestbody/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "multipart/form-data" |
| MultipartformdataSchema.[MultipartformdataSchema1Boxed](../../../paths/petpetiduploadimage/post/requestbody/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1boxed) | body()<br>returns the body passed in in the constructor |
