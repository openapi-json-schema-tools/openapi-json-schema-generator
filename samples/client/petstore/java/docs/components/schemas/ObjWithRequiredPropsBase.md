# ObjWithRequiredPropsBase
org.openapijsonschematools.client.components.schemas.ObjWithRequiredPropsBase.java
public class ObjWithRequiredPropsBase

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1](#objwithrequiredpropsbase1)<br> schema class |
| static class | [ObjWithRequiredPropsBase.ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap)<br> output class for Map payloads |
| static class | [ObjWithRequiredPropsBase.B](#b)<br> schema class |

## ObjWithRequiredPropsBase1
public static class ObjWithRequiredPropsBase1<br>
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
ObjWithRequiredPropsBase.ObjWithRequiredPropsBaseMap validatedPayload =
    ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "b",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", [B.class](#b)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"b"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjWithRequiredPropsBaseMap
public static class ObjWithRequiredPropsBaseMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | b()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **b** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## B
public static class B<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
