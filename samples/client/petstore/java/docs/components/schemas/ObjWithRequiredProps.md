# ObjWithRequiredProps
org.openapijsonschematools.client.components.schemas.ObjWithRequiredProps.java
public class ObjWithRequiredProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjWithRequiredProps.ObjWithRequiredProps1Boxed](#objwithrequiredprops1boxed)<br> abstract sealed validated payload class |
| record | [ObjWithRequiredProps.ObjWithRequiredProps1BoxedMap](#objwithrequiredprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjWithRequiredProps.ObjWithRequiredProps1](#objwithrequiredprops1)<br> schema class |
| static class | [ObjWithRequiredProps.ObjWithRequiredPropsMapBuilder](#objwithrequiredpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjWithRequiredProps.ObjWithRequiredPropsMap](#objwithrequiredpropsmap)<br> output class for Map payloads |
| sealed interface | [ObjWithRequiredProps.ABoxed](#aboxed)<br> abstract sealed validated payload class |
| record | [ObjWithRequiredProps.ABoxedString](#aboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjWithRequiredProps.A](#a)<br> schema class |

## ObjWithRequiredProps1Boxed
public sealed interface ObjWithRequiredProps1Boxed<br>
permits<br>
[ObjWithRequiredProps1BoxedMap](#objwithrequiredprops1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjWithRequiredProps1BoxedMap
public record ObjWithRequiredProps1BoxedMap<br>
implements [ObjWithRequiredProps1Boxed](#objwithrequiredprops1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjWithRequiredProps1BoxedMap([ObjWithRequiredPropsMap](#objwithrequiredpropsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjWithRequiredPropsMap](#objwithrequiredpropsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [ObjWithRequiredProps1BoxedMap](#objwithrequiredprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objwithrequiredpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjWithRequiredProps1Boxed](#objwithrequiredprops1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface ABoxed<br>
permits<br>
[ABoxedString](#aboxedstring)

sealed interface that stores validated payloads using boxed classes

## ABoxedString
public record ABoxedString<br>
implements [ABoxed](#aboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## A
public static class A<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
