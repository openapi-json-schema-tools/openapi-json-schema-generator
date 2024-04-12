# UserloginGetQueryParameters
public class UserloginGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserloginGetQueryParameters.UserloginGetQueryParameters1Boxed](#userlogingetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters1BoxedMap](#userlogingetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserloginGetQueryParameters.UserloginGetQueryParameters1](#userlogingetqueryparameters1)<br> schema class |
| static class | [UserloginGetQueryParameters.UserloginGetQueryParameters9](#userlogingetqueryparameters9)<br> builder for Map payloads |
| static class | [UserloginGetQueryParameters.UserloginGetQueryParameters10](#userlogingetqueryparameters10)<br> output class for Map payloads |
| sealed interface | [UserloginGetQueryParameters.UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)<br> sealed interface for validated payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedVoid](#userlogingetqueryparameters5boxedvoid)<br> boxed class to store validated null payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedBoolean](#userlogingetqueryparameters5boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedNumber](#userlogingetqueryparameters5boxednumber)<br> boxed class to store validated Number payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedString](#userlogingetqueryparameters5boxedstring)<br> boxed class to store validated String payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedList](#userlogingetqueryparameters5boxedlist)<br> boxed class to store validated List payloads |
| record | [UserloginGetQueryParameters.UserloginGetQueryParameters5BoxedMap](#userlogingetqueryparameters5boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserloginGetQueryParameters.UserloginGetQueryParameters5](#userlogingetqueryparameters5)<br> schema class |

## UserloginGetQueryParameters1Boxed
public sealed interface UserloginGetQueryParameters1Boxed<br>
permits<br>
[UserloginGetQueryParameters1BoxedMap](#userlogingetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserloginGetQueryParameters1BoxedMap
public record UserloginGetQueryParameters1BoxedMap<br>
implements [UserloginGetQueryParameters1Boxed](#userlogingetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters1BoxedMap([UserloginGetQueryParameters10](#userlogingetqueryparameters10) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParameters10](#userlogingetqueryparameters10) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters1
public static class UserloginGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserloginGetQueryParameters.UserloginGetQueryParameters10 validatedPayload =
    UserloginGetQueryParameters.UserloginGetQueryParameters1.validate(
    new UserloginGetQueryParameters.UserloginGetQueryParameters9()
        .password("a")

        .username("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Schema1.Schema11.class](../../../paths/userlogin/get/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("username", [Schema0.Schema01.class](../../../paths/userlogin/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"password",<br>&nbsp;&nbsp;&nbsp;&nbsp;"username"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [UserloginGetQueryParameters5.class](#userlogingetqueryparameters5) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParameters10](#userlogingetqueryparameters10) | validate([Map&lt;?, ?&gt;](#userlogingetqueryparameters9) arg, SchemaConfiguration configuration) |
| [UserloginGetQueryParameters1BoxedMap](#userlogingetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userlogingetqueryparameters9) arg, SchemaConfiguration configuration) |
| [UserloginGetQueryParameters1Boxed](#userlogingetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserloginGetQueryParameters11
public class UserloginGetQueryParameters11<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters11(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## UserloginGetQueryParameters12
public class UserloginGetQueryParameters12<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters12(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParameters11](#userlogingetqueryparameters11) | username(String value) |

## UserloginGetQueryParameters13
public class UserloginGetQueryParameters13<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters13(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParameters11](#userlogingetqueryparameters11) | password(String value) |

## UserloginGetQueryParameters9
public class UserloginGetQueryParameters9<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters9()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParameters12](#userlogingetqueryparameters12) | password(String value) |
| [UserloginGetQueryParameters13](#userlogingetqueryparameters13) | username(String value) |

## UserloginGetQueryParameters10
public static class UserloginGetQueryParameters10<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserloginGetQueryParameters10](#userlogingetqueryparameters10) | of([Map<String, ? extends @Nullable Object>](#userlogingetqueryparameters9) arg, SchemaConfiguration configuration) |
| String | password()<br> |
| String | username()<br> |

## UserloginGetQueryParameters5Boxed
public sealed interface UserloginGetQueryParameters5Boxed<br>
permits<br>
[UserloginGetQueryParameters5BoxedVoid](#userlogingetqueryparameters5boxedvoid),
[UserloginGetQueryParameters5BoxedBoolean](#userlogingetqueryparameters5boxedboolean),
[UserloginGetQueryParameters5BoxedNumber](#userlogingetqueryparameters5boxednumber),
[UserloginGetQueryParameters5BoxedString](#userlogingetqueryparameters5boxedstring),
[UserloginGetQueryParameters5BoxedList](#userlogingetqueryparameters5boxedlist),
[UserloginGetQueryParameters5BoxedMap](#userlogingetqueryparameters5boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserloginGetQueryParameters5BoxedVoid
public record UserloginGetQueryParameters5BoxedVoid<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5BoxedBoolean
public record UserloginGetQueryParameters5BoxedBoolean<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5BoxedNumber
public record UserloginGetQueryParameters5BoxedNumber<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5BoxedString
public record UserloginGetQueryParameters5BoxedString<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5BoxedList
public record UserloginGetQueryParameters5BoxedList<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5BoxedMap
public record UserloginGetQueryParameters5BoxedMap<br>
implements [UserloginGetQueryParameters5Boxed](#userlogingetqueryparameters5boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParameters5BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetQueryParameters5
public static class UserloginGetQueryParameters5<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
