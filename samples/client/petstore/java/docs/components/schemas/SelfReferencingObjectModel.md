# SelfReferencingObjectModel
org.openapijsonschematools.client.components.schemas.SelfReferencingObjectModel.java
public class SelfReferencingObjectModel<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SelfReferencingObjectModel.SelfReferencingObjectModel1Boxed](#selfreferencingobjectmodel1boxed)<br> sealed interface for validated payloads |
| record | [SelfReferencingObjectModel.SelfReferencingObjectModel1BoxedMap](#selfreferencingobjectmodel1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModel1](#selfreferencingobjectmodel1)<br> schema class |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder)<br> builder for Map payloads |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap)<br> output class for Map payloads |

## SelfReferencingObjectModel1Boxed
public sealed interface SelfReferencingObjectModel1Boxed<br>
permits<br>
[SelfReferencingObjectModel1BoxedMap](#selfreferencingobjectmodel1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SelfReferencingObjectModel1BoxedMap
public record SelfReferencingObjectModel1BoxedMap<br>
implements [SelfReferencingObjectModel1Boxed](#selfreferencingobjectmodel1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SelfReferencingObjectModel1BoxedMap([SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SelfReferencingObjectModel1
public static class SelfReferencingObjectModel1<br>
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
import org.openapijsonschematools.client.components.schemas.SelfReferencingObjectModel;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
SelfReferencingObjectModel.SelfReferencingObjectModelMap validatedPayload =
    SelfReferencingObjectModel.SelfReferencingObjectModel1.validate(
    new SelfReferencingObjectModel.SelfReferencingObjectModelMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("selfRef", [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | validate([Map&lt;?, ?&gt;](#selfreferencingobjectmodelmapbuilder) arg, SchemaConfiguration configuration) |
| [SelfReferencingObjectModel1BoxedMap](#selfreferencingobjectmodel1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#selfreferencingobjectmodelmapbuilder) arg, SchemaConfiguration configuration) |
| [SelfReferencingObjectModel1Boxed](#selfreferencingobjectmodel1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## SelfReferencingObjectModelMapBuilder
public class SelfReferencingObjectModelMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SelfReferencingObjectModelMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder) | selfRef(Map<String, @Nullable Object> value) |
| [SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## SelfReferencingObjectModelMap
public static class SelfReferencingObjectModelMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | of([Map<String, ? extends @Nullable Object>](#selfreferencingobjectmodelmapbuilder) arg, SchemaConfiguration configuration) |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | selfRef()<br>[optional] |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
