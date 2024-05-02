org.openapijsonschematools.client.components.securityschemes.BearerTest
# SecurityScheme BearerTest

public class BearerTest
extends HttpBearerSecurityScheme

A class that is used to apply auth to a request

### Description
http bearer with JWT bearer format

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| void              | applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) |

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BearerTest(String accessToken) |

[[Back to top]](#top) [[Back to Component Security Schemes]](../../../README.md#Component-SecuritySchemes) [[Back to README]](../../../README.md)
