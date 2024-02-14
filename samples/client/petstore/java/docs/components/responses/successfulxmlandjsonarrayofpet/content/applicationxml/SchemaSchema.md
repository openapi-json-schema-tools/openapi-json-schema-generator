# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedList](#schemaschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaListBuilderSchemaListBuilder](#schemalistbuilderschemalistbuilder)<br> builder for List payloads |
| static class | [SchemaSchema.SchemaListSchemaList](#schemalistschemalist)<br> output class for List payloads |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedList](#schemaschema1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedList
public static final class SchemaSchema1BoxedList<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedList([SchemaListSchemaList](#schemalistschemalist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaListSchemaList](#schemalistschemalist) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
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
SchemaSchema.SchemaListSchemaList validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaListBuilderSchemaListBuilder()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "name",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "photoUrls",
                    Arrays.asList(
                        "a"
                    )
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "category",
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, Object>(
                            "name",
                            "a"
                        ),
                        new AbstractMap.SimpleEntry<String, Object>(
                            "id",
                            1L
                        )
                    )
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "tags",
                    Arrays.asList(
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, String>(
                                "name",
                                "a"
                            )
                        )
                    )
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "status",
                    "available"
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
| Class<? extends JsonSchema> | items = [Pet.Pet1.class](../../../../../components/schemas/Pet.md#pet1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaListSchemaList](#schemalistschemalist) | validate([List<?>](#schemalistbuilderschemalistbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedList](#schemaschema1boxedlist) | validateAndBox([List<?>](#schemalistbuilderschemalistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilderSchemaListBuilder
public class SchemaListBuilderSchemaListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilderSchemaListBuilder()<br>Creates an empty list |
| SchemaListBuilderSchemaListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilderSchemaListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaListSchemaList
public class SchemaListSchemaList<br>
extends `FrozenList<Pet.PetMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaListSchemaList](#schemalistschemalist) | of([List<Map<String, ? extends @Nullable Object>>](#schemalistbuilderschemalistbuilder) arg, SchemaConfiguration configuration) |
