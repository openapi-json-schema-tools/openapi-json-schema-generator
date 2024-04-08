# ObjectWithOptionalTestProp
org.openapijsonschematools.client.components.schemas.ObjectWithOptionalTestProp.java
public class ObjectWithOptionalTestProp<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1Boxed](#objectwithoptionaltestprop1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1BoxedMap](#objectwithoptionaltestprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1](#objectwithoptionaltestprop1)<br> schema class |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMapBuilder](#objectwithoptionaltestpropmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap)<br> output class for Map payloads |
| sealed interface | [ObjectWithOptionalTestProp.TestBoxed](#testboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOptionalTestProp.TestBoxedString](#testboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithOptionalTestProp.Test](#test)<br> schema class |

## ObjectWithOptionalTestProp1Boxed
public sealed interface ObjectWithOptionalTestProp1Boxed<br>
permits<br>
[ObjectWithOptionalTestProp1BoxedMap](#objectwithoptionaltestprop1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithOptionalTestProp1BoxedMap
public record ObjectWithOptionalTestProp1BoxedMap<br>
implements [ObjectWithOptionalTestProp1Boxed](#objectwithoptionaltestprop1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOptionalTestProp1BoxedMap([ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.ObjectWithOptionalTestProp;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [ObjectWithOptionalTestProp1Boxed](#objectwithoptionaltestprop1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface TestBoxed<br>
permits<br>
[TestBoxedString](#testboxedstring)

sealed interface that stores validated payloads using boxed classes

## TestBoxedString
public record TestBoxedString<br>
implements [TestBoxed](#testboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TestBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Test
public static class Test<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
