# TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.java
public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxed)<br> abstract sealed validated payload class |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1)<br> schema class |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder)<br> builder for Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap)<br> output class for Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.AlphaBoxed](#alphaboxed)<br> abstract sealed validated payload class |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.AlphaBoxedNumber](#alphaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha](#alpha)<br> schema class |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed
public static abstract sealed class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed<br>
permits<br>
[TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap
public static final class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap<br>
extends [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap([TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | data<br>validated payload |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1<br>
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
TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap validatedPayload =
    TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
    new TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder()
        .alpha(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("alpha", [Alpha.class](#alpha)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | validate([Map&lt;?, ?&gt;](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder
public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(int value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(float value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(long value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(double value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, Void value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, boolean value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, String value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, int value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, float value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, long value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, double value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, List<?> value) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | of([Map<String, ? extends @Nullable Object>](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| Number | alpha()<br>[optional] if omitted the server will use the default value of 5.0 |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AlphaBoxed
public static abstract sealed class AlphaBoxed<br>
permits<br>
[AlphaBoxedNumber](#alphaboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## AlphaBoxedNumber
public static final class AlphaBoxedNumber<br>
extends [AlphaBoxed](#alphaboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AlphaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Alpha
public static class Alpha<br>
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

// int validation
int validatedPayload = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 3 |
| @Nullable Object | defaultValue = 5.0 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [AlphaBoxedNumber](#alphaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
