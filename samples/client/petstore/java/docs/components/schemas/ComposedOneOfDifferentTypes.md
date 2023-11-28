# ComposedOneOfDifferentTypes
org.openapijsonschematools.components.schemas.ComposedOneOfDifferentTypes.java
public class ComposedOneOfDifferentTypes

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1](#composedoneofdifferenttypes1)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema6](#schema6)<br> schema class |
| static class | [ComposedOneOfDifferentTypes.Schema5](#schema5)<br> schema class |
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

## Schema6
public static class Schema6<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("date-time"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Schema5
public static class Schema5<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maxItems", new MaxItemsValidator(4)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minItems", new MinItemsValidator(4))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema5List](#schema5list) | validate(List<Object> arg, SchemaConfiguration configuration) |

## Schema5List
public class Schema5List<br>
extends `FrozenList<Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema5List](#schema5list) | of(List<Object> arg, SchemaConfiguration configuration) |

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

## Schema4
public static class Schema4<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maxProperties", new MaxPropertiesValidator(4)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minProperties", new MinPropertiesValidator(4))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Schema3
public static class Schema3<br>
extends DateJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema2
public static class Schema2<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
