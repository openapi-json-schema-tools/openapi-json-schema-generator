# ComposedAnyOfDifferentTypesNoValidations
org.openapijsonschematools.client.components.schemas.ComposedAnyOfDifferentTypesNoValidations.java
public class ComposedAnyOfDifferentTypesNoValidations

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1](#composedanyofdifferenttypesnovalidations1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15](#schema15)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14](#schema14)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13](#schema13)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12](#schema12)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11](#schema11)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10](#schema10)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9](#schema9)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9ListBuilder](#schema9listbuilder)<br> builder for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9List](#schema9list)<br> output class for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Items](#items)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8](#schema8)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7](#schema7)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6](#schema6)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5](#schema5)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4](#schema4)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3](#schema3)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2](#schema2)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1](#schema1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0](#schema0)<br> schema class |

## ComposedAnyOfDifferentTypesNoValidations1
public static class ComposedAnyOfDifferentTypesNoValidations1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema3.class](#schema3),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema4.class](#schema4),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema5.class](#schema5),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema6.class](#schema6),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema7.class](#schema7),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema8.class](#schema8),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema9.class](#schema9),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema10.class](#schema10),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema11.class](#schema11),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema12.class](#schema12),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema13.class](#schema13),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema14.class](#schema14),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema15.class](#schema15)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema15
public static class Schema15<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema14
public static class Schema14<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema13
public static class Schema13<br>
extends IntJsonSchema

A schema class that validates payloads

## Schema12
public static class Schema12<br>
extends DoubleJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DoubleJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema11
public static class Schema11<br>
extends FloatJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.FloatJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema10
public static class Schema10<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema9
public static class Schema9<br>
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
ComposedAnyOfDifferentTypesNoValidations.Schema9List validatedPayload =
    ComposedAnyOfDifferentTypesNoValidations.Schema9.validate(
    new ComposedAnyOfDifferentTypesNoValidations.Schema9ListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema9List](#schema9list) | validate([List<?>](#schema9listbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema9ListBuilder
public class Schema9ListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema9ListBuilder()<br>Creates an empty list |
| Schema9ListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Schema9ListBuilder | add(Void item) |
| Schema9ListBuilder | add(boolean item) |
| Schema9ListBuilder | add(String item) |
| Schema9ListBuilder | add(int item) |
| Schema9ListBuilder | add(float item) |
| Schema9ListBuilder | add(long item) |
| Schema9ListBuilder | add(double item) |
| Schema9ListBuilder | add(List<?> item) |
| Schema9ListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## Schema9List
public class Schema9List<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema9List](#schema9list) | of([List<? extends @Nullable Object>](#schema9listbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema8
public static class Schema8<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema7
public static class Schema7<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema6
public static class Schema6<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema5
public static class Schema5<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema4
public static class Schema4<br>
extends StringJsonSchema

A schema class that validates payloads

## Schema3
public static class Schema3<br>
extends JsonSchema

A schema class that validates payloads

## Schema2
public static class Schema2<br>
extends DateTimeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema1
public static class Schema1<br>
extends DateJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
