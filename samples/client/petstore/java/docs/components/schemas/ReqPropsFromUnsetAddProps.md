# ReqPropsFromUnsetAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromUnsetAddProps.java
public class ReqPropsFromUnsetAddProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddProps1](#reqpropsfromunsetaddprops1)<br> schema class |
| static class | [ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMapInput](#reqpropsfromunsetaddpropsmapinput)<br> builder for Map payloads |
| static class | [ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMap](#reqpropsfromunsetaddpropsmap)<br> output class for Map payloads |

## ReqPropsFromUnsetAddProps1
public static class ReqPropsFromUnsetAddProps1<br>
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
ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMap validatedPayload =
    ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddProps1.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromUnsetAddPropsMap](#reqpropsfromunsetaddpropsmap) | validate([Map<?, ?>](#reqpropsfromunsetaddpropsmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReqPropsFromUnsetAddPropsMapInput
public class ReqPropsFromUnsetAddPropsMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **invalid-name** | ? extends @Nullable Object |  | |
| **validName** | ? extends @Nullable Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ReqPropsFromUnsetAddPropsMap
public static class ReqPropsFromUnsetAddPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromUnsetAddPropsMap](#reqpropsfromunsetaddpropsmap) | of([Map<String, ? extends @Nullable Object>](#reqpropsfromunsetaddpropsmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validName()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
