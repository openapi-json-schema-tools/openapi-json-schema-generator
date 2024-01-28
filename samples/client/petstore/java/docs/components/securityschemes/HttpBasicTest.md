org.openapijsonschematools.client.components.securityschemes.HttpBasicTest
# SecurityScheme HttpBasicTest

public class  HttpBasicTest
extends HttpBasicSecurityScheme

A class that is used to apply auth to a request

### Description
http basic

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| void              | applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) |

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HttpBasicTest(String userId, String password) |

[[Back to top]](#top) [[Back to Component Security Schemes]](../../../README.md#Component-SecuritySchemes) [[Back to README]](../../../README.md)
