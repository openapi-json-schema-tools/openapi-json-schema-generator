# AdditionalpropertiesAreAllowedByDefault
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAreAllowedByDefault.java
public class AdditionalpropertiesAreAllowedByDefault

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1](#additionalpropertiesareallowedbydefault1)<br> schema class |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.Bar](#bar)<br> schema class |
| static class | [AdditionalpropertiesAreAllowedByDefault.Foo](#foo)<br> schema class |

## AdditionalpropertiesAreAllowedByDefault1
public static class AdditionalpropertiesAreAllowedByDefault1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |

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
| [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesAreAllowedByDefaultMapBuilder
public class AdditionalpropertiesAreAllowedByDefaultMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefaultMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(Map<String, ?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(Map<String, ?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## AdditionalpropertiesAreAllowedByDefaultMap
public static class AdditionalpropertiesAreAllowedByDefaultMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
