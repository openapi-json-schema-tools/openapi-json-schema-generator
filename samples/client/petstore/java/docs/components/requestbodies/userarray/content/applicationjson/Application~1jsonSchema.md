# Application~1jsonSchema
public class Application~1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1jsonSchema.Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1](#application~1jsonschema1)<br> schema class |
| static class | [Application~1jsonSchema.Application~1jsonSchemaListBuilder](#application~1jsonschemalistbuilder)<br> builder for List payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchemaList](#application~1jsonschemalist)<br> output class for List payloads |

## Application~1jsonSchema1Boxed
public static abstract sealed class Application~1jsonSchema1Boxed<br>
permits<br>
[Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonSchema1BoxedList
public static final class Application~1jsonSchema1BoxedList<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedList([Application~1jsonSchemaList](#application~1jsonschemalist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application~1jsonSchemaList](#application~1jsonschemalist) | data<br>validated payload |

## Application~1jsonSchema1
public static class Application~1jsonSchema1<br>
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
Application~1jsonSchema.Application~1jsonSchemaList validatedPayload =
    Application~1jsonSchema.Application~1jsonSchema1.validate(
    new Application~1jsonSchema.Application~1jsonSchemaListBuilder()
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
| [Application~1jsonSchemaList](#application~1jsonschemalist) | validate([List<?>](#application~1jsonschemalistbuilder) arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist) | validateAndBox([List<?>](#application~1jsonschemalistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1jsonSchemaListBuilder
public class Application~1jsonSchemaListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchemaListBuilder()<br>Creates an empty list |
| Application~1jsonSchemaListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Application~1jsonSchemaListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## Application~1jsonSchemaList
public class Application~1jsonSchemaList<br>
extends `FrozenList<User.UserMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1jsonSchemaList](#application~1jsonschemalist) | of([List<Map<String, ? extends @Nullable Object>>](#application~1jsonschemalistbuilder) arg, SchemaConfiguration configuration) |
