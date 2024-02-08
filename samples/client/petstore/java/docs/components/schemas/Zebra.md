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
| static class | [Zebra.ZebraMapBuilder](#zebramapbuilder)<br> builder for Map payloads |
| static class | [Zebra.ZebraMap](#zebramap)<br> output class for Map payloads |
| static class | [Zebra.ClassName](#classname)<br> schema class |
| enum | [Zebra.StringClassNameEnums](#stringclassnameenums)<br>String enum |
| static class | [Zebra.Type](#type)<br> schema class |
| enum | [Zebra.StringTypeEnums](#stringtypeenums)<br>String enum |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Zebra.ZebraMap validatedPayload =
    Zebra.Zebra1.validate(
    new Zebra.ZebraMapBuilder()
        .className("zebra")

        .type("plains")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("type", [Type.class](#type))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ZebraMap](#zebramap) | validate([Map&lt;?, ?&gt;](#zebramapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ZebraMap0Builder
public class ZebraMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ZebraMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ZebraMap0Builder](#zebramap0builder) | type(String value) |
| [ZebraMap0Builder](#zebramap0builder) | type([StringTypeEnums](#stringtypeenums) value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, Void value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, boolean value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, String value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, int value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, float value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, long value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, double value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, List<?> value) |
| [ZebraMap0Builder](#zebramap0builder) | additionalProperty(String key, Map<String, ?> value) |

## ZebraMapBuilder
public class ZebraMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ZebraMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ZebraMap0Builder](#zebramap0builder) | className(String value) |
| [ZebraMap0Builder](#zebramap0builder) | className([StringClassNameEnums](#stringclassnameenums) value) |

## ZebraMap
public static class ZebraMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ZebraMap](#zebramap) | of([Map<String, ? extends @Nullable Object>](#zebramapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["zebra"] |
| String | type()<br>[optional] must be one of ["plains", "mountain", "grevys"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ClassName
public static class ClassName<br>
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
String validatedPayload = Zebra.ClassName.validate(
    "zebra",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"zebra"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringClassNameEnums](#stringclassnameenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringClassNameEnums
public enum StringClassNameEnums<br>
extends `Enum<StringClassNameEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| ZEBRA | value = "zebra" |

## Type
public static class Type<br>
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
String validatedPayload = Zebra.Type.validate(
    "plains",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"plains",<br>&nbsp;&nbsp;&nbsp;&nbsp;"mountain",<br>&nbsp;&nbsp;&nbsp;&nbsp;"grevys"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringTypeEnums](#stringtypeenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringTypeEnums
public enum StringTypeEnums<br>
extends `Enum<StringTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PLAINS | value = "plains" |
| MOUNTAIN | value = "mountain" |
| GREVYS | value = "grevys" |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
