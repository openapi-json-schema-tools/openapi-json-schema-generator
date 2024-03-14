# MixedPropertiesAndAdditionalPropertiesClass
org.openapijsonschematools.client.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java
public class MixedPropertiesAndAdditionalPropertiesClass<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1Boxed](#mixedpropertiesandadditionalpropertiesclass1boxed)<br> sealed interface for validated payloads |
| record | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1BoxedMap](#mixedpropertiesandadditionalpropertiesclass1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1](#mixedpropertiesandadditionalpropertiesclass1)<br> schema class |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder)<br> builder for Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap)<br> output class for Map payloads |
| sealed interface | [MixedPropertiesAndAdditionalPropertiesClass.MapSchemaBoxed](#mapschemaboxed)<br> sealed interface for validated payloads |
| record | [MixedPropertiesAndAdditionalPropertiesClass.MapSchemaBoxedMap](#mapschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MapSchema](#mapschema)<br> schema class |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MapMapBuilder](#mapmapbuilder)<br> builder for Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MapMap](#mapmap)<br> output class for Map payloads |
| sealed interface | [MixedPropertiesAndAdditionalPropertiesClass.DateTimeBoxed](#datetimeboxed)<br> sealed interface for validated payloads |
| record | [MixedPropertiesAndAdditionalPropertiesClass.DateTimeBoxedString](#datetimeboxedstring)<br> boxed class to store validated String payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.DateTime](#datetime)<br> schema class |
| sealed interface | [MixedPropertiesAndAdditionalPropertiesClass.UuidSchemaBoxed](#uuidschemaboxed)<br> sealed interface for validated payloads |
| record | [MixedPropertiesAndAdditionalPropertiesClass.UuidSchemaBoxedString](#uuidschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.UuidSchema](#uuidschema)<br> schema class |

## MixedPropertiesAndAdditionalPropertiesClass1Boxed
public sealed interface MixedPropertiesAndAdditionalPropertiesClass1Boxed<br>
permits<br>
[MixedPropertiesAndAdditionalPropertiesClass1BoxedMap](#mixedpropertiesandadditionalpropertiesclass1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MixedPropertiesAndAdditionalPropertiesClass1BoxedMap
public record MixedPropertiesAndAdditionalPropertiesClass1BoxedMap<br>
implements [MixedPropertiesAndAdditionalPropertiesClass1Boxed](#mixedpropertiesandadditionalpropertiesclass1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MixedPropertiesAndAdditionalPropertiesClass1BoxedMap([MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MixedPropertiesAndAdditionalPropertiesClass1
public static class MixedPropertiesAndAdditionalPropertiesClass1<br>
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
import org.openapijsonschematools.client.components.schemas.MixedPropertiesAndAdditionalPropertiesClass;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMap validatedPayload =
    MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1.validate(
    new MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMapBuilder()
        .uuid("046b6c7f-0b8a-43b9-b35d-6489e6daee91")

        .dateTime("1970-01-01T00:00:00.00Z")

        .map(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                    "someAdditionalProperty",
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "className",
                            "a"
                        ),
                        new AbstractMap.SimpleEntry<String, String>(
                            "color",
                            "a"
                        )
                    )
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
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [UuidSchema.class](#uuidschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map", [MapSchema.class](#mapschema)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) | validate([Map&lt;?, ?&gt;](#mixedpropertiesandadditionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| [MixedPropertiesAndAdditionalPropertiesClass1BoxedMap](#mixedpropertiesandadditionalpropertiesclass1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mixedpropertiesandadditionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| [MixedPropertiesAndAdditionalPropertiesClass1Boxed](#mixedpropertiesandadditionalpropertiesclass1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## MixedPropertiesAndAdditionalPropertiesClassMapBuilder
public class MixedPropertiesAndAdditionalPropertiesClassMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MixedPropertiesAndAdditionalPropertiesClassMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | uuid(String value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | dateTime(String value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | map(Map<String, Map<String, @Nullable Object>> value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, Void value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, boolean value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, String value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, int value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, float value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, long value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, double value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, List<?> value) |
| [MixedPropertiesAndAdditionalPropertiesClassMapBuilder](#mixedpropertiesandadditionalpropertiesclassmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## MixedPropertiesAndAdditionalPropertiesClassMap
public static class MixedPropertiesAndAdditionalPropertiesClassMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) | of([Map<String, ? extends @Nullable Object>](#mixedpropertiesandadditionalpropertiesclassmapbuilder) arg, SchemaConfiguration configuration) |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["uuid"], instance["map"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MapSchemaBoxed
public sealed interface MapSchemaBoxed<br>
permits<br>
[MapSchemaBoxedMap](#mapschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## MapSchemaBoxedMap
public record MapSchemaBoxedMap<br>
implements [MapSchemaBoxed](#mapschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapSchemaBoxedMap([MapMap](#mapmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapMap](#mapmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MapSchema
public static class MapSchema<br>
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
import org.openapijsonschematools.client.components.schemas.MixedPropertiesAndAdditionalPropertiesClass;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MixedPropertiesAndAdditionalPropertiesClass.MapMap validatedPayload =
    MixedPropertiesAndAdditionalPropertiesClass.MapSchema.validate(
    new MixedPropertiesAndAdditionalPropertiesClass.MapMapBuilder()
        .additionalProperty(
            "someAdditionalProperty",
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "className",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "color",
                    "a"
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
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [Animal.Animal1.class](../../components/schemas/Animal.md#animal1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MapMap](#mapmap) | validate([Map&lt;?, ?&gt;](#mapmapbuilder) arg, SchemaConfiguration configuration) |
| [MapSchemaBoxedMap](#mapschemaboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#mapmapbuilder) arg, SchemaConfiguration configuration) |
| [MapSchemaBoxed](#mapschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## MapMapBuilder
public class MapMapBuilder<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MapMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [MapMapBuilder](#mapmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## MapMap
public static class MapMap<br>
extends FrozenMap<String, Animal.AnimalMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMap](#mapmap) | of([Map<String, Map<String, ? extends @Nullable Object>>](#mapmapbuilder) arg, SchemaConfiguration configuration) |
| [Animal.AnimalMap](../../components/schemas/Animal.md#animalmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DateTimeBoxed
public sealed interface DateTimeBoxed<br>
permits<br>
[DateTimeBoxedString](#datetimeboxedstring)

sealed interface that stores validated payloads using boxed classes

## DateTimeBoxedString
public record DateTimeBoxedString<br>
implements [DateTimeBoxed](#datetimeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTime
public static class DateTime<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UuidSchemaBoxed
public sealed interface UuidSchemaBoxed<br>
permits<br>
[UuidSchemaBoxedString](#uuidschemaboxedstring)

sealed interface that stores validated payloads using boxed classes

## UuidSchemaBoxedString
public record UuidSchemaBoxedString<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchema
public static class UuidSchema<br>
extends UuidJsonSchema.UuidJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.UuidJsonSchema.UuidJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
