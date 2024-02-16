# UserArray
UserArray.java


public class UserArray

A class that contains necessary nested
- SealedRequestBody class, an abstract sealed class which contains all the contentType/schema input types
- final classes which extend SealedRequestBody, the concrete request body types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- supporting XMediaType classes which store the openapi request body contentType to schema information

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [UserArray.UserArray1](#userarray1)<br> class that serializes request bodies |
| static class | [UserArray.SealedRequestBody](#sealedrequestbody)<br> abstract sealed request body class |

## UserArray1
public static class UserArray1<br>

a class that serializes SealedRequestBody request bodies

## SealedRequestBody
public static abstract sealed class SealedRequestBody<br>
permits<br>

abstract sealed class that stores request contentType + validated schema data


[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
