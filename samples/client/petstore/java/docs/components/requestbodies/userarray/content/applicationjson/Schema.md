# Schema
org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson.Schema.java
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaListInput](#schemalistinput)<br> builder for List payloads |
| static class | [Schema.SchemaList](#schemalist)<br> output class for List payloads |

## Schema1
public static class Schema1<br>
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
Schema.SchemaList validatedPayload =
    Schema.Schema1.validate(
    Arrays.asList(
        MapMaker.makeMap(
            new AbstractMap.SimpleEntry<>(
                "id",
                1L
            ),
            new AbstractMap.SimpleEntry<>(
                "username",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "firstName",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "lastName",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "email",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "password",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "phone",
                "a"
            ),
            new AbstractMap.SimpleEntry<>(
                "userStatus",
                1
            ),
            new AbstractMap.SimpleEntry<>(
                "objectWithNoDeclaredPropsNullable",
                (Void) null
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([User.User1.class](../../../../components/schemas/User.md#user1))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | validate([List<Map<String, Object>>](#schemalistinput) arg, SchemaConfiguration configuration) |

## SchemaListInput
public class SchemaListInput<br>
builder for `List<Map<String, Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## SchemaList
public class SchemaList<br>
extends `FrozenList<User.UserMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | of([List<Map<String, Object>>](#schemalistinput) arg, SchemaConfiguration configuration) |
