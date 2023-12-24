# Schema
org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson.Schema.java
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

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
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "id",
                1L
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "username",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "firstName",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "lastName",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "email",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "password",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "phone",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "userStatus",
                1L
            ),
            new AbstractMap.SimpleEntry<String, @Nullable Object>(
                "objectWithNoDeclaredPropsNullable",
                null
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [User.User1.class](../../../../components/schemas/User.md#user1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | validate([List<?>](#schemalistinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListInput
public class SchemaListInput<br>
builder for `List<Map<String, ? extends @Nullable Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, ? extends @Nullable Object> |  |

## SchemaList
public class SchemaList<br>
extends `FrozenList<User.UserMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | of([List<Map<String, ? extends @Nullable Object>>](#schemalistinput) arg, SchemaConfiguration configuration) |
