org.openapijsonschematools.client.components.securityschemes.ApiKeyQuery
# SecurityScheme ApiKeyQuery

public class ApiKeyQuery
extends ApiKeyQuerySecurityScheme

A class that is used to apply auth to a request

### Description
apiKey in query

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| void              | applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) |

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApiKeyQuery(String apiKey)<br>for query apiKey auth |

[[Back to top]](#top) [[Back to Component Security Schemes]](../../../README.md#Component-SecuritySchemes) [[Back to README]](../../../README.md)
