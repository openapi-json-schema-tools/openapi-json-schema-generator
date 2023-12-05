# PropertiesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.PropertiesWithEscapedCharacters.java
public class PropertiesWithEscapedCharacters

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1](#propertieswithescapedcharacters1)<br> schema class |
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\nbar", [Foonbar.class](#foonbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\"bar", [Foobar.class](#foobar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\\bar", [Foobar1.class](#foobar1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\rbar", [Foorbar.class](#foorbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar.class](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\fbar", [Foofbar.class](#foofbar)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

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
| static [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## PropertiesWithEscapedCharactersMap
public static class PropertiesWithEscapedCharactersMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\nbar"], instance["foo\&quot;bar"], instance["foo\\bar"], instance["foo\rbar"], instance["foo\tbar"], instance["foo\fbar"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo\nbar** | Number |  | [optional] |
| **foo\&quot;bar** | Number |  | [optional] |
| **foo\\bar** | Number |  | [optional] |
| **foo\rbar** | Number |  | [optional] |
| **foo\tbar** | Number |  | [optional] |
| **foo\fbar** | Number |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Foofbar
public static class Foofbar<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Foofbar.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Footbar
public static class Footbar<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Footbar.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foorbar
public static class Foorbar<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Foorbar.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foobar1
public static class Foobar1<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Foobar1.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foobar
public static class Foobar<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Foobar.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foonbar
public static class Foonbar<br>
extends NumberJsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Number validation
Number validatedPayload = PropertiesWithEscapedCharacters.Foonbar.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
