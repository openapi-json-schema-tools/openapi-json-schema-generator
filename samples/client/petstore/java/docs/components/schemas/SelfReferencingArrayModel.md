# SelfReferencingArrayModel
org.openapijsonschematools.client.components.schemas.SelfReferencingArrayModel.java
public class SelfReferencingArrayModel<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SelfReferencingArrayModel.SelfReferencingArrayModel1Boxed](#selfreferencingarraymodel1boxed)<br> abstract sealed validated payload class |
| record | [SelfReferencingArrayModel.SelfReferencingArrayModel1BoxedList](#selfreferencingarraymodel1boxedlist)<br> boxed class to store validated List payloads |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModel1](#selfreferencingarraymodel1)<br> schema class |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModelListBuilder](#selfreferencingarraymodellistbuilder)<br> builder for List payloads |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModelList](#selfreferencingarraymodellist)<br> output class for List payloads |

## SelfReferencingArrayModel1Boxed
public sealed interface SelfReferencingArrayModel1Boxed<br>
permits<br>
[SelfReferencingArrayModel1BoxedList](#selfreferencingarraymodel1boxedlist)

sealed interface that stores validated payloads using boxed classes

## SelfReferencingArrayModel1BoxedList
public record SelfReferencingArrayModel1BoxedList<br>
implements [SelfReferencingArrayModel1Boxed](#selfreferencingarraymodel1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SelfReferencingArrayModel1BoxedList([SelfReferencingArrayModelList](#selfreferencingarraymodellist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## SelfReferencingArrayModel1
public static class SelfReferencingArrayModel1<br>
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
SelfReferencingArrayModel.SelfReferencingArrayModelList validatedPayload =
    SelfReferencingArrayModel.SelfReferencingArrayModel1.validate(
    new SelfReferencingArrayModel.SelfReferencingArrayModelListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [SelfReferencingArrayModel1.class](#selfreferencingarraymodel1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | validate([List<?>](#selfreferencingarraymodellistbuilder) arg, SchemaConfiguration configuration) |
| [SelfReferencingArrayModel1BoxedList](#selfreferencingarraymodel1boxedlist) | validateAndBox([List<?>](#selfreferencingarraymodellistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SelfReferencingArrayModelListBuilder
public class SelfReferencingArrayModelListBuilder<br>
builder for `List<List<?>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SelfReferencingArrayModelListBuilder()<br>Creates an empty list |
| SelfReferencingArrayModelListBuilder(List<List<?>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SelfReferencingArrayModelListBuilder | add(List<?> item) |
| List<List<?>> | build()<br>Returns list input that should be used with Schema.validate |

## SelfReferencingArrayModelList
public class SelfReferencingArrayModelList<br>
extends `FrozenList<SelfReferencingArrayModelList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | of([List<List<?>>](#selfreferencingarraymodellistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
