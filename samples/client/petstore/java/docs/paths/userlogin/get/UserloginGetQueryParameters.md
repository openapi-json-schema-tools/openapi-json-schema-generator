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
| static class | [UserloginGetQueryParameters.UserloginGetQueryParametersMapBuilder](#userlogingetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [UserloginGetQueryParameters.UserloginGetQueryParametersMap](#userlogingetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedVoid](#userlogingetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedBoolean](#userlogingetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedNumber](#userlogingetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedString](#userlogingetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedList](#userlogingetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UserloginGetQueryParameters.UserloginGetadditionalPropertiesBoxedMap](#userlogingetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserloginGetQueryParameters.UserloginGetadditionalProperties](#userlogingetadditionalproperties)<br> schema class |

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
| UserloginGetQueryParameters1BoxedMap([UserloginGetQueryParametersMap](#userlogingetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParametersMap](#userlogingetqueryparametersmap) | data()<br>validated payload |
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
UserloginGetQueryParameters.UserloginGetQueryParametersMap validatedPayload =
    UserloginGetQueryParameters.UserloginGetQueryParameters1.validate(
    new UserloginGetQueryParameters.UserloginGetQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [UserloginGetadditionalProperties.class](#userlogingetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParametersMap](#userlogingetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#userlogingetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserloginGetQueryParameters1BoxedMap](#userlogingetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userlogingetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserloginGetQueryParameters1Boxed](#userlogingetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserloginGetQueryParametersMap00Builder
public class UserloginGetQueryParametersMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParametersMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## UserloginGetQueryParametersMap01Builder
public class UserloginGetQueryParametersMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParametersMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParametersMap00Builder](#userlogingetqueryparametersmap00builder) | username(String value) |

## UserloginGetQueryParametersMap10Builder
public class UserloginGetQueryParametersMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParametersMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParametersMap00Builder](#userlogingetqueryparametersmap00builder) | password(String value) |

## UserloginGetQueryParametersMapBuilder
public class UserloginGetQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetQueryParametersMap01Builder](#userlogingetqueryparametersmap01builder) | password(String value) |
| [UserloginGetQueryParametersMap10Builder](#userlogingetqueryparametersmap10builder) | username(String value) |

## UserloginGetQueryParametersMap
public static class UserloginGetQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserloginGetQueryParametersMap](#userlogingetqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#userlogingetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | password()<br> |
| String | username()<br> |

## UserloginGetadditionalPropertiesBoxed
public sealed interface UserloginGetadditionalPropertiesBoxed<br>
permits<br>
[UserloginGetadditionalPropertiesBoxedVoid](#userlogingetadditionalpropertiesboxedvoid),
[UserloginGetadditionalPropertiesBoxedBoolean](#userlogingetadditionalpropertiesboxedboolean),
[UserloginGetadditionalPropertiesBoxedNumber](#userlogingetadditionalpropertiesboxednumber),
[UserloginGetadditionalPropertiesBoxedString](#userlogingetadditionalpropertiesboxedstring),
[UserloginGetadditionalPropertiesBoxedList](#userlogingetadditionalpropertiesboxedlist),
[UserloginGetadditionalPropertiesBoxedMap](#userlogingetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UserloginGetadditionalPropertiesBoxedVoid
public record UserloginGetadditionalPropertiesBoxedVoid<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalPropertiesBoxedBoolean
public record UserloginGetadditionalPropertiesBoxedBoolean<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalPropertiesBoxedNumber
public record UserloginGetadditionalPropertiesBoxedNumber<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalPropertiesBoxedString
public record UserloginGetadditionalPropertiesBoxedString<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalPropertiesBoxedList
public record UserloginGetadditionalPropertiesBoxedList<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalPropertiesBoxedMap
public record UserloginGetadditionalPropertiesBoxedMap<br>
implements [UserloginGetadditionalPropertiesBoxed](#userlogingetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetadditionalProperties
public static class UserloginGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
