# ComposedOneOfDifferentTypes
org.openapijsonschematools.client.components.schemas.ComposedOneOfDifferentTypes.java
public class ComposedOneOfDifferentTypes

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1](#composedoneofdifferenttypes1)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema6](#schema6)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema5](#schema5)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema5ListInput](#schema5listinput)<br> builder for List payloads |
| static class | [ComposedOneOfDifferentTypes.Schema5List](#schema5list)<br> output class for List payloads |
| static class | [ComposedOneOfDifferentTypes.Items](#items)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema4](#schema4)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema3](#schema3)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema2](#schema2)<br> schema class |

## ComposedOneOfDifferentTypes1
public static class ComposedOneOfDifferentTypes1<br>
extends JsonSchema

A schema class that validates payloads

## Description
this is a model that allows payloads of type object or number

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[NumberWithValidations.NumberWithValidations1.class](../../components/schemas/NumberWithValidations.md#numberwithvalidations1),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Animal.Animal1.class](../../components/schemas/Animal.md#animal1),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema3.class](#schema3),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema4.class](#schema4),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema5.class](#schema5),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema6.class](#schema6)<br>&nbsp;&nbsp;&nbsp;&nbsp;))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, ?> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema6
public static class Schema6<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
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
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| String | &nbsp;&nbsp;&nbsp;&nbsp;type = "date-time";<br> |
| Pattern | &nbsp;&nbsp;&nbsp;&nbsp;pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"^2020.*"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema5
public static class Schema5<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
ComposedOneOfDifferentTypes.Schema5List validatedPayload =
    ComposedOneOfDifferentTypes.Schema5.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |
| Integer | &nbsp;&nbsp;&nbsp;&nbsp;maxItems = 4<br> |
| Integer | &nbsp;&nbsp;&nbsp;&nbsp;minItems = 4<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema5List](#schema5list) | validate([List<?>](#schema5listinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema5ListInput
public class Schema5ListInput<br>
builder for `List<? extends @Nullable Object>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
? extends @Nullable Object |  |

## Schema5List
public class Schema5List<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema5List](#schema5list) | of([List<? extends @Nullable Object>](#schema5listinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema4
public static class Schema4<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Integer | &nbsp;&nbsp;&nbsp;&nbsp;maxProperties = 4<br> |
| Integer | &nbsp;&nbsp;&nbsp;&nbsp;minProperties = 4<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, ?> arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema3
public static class Schema3<br>
extends DateJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema2
public static class Schema2<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
