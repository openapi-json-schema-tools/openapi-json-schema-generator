# ApplicationjsonSchema
public class ApplicationjsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1](#applicationjsonschema1)<br> schema class |
| static class | [ApplicationjsonSchema.ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder)<br> builder for Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchemaMap](#applicationjsonschemamap)<br> output class for Map payloads |

## ApplicationjsonSchema1Boxed
public static abstract sealed class ApplicationjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationjsonSchema1BoxedMap
public static final class ApplicationjsonSchema1BoxedMap<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedMap([ApplicationjsonSchemaMap](#applicationjsonschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchemaMap](#applicationjsonschemamap) | data<br>validated payload |

## ApplicationjsonSchema1
public static class ApplicationjsonSchema1<br>
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

// Map validation
ApplicationjsonSchema.ApplicationjsonSchemaMap validatedPayload =
    ApplicationjsonSchema.ApplicationjsonSchema1.validate(
    new ApplicationjsonSchema.ApplicationjsonSchemaMapBuilder()
        .setString(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [Foo.Foo1.class](../../../../../../../../components/schemas/Foo.md#foo1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchemaMap](#applicationjsonschemamap) | validate([Map&lt;?, ?&gt;](#applicationjsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#applicationjsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ApplicationjsonSchemaMapBuilder
public class ApplicationjsonSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | setString(Map<String, @Nullable Object> value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, Void value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, boolean value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, String value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, int value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, float value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, long value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, double value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [ApplicationjsonSchemaMapBuilder](#applicationjsonschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ApplicationjsonSchemaMap
public static class ApplicationjsonSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationjsonSchemaMap](#applicationjsonschemamap) | of([Map<String, ? extends @Nullable Object>](#applicationjsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["string"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
