# ReqPropsFromExplicitAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromExplicitAddProps.java
public class ReqPropsFromExplicitAddProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1](#reqpropsfromexplicitaddprops1)<br> schema class |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMapBuilder](#reqpropsfromexplicitaddpropsmapbuilder)<br> builder for Map payloads |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap)<br> output class for Map payloads |
| static class | [ReqPropsFromExplicitAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap validatedPayload =
    ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "invalid-name",
            "a"
        )
    ),
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReqPropsFromExplicitAddPropsMap00Builder
public class ReqPropsFromExplicitAddPropsMap00Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMap00Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
## ReqPropsFromExplicitAddPropsMap01Builder
public class ReqPropsFromExplicitAddPropsMap01Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
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

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMap10Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap00Builder](#reqpropsfromexplicitaddpropsmap00builder) | setInvalidHyphenMinusName(String value) |
## ReqPropsFromExplicitAddPropsMapBuilder
public class ReqPropsFromExplicitAddPropsMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromExplicitAddPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromExplicitAddPropsMap01Builder](#reqpropsfromexplicitaddpropsmap01builder) | setInvalidHyphenMinusName(String value) |
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

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
