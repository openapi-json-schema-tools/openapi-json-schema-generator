# MultiPropertiesSchema
org.openapijsonschematools.client.components.schemas.MultiPropertiesSchema.java
public class MultiPropertiesSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultiPropertiesSchema.MultiPropertiesSchema1Boxed](#multipropertiesschema1boxed)<br> sealed interface for validated payloads |
| record | [MultiPropertiesSchema.MultiPropertiesSchema1BoxedMap](#multipropertiesschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultiPropertiesSchema.MultiPropertiesSchema1](#multipropertiesschema1)<br> schema class |
| static class | [MultiPropertiesSchema.MultiPropertiesSchemaMapBuilder](#multipropertiesschemamapbuilder)<br> builder for Map payloads |
| static class | [MultiPropertiesSchema.MultiPropertiesSchemaMap](#multipropertiesschemamap)<br> output class for Map payloads |
| sealed interface | [MultiPropertiesSchema.DataBoxed](#databoxed)<br> sealed interface for validated payloads |
| record | [MultiPropertiesSchema.DataBoxedList](#databoxedlist)<br> boxed class to store validated List payloads |
| static class | [MultiPropertiesSchema.Data](#data)<br> schema class |
| static class | [MultiPropertiesSchema.DataListBuilder](#datalistbuilder)<br> builder for List payloads |
| static class | [MultiPropertiesSchema.DataList](#datalist)<br> output class for List payloads |
| sealed interface | [MultiPropertiesSchema.MessageBoxed](#messageboxed)<br> sealed interface for validated payloads |
| record | [MultiPropertiesSchema.MessageBoxedString](#messageboxedstring)<br> boxed class to store validated String payloads |
| static class | [MultiPropertiesSchema.Message](#message)<br> schema class |
| sealed interface | [MultiPropertiesSchema.StatusBoxed](#statusboxed)<br> sealed interface for validated payloads |
| record | [MultiPropertiesSchema.StatusBoxedNumber](#statusboxednumber)<br> boxed class to store validated Number payloads |
| static class | [MultiPropertiesSchema.Status](#status)<br> schema class |
| sealed interface | [MultiPropertiesSchema.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [MultiPropertiesSchema.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultiPropertiesSchema.AdditionalProperties](#additionalproperties)<br> schema class |

## MultiPropertiesSchema1Boxed
public sealed interface MultiPropertiesSchema1Boxed<br>
permits<br>
[MultiPropertiesSchema1BoxedMap](#multipropertiesschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultiPropertiesSchema1BoxedMap
public record MultiPropertiesSchema1BoxedMap<br>
implements [MultiPropertiesSchema1Boxed](#multipropertiesschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultiPropertiesSchema1BoxedMap([MultiPropertiesSchemaMap](#multipropertiesschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultiPropertiesSchemaMap](#multipropertiesschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultiPropertiesSchema1
public static class MultiPropertiesSchema1<br>
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
import org.openapijsonschematools.client.components.schemas.MultiPropertiesSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
MultiPropertiesSchema.MultiPropertiesSchemaMap validatedPayload =
    MultiPropertiesSchema.MultiPropertiesSchema1.validate(
    new MultiPropertiesSchema.MultiPropertiesSchemaMapBuilder()
        .status(1)

        .data(
            Arrays.asList(
            )
        )
        .message("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Status.class](#status))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("data", [Data.class](#data))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("message", [Message.class](#message)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"status"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultiPropertiesSchemaMap](#multipropertiesschemamap) | validate([Map&lt;?, ?&gt;](#multipropertiesschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultiPropertiesSchema1BoxedMap](#multipropertiesschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipropertiesschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultiPropertiesSchema1Boxed](#multipropertiesschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## MultiPropertiesSchemaMap0Builder
public class MultiPropertiesSchemaMap0Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultiPropertiesSchemaMap0Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MultiPropertiesSchemaMap0Builder](#multipropertiesschemamap0builder) | data(List<Map<String, @Nullable Object>> value) |
| [MultiPropertiesSchemaMap0Builder](#multipropertiesschemamap0builder) | message(String value) |

## MultiPropertiesSchemaMapBuilder
public class MultiPropertiesSchemaMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultiPropertiesSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultiPropertiesSchemaMap0Builder](#multipropertiesschemamap0builder) | status(int value) |
| [MultiPropertiesSchemaMap0Builder](#multipropertiesschemamap0builder) | status(float value) |

## MultiPropertiesSchemaMap
public static class MultiPropertiesSchemaMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MultiPropertiesSchemaMap](#multipropertiesschemamap) | of([Map<String, Object>](#multipropertiesschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | status()<br> value must be a 32 bit integer |
| [DataList](#datalist) | data()<br>[optional] |
| String | message()<br>[optional] |

## DataBoxed
public sealed interface DataBoxed<br>
permits<br>
[DataBoxedList](#databoxedlist)

sealed interface that stores validated payloads using boxed classes

## DataBoxedList
public record DataBoxedList<br>
implements [DataBoxed](#databoxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DataBoxedList([DataList](#datalist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DataList](#datalist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Data
public static class Data<br>
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
import org.openapijsonschematools.client.components.schemas.MultiPropertiesSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
MultiPropertiesSchema.DataList validatedPayload =
    MultiPropertiesSchema.Data.validate(
    new MultiPropertiesSchema.DataListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [ItemsSchema.ItemsSchema1.class](../../components/schemas/ItemsSchema.md#itemsschema1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DataList](#datalist) | validate([List<?>](#datalistbuilder) arg, SchemaConfiguration configuration) |
| [DataBoxedList](#databoxedlist) | validateAndBox([List<?>](#datalistbuilder) arg, SchemaConfiguration configuration) |
| [DataBoxed](#databoxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DataListBuilder
public class DataListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DataListBuilder()<br>Creates an empty list |
| DataListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| DataListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## DataList
public class DataList<br>
extends `FrozenList<ItemsSchema.ItemsSchemaMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DataList](#datalist) | of([List<Map<String, ? extends @Nullable Object>>](#datalistbuilder) arg, SchemaConfiguration configuration) |

## MessageBoxed
public sealed interface MessageBoxed<br>
permits<br>
[MessageBoxedString](#messageboxedstring)

sealed interface that stores validated payloads using boxed classes

## MessageBoxedString
public record MessageBoxedString<br>
implements [MessageBoxed](#messageboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MessageBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Message
public static class Message<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## StatusBoxed
public sealed interface StatusBoxed<br>
permits<br>
[StatusBoxedNumber](#statusboxednumber)

sealed interface that stores validated payloads using boxed classes

## StatusBoxedNumber
public record StatusBoxedNumber<br>
implements [StatusBoxed](#statusboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StatusBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Status
public static class Status<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
