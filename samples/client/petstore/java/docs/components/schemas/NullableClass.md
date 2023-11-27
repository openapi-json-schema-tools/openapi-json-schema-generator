# NullableClass
org.openapijsonschematools.components.schemas.NullableClass.java
public class NullableClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | NullableClass.NullableClass1<br> schema class |
| static class | NullableClass.NullableClassMap<br> output class for Map payloads |
| static class | NullableClass.ObjectItemsNullable<br> schema class |
| static class | NullableClass.ObjectItemsNullableMap<br> output class for Map payloads |
| static class | NullableClass.AdditionalProperties2<br> schema class |
| static class | NullableClass.ObjectAndItemsNullableProp<br> schema class |
| static class | NullableClass.ObjectAndItemsNullablePropMap<br> output class for Map payloads |
| static class | NullableClass.AdditionalProperties1<br> schema class |
| static class | NullableClass.ObjectNullableProp<br> schema class |
| static class | NullableClass.ObjectNullablePropMap<br> output class for Map payloads |
| static class | NullableClass.AdditionalProperties<br> schema class |
| static class | NullableClass.ArrayItemsNullable<br> schema class |
| static class | NullableClass.ArrayItemsNullableList<br> output class for List payloads |
| static class | NullableClass.Items2<br> schema class |
| static class | NullableClass.ArrayAndItemsNullableProp<br> schema class |
| static class | NullableClass.ArrayAndItemsNullablePropList<br> output class for List payloads |
| static class | NullableClass.Items1<br> schema class |
| static class | NullableClass.ArrayNullableProp<br> schema class |
| static class | NullableClass.ArrayNullablePropList<br> output class for List payloads |
| static class | NullableClass.Items<br> schema class |
| static class | NullableClass.DatetimeProp<br> schema class |
| static class | NullableClass.DateProp<br> schema class |
| static class | NullableClass.StringProp<br> schema class |
| static class | NullableClass.BooleanProp<br> schema class |
| static class | NullableClass.NumberProp<br> schema class |
| static class | NullableClass.IntegerProp<br> schema class |
| static class | NullableClass.AdditionalProperties3<br> schema class |

## NullableClass1
public class NullableClass1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NullableClassMap](#nullableclassmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## NullableClassMap
public class NullableClassMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NullableClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Long | integer_prop()<br>[optional] |
| Number | number_prop()<br>[optional] |
| Boolean | boolean_prop()<br>[optional] |
| String | string_prop()<br>[optional] |
| String | date_prop()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | datetime_prop()<br>[optional] value must conform to RFC-3339 date-time |
| ArrayNullablePropList | array_nullable_prop()<br>[optional] |
| ArrayAndItemsNullablePropList | array_and_items_nullable_prop()<br>[optional] |
| ArrayItemsNullableList | array_items_nullable()<br>[optional] |
| ObjectNullablePropMap | object_nullable_prop()<br>[optional] |
| ObjectAndItemsNullablePropMap | object_and_items_nullable_prop()<br>[optional] |
| ObjectItemsNullableMap | object_items_nullable()<br>[optional] |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**integer_prop** | Long |  | [optional]
**number_prop** | Number |  | [optional]
**boolean_prop** | Boolean |  | [optional]
**string_prop** | String |  | [optional]
**date_prop** | String |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | String |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | List<Map<String, Object>> |  | [optional]
**array_and_items_nullable_prop** | List<Map<String, Object>> |  | [optional]
**array_items_nullable** | List<Map<String, Object>> |  | [optional]
**object_nullable_prop** | Map<String, Map<String, Object>> |  | [optional]
**object_and_items_nullable_prop** | Map<String, Map<String, Object>> |  | [optional]
**object_items_nullable** | Map<String, Map<String, Object>> |  | [optional]
**anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## ObjectItemsNullable
public class ObjectItemsNullable
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectItemsNullableMap](#objectitemsnullablemap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectItemsNullableMap
public class ObjectItemsNullableMap
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectItemsNullableMap | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties2
public class AdditionalProperties2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectAndItemsNullableProp
public class ObjectAndItemsNullableProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ObjectAndItemsNullablePropMap](#objectanditemsnullablepropmap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectAndItemsNullablePropMap
public class ObjectAndItemsNullablePropMap
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectAndItemsNullablePropMap | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties1
public class AdditionalProperties1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectNullableProp
public class ObjectNullableProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ObjectNullablePropMap](#objectnullablepropmap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## ObjectNullablePropMap
public class ObjectNullablePropMap
extends FrozenMap<String, FrozenMap<String, Object>>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectNullablePropMap | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayItemsNullable
public class ArrayItemsNullable
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayItemsNullableList](#arrayitemsnullablelist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayItemsNullableList
public class ArrayItemsNullableList
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items2
public class Items2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayAndItemsNullableProp
public class ArrayAndItemsNullableProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ArrayAndItemsNullablePropList](#arrayanditemsnullableproplist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayAndItemsNullablePropList
public class ArrayAndItemsNullablePropList
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items1
public class Items1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayNullableProp
public class ArrayNullableProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [ArrayNullablePropList](#arraynullableproplist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ArrayNullablePropList
public class ArrayNullablePropList
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items
public class Items
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## DatetimeProp
public class DatetimeProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateProp
public class DateProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringProp
public class StringProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

## BooleanProp
public class BooleanProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## NumberProp
public class NumberProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## IntegerProp
public class IntegerProp
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |

## AdditionalProperties3
public class AdditionalProperties3
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
