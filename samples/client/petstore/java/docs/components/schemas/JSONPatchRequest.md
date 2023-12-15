# JSONPatchRequest
org.openapijsonschematools.client.components.schemas.JSONPatchRequest.java
public class JSONPatchRequest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequest.JSONPatchRequest1](#jsonpatchrequest1)<br> schema class |
| static class | [JSONPatchRequest.JSONPatchRequestListInput](#jsonpatchrequestlistinput)<br> builder for List payloads |
| static class | [JSONPatchRequest.JSONPatchRequestList](#jsonpatchrequestlist)<br> output class for List payloads |
| static class | [JSONPatchRequest.Items](#items)<br> schema class |

## JSONPatchRequest1
public static class JSONPatchRequest1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
JSONPatchRequest.JSONPatchRequestList validatedPayload =
    JSONPatchRequest.JSONPatchRequest1.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenList.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestList](#jsonpatchrequestlist) | validate([List<Object>](#jsonpatchrequestlistinput) arg, SchemaConfiguration configuration) |

## JSONPatchRequestListInput
public class JSONPatchRequestListInput<br>
builder for `List<Object>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

## JSONPatchRequestList
public class JSONPatchRequestList<br>
extends `FrozenList<Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestList](#jsonpatchrequestlist) | of([List<Object>](#jsonpatchrequestlistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1.class](../../components/schemas/JSONPatchRequestAddReplaceTest.md#jsonpatchrequestaddreplacetest1),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestRemove.JSONPatchRequestRemove1.class](../../components/schemas/JSONPatchRequestRemove.md#jsonpatchrequestremove1),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1.class](../../components/schemas/JSONPatchRequestMoveCopy.md#jsonpatchrequestmovecopy1)<br>&nbsp;&nbsp;&nbsp;&nbsp;))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
