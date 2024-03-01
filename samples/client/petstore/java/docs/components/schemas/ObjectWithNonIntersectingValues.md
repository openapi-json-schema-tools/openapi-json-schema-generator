# ObjectWithNonIntersectingValues
org.openapijsonschematools.client.components.schemas.ObjectWithNonIntersectingValues.java
public class ObjectWithNonIntersectingValues<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1Boxed](#objectwithnonintersectingvalues1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1BoxedMap](#objectwithnonintersectingvalues1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1](#objectwithnonintersectingvalues1)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMapBuilder](#objectwithnonintersectingvaluesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap)<br> output class for Map payloads |
| sealed interface | [ObjectWithNonIntersectingValues.ABoxed](#aboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithNonIntersectingValues.ABoxedNumber](#aboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithNonIntersectingValues.A](#a)<br> schema class |
| sealed interface | [ObjectWithNonIntersectingValues.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithNonIntersectingValues.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithNonIntersectingValues.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithNonIntersectingValues1Boxed
public sealed interface ObjectWithNonIntersectingValues1Boxed<br>
permits<br>
[ObjectWithNonIntersectingValues1BoxedMap](#objectwithnonintersectingvalues1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithNonIntersectingValues1BoxedMap
public record ObjectWithNonIntersectingValues1BoxedMap<br>
implements [ObjectWithNonIntersectingValues1Boxed](#objectwithnonintersectingvalues1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNonIntersectingValues1BoxedMap([ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.ObjectWithNonIntersectingValues;

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
| [ObjectWithNonIntersectingValues1BoxedMap](#objectwithnonintersectingvalues1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithnonintersectingvaluesmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithNonIntersectingValues1Boxed](#objectwithnonintersectingvalues1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface ABoxed<br>
permits<br>
[ABoxedNumber](#aboxednumber)

sealed interface that stores validated payloads using boxed classes

## ABoxedNumber
public record ABoxedNumber<br>
implements [ABoxed](#aboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## A
public static class A<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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
