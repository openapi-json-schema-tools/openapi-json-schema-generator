# ObjectModelWithArgAndArgsProperties
org.openapijsonschematools.client.components.schemas.ObjectModelWithArgAndArgsProperties.java
public class ObjectModelWithArgAndArgsProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1](#objectmodelwithargandargsproperties1)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMapInput](#objectmodelwithargandargspropertiesmapinput)<br> builder for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap)<br> output class for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Args](#args)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.Arg](#arg)<br> schema class |

## ObjectModelWithArgAndArgsProperties1
public static class ObjectModelWithArgAndArgsProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap validatedPayload =
    ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, String>(
            "arg",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "args",
            "a"
        )
    ),
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
| [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | validate([Map<?, ?>](#objectmodelwithargandargspropertiesmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectModelWithArgAndArgsPropertiesMapInput
public class ObjectModelWithArgAndArgsPropertiesMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **arg** | String |  | |
| **args** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ObjectModelWithArgAndArgsPropertiesMap
public static class ObjectModelWithArgAndArgsPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectmodelwithargandargspropertiesmapinput) arg, SchemaConfiguration configuration) |
| String | arg()<br> |
| String | args()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Args
public static class Args<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Arg
public static class Arg<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
