# ComposedAnyOfDifferentTypesNoValidations
org.openapijsonschematools.client.components.schemas.ComposedAnyOfDifferentTypesNoValidations.java
public class ComposedAnyOfDifferentTypesNoValidations

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1](#composedanyofdifferenttypesnovalidations1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15Boxed](#schema15boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15](#schema15)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14Boxed](#schema14boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14](#schema14)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13Boxed](#schema13boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13](#schema13)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12Boxed](#schema12boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12](#schema12)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11Boxed](#schema11boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11](#schema11)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10Boxed](#schema10boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10](#schema10)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9Boxed](#schema9boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9](#schema9)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9ListBuilder](#schema9listbuilder)<br> builder for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9List](#schema9list)<br> output class for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxed](#itemsboxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Items](#items)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8Boxed](#schema8boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8](#schema8)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7Boxed](#schema7boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7](#schema7)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6Boxed](#schema6boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6](#schema6)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5Boxed](#schema5boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5](#schema5)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4Boxed](#schema4boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4](#schema4)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3Boxed](#schema3boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3](#schema3)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2Boxed](#schema2boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2](#schema2)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1](#schema1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0Boxed](#schema0boxed)<br> sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0](#schema0)<br> schema class |

## ComposedAnyOfDifferentTypesNoValidations1Boxed
public static abstract sealed class ComposedAnyOfDifferentTypesNoValidations1Boxed<br>
permits<br>
[ComposedAnyOfDifferentTypesNoValidations1BoxedVoid](#composedanyofdifferenttypesnovalidations1boxedvoid),
[ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean](#composedanyofdifferenttypesnovalidations1boxedboolean),
[ComposedAnyOfDifferentTypesNoValidations1BoxedNumber](#composedanyofdifferenttypesnovalidations1boxednumber),
[ComposedAnyOfDifferentTypesNoValidations1BoxedString](#composedanyofdifferenttypesnovalidations1boxedstring),
[ComposedAnyOfDifferentTypesNoValidations1BoxedList](#composedanyofdifferenttypesnovalidations1boxedlist),
[ComposedAnyOfDifferentTypesNoValidations1BoxedMap](#composedanyofdifferenttypesnovalidations1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ComposedAnyOfDifferentTypesNoValidations1BoxedVoid
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedVoid<br>
extends ComposedAnyOfDifferentTypesNoValidations1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean<br>
extends ComposedAnyOfDifferentTypesNoValidations1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

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
## Schema15Boxed
public static abstract sealed class Schema15Boxed<br>
permits<br>
[Schema15BoxedNumber](#schema15boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema15
public static class Schema15<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema14Boxed
public static abstract sealed class Schema14Boxed<br>
permits<br>
[Schema14BoxedNumber](#schema14boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema14
public static class Schema14<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema13Boxed
public static abstract sealed class Schema13Boxed<br>
permits<br>
[Schema13BoxedNumber](#schema13boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema13
public static class Schema13<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema12Boxed
public static abstract sealed class Schema12Boxed<br>
permits<br>
[Schema12BoxedNumber](#schema12boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema12
public static class Schema12<br>
extends DoubleJsonSchema.DoubleJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DoubleJsonSchema.DoubleJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema11Boxed
public static abstract sealed class Schema11Boxed<br>
permits<br>
[Schema11BoxedNumber](#schema11boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema11
public static class Schema11<br>
extends FloatJsonSchema.FloatJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.FloatJsonSchema.FloatJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema10Boxed
public static abstract sealed class Schema10Boxed<br>
permits<br>
[Schema10BoxedNumber](#schema10boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema10
public static class Schema10<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema9Boxed
public static abstract sealed class Schema9Boxed<br>
permits<br>
[Schema9BoxedList](#schema9boxedlist)

A sealed class that stores validated payloads using boxed classes

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

## ItemsBoxed
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

A sealed class that stores validated payloads using boxed classes

## ItemsBoxedVoid
public static final class ItemsBoxedVoid<br>
extends ItemsBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ItemsBoxedBoolean
public static final class ItemsBoxedBoolean<br>
extends ItemsBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema8Boxed
public static abstract sealed class Schema8Boxed<br>
permits<br>
[Schema8BoxedVoid](#schema8boxedvoid)

A sealed class that stores validated payloads using boxed classes

## Schema8BoxedVoid
public static final class Schema8BoxedVoid<br>
extends Schema8Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema8BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema8
public static class Schema8<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema7Boxed
public static abstract sealed class Schema7Boxed<br>
permits<br>
[Schema7BoxedBoolean](#schema7boxedboolean)

A sealed class that stores validated payloads using boxed classes

## Schema7BoxedBoolean
public static final class Schema7BoxedBoolean<br>
extends Schema7Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema7BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema7
public static class Schema7<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema6Boxed
public static abstract sealed class Schema6Boxed<br>
permits<br>
[Schema6BoxedMap](#schema6boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema6
public static class Schema6<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema5Boxed
public static abstract sealed class Schema5Boxed<br>
permits<br>
[Schema5BoxedString](#schema5boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema5
public static class Schema5<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema4Boxed
public static abstract sealed class Schema4Boxed<br>
permits<br>
[Schema4BoxedString](#schema4boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema4
public static class Schema4<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Schema3Boxed
public static abstract sealed class Schema3Boxed<br>
permits<br>

A sealed class that stores validated payloads using boxed classes

## Schema3
public static class Schema3<br>
extends JsonSchema

A schema class that validates payloads

## Schema2Boxed
public static abstract sealed class Schema2Boxed<br>
permits<br>
[Schema2BoxedString](#schema2boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema2
public static class Schema2<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema1
public static class Schema1<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedMap](#schema0boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema0
public static class Schema0<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
