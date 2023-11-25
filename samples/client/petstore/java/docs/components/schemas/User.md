# User
org.openapijsonschematools.components.schemas.User.java
public class User

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | User.Id<br> schema class |
| static class | User.Username<br> schema class |
| static class | User.FirstName<br> schema class |
| static class | User.LastName<br> schema class |
| static class | User.Email<br> schema class |
| static class | User.Password<br> schema class |
| static class | User.Phone<br> schema class |
| static class | User.UserStatus<br> schema class |
| static class | User.ObjectWithNoDeclaredProps<br> schema class |
| static class | User.ObjectWithNoDeclaredPropsNullable<br> schema class |
| static class | User.AnyTypeProp<br> schema class |
| static class | User.Not<br> schema class |
| static class | User.AnyTypeExceptNullProp<br> schema class |
| static class | User.AnyTypePropNullable<br> schema class |
| static class | User.UserMap<br> output class for Map payloads |
| static class | User.User1<br> schema class |

## User1
public class User1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static UserMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | [optional] value must be a 64 bit integer
**username** | String |  | [optional]
**firstName** | String |  | [optional]
**lastName** | String |  | [optional]
**email** | String |  | [optional]
**password** | String |  | [optional]
**phone** | String |  | [optional]
**userStatus** | int | User Status | [optional] value must be a 32 bit integer
**objectWithNoDeclaredProps** | Map<String, Object> | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional]
**objectWithNoDeclaredPropsNullable** | Map<String, Object> | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional]
**anyTypeProp** | Object | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional]
**anyTypeExceptNullProp** | Object | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional]
**anyTypePropNullable** | Object | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## UserMap
public class UserMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static UserMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | id()<br>[optional] value must be a 64 bit integer |
| String | username()<br>[optional] |
| String | firstName()<br>[optional] |
| String | lastName()<br>[optional] |
| String | email()<br>[optional] |
| String | password()<br>[optional] |
| String | phone()<br>[optional] |
| int | userStatus()<br>[optional] value must be a 32 bit integer |
| FrozenMap<String, Object> | objectWithNoDeclaredProps()<br>[optional] |
| FrozenMap<String, Object> | objectWithNoDeclaredPropsNullable()<br>[optional] |
| Object | anyTypeProp()<br>[optional] |
| Object | anyTypeExceptNullProp()<br>[optional] |
| Object | anyTypePropNullable()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
