# Application1xmlSchema
public class Application1xmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1xmlSchema.Application1xmlSchema1Boxed](#application1xmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedList](#application1xmlschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1](#application1xmlschema1)<br> schema class |
| static class | [Application1xmlSchema.Application1xmlSchemaListBuilder](#application1xmlschemalistbuilder)<br> builder for List payloads |
| static class | [Application1xmlSchema.Application1xmlSchemaList](#application1xmlschemalist)<br> output class for List payloads |

## Application1xmlSchema1Boxed
public static abstract sealed class Application1xmlSchema1Boxed<br>
permits<br>
[Application1xmlSchema1BoxedList](#application1xmlschema1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Application1xmlSchema1BoxedList
public static final class Application1xmlSchema1BoxedList<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedList([Application1xmlSchemaList](#application1xmlschemalist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application1xmlSchemaList](#application1xmlschemalist) | data<br>validated payload |

## Application1xmlSchema1
public static class Application1xmlSchema1<br>
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
Application1xmlSchema.Application1xmlSchemaList validatedPayload =
    Application1xmlSchema.Application1xmlSchema1.validate(
    new Application1xmlSchema.Application1xmlSchemaListBuilder()
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
| [Application1xmlSchemaList](#application1xmlschemalist) | validate([List<?>](#application1xmlschemalistbuilder) arg, SchemaConfiguration configuration) |
| [Application1xmlSchema1BoxedList](#application1xmlschema1boxedlist) | validateAndBox([List<?>](#application1xmlschemalistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xmlSchemaListBuilder
public class Application1xmlSchemaListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchemaListBuilder()<br>Creates an empty list |
| Application1xmlSchemaListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Application1xmlSchemaListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## Application1xmlSchemaList
public class Application1xmlSchemaList<br>
extends `FrozenList<Pet.PetMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xmlSchemaList](#application1xmlschemalist) | of([List<Map<String, ? extends @Nullable Object>>](#application1xmlschemalistbuilder) arg, SchemaConfiguration configuration) |
