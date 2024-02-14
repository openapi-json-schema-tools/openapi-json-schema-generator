# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder)<br> builder for Map payloads |
| static class | [SchemaSchema.SchemaMapSchemaMap](#schemamapschemamap)<br> output class for Map payloads |
| static class | [SchemaSchema.Param2Param2Boxed](#param2param2boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.Param2Param2BoxedString](#param2param2boxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.Param2Param2](#param2param2)<br> schema class |
| static class | [SchemaSchema.ParamParamBoxed](#paramparamboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.ParamParamBoxedString](#paramparamboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.ParamParam](#paramparam)<br> schema class |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap([SchemaMapSchemaMap](#schemamapschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
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
SchemaSchema.SchemaMapSchemaMap validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaMapBuilderSchemaMapBuilder()
        .param("a")

        .param2("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param", [ParamParam.class](#paramparam))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param2", [Param2Param2.class](#param2param2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"param",<br>&nbsp;&nbsp;&nbsp;&nbsp;"param2"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap00BuilderSchemaMap00Builder
public class SchemaMap00BuilderSchemaMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap00BuilderSchemaMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, Void value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, boolean value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, String value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, int value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, float value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, long value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, double value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, List<?> value) |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap01BuilderSchemaMap01Builder
public class SchemaMap01BuilderSchemaMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap01BuilderSchemaMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | param2(String value) |

## SchemaMap10BuilderSchemaMap10Builder
public class SchemaMap10BuilderSchemaMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap10BuilderSchemaMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap00BuilderSchemaMap00Builder](#schemamap00builderschemamap00builder) | param(String value) |

## SchemaMapBuilderSchemaMapBuilder
public class SchemaMapBuilderSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilderSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap01BuilderSchemaMap01Builder](#schemamap01builderschemamap01builder) | param(String value) |
| [SchemaMap10BuilderSchemaMap10Builder](#schemamap10builderschemamap10builder) | param2(String value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Param2Param2Boxed
public static abstract sealed class Param2Param2Boxed<br>
permits<br>
[Param2Param2BoxedString](#param2param2boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Param2Param2BoxedString
public static final class Param2Param2BoxedString<br>
extends [Param2Param2Boxed](#param2param2boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Param2Param2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Param2Param2
public static class Param2Param2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field2

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ParamParamBoxed
public static abstract sealed class ParamParamBoxed<br>
permits<br>
[ParamParamBoxedString](#paramparamboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ParamParamBoxedString
public static final class ParamParamBoxedString<br>
extends [ParamParamBoxed](#paramparamboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ParamParamBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ParamParam
public static class ParamParam<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field1

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
