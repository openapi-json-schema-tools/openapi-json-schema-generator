# User
org.openapijsonschematools.client.components.schemas.User.java
public class User

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [User.User1](#user1)<br> schema class |
| static class | [User.UserMap](#usermap)<br> output class for Map payloads |
| static class | [User.AnyTypePropNullable](#anytypepropnullable)<br> schema class |
| static class | [User.AnyTypeExceptNullProp](#anytypeexceptnullprop)<br> schema class |
| static class | [User.Not](#not)<br> schema class |
| static class | [User.AnyTypeProp](#anytypeprop)<br> schema class |
| static class | [User.ObjectWithNoDeclaredPropsNullable](#objectwithnodeclaredpropsnullable)<br> schema class |
| static class | [User.ObjectWithNoDeclaredProps](#objectwithnodeclaredprops)<br> schema class |
| static class | [User.UserStatus](#userstatus)<br> schema class |
| static class | [User.Phone](#phone)<br> schema class |
| static class | [User.Password](#password)<br> schema class |
| static class | [User.Email](#email)<br> schema class |
| static class | [User.LastName](#lastname)<br> schema class |
| static class | [User.FirstName](#firstname)<br> schema class |
| static class | [User.Username](#username)<br> schema class |
| static class | [User.Id](#id)<br> schema class |

## User1
public static class User1<br>
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

// Map validation
User.UserMap validatedPayload =
    User.User1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "id",
            1L
        ),
        new AbstractMap.SimpleEntry<>(
            "username",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "firstName",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "lastName",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "email",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "password",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "phone",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "userStatus",
            1
        ),
        new AbstractMap.SimpleEntry<>(
            "objectWithNoDeclaredPropsNullable",
            (Void) null
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("username", [Username.class](#username))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("firstName", [FirstName.class](#firstname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("lastName", [LastName.class](#lastname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("email", [Email.class](#email))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("phone", [Phone.class](#phone))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("userStatus", [UserStatus.class](#userstatus))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("objectWithNoDeclaredProps", [ObjectWithNoDeclaredProps.class](#objectwithnodeclaredprops))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("objectWithNoDeclaredPropsNullable", [ObjectWithNoDeclaredPropsNullable.class](#objectwithnodeclaredpropsnullable))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypeProp", [AnyTypeProp.class](#anytypeprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypeExceptNullProp", [AnyTypeExceptNullProp.class](#anytypeexceptnullprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypePropNullable", [AnyTypePropNullable.class](#anytypepropnullable)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserMap](#usermap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## UserMap
public static class UserMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserMap](#usermap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
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

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **username** | String |  | [optional] |
| **firstName** | String |  | [optional] |
| **lastName** | String |  | [optional] |
| **email** | String |  | [optional] |
| **password** | String |  | [optional] |
| **phone** | String |  | [optional] |
| **userStatus** | int | User Status | [optional] value must be a 32 bit integer |
| **objectWithNoDeclaredProps** | Map<String, Object> | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional] |
| **objectWithNoDeclaredPropsNullable** | Map<String, Object> | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional] |
| **anyTypeProp** | Object | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional] |
| **anyTypeExceptNullProp** | Object | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional] |
| **anyTypePropNullable** | Object | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AnyTypePropNullable
public static class AnyTypePropNullable<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values.

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AnyTypeExceptNullProp
public static class AnyTypeExceptNullProp<br>
extends JsonSchema

A schema class that validates payloads

## Description
any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object.

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("not", new NotValidator([Not.class](#not)))<br>)); |

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

## Not
public static class Not<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AnyTypeProp
public static class AnyTypeProp<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ObjectWithNoDeclaredPropsNullable
public static class ObjectWithNoDeclaredPropsNullable<br>
extends JsonSchema

A schema class that validates payloads

## Description
test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value.

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

// null validation
Void validatedPayload = User.ObjectWithNoDeclaredPropsNullable.validate(
    (Void) null,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FrozenMap.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)))<br/>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithNoDeclaredProps
public static class ObjectWithNoDeclaredProps<br>
extends MapJsonSchema

A schema class that validates payloads

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## UserStatus
public static class UserStatus<br>
extends Int32JsonSchema

A schema class that validates payloads

## Description
User Status

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Phone
public static class Phone<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Password
public static class Password<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Email
public static class Email<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## LastName
public static class LastName<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## FirstName
public static class FirstName<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Username
public static class Username<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
