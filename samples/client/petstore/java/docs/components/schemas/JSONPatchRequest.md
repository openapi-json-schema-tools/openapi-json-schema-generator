# JSONPatchRequest
org.openapijsonschematools.client.components.schemas.JSONPatchRequest.java
public class JSONPatchRequest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequest.JSONPatchRequest1](#jsonpatchrequest1)<br> schema class |
| static class | [JSONPatchRequest.JSONPatchRequestListBuilder](#jsonpatchrequestlistbuilder)<br> builder for List payloads |
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
    new JSONPatchRequest.JSONPatchRequestListBuilder(
        Arrays.asList(
        )
    ).build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestList](#jsonpatchrequestlist) | validate([List<?>](#jsonpatchrequestlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## JSONPatchRequestListBuilder
public class JSONPatchRequestListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestListBuilder()<br>Creates an empty list |
| JSONPatchRequestListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| JSONPatchRequestListBuilder | add(Void item) |
| JSONPatchRequestListBuilder | add(boolean item) |
| JSONPatchRequestListBuilder | add(String item) |
| JSONPatchRequestListBuilder | add(int item) |
| JSONPatchRequestListBuilder | add(float item) |
| JSONPatchRequestListBuilder | add(long item) |
| JSONPatchRequestListBuilder | add(double item) |
| JSONPatchRequestListBuilder | add(List<?> item) |
| JSONPatchRequestListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## JSONPatchRequestList
public class JSONPatchRequestList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestList](#jsonpatchrequestlist) | of([List<? extends @Nullable Object>](#jsonpatchrequestlistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1.class](../../components/schemas/JSONPatchRequestAddReplaceTest.md#jsonpatchrequestaddreplacetest1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestRemove.JSONPatchRequestRemove1.class](../../components/schemas/JSONPatchRequestRemove.md#jsonpatchrequestremove1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1.class](../../components/schemas/JSONPatchRequestMoveCopy.md#jsonpatchrequestmovecopy1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map<?, ?> arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
