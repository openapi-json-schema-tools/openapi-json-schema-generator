# InvalidStringValueForDefault
org.openapijsonschematools.client.components.schemas.InvalidStringValueForDefault.java
public class InvalidStringValueForDefault

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefault1](#invalidstringvaluefordefault1)<br> schema class |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefaultMapBuilder](#invalidstringvaluefordefaultmapbuilder)<br> builder for Map payloads |
| static class | [InvalidStringValueForDefault.InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap)<br> output class for Map payloads |
| static class | [InvalidStringValueForDefault.Bar](#bar)<br> schema class |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [InvalidStringValueForDefaultMap](#invalidstringvaluefordefaultmap) | validate([Map&lt;?, ?&gt;](#invalidstringvaluefordefaultmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## InvalidStringValueForDefaultMapBuilder
public class InvalidStringValueForDefaultMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
