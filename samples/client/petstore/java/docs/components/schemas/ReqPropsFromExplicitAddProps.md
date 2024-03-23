# ReqPropsFromExplicitAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromExplicitAddProps.java
public class ReqPropsFromExplicitAddProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1Boxed](#reqpropsfromexplicitaddprops1boxed)<br> sealed interface for validated payloads |
| record | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1BoxedMap](#reqpropsfromexplicitaddprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1](#reqpropsfromexplicitaddprops1)<br> schema class |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMapBuilder](#reqpropsfromexplicitaddpropsmapbuilder)<br> builder for Map payloads |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap)<br> output class for Map payloads |
| sealed interface | [ReqPropsFromExplicitAddProps.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [ReqPropsFromExplicitAddProps.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [ReqPropsFromExplicitAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ReqPropsFromExplicitAddProps1Boxed
public sealed interface ReqPropsFromExplicitAddProps1Boxed<br>
permits<br>
[ReqPropsFromExplicitAddProps1BoxedMap](#reqpropsfromexplicitaddprops1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ReqPropsFromExplicitAddProps1BoxedMap
public record ReqPropsFromExplicitAddProps1BoxedMap<br>
implements [ReqPropsFromExplicitAddProps1Boxed](#reqpropsfromexplicitaddprops1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddProps1BoxedMap([ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ReqPropsFromExplicitAddProps1
public static class ReqPropsFromExplicitAddProps1<br>
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
import org.openapijsonschematools.client.components.schemas.ReqPropsFromExplicitAddProps;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap validatedPayload =
    ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1.validate(
    new ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMapBuilder()
        .invalidHyphenMinusName("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | validate([Map&lt;?, ?&gt;](#reqpropsfromexplicitaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ReqPropsFromExplicitAddProps1BoxedMap](#reqpropsfromexplicitaddprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#reqpropsfromexplicitaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ReqPropsFromExplicitAddProps1Boxed](#reqpropsfromexplicitaddprops1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ReqPropsFromExplicitAddPropsMap00Builder
public class ReqPropsFromExplicitAddPropsMap00Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMap00Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [ReqPropsFromExplicitAddPropsMap00Builder](#reqpropsfromexplicitaddpropsmap00builder) | additionalProperty(String key, String value) |

## ReqPropsFromExplicitAddPropsMap01Builder
public class ReqPropsFromExplicitAddPropsMap01Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMap01Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap00Builder](#reqpropsfromexplicitaddpropsmap00builder) | validName(String value) |

## ReqPropsFromExplicitAddPropsMap10Builder
public class ReqPropsFromExplicitAddPropsMap10Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMap10Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap00Builder](#reqpropsfromexplicitaddpropsmap00builder) | invalidHyphenMinusName(String value) |

## ReqPropsFromExplicitAddPropsMapBuilder
public class ReqPropsFromExplicitAddPropsMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap01Builder](#reqpropsfromexplicitaddpropsmap01builder) | invalidHyphenMinusName(String value) |
| [ReqPropsFromExplicitAddPropsMap10Builder](#reqpropsfromexplicitaddpropsmap10builder) | validName(String value) |

## ReqPropsFromExplicitAddPropsMap
public static class ReqPropsFromExplicitAddPropsMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | of([Map<String, String>](#reqpropsfromexplicitaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| String | validName()<br> |
| String | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
