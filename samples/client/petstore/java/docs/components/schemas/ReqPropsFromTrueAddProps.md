# ReqPropsFromTrueAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromTrueAddProps.java
public class ReqPropsFromTrueAddProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1](#reqpropsfromtrueaddprops1)<br> schema class |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMapBuilder](#reqpropsfromtrueaddpropsmapbuilder)<br> builder for Map payloads |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap)<br> output class for Map payloads |
| static class | [ReqPropsFromTrueAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ReqPropsFromTrueAddProps1
public static class ReqPropsFromTrueAddProps1<br>
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
ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMap validatedPayload =
    ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1.validate(
    new ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMapBuilder()
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
| [ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) | validate([Map&lt;?, ?&gt;](#reqpropsfromtrueaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReqPropsFromTrueAddPropsMap00Builder
public class ReqPropsFromTrueAddPropsMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromTrueAddPropsMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, Void value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, boolean value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, String value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, int value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, float value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, long value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, double value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, List<?> value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | additionalProperty(String key, Map<String, ?> value) |

## ReqPropsFromTrueAddPropsMap01Builder
public class ReqPropsFromTrueAddPropsMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromTrueAddPropsMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(Void value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(boolean value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(String value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(int value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(float value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(long value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(double value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | validName(Map<String, ?> value) |

## ReqPropsFromTrueAddPropsMap10Builder
public class ReqPropsFromTrueAddPropsMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromTrueAddPropsMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(Void value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(boolean value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(String value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(int value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(float value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(long value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(double value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | setInvalidHyphenMinusName(Map<String, ?> value) |

## ReqPropsFromTrueAddPropsMapBuilder
public class ReqPropsFromTrueAddPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromTrueAddPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(Void value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(boolean value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(String value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(int value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(float value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(long value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(double value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | setInvalidHyphenMinusName(Map<String, ?> value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(Void value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(boolean value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(String value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(int value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(float value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(long value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(double value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap10Builder](#reqpropsfromtrueaddpropsmap10builder) | validName(Map<String, ?> value) |

## ReqPropsFromTrueAddPropsMap
public static class ReqPropsFromTrueAddPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) | of([Map<String, ? extends @Nullable Object>](#reqpropsfromtrueaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validName()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
