# ComposedAnyOfDifferentTypesNoValidations
org.openapijsonschematools.client.components.schemas.ComposedAnyOfDifferentTypesNoValidations.java
public class ComposedAnyOfDifferentTypesNoValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedVoid](#composedanyofdifferenttypesnovalidations1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean](#composedanyofdifferenttypesnovalidations1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedNumber](#composedanyofdifferenttypesnovalidations1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedString](#composedanyofdifferenttypesnovalidations1boxedstring)<br> boxed class to store validated String payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedList](#composedanyofdifferenttypesnovalidations1boxedlist)<br> boxed class to store validated List payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1BoxedMap](#composedanyofdifferenttypesnovalidations1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.ComposedAnyOfDifferentTypesNoValidations1](#composedanyofdifferenttypesnovalidations1)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema15Boxed](#schema15boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema15BoxedNumber](#schema15boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema15](#schema15)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema14Boxed](#schema14boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema14BoxedNumber](#schema14boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema14](#schema14)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema13Boxed](#schema13boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema13BoxedNumber](#schema13boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema13](#schema13)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema12Boxed](#schema12boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema12BoxedNumber](#schema12boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema12](#schema12)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema11Boxed](#schema11boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema11BoxedNumber](#schema11boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema11](#schema11)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema10Boxed](#schema10boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema10BoxedNumber](#schema10boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema10](#schema10)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema9Boxed](#schema9boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema9BoxedList](#schema9boxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9](#schema9)<br> schema class |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9ListBuilder](#schema9listbuilder)<br> builder for List payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema9List](#schema9list)<br> output class for List payloads |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Items](#items)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema8Boxed](#schema8boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema8BoxedVoid](#schema8boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema8](#schema8)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema7Boxed](#schema7boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema7BoxedBoolean](#schema7boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema7](#schema7)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema6Boxed](#schema6boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema6BoxedMap](#schema6boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema6](#schema6)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema5Boxed](#schema5boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema5BoxedString](#schema5boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema5](#schema5)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema4Boxed](#schema4boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema4BoxedString](#schema4boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema4](#schema4)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema3Boxed](#schema3boxed)<br> sealed interface for validated payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema3](#schema3)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema2Boxed](#schema2boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema2BoxedString](#schema2boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema2](#schema2)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedAnyOfDifferentTypesNoValidations.Schema1](#schema1)<br> schema class |
| sealed interface | [ComposedAnyOfDifferentTypesNoValidations.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [ComposedAnyOfDifferentTypesNoValidations.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
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
public record ComposedAnyOfDifferentTypesNoValidations1BoxedVoid<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean
public record ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedNumber
public record ComposedAnyOfDifferentTypesNoValidations1BoxedNumber<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedString
public record ComposedAnyOfDifferentTypesNoValidations1BoxedString<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedList
public record ComposedAnyOfDifferentTypesNoValidations1BoxedList<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedAnyOfDifferentTypesNoValidations1BoxedMap
public record ComposedAnyOfDifferentTypesNoValidations1BoxedMap<br>
implements [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedAnyOfDifferentTypesNoValidations1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [ComposedAnyOfDifferentTypesNoValidations1Boxed](#composedanyofdifferenttypesnovalidations1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema15Boxed
public sealed interface Schema15Boxed<br>
permits<br>
[Schema15BoxedNumber](#schema15boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema15BoxedNumber
public record Schema15BoxedNumber<br>
implements [Schema15Boxed](#schema15boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema15BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema14BoxedNumber<br>
implements [Schema14Boxed](#schema14boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema14BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema13BoxedNumber<br>
implements [Schema13Boxed](#schema13boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema13BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema12BoxedNumber<br>
implements [Schema12Boxed](#schema12boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema12BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema11BoxedNumber<br>
implements [Schema11Boxed](#schema11boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema10BoxedNumber<br>
implements [Schema10Boxed](#schema10boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema10BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema9BoxedList<br>
implements [Schema9Boxed](#schema9boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema9BoxedList([Schema9List](#schema9list) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema9List](#schema9list) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.ComposedAnyOfDifferentTypesNoValidations;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [Schema9Boxed](#schema9boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public record ItemsBoxedVoid<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedBoolean
public record ItemsBoxedBoolean<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedNumber
public record ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedString
public record ItemsBoxedString<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedList
public record ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedMap
public record ItemsBoxedMap<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema8BoxedVoid<br>
implements [Schema8Boxed](#schema8boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema8BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema7BoxedBoolean<br>
implements [Schema7Boxed](#schema7boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema7BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema6BoxedMap<br>
implements [Schema6Boxed](#schema6boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema6BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema5BoxedString<br>
implements [Schema5Boxed](#schema5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema4BoxedString<br>
implements [Schema4Boxed](#schema4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema2BoxedString<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
