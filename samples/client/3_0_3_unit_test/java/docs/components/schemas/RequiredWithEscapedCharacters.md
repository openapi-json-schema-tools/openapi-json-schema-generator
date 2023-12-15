# RequiredWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.RequiredWithEscapedCharacters.java
public class RequiredWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1](#requiredwithescapedcharacters1)<br> schema class |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMapInput](#requiredwithescapedcharactersmapinput)<br> builder for Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap)<br> output class for Map payloads |

## RequiredWithEscapedCharacters1
public static class RequiredWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\tbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\nbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\fbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\rbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo\\bar"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

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
| static [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | validate([Map<String, Object>](#requiredwithescapedcharactersmapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## RequiredWithEscapedCharactersMapInput
public class RequiredWithEscapedCharactersMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo\tbar** | Object |  | |
| **foo\nbar** | Object |  | |
| **foo\fbar** | Object |  | |
| **foo\rbar** | Object |  | |
| **foo\&quot;bar** | Object |  | |
| **foo\\bar** | Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## RequiredWithEscapedCharactersMap
public static class RequiredWithEscapedCharactersMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | of([Map<String, Object>](#requiredwithescapedcharactersmapinput) arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\tbar"], instance["foo\nbar"], instance["foo\fbar"], instance["foo\rbar"], instance["foo\&quot;bar"], instance["foo\\bar"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
