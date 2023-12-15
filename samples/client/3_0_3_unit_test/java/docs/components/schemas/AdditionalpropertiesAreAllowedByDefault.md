# AdditionalpropertiesAreAllowedByDefault
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAreAllowedByDefault.java
public class AdditionalpropertiesAreAllowedByDefault

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1](#additionalpropertiesareallowedbydefault1)<br> schema class |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMapInput](#additionalpropertiesareallowedbydefaultmapinput)<br> builder for Map payloads |
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

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
| static [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | validate([Map<String, Object>](#additionalpropertiesareallowedbydefaultmapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## AdditionalpropertiesAreAllowedByDefaultMapInput
public class AdditionalpropertiesAreAllowedByDefaultMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | Object |  | [optional] |
| **bar** | Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AdditionalpropertiesAreAllowedByDefaultMap
public static class AdditionalpropertiesAreAllowedByDefaultMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | of([Map<String, Object>](#additionalpropertiesareallowedbydefaultmapinput) arg, SchemaConfiguration configuration) |
| Object | foo()<br>[optional] |
| Object | bar()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
