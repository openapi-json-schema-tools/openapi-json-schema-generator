# OneofWithRequired
org.openapijsonschematools.client.components.schemas.OneofWithRequired.java
public class OneofWithRequired

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [OneofWithRequired.OneofWithRequired1](#oneofwithrequired1)<br> schema class |
| static class | [OneofWithRequired.Schema1](#schema1)<br> schema class |
| static class | [OneofWithRequired.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [OneofWithRequired.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [OneofWithRequired.Schema0](#schema0)<br> schema class |
| static class | [OneofWithRequired.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [OneofWithRequired.Schema0Map](#schema0map)<br> output class for Map payloads |

## OneofWithRequired1
public static class OneofWithRequired1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map<?, ?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"baz",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [Schema1Map](#schema1map) | validate([Map<?, ?>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema100MapBuilder
public class Schema100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |

## Schema101MapBuilder
public class Schema101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## Schema110MapBuilder
public class Schema110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |


## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | baz()<br> |
| @Nullable Object | foo()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [Schema0Map](#schema0map) | validate([Map<?, ?>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema000MapBuilder
public class Schema000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |

## Schema001MapBuilder
public class Schema001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## Schema010MapBuilder
public class Schema010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## Schema0MapBuilder
public class Schema0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |


## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | bar()<br> |
| @Nullable Object | foo()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
