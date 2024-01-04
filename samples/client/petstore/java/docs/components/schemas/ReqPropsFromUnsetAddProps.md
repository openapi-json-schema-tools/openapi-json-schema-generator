# ReqPropsFromUnsetAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromUnsetAddProps.java
public class ReqPropsFromUnsetAddProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddProps1](#reqpropsfromunsetaddprops1)<br> schema class |
| static class | [ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMapBuilder](#reqpropsfromunsetaddpropsmapbuilder)<br> builder for Map payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMap validatedPayload =
    ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddProps1.validate(
    MapUtils.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromUnsetAddPropsMap](#reqpropsfromunsetaddpropsmap) | validate([Map&lt;?, ?&gt;>](#reqpropsfromunsetaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReqPropsFromUnsetAddPropsMap00Builder
public class ReqPropsFromUnsetAddPropsMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromUnsetAddPropsMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
## ReqPropsFromUnsetAddPropsMap01Builder
public class ReqPropsFromUnsetAddPropsMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromUnsetAddPropsMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(Void value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(boolean value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(String value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(int value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(float value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(long value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(double value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(List<?> value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | validName(Map<String, ?> value) |
## ReqPropsFromUnsetAddPropsMap10Builder
public class ReqPropsFromUnsetAddPropsMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromUnsetAddPropsMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(Void value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(boolean value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(String value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(int value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(float value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(long value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(double value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(List<?> value) |
| [ReqPropsFromUnsetAddPropsMap00Builder](#reqpropsfromunsetaddpropsmap00builder) | setInvalidHyphenMinusName(Map<String, ?> value) |
## ReqPropsFromUnsetAddPropsMapBuilder
public class ReqPropsFromUnsetAddPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromUnsetAddPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(Void value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(boolean value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(String value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(int value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(float value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(long value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(double value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(List<?> value) |
| [ReqPropsFromUnsetAddPropsMap01Builder](#reqpropsfromunsetaddpropsmap01builder) | setInvalidHyphenMinusName(Map<String, ?> value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(Void value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(boolean value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(String value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(int value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(float value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(long value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(double value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(List<?> value) |
| [ReqPropsFromUnsetAddPropsMap10Builder](#reqpropsfromunsetaddpropsmap10builder) | validName(Map<String, ?> value) |

## ReqPropsFromUnsetAddPropsMap
public static class ReqPropsFromUnsetAddPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromUnsetAddPropsMap](#reqpropsfromunsetaddpropsmap) | of([Map<String, ? extends @Nullable Object>](#reqpropsfromunsetaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validName()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
