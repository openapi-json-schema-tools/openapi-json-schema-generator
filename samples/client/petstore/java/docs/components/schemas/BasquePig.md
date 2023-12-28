# BasquePig
org.openapijsonschematools.client.components.schemas.BasquePig.java
public class BasquePig

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BasquePig.BasquePig1](#basquepig1)<br> schema class |
| static class | [BasquePig.BasquePigMapBuilder](#basquepigmapbuilder)<br> builder for Map payloads |
| static class | [BasquePig.BasquePigMap](#basquepigmap)<br> output class for Map payloads |
| static class | [BasquePig.ClassName](#classname)<br> schema class |
| enum | [BasquePig.StringClassNameEnums](#stringclassnameenums)<br>String enum |

## BasquePig1
public static class BasquePig1<br>
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
BasquePig.BasquePigMap validatedPayload =
    BasquePig.BasquePig1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "className",
            "BasquePig"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BasquePigMap](#basquepigmap) | validate([Map<?, ?>](#basquepigmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BasquePigMapBuilder
public class BasquePigMapBuilder<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | must be one of ["BasquePig"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## BasquePigMap
public static class BasquePigMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BasquePigMap](#basquepigmap) | of([Map<String, ? extends @Nullable Object>](#basquepigmapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["BasquePig"] |
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
String validatedPayload = BasquePig.ClassName.validate(
    "BasquePig",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"BasquePig"<br>)<br> |

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
| BASQUE_PIG | value = "BasquePig" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
