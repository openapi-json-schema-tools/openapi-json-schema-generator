# Zebra
org.openapijsonschematools.client.components.schemas.Zebra.java
public class Zebra

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Zebra.Zebra1](#zebra1)<br> schema class |
| static class | [Zebra.ZebraMapInput](#zebramapinput)<br> builder for Map payloads |
| static class | [Zebra.ZebraMap](#zebramap)<br> output class for Map payloads |
| static class | [Zebra.ClassName](#classname)<br> schema class |
| enum | [Zebra.StringClassNameEnums]()<br>String enum |
| static class | [Zebra.Type](#type)<br> schema class |
| enum | [Zebra.StringTypeEnums]()<br>String enum |
| static class | [Zebra.AdditionalProperties](#additionalproperties)<br> schema class |

## Zebra1
public static class Zebra1<br>
extends JsonSchema

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

// Map validation
Zebra.ZebraMap validatedPayload =
    Zebra.Zebra1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, String>(
            "className",
            "zebra"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "type",
            "plains"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("type", [Type.class](#type))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ZebraMap](#zebramap) | validate([Map<?, ?>](#zebramapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ZebraMapInput
public class ZebraMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | must be one of ["zebra"] |
| **type** | String |  | [optional] must be one of ["plains", "mountain", "grevys"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ZebraMap
public static class ZebraMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ZebraMap](#zebramap) | of([Map<String, ? extends @Nullable Object>](#zebramapinput) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["zebra"] |
| String | type()<br>[optional] must be one of ["plains", "mountain", "grevys"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ClassName
public static class ClassName<br>
extends JsonSchema

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

// String validation
String validatedPayload = Zebra.ClassName.validate(
    "zebra",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"zebra"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringClassNameEnums
public enum StringClassNameEnums<br>
extends `Enum<StringClassNameEnums>`

A class that stores String enum values

## Type
public static class Type<br>
extends JsonSchema

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

// String validation
String validatedPayload = Zebra.Type.validate(
    "plains",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"plains",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"mountain",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"grevys"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringTypeEnums
public enum StringTypeEnums<br>
extends `Enum<StringTypeEnums>`

A class that stores String enum values

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
