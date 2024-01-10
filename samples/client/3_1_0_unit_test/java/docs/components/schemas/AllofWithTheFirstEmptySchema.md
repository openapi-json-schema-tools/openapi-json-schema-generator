# AllofWithTheFirstEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithTheFirstEmptySchema.java
public class AllofWithTheFirstEmptySchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1](#allofwiththefirstemptyschema1)<br> schema class |
| static class | [AllofWithTheFirstEmptySchema.Schema1](#schema1)<br> schema class |
| static class | [AllofWithTheFirstEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheFirstEmptySchema1
public static class AllofWithTheFirstEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

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
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1
public static class Schema1<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
