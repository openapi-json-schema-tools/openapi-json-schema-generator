# NullableClass
org.openapijsonschematools.components.schemas.NullableClass.java
public class NullableClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullableClass.NullableClass1](#nullableclass1)<br> schema class |
| static class | [NullableClass.NullableClassMap](#nullableclassmap)<br> output class for Map payloads |
| static class | [NullableClass.ObjectItemsNullable](#objectitemsnullable)<br> schema class |
| static class | [NullableClass.ObjectItemsNullableMap](#objectitemsnullablemap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [NullableClass.ObjectAndItemsNullableProp](#objectanditemsnullableprop)<br> schema class |
| static class | [NullableClass.ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [NullableClass.ObjectNullableProp](#objectnullableprop)<br> schema class |
| static class | [NullableClass.ObjectNullablePropMap](#objectnullablepropmap)<br> output class for Map payloads |
| static class | [NullableClass.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [NullableClass.ArrayItemsNullable](#arrayitemsnullable)<br> schema class |
| static class | [NullableClass.ArrayItemsNullableList](#arrayitemsnullablelist)<br> output class for List payloads |
| static class | [NullableClass.Items2](#items2)<br> schema class |
| static class | [NullableClass.ArrayAndItemsNullableProp](#arrayanditemsnullableprop)<br> schema class |
| static class | [NullableClass.ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist)<br> output class for List payloads |
| static class | [NullableClass.Items1](#items1)<br> schema class |
| static class | [NullableClass.ArrayNullableProp](#arraynullableprop)<br> schema class |
| static class | [NullableClass.ArrayNullablePropList](#arraynullableproplist)<br> output class for List payloads |
| static class | [NullableClass.Items](#items)<br> schema class |
| static class | [NullableClass.DatetimeProp](#datetimeprop)<br> schema class |
| static class | [NullableClass.DateProp](#dateprop)<br> schema class |
| static class | [NullableClass.StringProp](#stringprop)<br> schema class |
| static class | [NullableClass.BooleanProp](#booleanprop)<br> schema class |
| static class | [NullableClass.NumberProp](#numberprop)<br> schema class |
| static class | [NullableClass.IntegerProp](#integerprop)<br> schema class |
| static class | [NullableClass.AdditionalProperties3](#additionalproperties3)<br> schema class |

## NullableClass1
public static class NullableClass1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer_prop", IntegerProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number_prop", NumberProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("boolean_prop", BooleanProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string_prop", StringProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date_prop", DateProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("datetime_prop", DatetimeProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_nullable_prop", ArrayNullableProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_and_items_nullable_prop", ArrayAndItemsNullableProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_items_nullable", ArrayItemsNullable.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_nullable_prop", ObjectNullableProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_and_items_nullable_prop", ObjectAndItemsNullableProp.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("object_items_nullable", ObjectItemsNullable.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NullableClassMap](#nullableclassmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## NullableClassMap
public static class NullableClassMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NullableClassMap](#nullableclassmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Long | integer_prop()<br>[optional] |
| Number | number_prop()<br>[optional] |
| Boolean | boolean_prop()<br>[optional] |
| String | string_prop()<br>[optional] |
| String | date_prop()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | datetime_prop()<br>[optional] value must conform to RFC-3339 date-time |
| [ArrayNullablePropList](#arraynullableproplist) | array_nullable_prop()<br>[optional] |
| [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | array_and_items_nullable_prop()<br>[optional] |
| [ArrayItemsNullableList](#arrayitemsnullablelist) | array_items_nullable()<br>[optional] |
| [ObjectNullablePropMap](#objectnullablepropmap) | object_nullable_prop()<br>[optional] |
| [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | object_and_items_nullable_prop()<br>[optional] |
| [ObjectItemsNullableMap](#objectitemsnullablemap) | object_items_nullable()<br>[optional] |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **integer_prop** | Long |  | [optional] |
| **number_prop** | Number |  | [optional] |
| **boolean_prop** | Boolean |  | [optional] |
| **string_prop** | String |  | [optional] |
| **date_prop** | String |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| **datetime_prop** | String |  | [optional] value must conform to RFC-3339 date-time |
| **array_nullable_prop** | List<Map<String, Object>> |  | [optional] |
| **array_and_items_nullable_prop** | List<Map<String, Object>> |  | [optional] |
| **array_items_nullable** | List<Map<String, Object>> |  | [optional] |
| **object_nullable_prop** | Map<String, Map<String, Object>> |  | [optional] |
| **object_and_items_nullable_prop** | Map<String, Map<String, Object>> |  | [optional] |
| **object_items_nullable** | Map<String, Map<String, Object>> |  | [optional] |
| **anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional] |

## ObjectItemsNullable
public static class ObjectItemsNullable<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectItemsNullableMap](#objectitemsnullablemap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectItemsNullableMap
public static class ObjectItemsNullableMap<br>
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectItemsNullableMap](#objectitemsnullablemap) | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectAndItemsNullableProp
public static class ObjectAndItemsNullableProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectAndItemsNullablePropMap
public static class ObjectAndItemsNullablePropMap<br>
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectNullableProp
public static class ObjectNullableProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ObjectNullablePropMap](#objectnullablepropmap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectNullablePropMap
public static class ObjectNullablePropMap<br>
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectNullablePropMap](#objectnullablepropmap) | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
extends MapJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayItemsNullable
public static class ArrayItemsNullable<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator(Items2.class))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayItemsNullableList](#arrayitemsnullablelist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayItemsNullableList
public class ArrayItemsNullableList<br>
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayItemsNullableList](#arrayitemsnullablelist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items2
public static class Items2<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayAndItemsNullableProp
public static class ArrayAndItemsNullableProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenList.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator(Items1.class))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayAndItemsNullablePropList
public class ArrayAndItemsNullablePropList<br>
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items1
public static class Items1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayNullableProp
public static class ArrayNullableProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenList.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator(Items.class))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ArrayNullablePropList](#arraynullableproplist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayNullablePropList
public class ArrayNullablePropList<br>
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNullablePropList](#arraynullableproplist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items
public static class Items<br>
extends MapJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## DatetimeProp
public static class DatetimeProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("date-time"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateProp
public static class DateProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("date"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringProp
public static class StringProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## BooleanProp
public static class BooleanProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Boolean.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## NumberProp
public static class NumberProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## IntegerProp
public static class IntegerProp<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
