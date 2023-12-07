# Schema4
org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4.java
public class Schema4

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41](#schema41)<br> schema class |
| static class | [Schema4.SchemaListInput4](#schemalistinput4)<br> builder for List payloads |
| static class | [Schema4.SchemaList4](#schemalist4)<br> output class for List payloads |
| static class | [Schema4.Items4](#items4)<br> schema class |

## Schema41
public static class Schema41<br>
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

// List validation
Schema4.SchemaList4 validatedPayload =
    Schema4.Schema41.validate(
    Arrays.asList(
        "a"
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items4.class](#items4)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList4](#schemalist4) | validate([List<String>](#schemalistinput4) arg, SchemaConfiguration configuration) |

## SchemaListInput4
public class SchemaListInput4<br>
builder for `List<String>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## SchemaList4
public class SchemaList4<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList4](#schemalist4) | of([SchemaListInput4](#schemalistinput4) arg, SchemaConfiguration configuration) |

## Items4
public static class Items4<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |
