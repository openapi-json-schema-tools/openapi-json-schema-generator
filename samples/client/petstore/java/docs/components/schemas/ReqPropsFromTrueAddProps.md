# ReqPropsFromTrueAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromTrueAddProps.java
public class ReqPropsFromTrueAddProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1Boxed](#reqpropsfromtrueaddprops1boxed)<br> sealed interface for validated payloads |
| record | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1BoxedMap](#reqpropsfromtrueaddprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1](#reqpropsfromtrueaddprops1)<br> schema class |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMapBuilder](#reqpropsfromtrueaddpropsmapbuilder)<br> builder for Map payloads |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap)<br> output class for Map payloads |
| sealed interface | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [ReqPropsFromTrueAddProps.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ReqPropsFromTrueAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ReqPropsFromTrueAddProps1Boxed
public sealed interface ReqPropsFromTrueAddProps1Boxed<br>
permits<br>
[ReqPropsFromTrueAddProps1BoxedMap](#reqpropsfromtrueaddprops1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ReqPropsFromTrueAddProps1BoxedMap
public record ReqPropsFromTrueAddProps1BoxedMap<br>
implements [ReqPropsFromTrueAddProps1Boxed](#reqpropsfromtrueaddprops1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReqPropsFromTrueAddProps1BoxedMap([ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.ReqPropsFromTrueAddProps;

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
| [ReqPropsFromTrueAddProps1BoxedMap](#reqpropsfromtrueaddprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#reqpropsfromtrueaddpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ReqPropsFromTrueAddProps1Boxed](#reqpropsfromtrueaddprops1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(Void value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(boolean value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(String value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(int value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(float value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(long value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(double value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap00Builder](#reqpropsfromtrueaddpropsmap00builder) | invalidHyphenMinusName(Map<String, ?> value) |

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
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(Void value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(boolean value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(String value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(int value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(float value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(long value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(double value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(List<?> value) |
| [ReqPropsFromTrueAddPropsMap01Builder](#reqpropsfromtrueaddpropsmap01builder) | invalidHyphenMinusName(Map<String, ?> value) |
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

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
