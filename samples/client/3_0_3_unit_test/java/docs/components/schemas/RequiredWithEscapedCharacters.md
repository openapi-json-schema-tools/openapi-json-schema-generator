# RequiredWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.RequiredWithEscapedCharacters.java
public class RequiredWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
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
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\tbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\nbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\fbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\rbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\\bar"<br>)<br> |

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
| [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | validate([Map<?, ?>](#requiredwithescapedcharactersmapinput) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredWithEscapedCharactersMapInput
public class RequiredWithEscapedCharactersMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo\tbar** | ? extends @Nullable Object |  | |
| **foo\nbar** | ? extends @Nullable Object |  | |
| **foo\fbar** | ? extends @Nullable Object |  | |
| **foo\rbar** | ? extends @Nullable Object |  | |
| **foo\&quot;bar** | ? extends @Nullable Object |  | |
| **foo\\bar** | ? extends @Nullable Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## RequiredWithEscapedCharactersMap
public static class RequiredWithEscapedCharactersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | of([Map<String, ? extends @Nullable Object>](#requiredwithescapedcharactersmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\tbar"], instance["foo\nbar"], instance["foo\fbar"], instance["foo\rbar"], instance["foo\&quot;bar"], instance["foo\\bar"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
