# ComposedAnyOfDifferentTypesNoValidations
org.openapijsonschematools.client.components.schemas.ComposedAnyOfDifferentTypesNoValidations.java
public class ComposedAnyOfDifferentTypesNoValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedVoid](#composedanyofdifferenttypesnovalidations1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean](#composedanyofdifferenttypesnovalidations1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedNumber](#composedanyofdifferenttypesnovalidations1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedString](#composedanyofdifferenttypesnovalidations1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedList](#composedanyofdifferenttypesnovalidations1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedMap](#composedanyofdifferenttypesnovalidations1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1](#composedanyofdifferenttypesnovalidations1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15Boxed](#schema15boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15BoxedNumber](#schema15boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15](#schema15)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14Boxed](#schema14boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14BoxedNumber](#schema14boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14](#schema14)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13Boxed](#schema13boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13BoxedNumber](#schema13boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13](#schema13)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12Boxed](#schema12boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12BoxedNumber](#schema12boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12](#schema12)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11Boxed](#schema11boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11BoxedNumber](#schema11boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11](#schema11)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10Boxed](#schema10boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10BoxedNumber](#schema10boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10](#schema10)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9Boxed](#schema9boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9BoxedList](#schema9boxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9](#schema9)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9ListBuilder](#schema9listbuilder)<br> builder for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9List](#schema9list)<br> output class for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Items](#items)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8Boxed](#schema8boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8BoxedVoid](#schema8boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8](#schema8)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7Boxed](#schema7boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7BoxedBoolean](#schema7boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7](#schema7)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6Boxed](#schema6boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6BoxedMap](#schema6boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6](#schema6)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5Boxed](#schema5boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5BoxedString](#schema5boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5](#schema5)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4Boxed](#schema4boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4BoxedString](#schema4boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4](#schema4)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3Boxed](#schema3boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3](#schema3)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2Boxed](#schema2boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2BoxedString](#schema2boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2](#schema2)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1](#schema1)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema0](#schema0)<br> schema class |

## ComposedAnyOfDifferentTypesNoValidations1Boxed
public sealed interface ComposedAnyOfDifferentTypesNoValidations1Boxed<br>
permits<br>
[ComposedAnyOfDifferentTypesNoValidations1BoxedVoid](#composedanyofdifferenttypesnovalidations1boxedvoid),
[ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean](#composedanyofdifferenttypesnovalidations1boxedboolean),
[ComposedAnyOfDifferentTypesNoValidations1BoxedNumber](#composedanyofdifferenttypesnovalidations1boxednumber),
[ComposedAnyOfDifferentTypesNoValidations1BoxedString](#composedanyofdifferenttypesnovalidations1boxedstring),
[ComposedAnyOfDifferentTypesNoValidations1BoxedList](#composedanyofdifferenttypesnovalidations1boxedlist),
[ComposedAnyOfDifferentTypesNoValidations1BoxedMap](#composedanyofdifferenttypesnovalidations1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ComposedAnyOfDifferentTypesNoValidations1BoxedVoid
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedVoid<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

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
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedNumber
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedNumber<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedString
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedString<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedList
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedList<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedMap
public static final class ComposedAnyOfDifferentTypesNoValidations1BoxedMap<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedString](#composedanyofdifferenttypesnovalidations1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedVoid](#composedanyofdifferenttypesnovalidations1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedNumber](#composedanyofdifferenttypesnovalidations1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean](#composedanyofdifferenttypesnovalidations1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedMap](#composedanyofdifferenttypesnovalidations1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ComposedAnyOfDifferentTypesNoValidations1BoxedList](#composedanyofdifferenttypesnovalidations1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema15Boxed
public sealed interface Schema15Boxed<br>
permits<br>
[Schema15BoxedNumber](#schema15boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema15BoxedNumber
public static final class Schema15BoxedNumber<br>
implements [Schema15Boxed](#schema15boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema15BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema15
public static class Schema15<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema14Boxed
public sealed interface Schema14Boxed<br>
permits<br>
[Schema14BoxedNumber](#schema14boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema14BoxedNumber
public static final class Schema14BoxedNumber<br>
implements [Schema14Boxed](#schema14boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema14BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema14
public static class Schema14<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema13Boxed
public sealed interface Schema13Boxed<br>
permits<br>
[Schema13BoxedNumber](#schema13boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema13BoxedNumber
public static final class Schema13BoxedNumber<br>
implements [Schema13Boxed](#schema13boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema13BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema13
public static class Schema13<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema12Boxed
public sealed interface Schema12Boxed<br>
permits<br>
[Schema12BoxedNumber](#schema12boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema12BoxedNumber
public static final class Schema12BoxedNumber<br>
implements [Schema12Boxed](#schema12boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema12BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema12
public static class Schema12<br>
extends DoubleJsonSchema.DoubleJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DoubleJsonSchema.DoubleJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema11Boxed
public sealed interface Schema11Boxed<br>
permits<br>
[Schema11BoxedNumber](#schema11boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema11BoxedNumber
public static final class Schema11BoxedNumber<br>
implements [Schema11Boxed](#schema11boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema11
public static class Schema11<br>
extends FloatJsonSchema.FloatJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.FloatJsonSchema.FloatJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema10Boxed
public sealed interface Schema10Boxed<br>
permits<br>
[Schema10BoxedNumber](#schema10boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema10BoxedNumber
public static final class Schema10BoxedNumber<br>
implements [Schema10Boxed](#schema10boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema10BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema10
public static class Schema10<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema9Boxed
public sealed interface Schema9Boxed<br>
permits<br>
[Schema9BoxedList](#schema9boxedlist)

sealed interface that stores validated payloads using boxed classes

## Schema9BoxedList
public static final class Schema9BoxedList<br>
implements [Schema9Boxed](#schema9boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema9BoxedList([Schema9List](#schema9list) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema9List](#schema9list) | data<br>validated payload |

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
| [Schema9BoxedList](#schema9boxedlist) | validateAndBox([List<?>](#schema9listbuilder) arg, SchemaConfiguration configuration) |
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
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedVoid
public static final class ItemsBoxedVoid<br>
implements [ItemsBoxed](#itemsboxed)

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
implements [ItemsBoxed](#itemsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ItemsBoxedNumber
public static final class ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ItemsBoxedString
public static final class ItemsBoxedString<br>
implements [ItemsBoxed](#itemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ItemsBoxedList
public static final class ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ItemsBoxedMap
public static final class ItemsBoxedMap<br>
implements [ItemsBoxed](#itemsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema8Boxed
public sealed interface Schema8Boxed<br>
permits<br>
[Schema8BoxedVoid](#schema8boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema8BoxedVoid
public static final class Schema8BoxedVoid<br>
implements [Schema8Boxed](#schema8boxed)

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
public sealed interface Schema7Boxed<br>
permits<br>
[Schema7BoxedBoolean](#schema7boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema7BoxedBoolean
public static final class Schema7BoxedBoolean<br>
implements [Schema7Boxed](#schema7boxed)

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
public sealed interface Schema6Boxed<br>
permits<br>
[Schema6BoxedMap](#schema6boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema6BoxedMap
public static final class Schema6BoxedMap<br>
implements [Schema6Boxed](#schema6boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema6BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema6
public static class Schema6<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema5Boxed
public sealed interface Schema5Boxed<br>
permits<br>
[Schema5BoxedString](#schema5boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema5BoxedString
public static final class Schema5BoxedString<br>
implements [Schema5Boxed](#schema5boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema5BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema5
public static class Schema5<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema4Boxed
public sealed interface Schema4Boxed<br>
permits<br>
[Schema4BoxedString](#schema4boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema4BoxedString
public static final class Schema4BoxedString<br>
implements [Schema4Boxed](#schema4boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema4BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema4
public static class Schema4<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Schema3Boxed
public sealed interface Schema3Boxed<br>
permits<br>

sealed interface that stores validated payloads using boxed classes

## Schema3
public static class Schema3<br>
extends JsonSchema

A schema class that validates payloads

## Schema2Boxed
public sealed interface Schema2Boxed<br>
permits<br>
[Schema2BoxedString](#schema2boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema2BoxedString
public static final class Schema2BoxedString<br>
implements [Schema2Boxed](#schema2boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema2
public static class Schema2<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedString
public static final class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
