# User
org.openapijsonschematools.client.components.schemas.User.java
public class User

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [User.User1Boxed](#user1boxed)<br> sealed validated payload class |
| static class | [User.User1BoxedMap](#user1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.User1](#user1)<br> schema class |
| static class | [User.UserMapBuilder](#usermapbuilder)<br> builder for Map payloads |
| static class | [User.UserMap](#usermap)<br> output class for Map payloads |
| static class | [User.AnyTypePropNullableBoxed](#anytypepropnullableboxed)<br> sealed validated payload class |
| static class | [User.AnyTypePropNullableBoxedVoid](#anytypepropnullableboxedvoid)<br> boxed class to store validated null payloads |
| static class | [User.AnyTypePropNullableBoxedBoolean](#anytypepropnullableboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [User.AnyTypePropNullableBoxedNumber](#anytypepropnullableboxednumber)<br> boxed class to store validated Number payloads |
| static class | [User.AnyTypePropNullableBoxedString](#anytypepropnullableboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.AnyTypePropNullableBoxedList](#anytypepropnullableboxedlist)<br> boxed class to store validated List payloads |
| static class | [User.AnyTypePropNullableBoxedMap](#anytypepropnullableboxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.AnyTypePropNullable](#anytypepropnullable)<br> schema class |
| static class | [User.AnyTypeExceptNullPropBoxed](#anytypeexceptnullpropboxed)<br> sealed validated payload class |
| static class | [User.AnyTypeExceptNullPropBoxedVoid](#anytypeexceptnullpropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [User.AnyTypeExceptNullPropBoxedBoolean](#anytypeexceptnullpropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [User.AnyTypeExceptNullPropBoxedNumber](#anytypeexceptnullpropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [User.AnyTypeExceptNullPropBoxedString](#anytypeexceptnullpropboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.AnyTypeExceptNullPropBoxedList](#anytypeexceptnullpropboxedlist)<br> boxed class to store validated List payloads |
| static class | [User.AnyTypeExceptNullPropBoxedMap](#anytypeexceptnullpropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.AnyTypeExceptNullProp](#anytypeexceptnullprop)<br> schema class |
| static class | [User.NotBoxed](#notboxed)<br> sealed validated payload class |
| static class | [User.NotBoxedVoid](#notboxedvoid)<br> boxed class to store validated null payloads |
| static class | [User.Not](#not)<br> schema class |
| static class | [User.AnyTypePropBoxed](#anytypepropboxed)<br> sealed validated payload class |
| static class | [User.AnyTypePropBoxedVoid](#anytypepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [User.AnyTypePropBoxedBoolean](#anytypepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [User.AnyTypePropBoxedNumber](#anytypepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [User.AnyTypePropBoxedString](#anytypepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.AnyTypePropBoxedList](#anytypepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [User.AnyTypePropBoxedMap](#anytypepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.AnyTypeProp](#anytypeprop)<br> schema class |
| static class | [User.ObjectWithNoDeclaredPropsNullableBoxed](#objectwithnodeclaredpropsnullableboxed)<br> sealed validated payload class |
| static class | [User.ObjectWithNoDeclaredPropsNullableBoxedVoid](#objectwithnodeclaredpropsnullableboxedvoid)<br> boxed class to store validated null payloads |
| static class | [User.ObjectWithNoDeclaredPropsNullableBoxedMap](#objectwithnodeclaredpropsnullableboxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.ObjectWithNoDeclaredPropsNullable](#objectwithnodeclaredpropsnullable)<br> schema class |
| static class | [User.ObjectWithNoDeclaredPropsBoxed](#objectwithnodeclaredpropsboxed)<br> sealed validated payload class |
| static class | [User.ObjectWithNoDeclaredPropsBoxedMap](#objectwithnodeclaredpropsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [User.ObjectWithNoDeclaredProps](#objectwithnodeclaredprops)<br> schema class |
| static class | [User.UserStatusBoxed](#userstatusboxed)<br> sealed validated payload class |
| static class | [User.UserStatusBoxedNumber](#userstatusboxednumber)<br> boxed class to store validated Number payloads |
| static class | [User.UserStatus](#userstatus)<br> schema class |
| static class | [User.PhoneBoxed](#phoneboxed)<br> sealed validated payload class |
| static class | [User.PhoneBoxedString](#phoneboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.Phone](#phone)<br> schema class |
| static class | [User.PasswordBoxed](#passwordboxed)<br> sealed validated payload class |
| static class | [User.PasswordBoxedString](#passwordboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.Password](#password)<br> schema class |
| static class | [User.EmailBoxed](#emailboxed)<br> sealed validated payload class |
| static class | [User.EmailBoxedString](#emailboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.Email](#email)<br> schema class |
| static class | [User.LastNameBoxed](#lastnameboxed)<br> sealed validated payload class |
| static class | [User.LastNameBoxedString](#lastnameboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.LastName](#lastname)<br> schema class |
| static class | [User.FirstNameBoxed](#firstnameboxed)<br> sealed validated payload class |
| static class | [User.FirstNameBoxedString](#firstnameboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.FirstName](#firstname)<br> schema class |
| static class | [User.UsernameBoxed](#usernameboxed)<br> sealed validated payload class |
| static class | [User.UsernameBoxedString](#usernameboxedstring)<br> boxed class to store validated String payloads |
| static class | [User.Username](#username)<br> schema class |
| static class | [User.IdBoxed](#idboxed)<br> sealed validated payload class |
| static class | [User.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [User.Id](#id)<br> schema class |

## User1Boxed
public static abstract sealed class User1Boxed<br>
permits<br>
[User1BoxedMap](#user1boxedmap)

A sealed class that stores validated payloads using boxed classes

## User1BoxedMap
public static final class User1BoxedMap<br>
extends User1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| User1BoxedMap(UserMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| UserMap | data<br>validated payload |

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

## AnyTypePropNullableBoxed
public static abstract sealed class AnyTypePropNullableBoxed<br>
permits<br>
[AnyTypePropNullableBoxedVoid](#anytypepropnullableboxedvoid),
[AnyTypePropNullableBoxedBoolean](#anytypepropnullableboxedboolean),
[AnyTypePropNullableBoxedNumber](#anytypepropnullableboxednumber),
[AnyTypePropNullableBoxedString](#anytypepropnullableboxedstring),
[AnyTypePropNullableBoxedList](#anytypepropnullableboxedlist),
[AnyTypePropNullableBoxedMap](#anytypepropnullableboxedmap)

A sealed class that stores validated payloads using boxed classes

## AnyTypePropNullableBoxedVoid
public static final class AnyTypePropNullableBoxedVoid<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AnyTypePropNullableBoxedBoolean
public static final class AnyTypePropNullableBoxedBoolean<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AnyTypePropNullableBoxedNumber
public static final class AnyTypePropNullableBoxedNumber<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AnyTypePropNullableBoxedString
public static final class AnyTypePropNullableBoxedString<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AnyTypePropNullableBoxedList
public static final class AnyTypePropNullableBoxedList<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AnyTypePropNullableBoxedMap
public static final class AnyTypePropNullableBoxedMap<br>
extends AnyTypePropNullableBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropNullableBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AnyTypePropNullable
public static class AnyTypePropNullable<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values.

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AnyTypeExceptNullPropBoxed
public static abstract sealed class AnyTypeExceptNullPropBoxed<br>
permits<br>
[AnyTypeExceptNullPropBoxedVoid](#anytypeexceptnullpropboxedvoid),
[AnyTypeExceptNullPropBoxedBoolean](#anytypeexceptnullpropboxedboolean),
[AnyTypeExceptNullPropBoxedNumber](#anytypeexceptnullpropboxednumber),
[AnyTypeExceptNullPropBoxedString](#anytypeexceptnullpropboxedstring),
[AnyTypeExceptNullPropBoxedList](#anytypeexceptnullpropboxedlist),
[AnyTypeExceptNullPropBoxedMap](#anytypeexceptnullpropboxedmap)

A sealed class that stores validated payloads using boxed classes

## AnyTypeExceptNullPropBoxedVoid
public static final class AnyTypeExceptNullPropBoxedVoid<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AnyTypeExceptNullPropBoxedBoolean
public static final class AnyTypeExceptNullPropBoxedBoolean<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AnyTypeExceptNullPropBoxedNumber
public static final class AnyTypeExceptNullPropBoxedNumber<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AnyTypeExceptNullPropBoxedString
public static final class AnyTypeExceptNullPropBoxedString<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AnyTypeExceptNullPropBoxedList
public static final class AnyTypeExceptNullPropBoxedList<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AnyTypeExceptNullPropBoxedMap
public static final class AnyTypeExceptNullPropBoxedMap<br>
extends AnyTypeExceptNullPropBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeExceptNullPropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AnyTypeExceptNullPropBoxedString](#anytypeexceptnullpropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AnyTypeExceptNullPropBoxedVoid](#anytypeexceptnullpropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AnyTypeExceptNullPropBoxedNumber](#anytypeexceptnullpropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AnyTypeExceptNullPropBoxedBoolean](#anytypeexceptnullpropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NotBoxed
public static abstract sealed class NotBoxed<br>
permits<br>
[NotBoxedVoid](#notboxedvoid)

A sealed class that stores validated payloads using boxed classes

## NotBoxedVoid
public static final class NotBoxedVoid<br>
extends NotBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Not
public static class Not<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AnyTypePropBoxed
public static abstract sealed class AnyTypePropBoxed<br>
permits<br>
[AnyTypePropBoxedVoid](#anytypepropboxedvoid),
[AnyTypePropBoxedBoolean](#anytypepropboxedboolean),
[AnyTypePropBoxedNumber](#anytypepropboxednumber),
[AnyTypePropBoxedString](#anytypepropboxedstring),
[AnyTypePropBoxedList](#anytypepropboxedlist),
[AnyTypePropBoxedMap](#anytypepropboxedmap)

A sealed class that stores validated payloads using boxed classes

## AnyTypePropBoxedVoid
public static final class AnyTypePropBoxedVoid<br>
extends AnyTypePropBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AnyTypePropBoxedBoolean
public static final class AnyTypePropBoxedBoolean<br>
extends AnyTypePropBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AnyTypePropBoxedNumber
public static final class AnyTypePropBoxedNumber<br>
extends AnyTypePropBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AnyTypePropBoxedString
public static final class AnyTypePropBoxedString<br>
extends AnyTypePropBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AnyTypePropBoxedList
public static final class AnyTypePropBoxedList<br>
extends AnyTypePropBoxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AnyTypePropBoxedMap
public static final class AnyTypePropBoxedMap<br>
extends AnyTypePropBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AnyTypeProp
public static class AnyTypeProp<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

## Description
test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ObjectWithNoDeclaredPropsNullableBoxed
public static abstract sealed class ObjectWithNoDeclaredPropsNullableBoxed<br>
permits<br>
[ObjectWithNoDeclaredPropsNullableBoxedVoid](#objectwithnodeclaredpropsnullableboxedvoid),
[ObjectWithNoDeclaredPropsNullableBoxedMap](#objectwithnodeclaredpropsnullableboxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithNoDeclaredPropsNullableBoxedVoid
public static final class ObjectWithNoDeclaredPropsNullableBoxedVoid<br>
extends ObjectWithNoDeclaredPropsNullableBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNoDeclaredPropsNullableBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ObjectWithNoDeclaredPropsNullableBoxedMap
public static final class ObjectWithNoDeclaredPropsNullableBoxedMap<br>
extends ObjectWithNoDeclaredPropsNullableBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNoDeclaredPropsNullableBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
## ObjectWithNoDeclaredPropsBoxed
public static abstract sealed class ObjectWithNoDeclaredPropsBoxed<br>
permits<br>
[ObjectWithNoDeclaredPropsBoxedMap](#objectwithnodeclaredpropsboxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithNoDeclaredPropsBoxedMap
public static final class ObjectWithNoDeclaredPropsBoxedMap<br>
extends ObjectWithNoDeclaredPropsBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithNoDeclaredPropsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ObjectWithNoDeclaredProps
public static class ObjectWithNoDeclaredProps<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UserStatusBoxed
public static abstract sealed class UserStatusBoxed<br>
permits<br>
[UserStatusBoxedNumber](#userstatusboxednumber)

A sealed class that stores validated payloads using boxed classes

## UserStatusBoxedNumber
public static final class UserStatusBoxedNumber<br>
extends UserStatusBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserStatusBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UserStatus
public static class UserStatus<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

## Description
User Status

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PhoneBoxed
public static abstract sealed class PhoneBoxed<br>
permits<br>
[PhoneBoxedString](#phoneboxedstring)

A sealed class that stores validated payloads using boxed classes

## PhoneBoxedString
public static final class PhoneBoxedString<br>
extends PhoneBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PhoneBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Phone
public static class Phone<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PasswordBoxed
public static abstract sealed class PasswordBoxed<br>
permits<br>
[PasswordBoxedString](#passwordboxedstring)

A sealed class that stores validated payloads using boxed classes

## PasswordBoxedString
public static final class PasswordBoxedString<br>
extends PasswordBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PasswordBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Password
public static class Password<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## EmailBoxed
public static abstract sealed class EmailBoxed<br>
permits<br>
[EmailBoxedString](#emailboxedstring)

A sealed class that stores validated payloads using boxed classes

## EmailBoxedString
public static final class EmailBoxedString<br>
extends EmailBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Email
public static class Email<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## LastNameBoxed
public static abstract sealed class LastNameBoxed<br>
permits<br>
[LastNameBoxedString](#lastnameboxedstring)

A sealed class that stores validated payloads using boxed classes

## LastNameBoxedString
public static final class LastNameBoxedString<br>
extends LastNameBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| LastNameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## LastName
public static class LastName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FirstNameBoxed
public static abstract sealed class FirstNameBoxed<br>
permits<br>
[FirstNameBoxedString](#firstnameboxedstring)

A sealed class that stores validated payloads using boxed classes

## FirstNameBoxedString
public static final class FirstNameBoxedString<br>
extends FirstNameBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FirstNameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FirstName
public static class FirstName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UsernameBoxed
public static abstract sealed class UsernameBoxed<br>
permits<br>
[UsernameBoxedString](#usernameboxedstring)

A sealed class that stores validated payloads using boxed classes

## UsernameBoxedString
public static final class UsernameBoxedString<br>
extends UsernameBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UsernameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Username
public static class Username<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## IdBoxed
public static abstract sealed class IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

A sealed class that stores validated payloads using boxed classes

## IdBoxedNumber
public static final class IdBoxedNumber<br>
extends IdBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Id
public static class Id<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
