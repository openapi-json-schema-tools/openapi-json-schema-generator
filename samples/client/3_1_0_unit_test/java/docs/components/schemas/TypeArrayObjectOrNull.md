# TypeArrayObjectOrNull
org.openapijsonschematools.client.components.schemas.TypeArrayObjectOrNull.java
public class TypeArrayObjectOrNull

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)<br> abstract sealed validated payload class |
| static class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist)<br> boxed class to store validated List payloads |
| static class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1](#typearrayobjectornull1)<br> schema class |

## TypeArrayObjectOrNull1Boxed
public static abstract sealed class TypeArrayObjectOrNull1Boxed<br>
permits<br>
[TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist),
[TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap),
[TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## TypeArrayObjectOrNull1BoxedList
public static final class TypeArrayObjectOrNull1BoxedList<br>
extends [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## TypeArrayObjectOrNull1BoxedMap
public static final class TypeArrayObjectOrNull1BoxedMap<br>
extends [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## TypeArrayObjectOrNull1BoxedVoid
public static final class TypeArrayObjectOrNull1BoxedVoid<br>
extends [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## TypeArrayObjectOrNull1
public static class TypeArrayObjectOrNull1<br>
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

// null validation
Void validatedPayload = TypeArrayObjectOrNull.TypeArrayObjectOrNull1.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;List.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
