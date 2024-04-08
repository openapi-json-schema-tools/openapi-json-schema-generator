# RefInAdditionalproperties
org.openapijsonschematools.client.components.schemas.RefInAdditionalproperties.java
public class RefInAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInAdditionalproperties.RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [RefInAdditionalproperties.RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInAdditionalproperties.RefInAdditionalproperties1](#refinadditionalproperties1)<br> schema class |
| static class | [RefInAdditionalproperties.RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [RefInAdditionalproperties.RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap)<br> output class for Map payloads |

## RefInAdditionalproperties1Boxed
public sealed interface RefInAdditionalproperties1Boxed<br>
permits<br>
[RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInAdditionalproperties1BoxedMap
public record RefInAdditionalproperties1BoxedMap<br>
implements [RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAdditionalproperties1BoxedMap([RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInAdditionalproperties1
public static class RefInAdditionalproperties1<br>
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
import org.openapijsonschematools.client.components.schemas.RefInAdditionalproperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
RefInAdditionalproperties.RefInAdditionalpropertiesMap validatedPayload =
    RefInAdditionalproperties.RefInAdditionalproperties1.validate(
    new RefInAdditionalproperties.RefInAdditionalpropertiesMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#refinadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#refinadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## RefInAdditionalpropertiesMapBuilder
public class RefInAdditionalpropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, String value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, int value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, float value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, long value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, double value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## RefInAdditionalpropertiesMap
public static class RefInAdditionalpropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#refinadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
