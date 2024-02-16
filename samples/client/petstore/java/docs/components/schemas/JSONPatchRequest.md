# JSONPatchRequest
org.openapijsonschematools.client.components.schemas.JSONPatchRequest.java
public class JSONPatchRequest<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequest.JSONPatchRequest1Boxed](#jsonpatchrequest1boxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequest.JSONPatchRequest1BoxedList](#jsonpatchrequest1boxedlist)<br> boxed class to store validated List payloads |
| static class | [JSONPatchRequest.JSONPatchRequest1](#jsonpatchrequest1)<br> schema class |
| static class | [JSONPatchRequest.JSONPatchRequestListBuilder](#jsonpatchrequestlistbuilder)<br> builder for List payloads |
| static class | [JSONPatchRequest.JSONPatchRequestList](#jsonpatchrequestlist)<br> output class for List payloads |
| static class | [JSONPatchRequest.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequest.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [JSONPatchRequest.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [JSONPatchRequest.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [JSONPatchRequest.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequest.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [JSONPatchRequest.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequest.Items](#items)<br> schema class |

## JSONPatchRequest1Boxed
public static abstract sealed class JSONPatchRequest1Boxed<br>
permits<br>
[JSONPatchRequest1BoxedList](#jsonpatchrequest1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## JSONPatchRequest1BoxedList
public static final class JSONPatchRequest1BoxedList<br>
extends [JSONPatchRequest1Boxed](#jsonpatchrequest1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequest1BoxedList([JSONPatchRequestList](#jsonpatchrequestlist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestList](#jsonpatchrequestlist) | data<br>validated payload |

## JSONPatchRequest1
public static class JSONPatchRequest1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
JSONPatchRequest.JSONPatchRequestList validatedPayload =
    JSONPatchRequest.JSONPatchRequest1.validate(
    new JSONPatchRequest.JSONPatchRequestListBuilder()
    .build(),
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
| [JSONPatchRequest1BoxedList](#jsonpatchrequest1boxedlist) | validateAndBox([List<?>](#jsonpatchrequestlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## JSONPatchRequestListBuilder
public class JSONPatchRequestListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
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

## ItemsBoxed
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ItemsBoxedVoid
public static final class ItemsBoxedVoid<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ItemsBoxedBoolean
public static final class ItemsBoxedBoolean<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ItemsBoxedNumber
public static final class ItemsBoxedNumber<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ItemsBoxedString
public static final class ItemsBoxedString<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ItemsBoxedList
public static final class ItemsBoxedList<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ItemsBoxedMap
public static final class ItemsBoxedMap<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ItemsBoxedString](#itemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ItemsBoxedVoid](#itemsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ItemsBoxedNumber](#itemsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ItemsBoxedBoolean](#itemsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ItemsBoxedMap](#itemsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ItemsBoxedList](#itemsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
