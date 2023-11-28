# ComposedAnyOfDifferentTypesNoValidations
org.openapijsonschematools.components.schemas.ComposedAnyOfDifferentTypesNoValidations.java
public class ComposedAnyOfDifferentTypesNoValidations

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

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
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Schema15
public static class Schema15<br>
extends Int64JsonSchema

A schema class that validates payloads

## Schema14
public static class Schema14<br>
extends Int32JsonSchema

A schema class that validates payloads

## Schema13
public static class Schema13<br>
extends IntJsonSchema

A schema class that validates payloads

## Schema12
public static class Schema12<br>
extends DoubleJsonSchema

A schema class that validates payloads

## Schema11
public static class Schema11<br>
extends FloatJsonSchema

A schema class that validates payloads

## Schema10
public static class Schema10<br>
extends NumberJsonSchema

A schema class that validates payloads

## Schema9
public static class Schema9<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema9List](#schema9list) | validate(List<Object> arg, SchemaConfiguration configuration) |

## Schema9List
public class Schema9List<br>
extends FrozenList<Object>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema9List](#schema9list) | of(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema8
public static class Schema8<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema7
public static class Schema7<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema6
public static class Schema6<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema5
public static class Schema5<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.StringJsonSchema |
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

| Methods Inherited from class org.openapijsonschematools.schemas.DateTimeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema1
public static class Schema1<br>
extends DateJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
