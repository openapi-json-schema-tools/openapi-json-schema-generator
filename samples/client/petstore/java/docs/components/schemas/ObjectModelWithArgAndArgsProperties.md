# ObjectModelWithArgAndArgsProperties
org.openapijsonschematools.client.components.schemas.ObjectModelWithArgAndArgsProperties.java
public class ObjectModelWithArgAndArgsProperties

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1Boxed](#objectmodelwithargandargsproperties1boxed)<br> sealed validated payload class |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1](#objectmodelwithargandargsproperties1)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMapBuilder](#objectmodelwithargandargspropertiesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap)<br> output class for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ArgsBoxed](#argsboxed)<br> sealed validated payload class |
| static class | [ObjectModelWithArgAndArgsProperties.ArgsBoxedString](#argsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Args](#args)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.ArgBoxed](#argboxed)<br> sealed validated payload class |
| static class | [ObjectModelWithArgAndArgsProperties.ArgBoxedString](#argboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Arg](#arg)<br> schema class |

## ObjectModelWithArgAndArgsProperties1Boxed
public static abstract sealed class ObjectModelWithArgAndArgsProperties1Boxed<br>
permits<br>
[ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectModelWithArgAndArgsProperties1BoxedMap
public static final class ObjectModelWithArgAndArgsProperties1BoxedMap<br>
extends ObjectModelWithArgAndArgsProperties1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsProperties1BoxedMap(ObjectModelWithArgAndArgsPropertiesMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ObjectModelWithArgAndArgsPropertiesMap | data<br>validated payload |

## ObjectModelWithArgAndArgsProperties1
public static class ObjectModelWithArgAndArgsProperties1<br>
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
ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap validatedPayload =
    ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1.validate(
    new ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMapBuilder()
        .arg("a")

        .args("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("arg", [Arg.class](#arg))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("args", [Args.class](#args)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"arg",<br>&nbsp;&nbsp;&nbsp;&nbsp;"args"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | validate([Map&lt;?, ?&gt;](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectModelWithArgAndArgsPropertiesMap00Builder
public class ObjectModelWithArgAndArgsPropertiesMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, Void value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, boolean value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, String value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, int value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, float value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, long value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, double value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, List<?> value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectModelWithArgAndArgsPropertiesMap01Builder
public class ObjectModelWithArgAndArgsPropertiesMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | args(String value) |

## ObjectModelWithArgAndArgsPropertiesMap10Builder
public class ObjectModelWithArgAndArgsPropertiesMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | arg(String value) |

## ObjectModelWithArgAndArgsPropertiesMapBuilder
public class ObjectModelWithArgAndArgsPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap01Builder](#objectmodelwithargandargspropertiesmap01builder) | arg(String value) |
| [ObjectModelWithArgAndArgsPropertiesMap10Builder](#objectmodelwithargandargspropertiesmap10builder) | args(String value) |

## ObjectModelWithArgAndArgsPropertiesMap
public static class ObjectModelWithArgAndArgsPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | arg()<br> |
| String | args()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArgsBoxed
public static abstract sealed class ArgsBoxed<br>
permits<br>
[ArgsBoxedString](#argsboxedstring)

A sealed class that stores validated payloads using boxed classes

## ArgsBoxedString
public static final class ArgsBoxedString<br>
extends ArgsBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArgsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Args
public static class Args<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ArgBoxed
public static abstract sealed class ArgBoxed<br>
permits<br>
[ArgBoxedString](#argboxedstring)

A sealed class that stores validated payloads using boxed classes

## ArgBoxedString
public static final class ArgBoxedString<br>
extends ArgBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArgBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Arg
public static class Arg<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
