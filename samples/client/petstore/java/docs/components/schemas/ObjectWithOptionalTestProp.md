# ObjectWithOptionalTestProp
org.openapijsonschematools.client.components.schemas.ObjectWithOptionalTestProp.java
public class ObjectWithOptionalTestProp

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1](#objectwithoptionaltestprop1)<br> schema class |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap)<br> output class for Map payloads |
| static class | [ObjectWithOptionalTestProp.Test](#test)<br> schema class |

## ObjectWithOptionalTestProp1
public static class ObjectWithOptionalTestProp1<br>
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
ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap validatedPayload =
    ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "test",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("test", [Test.class](#test)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithOptionalTestPropMap
public static class ObjectWithOptionalTestPropMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | test()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **test** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Test
public static class Test<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
