# ApplicationxmlSchema
public class ApplicationxmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedList](#applicationxmlschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1](#applicationxmlschema1)<br> schema class |
| static class | [ApplicationxmlSchema.ApplicationxmlSchemaListBuilder](#applicationxmlschemalistbuilder)<br> builder for List payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchemaList](#applicationxmlschemalist)<br> output class for List payloads |

## ApplicationxmlSchema1Boxed
public static abstract sealed class ApplicationxmlSchema1Boxed<br>
permits<br>
[ApplicationxmlSchema1BoxedList](#applicationxmlschema1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationxmlSchema1BoxedList
public static final class ApplicationxmlSchema1BoxedList<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedList([ApplicationxmlSchemaList](#applicationxmlschemalist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ApplicationxmlSchemaList](#applicationxmlschemalist) | data<br>validated payload |

## ApplicationxmlSchema1
public static class ApplicationxmlSchema1<br>
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
ApplicationxmlSchema.ApplicationxmlSchemaList validatedPayload =
    ApplicationxmlSchema.ApplicationxmlSchema1.validate(
    new ApplicationxmlSchema.ApplicationxmlSchemaListBuilder()
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
| [ApplicationxmlSchemaList](#applicationxmlschemalist) | validate([List<?>](#applicationxmlschemalistbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxmlSchema1BoxedList](#applicationxmlschema1boxedlist) | validateAndBox([List<?>](#applicationxmlschemalistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ApplicationxmlSchemaListBuilder
public class ApplicationxmlSchemaListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchemaListBuilder()<br>Creates an empty list |
| ApplicationxmlSchemaListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationxmlSchemaListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ApplicationxmlSchemaList
public class ApplicationxmlSchemaList<br>
extends `FrozenList<Pet.PetMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationxmlSchemaList](#applicationxmlschemalist) | of([List<Map<String, ? extends @Nullable Object>>](#applicationxmlschemalistbuilder) arg, SchemaConfiguration configuration) |
