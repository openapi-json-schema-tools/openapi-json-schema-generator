# PropertiesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.PropertiesWithEscapedCharacters.java
public class PropertiesWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1](#propertieswithescapedcharacters1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap)<br> output class for Map payloads |
| static class | [PropertiesWithEscapedCharacters.Foofbar](#foofbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Footbar](#footbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Foorbar](#foorbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Foobar1](#foobar1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Foonbar](#foonbar)<br> schema class |

## PropertiesWithEscapedCharacters1
public static class PropertiesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\nbar", [Foonbar.class](#foonbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\"bar", [Foobar.class](#foobar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\\bar", [Foobar1.class](#foobar1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\rbar", [Foorbar.class](#foorbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar.class](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\fbar", [Foofbar.class](#foofbar)))<br>)<br> |

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
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | validate([Map<?, ?>](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertiesWithEscapedCharactersMapBuilder
public class PropertiesWithEscapedCharactersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharactersMapBuilder()<br>Creates an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## PropertiesWithEscapedCharactersMap
public static class PropertiesWithEscapedCharactersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | of([Map<String, ? extends @Nullable Object>](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\nbar"], instance["foo\&quot;bar"], instance["foo\\bar"], instance["foo\rbar"], instance["foo\tbar"], instance["foo\fbar"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foofbar
public static class Foofbar<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Footbar
public static class Footbar<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foorbar
public static class Foorbar<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foobar1
public static class Foobar1<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foobar
public static class Foobar<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foonbar
public static class Foonbar<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
