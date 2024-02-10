# ObjWithRequiredProps
org.openapijsonschematools.client.components.schemas.ObjWithRequiredProps.java
public class ObjWithRequiredProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjWithRequiredProps.ObjWithRequiredProps1Boxed](#objwithrequiredprops1boxed)<br> sealed validated payload class |
| static class | [ObjWithRequiredProps.ObjWithRequiredProps1](#objwithrequiredprops1)<br> schema class |
| static class | [ObjWithRequiredProps.ObjWithRequiredPropsMapBuilder](#objwithrequiredpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjWithRequiredProps.ObjWithRequiredPropsMap](#objwithrequiredpropsmap)<br> output class for Map payloads |
| static class | [ObjWithRequiredProps.ABoxed](#aboxed)<br> sealed validated payload class |
| static class | [ObjWithRequiredProps.A](#a)<br> schema class |

## ObjWithRequiredProps1Boxed
public static abstract sealed class ObjWithRequiredProps1Boxed<br>
permits<br>
[ObjWithRequiredProps1BoxedMap](#objwithrequiredprops1boxedmap)

## ObjWithRequiredProps1
public static class ObjWithRequiredProps1<br>
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
ObjWithRequiredProps.ObjWithRequiredPropsMap validatedPayload =
    ObjWithRequiredProps.ObjWithRequiredProps1.validate(
    new ObjWithRequiredProps.ObjWithRequiredPropsMapBuilder()
        .a("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"a"<br>)<br> |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1.class](../../components/schemas/ObjWithRequiredPropsBase.md#objwithrequiredpropsbase1)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjWithRequiredPropsMap](#objwithrequiredpropsmap) | validate([Map&lt;?, ?&gt;](#objwithrequiredpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjWithRequiredPropsMap0Builder
public class ObjWithRequiredPropsMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjWithRequiredPropsMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, Void value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, boolean value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, String value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, int value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, float value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, long value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, double value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, List<?> value) |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## ObjWithRequiredPropsMapBuilder
public class ObjWithRequiredPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjWithRequiredPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjWithRequiredPropsMap0Builder](#objwithrequiredpropsmap0builder) | a(String value) |

## ObjWithRequiredPropsMap
public static class ObjWithRequiredPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjWithRequiredPropsMap](#objwithrequiredpropsmap) | of([Map<String, ? extends @Nullable Object>](#objwithrequiredpropsmapbuilder) arg, SchemaConfiguration configuration) |
| String | a()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ABoxed
public static abstract sealed class ABoxed<br>
permits<br>
[ABoxedString](#aboxedstring)

## A
public static class A<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
