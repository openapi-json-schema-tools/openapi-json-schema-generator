# ReqPropsFromExplicitAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromExplicitAddProps.java
public class ReqPropsFromExplicitAddProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1](#reqpropsfromexplicitaddprops1)<br> schema class |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMapInput](#reqpropsfromexplicitaddpropsmapinput)<br> builder for Map payloads |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap validatedPayload =
    ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1.validate(
    MapMaker.makeMap(
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
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | validate([Map<String, String>](#reqpropsfromexplicitaddpropsmapinput) arg, SchemaConfiguration configuration) |

## ReqPropsFromExplicitAddPropsMapInput
public class ReqPropsFromExplicitAddPropsMapInput<br>
builder for `Map<String, String>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **invalid-name** | String |  | |
| **validName** | String |  | |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## ReqPropsFromExplicitAddPropsMap
public static class ReqPropsFromExplicitAddPropsMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | of([Map<String, String>](#reqpropsfromexplicitaddpropsmapinput) arg, SchemaConfiguration configuration) |
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
