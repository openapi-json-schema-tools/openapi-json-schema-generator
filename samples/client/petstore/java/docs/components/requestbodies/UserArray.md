# UserArray
UserArray.java

public class UserArray

A class that contains necessary nested request body classes
- supporting XMediaType classes which store the openapi request body contentType to schema information
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody class, an abstract sealed class which contains all the contentType/schema input types
- final classes which extend SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [UserArray.ApplicationjsonMediaType](#applicationjsonmediatype)<br>class storing schema info for a specific contentType |
| static class | [UserArray.UserArray1](#userarray1)<br>class that serializes request bodies |
| static class | [UserArray.SealedRequestBody](#sealedrequestbody)<br>abstract sealed request body class |
| static class | [UserArray.ApplicationjsonRequestBody](#applicationjsonrequestbody)<br>implementing sealed class to store request body input |

## ApplicationjsonMediaType
public static class ApplicationjsonMediaType<br>
extends MediaType<ApplicationjsonSchema.ApplicationjsonSchema1>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| ApplicationjsonSchema.ApplicationjsonSchema1 | schema<br>the schema for this MediaType |

## UserArray1
public static class UserArray1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserArray1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the request body is required |
| Map<String, MediaType<?>> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public static abstract sealed class SealedRequestBody<br>
permits<br>
[ApplicationjsonRequestBody](#applicationjsonrequestbody)

abstract sealed class that stores request contentType + validated schema data

## ApplicationjsonRequestBody
public static final class ApplicationjsonRequestBody<br>
extends [SealedRequestBody](#sealedrequestbody)<br>
implements GenericRequestBody<ApplicationjsonSchema.ApplicationjsonSchema1Boxed><br>

A final class to store request body input for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonRequestBody(ApplicationjsonSchema.ApplicationjsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/json" |
| ApplicationjsonSchema.ApplicationjsonSchema1Boxed | body()<br>returns the body passed in in the constructor |

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
