# TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.java
public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1)<br> schema class |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap)<br> output class for Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha](#alpha)<br> schema class |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1<br>
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
TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap validatedPayload =
    TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "alpha",
            3.14
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("alpha", [Alpha.class](#alpha)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | alpha()<br>[optional] if omitted the server will use the default value of 5 |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **alpha** | Number |  | [optional] if omitted the server will use the default value of 5 |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Alpha
public static class Alpha<br>
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

// Number validation
Number validatedPayload = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha.validate(
    3.14,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(3))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
