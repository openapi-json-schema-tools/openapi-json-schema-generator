org.openapijsonschematools.client.components.securityschemes.ApiKey
# SecurityScheme ApiKey

public class ApiKey
extends ApiKeySecurityScheme

A class that is used to apply auth to a request

### Description
apiKey in header

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| void              | applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) |

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApiKey(String apiKey)<br>for header apiKey auth |

[[Back to top]](#top) [[Back to Component Security Schemes]](../../../README.md#Component-SecuritySchemes) [[Back to README]](../../../README.md)
