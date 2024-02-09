# User
org.openapijsonschematools.client.components.schemas.User.java
public class User

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [User.User1](#user1)<br> schema class |
| static class | [User.UserMapBuilder](#usermapbuilder)<br> builder for Map payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
User.UserMap validatedPayload =
    User.User1.validate(
    new User.UserMapBuilder()
        .id(1L)

        .username("a")

        .firstName("a")

        .lastName("a")

        .email("a")

        .password("a")

        .phone("a")

        .userStatus(1)

        .objectWithNoDeclaredPropsNullable(null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("username", [Username.class](#username))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("firstName", [FirstName.class](#firstname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("lastName", [LastName.class](#lastname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("email", [Email.class](#email))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("phone", [Phone.class](#phone))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("userStatus", [UserStatus.class](#userstatus))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("objectWithNoDeclaredProps", [ObjectWithNoDeclaredProps.class](#objectwithnodeclaredprops))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("objectWithNoDeclaredPropsNullable", [ObjectWithNoDeclaredPropsNullable.class](#objectwithnodeclaredpropsnullable))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypeProp", [AnyTypeProp.class](#anytypeprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypeExceptNullProp", [AnyTypeExceptNullProp.class](#anytypeexceptnullprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anyTypePropNullable", [AnyTypePropNullable.class](#anytypepropnullable)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserMap](#usermap) | validate([Map&lt;?, ?&gt;](#usermapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UserMapBuilder
public class UserMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [UserMapBuilder](#usermapbuilder) | id(int value) |
| [UserMapBuilder](#usermapbuilder) | id(float value) |
| [UserMapBuilder](#usermapbuilder) | id(long value) |
| [UserMapBuilder](#usermapbuilder) | id(double value) |
| [UserMapBuilder](#usermapbuilder) | username(String value) |
| [UserMapBuilder](#usermapbuilder) | firstName(String value) |
| [UserMapBuilder](#usermapbuilder) | lastName(String value) |
| [UserMapBuilder](#usermapbuilder) | email(String value) |
| [UserMapBuilder](#usermapbuilder) | password(String value) |
| [UserMapBuilder](#usermapbuilder) | phone(String value) |
| [UserMapBuilder](#usermapbuilder) | userStatus(int value) |
| [UserMapBuilder](#usermapbuilder) | userStatus(float value) |
| [UserMapBuilder](#usermapbuilder) | objectWithNoDeclaredProps(Map<String, @Nullable Object> value) |
| [UserMapBuilder](#usermapbuilder) | objectWithNoDeclaredPropsNullable(Void value) |
| [UserMapBuilder](#usermapbuilder) | objectWithNoDeclaredPropsNullable(Map<String, @Nullable Object> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(Void value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(boolean value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(String value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(int value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(float value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(long value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(double value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(List<?> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeProp(Map<String, ?> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(Void value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(boolean value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(String value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(int value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(float value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(long value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(double value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(List<?> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypeExceptNullProp(Map<String, ?> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(Void value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(boolean value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(String value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(int value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(float value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(long value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(double value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(List<?> value) |
| [UserMapBuilder](#usermapbuilder) | anyTypePropNullable(Map<String, ?> value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, Void value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, boolean value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, String value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, int value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, float value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, long value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, double value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, List<?> value) |
| [UserMapBuilder](#usermapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## UserMap
public static class UserMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserMap](#usermap) | of([Map<String, ? extends @Nullable Object>](#usermapbuilder) arg, SchemaConfiguration configuration) |
| Number | id()<br>[optional] value must be a 64 bit integer |
| String | username()<br>[optional] |
| String | firstName()<br>[optional] |
| String | lastName()<br>[optional] |
| String | email()<br>[optional] |
| String | password()<br>[optional] |
| String | phone()<br>[optional] |
| Number | userStatus()<br>[optional] value must be a 32 bit integer |
| FrozenMap<?> | objectWithNoDeclaredProps()<br>[optional] |
| @Nullable FrozenMap<?> | objectWithNoDeclaredPropsNullable()<br>[optional] |
| @Nullable Object | anyTypeProp()<br>[optional] |
| @Nullable Object | anyTypeExceptNullProp()<br>[optional] |
| @Nullable Object | anyTypePropNullable()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AnyTypePropNullable
public static class AnyTypePropNullable<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values.

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
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
| Class<? extends JsonSchema> | not = [Not.class](#not) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Not
public static class Not<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## AnyTypeProp
public static class AnyTypeProp<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
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
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithNoDeclaredProps
public static class ObjectWithNoDeclaredProps<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
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
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## Password
public static class Password<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## Email
public static class Email<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## LastName
public static class LastName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## FirstName
public static class FirstName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## Username
public static class Username<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
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
