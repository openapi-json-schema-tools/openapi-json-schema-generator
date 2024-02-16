# ObjectWithOnlyOptionalProps
org.openapijsonschematools.client.components.schemas.ObjectWithOnlyOptionalProps.java
public class ObjectWithOnlyOptionalProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1Boxed](#objectwithonlyoptionalprops1boxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1](#objectwithonlyoptionalprops1)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap)<br> output class for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.BBoxed](#bboxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOnlyOptionalProps.BBoxedNumber](#bboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithOnlyOptionalProps.B](#b)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ABoxed](#aboxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOnlyOptionalProps.ABoxedString](#aboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithOnlyOptionalProps.A](#a)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithOnlyOptionalProps1Boxed
public static abstract sealed class ObjectWithOnlyOptionalProps1Boxed<br>
permits<br>
[ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ObjectWithOnlyOptionalProps1BoxedMap
public static final class ObjectWithOnlyOptionalProps1BoxedMap<br>
extends [ObjectWithOnlyOptionalProps1Boxed](#objectwithonlyoptionalprops1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOnlyOptionalProps1BoxedMap([ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | data<br>validated payload |

## ObjectWithOnlyOptionalProps1
public static class ObjectWithOnlyOptionalProps1<br>
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
ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap validatedPayload =
    ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1.validate(
    new ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMapBuilder()
        .a("a")

        .b(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", [B.class](#b)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | validate([Map&lt;?, ?&gt;](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithOnlyOptionalPropsMapBuilder
public class ObjectWithOnlyOptionalPropsMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOnlyOptionalPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | a(String value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(int value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(float value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(long value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(double value) |

## ObjectWithOnlyOptionalPropsMap
public static class ObjectWithOnlyOptionalPropsMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | of([Map<String, Object>](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |

## BBoxed
public static abstract sealed class BBoxed<br>
permits<br>
[BBoxedNumber](#bboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## BBoxedNumber
public static final class BBoxedNumber<br>
extends [BBoxed](#bboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## B
public static class B<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ABoxed
public static abstract sealed class ABoxed<br>
permits<br>
[ABoxedString](#aboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ABoxedString
public static final class ABoxedString<br>
extends [ABoxed](#aboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## A
public static class A<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public static final class AdditionalPropertiesBoxedBoolean<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalPropertiesBoxedNumber
public static final class AdditionalPropertiesBoxedNumber<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalPropertiesBoxedList
public static final class AdditionalPropertiesBoxedList<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalPropertiesBoxedMap
public static final class AdditionalPropertiesBoxedMap<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
