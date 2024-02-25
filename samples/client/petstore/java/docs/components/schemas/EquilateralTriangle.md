# EquilateralTriangle
org.openapijsonschematools.client.components.schemas.EquilateralTriangle.java
public class EquilateralTriangle<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EquilateralTriangle.EquilateralTriangle1Boxed](#equilateraltriangle1boxed)<br> sealed interface for validated payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedVoid](#equilateraltriangle1boxedvoid)<br> boxed class to store validated null payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedBoolean](#equilateraltriangle1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedNumber](#equilateraltriangle1boxednumber)<br> boxed class to store validated Number payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedString](#equilateraltriangle1boxedstring)<br> boxed class to store validated String payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedList](#equilateraltriangle1boxedlist)<br> boxed class to store validated List payloads |
| record | [EquilateralTriangle.EquilateralTriangle1BoxedMap](#equilateraltriangle1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EquilateralTriangle.EquilateralTriangle1](#equilateraltriangle1)<br> schema class |
| sealed interface | [EquilateralTriangle.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [EquilateralTriangle.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EquilateralTriangle.Schema1](#schema1)<br> schema class |
| static class | [EquilateralTriangle.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [EquilateralTriangle.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [EquilateralTriangle.TriangleTypeBoxed](#triangletypeboxed)<br> sealed interface for validated payloads |
| record | [EquilateralTriangle.TriangleTypeBoxedString](#triangletypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [EquilateralTriangle.TriangleType](#triangletype)<br> schema class |
| enum | [EquilateralTriangle.StringTriangleTypeEnums](#stringtriangletypeenums)<br>String enum |

## EquilateralTriangle1Boxed
public sealed interface EquilateralTriangle1Boxed<br>
permits<br>
[EquilateralTriangle1BoxedVoid](#equilateraltriangle1boxedvoid),
[EquilateralTriangle1BoxedBoolean](#equilateraltriangle1boxedboolean),
[EquilateralTriangle1BoxedNumber](#equilateraltriangle1boxednumber),
[EquilateralTriangle1BoxedString](#equilateraltriangle1boxedstring),
[EquilateralTriangle1BoxedList](#equilateraltriangle1boxedlist),
[EquilateralTriangle1BoxedMap](#equilateraltriangle1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EquilateralTriangle1BoxedVoid
public record EquilateralTriangle1BoxedVoid<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1BoxedBoolean
public record EquilateralTriangle1BoxedBoolean<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1BoxedNumber
public record EquilateralTriangle1BoxedNumber<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1BoxedString
public record EquilateralTriangle1BoxedString<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1BoxedList
public record EquilateralTriangle1BoxedList<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1BoxedMap
public record EquilateralTriangle1BoxedMap<br>
implements [EquilateralTriangle1Boxed](#equilateraltriangle1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EquilateralTriangle1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EquilateralTriangle1
public static class EquilateralTriangle1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[TriangleInterface.TriangleInterface1.class](../../components/schemas/TriangleInterface.md#triangleinterface1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedString](#equilateraltriangle1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedVoid](#equilateraltriangle1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedNumber](#equilateraltriangle1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedBoolean](#equilateraltriangle1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedMap](#equilateraltriangle1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1BoxedList](#equilateraltriangle1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [EquilateralTriangle1Boxed](#equilateraltriangle1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
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
EquilateralTriangle.Schema1Map validatedPayload =
    EquilateralTriangle.Schema1.validate(
    new EquilateralTriangle.Schema1MapBuilder()
        .triangleType("EquilateralTriangle")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("triangleType", [TriangleType.class](#triangletype)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1MapBuilder](#schema1mapbuilder) | triangleType(String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | triangleType([StringTriangleTypeEnums](#stringtriangletypeenums) value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Void value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, int value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, float value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, long value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, double value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| String | triangleType()<br>[optional] must be one of ["EquilateralTriangle"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## TriangleTypeBoxed
public sealed interface TriangleTypeBoxed<br>
permits<br>
[TriangleTypeBoxedString](#triangletypeboxedstring)

sealed interface that stores validated payloads using boxed classes

## TriangleTypeBoxedString
public record TriangleTypeBoxedString<br>
implements [TriangleTypeBoxed](#triangletypeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TriangleType
public static class TriangleType<br>
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
String validatedPayload = EquilateralTriangle.TriangleType.validate(
    "EquilateralTriangle",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"EquilateralTriangle"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringTriangleTypeEnums](#stringtriangletypeenums) arg, SchemaConfiguration configuration) |
| [TriangleTypeBoxedString](#triangletypeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [TriangleTypeBoxed](#triangletypeboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringTriangleTypeEnums
public enum StringTriangleTypeEnums<br>
extends `Enum<StringTriangleTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| EQUILATERAL_TRIANGLE | value = "EquilateralTriangle" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
