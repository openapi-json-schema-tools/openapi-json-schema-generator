# ComposedOneOfDifferentTypes
org.openapijsonschematools.client.components.schemas.ComposedOneOfDifferentTypes.java
public class ComposedOneOfDifferentTypes<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedVoid](#composedoneofdifferenttypes1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedBoolean](#composedoneofdifferenttypes1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedNumber](#composedoneofdifferenttypes1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedString](#composedoneofdifferenttypes1boxedstring)<br> boxed class to store validated String payloads |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedList](#composedoneofdifferenttypes1boxedlist)<br> boxed class to store validated List payloads |
| record | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1BoxedMap](#composedoneofdifferenttypes1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1](#composedoneofdifferenttypes1)<br> schema class |
| sealed interface | [ComposedOneOfDifferentTypes.Schema6Boxed](#schema6boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.Schema6BoxedString](#schema6boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedOneOfDifferentTypes.Schema6](#schema6)<br> schema class |
| sealed interface | [ComposedOneOfDifferentTypes.Schema5Boxed](#schema5boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.Schema5BoxedList](#schema5boxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedOneOfDifferentTypes.Schema5](#schema5)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema5ListBuilder](#schema5listbuilder)<br> builder for List payloads |
| static class | [ComposedOneOfDifferentTypes.Schema5List](#schema5list)<br> output class for List payloads |
| sealed interface | [ComposedOneOfDifferentTypes.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ComposedOneOfDifferentTypes.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedOneOfDifferentTypes.Items](#items)<br> schema class |
| sealed interface | [ComposedOneOfDifferentTypes.Schema4Boxed](#schema4boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.Schema4BoxedMap](#schema4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedOneOfDifferentTypes.Schema4](#schema4)<br> schema class |
| sealed interface | [ComposedOneOfDifferentTypes.Schema3Boxed](#schema3boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.Schema3BoxedString](#schema3boxedstring)<br> boxed class to store validated String payloads |
| static class | [ComposedOneOfDifferentTypes.Schema3](#schema3)<br> schema class |
| sealed interface | [ComposedOneOfDifferentTypes.Schema2Boxed](#schema2boxed)<br> abstract sealed validated payload class |
| record | [ComposedOneOfDifferentTypes.Schema2BoxedVoid](#schema2boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ComposedOneOfDifferentTypes.Schema2](#schema2)<br> schema class |

## ComposedOneOfDifferentTypes1Boxed
public sealed interface ComposedOneOfDifferentTypes1Boxed<br>
permits<br>
[ComposedOneOfDifferentTypes1BoxedVoid](#composedoneofdifferenttypes1boxedvoid),
[ComposedOneOfDifferentTypes1BoxedBoolean](#composedoneofdifferenttypes1boxedboolean),
[ComposedOneOfDifferentTypes1BoxedNumber](#composedoneofdifferenttypes1boxednumber),
[ComposedOneOfDifferentTypes1BoxedString](#composedoneofdifferenttypes1boxedstring),
[ComposedOneOfDifferentTypes1BoxedList](#composedoneofdifferenttypes1boxedlist),
[ComposedOneOfDifferentTypes1BoxedMap](#composedoneofdifferenttypes1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ComposedOneOfDifferentTypes1BoxedVoid
public record ComposedOneOfDifferentTypes1BoxedVoid<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1BoxedBoolean
public record ComposedOneOfDifferentTypes1BoxedBoolean<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1BoxedNumber
public record ComposedOneOfDifferentTypes1BoxedNumber<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1BoxedString
public record ComposedOneOfDifferentTypes1BoxedString<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1BoxedList
public record ComposedOneOfDifferentTypes1BoxedList<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1BoxedMap
public record ComposedOneOfDifferentTypes1BoxedMap<br>
implements [ComposedOneOfDifferentTypes1Boxed](#composedoneofdifferenttypes1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedOneOfDifferentTypes1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ComposedOneOfDifferentTypes1
public static class ComposedOneOfDifferentTypes1<br>
extends JsonSchema

A schema class that validates payloads

## Description
this is a model that allows payloads of type object or number

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[NumberWithValidations.NumberWithValidations1.class](../../components/schemas/NumberWithValidations.md#numberwithvalidations1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Animal.Animal1.class](../../components/schemas/Animal.md#animal1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema3.class](#schema3),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema4.class](#schema4),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema5.class](#schema5),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema6.class](#schema6)<br>))<br> |

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
| [ComposedOneOfDifferentTypes1BoxedString](#composedoneofdifferenttypes1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ComposedOneOfDifferentTypes1BoxedVoid](#composedoneofdifferenttypes1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ComposedOneOfDifferentTypes1BoxedNumber](#composedoneofdifferenttypes1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ComposedOneOfDifferentTypes1BoxedBoolean](#composedoneofdifferenttypes1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ComposedOneOfDifferentTypes1BoxedMap](#composedoneofdifferenttypes1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ComposedOneOfDifferentTypes1BoxedList](#composedoneofdifferenttypes1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema6Boxed
public sealed interface Schema6Boxed<br>
permits<br>
[Schema6BoxedString](#schema6boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema6BoxedString
public record Schema6BoxedString<br>
implements [Schema6Boxed](#schema6boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema6BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema6
public static class Schema6<br>
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

// String validation
String validatedPayload = ComposedOneOfDifferentTypes.Schema6.validate(
    "2020jUR,rZ#UM/?R,Fp^l6$ARj",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^2020.*"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Schema6BoxedString](#schema6boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema5Boxed
public sealed interface Schema5Boxed<br>
permits<br>
[Schema5BoxedList](#schema5boxedlist)

sealed interface that stores validated payloads using boxed classes

## Schema5BoxedList
public record Schema5BoxedList<br>
implements [Schema5Boxed](#schema5boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema5BoxedList([Schema5List](#schema5list) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema5List](#schema5list) | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema5
public static class Schema5<br>
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
ComposedOneOfDifferentTypes.Schema5List validatedPayload =
    ComposedOneOfDifferentTypes.Schema5.validate(
    new ComposedOneOfDifferentTypes.Schema5ListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |
| Integer | maxItems = 4 |
| Integer | minItems = 4 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema5List](#schema5list) | validate([List<?>](#schema5listbuilder) arg, SchemaConfiguration configuration) |
| [Schema5BoxedList](#schema5boxedlist) | validateAndBox([List<?>](#schema5listbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema5ListBuilder
public class Schema5ListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema5ListBuilder()<br>Creates an empty list |
| Schema5ListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Schema5ListBuilder | add(Void item) |
| Schema5ListBuilder | add(boolean item) |
| Schema5ListBuilder | add(String item) |
| Schema5ListBuilder | add(int item) |
| Schema5ListBuilder | add(float item) |
| Schema5ListBuilder | add(long item) |
| Schema5ListBuilder | add(double item) |
| Schema5ListBuilder | add(List<?> item) |
| Schema5ListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## Schema5List
public class Schema5List<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema5List](#schema5list) | of([List<? extends @Nullable Object>](#schema5listbuilder) arg, SchemaConfiguration configuration) |

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
| @Nullable Object | getData()validated payload |

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
| @Nullable Object | getData()validated payload |

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
| @Nullable Object | getData()validated payload |

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
| @Nullable Object | getData()validated payload |

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
| @Nullable Object | getData()validated payload |

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
| @Nullable Object | getData()validated payload |

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema4Boxed
public sealed interface Schema4Boxed<br>
permits<br>
[Schema4BoxedMap](#schema4boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema4BoxedMap
public record Schema4BoxedMap<br>
implements [Schema4Boxed](#schema4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema4
public static class Schema4<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Integer | maxProperties = 4 |
| Integer | minProperties = 4 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema4BoxedMap](#schema4boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema3Boxed
public sealed interface Schema3Boxed<br>
permits<br>
[Schema3BoxedString](#schema3boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema3BoxedString
public record Schema3BoxedString<br>
implements [Schema3Boxed](#schema3boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema3BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema3
public static class Schema3<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema2Boxed
public sealed interface Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema2BoxedVoid
public record Schema2BoxedVoid<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema2
public static class Schema2<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
