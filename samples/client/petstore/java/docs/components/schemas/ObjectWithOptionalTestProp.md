# ObjectWithOptionalTestProp
org.openapijsonschematools.client.components.schemas.ObjectWithOptionalTestProp.java
public class ObjectWithOptionalTestProp

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1Boxed](#objectwithoptionaltestprop1boxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1BoxedMap](#objectwithoptionaltestprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1](#objectwithoptionaltestprop1)<br> schema class |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap)<br> output class for Map payloads |
| static class | [ObjectWithOptionalTestProp.TestBoxed](#testboxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithOptionalTestProp.TestBoxedString](#testboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithOptionalTestProp.Test](#test)<br> schema class |

## ObjectWithOptionalTestProp1Boxed
public static abstract sealed class ObjectWithOptionalTestProp1Boxed<br>
permits<br>
[ObjectWithOptionalTestProp1BoxedMap](#objectwithoptionaltestprop1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ObjectWithOptionalTestProp1BoxedMap
public static final class ObjectWithOptionalTestProp1BoxedMap<br>
extends [ObjectWithOptionalTestProp1Boxed](#objectwithoptionaltestprop1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOptionalTestProp1BoxedMap([ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | data<br>validated payload |

## ObjectWithOptionalTestProp1
public static class ObjectWithOptionalTestProp1<br>
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
ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap validatedPayload =
    ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1.validate(
    new ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMapBuilder()
        .test("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("test", [Test.class](#test)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | validate([Map&lt;?, ?&gt;](#objectwithoptionaltestpropmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithOptionalTestProp1BoxedMap](#objectwithoptionaltestprop1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithoptionaltestpropmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithOptionalTestPropMapBuilder
public class ObjectWithOptionalTestPropMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOptionalTestPropMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | test(String value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, Void value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, boolean value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, String value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, int value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, float value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, long value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, double value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, List<?> value) |
| [ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectWithOptionalTestPropMap
public static class ObjectWithOptionalTestPropMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | of([Map<String, ? extends @Nullable Object>](#objectwithoptionaltestpropmapbuilder) arg, SchemaConfiguration configuration) |
| String | test()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## TestBoxed
public static abstract sealed class TestBoxed<br>
permits<br>
[TestBoxedString](#testboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## TestBoxedString
public static final class TestBoxedString<br>
extends [TestBoxed](#testboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TestBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Test
public static class Test<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
