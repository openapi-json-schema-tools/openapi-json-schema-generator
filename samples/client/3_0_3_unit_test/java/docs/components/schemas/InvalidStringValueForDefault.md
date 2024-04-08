# InvalidStringValueForDefault
org.openapijsonschematools.client.components.schemas.InvalidStringValueForDefault.java
public class InvalidStringValueForDefault<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [InvalidStringValueForDefault.InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)<br> sealed interface for validated payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedVoid](#invalidstringvaluefordefault1boxedvoid)<br> boxed class to store validated null payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedBoolean](#invalidstringvaluefordefault1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedNumber](#invalidstringvaluefordefault1boxednumber)<br> boxed class to store validated Number payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedString](#invalidstringvaluefordefault1boxedstring)<br> boxed class to store validated String payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedList](#invalidstringvaluefordefault1boxedlist)<br> boxed class to store validated List payloads |
| record | [InvalidStringValueForDefault.InvalidStringValueForDefault1BoxedMap](#invalidstringvaluefordefault1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefault1](#invalidstringvaluefordefault1)<br> schema class |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder)<br> builder for Map payloads |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap)<br> output class for Map payloads |
| sealed interface | [InvalidStringValueForDefault.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [InvalidStringValueForDefault.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [InvalidStringValueForDefault.Bar](#bar)<br> schema class |

## InvalidStringValueForDefault1Boxed
public sealed interface InvalidStringValueForDefault1Boxed<br>
permits<br>
[InvalidStringValueForDefault1BoxedVoid](#invalidstringvaluefordefault1boxedvoid),
[InvalidStringValueForDefault1BoxedBoolean](#invalidstringvaluefordefault1boxedboolean),
[InvalidStringValueForDefault1BoxedNumber](#invalidstringvaluefordefault1boxednumber),
[InvalidStringValueForDefault1BoxedString](#invalidstringvaluefordefault1boxedstring),
[InvalidStringValueForDefault1BoxedList](#invalidstringvaluefordefault1boxedlist),
[InvalidStringValueForDefault1BoxedMap](#invalidstringvaluefordefault1boxedmap)

sealed interface that stores validated payloads using boxed classes

## InvalidStringValueForDefault1BoxedVoid
public record InvalidStringValueForDefault1BoxedVoid<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1BoxedBoolean
public record InvalidStringValueForDefault1BoxedBoolean<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1BoxedNumber
public record InvalidStringValueForDefault1BoxedNumber<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1BoxedString
public record InvalidStringValueForDefault1BoxedString<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1BoxedList
public record InvalidStringValueForDefault1BoxedList<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1BoxedMap
public record InvalidStringValueForDefault1BoxedMap<br>
implements [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefault1BoxedMap([InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## InvalidStringValueForDefault1
public static class InvalidStringValueForDefault1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |

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
| [InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap) | validate([Map&lt;?, ?&gt;](#invalidstringvaluefordefaultmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedString](#invalidstringvaluefordefault1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedVoid](#invalidstringvaluefordefault1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedNumber](#invalidstringvaluefordefault1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedBoolean](#invalidstringvaluefordefault1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedMap](#invalidstringvaluefordefault1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#invalidstringvaluefordefaultmapbuilder) arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1BoxedList](#invalidstringvaluefordefault1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefault1Boxed](#invalidstringvaluefordefault1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## InvalidStringValueForDefaultMapBuilder
public class InvalidStringValueForDefaultMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidStringValueForDefaultMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | bar(String value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, Void value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, boolean value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, String value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, int value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, float value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, long value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, double value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, List<?> value) |
| [InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## InvalidStringValueForDefaultMap
public static class InvalidStringValueForDefaultMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap) | of([Map<String, ? extends @Nullable Object>](#invalidstringvaluefordefaultmapbuilder) arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] if omitted the server will use the default value of bad |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

sealed interface that stores validated payloads using boxed classes

## BarBoxedString
public record BarBoxedString<br>
implements [BarBoxed](#barboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
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
import org.openapijsonschematools.client.components.schemas.InvalidStringValueForDefault;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = InvalidStringValueForDefault.Bar.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 4 |
| @Nullable Object | defaultValue = "bad" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [BarBoxedString](#barboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BarBoxed](#barboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
