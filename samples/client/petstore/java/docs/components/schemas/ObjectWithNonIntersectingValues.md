# ObjectWithNonIntersectingValues
org.openapijsonschematools.client.components.schemas.ObjectWithNonIntersectingValues.java
public class ObjectWithNonIntersectingValues

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1Boxed](#objectwithnonintersectingvalues1boxed)<br> sealed validated payload class |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1](#objectwithnonintersectingvalues1)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap)<br> output class for Map payloads |
| static class | [ObjectWithNonIntersectingValues.ABoxed](#aboxed)<br> sealed validated payload class |
| static class | [ObjectWithNonIntersectingValues.A](#a)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [ObjectWithNonIntersectingValues.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithNonIntersectingValues1Boxed
public static abstract sealed class ObjectWithNonIntersectingValues1Boxed<br>
permits<br>
[ObjectWithNonIntersectingValues1BoxedMap](#objectwithnonintersectingvalues1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithNonIntersectingValues1BoxedMap
public static final class ObjectWithNonIntersectingValues1BoxedMap<br>
extends ObjectWithNonIntersectingValues1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNonIntersectingValues1BoxedMap(ObjectWithNonIntersectingValuesMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ObjectWithNonIntersectingValuesMap | data<br>validated payload |

## ObjectWithNonIntersectingValues1
public static class ObjectWithNonIntersectingValues1<br>
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
ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap validatedPayload =
    ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1.validate(
    new ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMapBuilder()
        .a(1)

        .additionalProperty("someAdditionalProperty", "a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | validate([Map&lt;?, ?&gt;](#objectwithnonintersectingvaluesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithNonIntersectingValuesMapBuilder
public class ObjectWithNonIntersectingValuesMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNonIntersectingValuesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder) | a(int value) |
| [ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder) | a(float value) |
| [ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder) | a(long value) |
| [ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder) | a(double value) |
| [ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder) | additionalProperty(String key, String value) |

## ObjectWithNonIntersectingValuesMap
public static class ObjectWithNonIntersectingValuesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | of([Map<String, Object>](#objectwithnonintersectingvaluesmapbuilder) arg, SchemaConfiguration configuration) |
| Number | a()<br>[optional] |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ABoxed
public static abstract sealed class ABoxed<br>
permits<br>
[ABoxedNumber](#aboxednumber)

A sealed class that stores validated payloads using boxed classes

## ABoxedNumber
public static final class ABoxedNumber<br>
extends ABoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## A
public static class A<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
