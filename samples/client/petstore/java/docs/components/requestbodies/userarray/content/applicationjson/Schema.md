# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaListBuilder](#schemalistbuilder)<br> builder for List payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
Schema.SchemaList validatedPayload =
    Schema.Schema1.validate(
    new Schema.SchemaListBuilder()
        .add(
            MapUtils.makeMap(
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
                    1
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "objectWithNoDeclaredPropsNullable",
                    null
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [User.User1.class](../../../../components/schemas/User.md#user1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList](#schemalist) | validate([List<?>](#schemalistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder
public class SchemaListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder()<br>Creates an empty list |
| SchemaListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList
public class SchemaList<br>
extends `FrozenList<User.UserMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | of([List<Map<String, ? extends @Nullable Object>>](#schemalistbuilder) arg, SchemaConfiguration configuration) |
