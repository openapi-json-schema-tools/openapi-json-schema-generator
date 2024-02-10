# SpecialModelname
org.openapijsonschematools.client.components.schemas.SpecialModelname.java
public class SpecialModelname

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SpecialModelname.SpecialModelname1Boxed](#specialmodelname1boxed)<br> sealed validated payload class |
| static class | [SpecialModelname.SpecialModelname1](#specialmodelname1)<br> schema class |
| static class | [SpecialModelname.SpecialModelnameMapBuilder](#specialmodelnamemapbuilder)<br> builder for Map payloads |
| static class | [SpecialModelname.SpecialModelnameMap](#specialmodelnamemap)<br> output class for Map payloads |
| static class | [SpecialModelname.ABoxed](#aboxed)<br> sealed validated payload class |
| static class | [SpecialModelname.A](#a)<br> schema class |

## SpecialModelname1Boxed
public static abstract sealed class SpecialModelname1Boxed<br>
permits<br>
[SpecialModelname1BoxedMap](#specialmodelname1boxedmap)

A sealed class that stores validated payloads using boxed classes

## SpecialModelname1BoxedMap
public static final class SpecialModelname1BoxedMap<br>
extends SpecialModelname1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SpecialModelname1BoxedMap(SpecialModelnameMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| SpecialModelnameMap | data<br>validated payload |

## SpecialModelname1
public static class SpecialModelname1<br>
extends JsonSchema

A schema class that validates payloads

## Description
model with an invalid class name for python

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
SpecialModelname.SpecialModelnameMap validatedPayload =
    SpecialModelname.SpecialModelname1.validate(
    new SpecialModelname.SpecialModelnameMapBuilder()
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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SpecialModelnameMap](#specialmodelnamemap) | validate([Map&lt;?, ?&gt;](#specialmodelnamemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SpecialModelnameMapBuilder
public class SpecialModelnameMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SpecialModelnameMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | a(String value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, Void value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, boolean value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, String value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, int value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, float value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, long value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, double value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, List<?> value) |
| [SpecialModelnameMapBuilder](#specialmodelnamemapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## SpecialModelnameMap
public static class SpecialModelnameMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | of([Map<String, ? extends @Nullable Object>](#specialmodelnamemapbuilder) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ABoxed
public static abstract sealed class ABoxed<br>
permits<br>
[ABoxedString](#aboxedstring)

A sealed class that stores validated payloads using boxed classes

## ABoxedString
public static final class ABoxedString<br>
extends ABoxed

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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
