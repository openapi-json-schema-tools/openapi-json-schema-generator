# ItemsSchema
org.openapijsonschematools.client.components.schemas.ItemsSchema.java
public class ItemsSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsSchema.ItemsSchema1Boxed](#itemsschema1boxed)<br> sealed interface for validated payloads |
| record | [ItemsSchema.ItemsSchema1BoxedMap](#itemsschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ItemsSchema.ItemsSchema1](#itemsschema1)<br> schema class |
| static class | [ItemsSchema.ItemsSchemaMapBuilder](#itemsschemamapbuilder)<br> builder for Map payloads |
| static class | [ItemsSchema.ItemsSchemaMap](#itemsschemamap)<br> output class for Map payloads |
| sealed interface | [ItemsSchema.SecondAdditionalPropertyBoxed](#secondadditionalpropertyboxed)<br> sealed interface for validated payloads |
| record | [ItemsSchema.SecondAdditionalPropertyBoxedString](#secondadditionalpropertyboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsSchema.SecondAdditionalProperty](#secondadditionalproperty)<br> schema class |
| sealed interface | [ItemsSchema.SomePropertyBoxed](#somepropertyboxed)<br> sealed interface for validated payloads |
| record | [ItemsSchema.SomePropertyBoxedString](#somepropertyboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsSchema.SomeProperty](#someproperty)<br> schema class |
| sealed interface | [ItemsSchema.NameBoxed](#nameboxed)<br> sealed interface for validated payloads |
| record | [ItemsSchema.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsSchema.Name](#name)<br> schema class |

## ItemsSchema1Boxed
public sealed interface ItemsSchema1Boxed<br>
permits<br>
[ItemsSchema1BoxedMap](#itemsschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ItemsSchema1BoxedMap
public record ItemsSchema1BoxedMap<br>
implements [ItemsSchema1Boxed](#itemsschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsSchema1BoxedMap([ItemsSchemaMap](#itemsschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsSchemaMap](#itemsschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsSchema1
public static class ItemsSchema1<br>
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
import org.openapijsonschematools.client.components.schemas.ItemsSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
ItemsSchema.ItemsSchemaMap validatedPayload =
    ItemsSchema.ItemsSchema1.validate(
    new ItemsSchema.ItemsSchemaMapBuilder()
        .name("a")

        .someProperty("a")

        .secondAdditionalProperty("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProperty", [SomeProperty.class](#someproperty))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("secondAdditionalProperty", [SecondAdditionalProperty.class](#secondadditionalproperty)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsSchemaMap](#itemsschemamap) | validate([Map&lt;?, ?&gt;](#itemsschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ItemsSchema1BoxedMap](#itemsschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#itemsschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ItemsSchema1Boxed](#itemsschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ItemsSchemaMapBuilder
public class ItemsSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | name(String value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | someProperty(String value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | secondAdditionalProperty(String value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, Void value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, boolean value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, String value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, int value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, float value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, long value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, double value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [ItemsSchemaMapBuilder](#itemsschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ItemsSchemaMap
public static class ItemsSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsSchemaMap](#itemsschemamap) | of([Map<String, ? extends @Nullable Object>](#itemsschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| String | someProperty()<br>[optional] |
| String | secondAdditionalProperty()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SecondAdditionalPropertyBoxed
public sealed interface SecondAdditionalPropertyBoxed<br>
permits<br>
[SecondAdditionalPropertyBoxedString](#secondadditionalpropertyboxedstring)

sealed interface that stores validated payloads using boxed classes

## SecondAdditionalPropertyBoxedString
public record SecondAdditionalPropertyBoxedString<br>
implements [SecondAdditionalPropertyBoxed](#secondadditionalpropertyboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SecondAdditionalPropertyBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SecondAdditionalProperty
public static class SecondAdditionalProperty<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SomePropertyBoxed
public sealed interface SomePropertyBoxed<br>
permits<br>
[SomePropertyBoxedString](#somepropertyboxedstring)

sealed interface that stores validated payloads using boxed classes

## SomePropertyBoxedString
public record SomePropertyBoxedString<br>
implements [SomePropertyBoxed](#somepropertyboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropertyBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProperty
public static class SomeProperty<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## NameBoxed
public sealed interface NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

sealed interface that stores validated payloads using boxed classes

## NameBoxedString
public record NameBoxedString<br>
implements [NameBoxed](#nameboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
