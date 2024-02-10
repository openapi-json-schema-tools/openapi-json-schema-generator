# IsoscelesTriangle
org.openapijsonschematools.client.components.schemas.IsoscelesTriangle.java
public class IsoscelesTriangle

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IsoscelesTriangle.IsoscelesTriangle1Boxed](#isoscelestriangle1boxed)<br> sealed validated payload class |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedVoid](#isoscelestriangle1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedBoolean](#isoscelestriangle1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedNumber](#isoscelestriangle1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedString](#isoscelestriangle1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedList](#isoscelestriangle1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1BoxedMap](#isoscelestriangle1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IsoscelesTriangle.IsoscelesTriangle1](#isoscelestriangle1)<br> schema class |
| static class | [IsoscelesTriangle.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [IsoscelesTriangle.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IsoscelesTriangle.Schema1](#schema1)<br> schema class |
| static class | [IsoscelesTriangle.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [IsoscelesTriangle.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [IsoscelesTriangle.TriangleTypeBoxed](#triangletypeboxed)<br> sealed validated payload class |
| static class | [IsoscelesTriangle.TriangleTypeBoxedString](#triangletypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [IsoscelesTriangle.TriangleType](#triangletype)<br> schema class |
| enum | [IsoscelesTriangle.StringTriangleTypeEnums](#stringtriangletypeenums)<br>String enum |

## IsoscelesTriangle1Boxed
public static abstract sealed class IsoscelesTriangle1Boxed<br>
permits<br>
[IsoscelesTriangle1BoxedVoid](#isoscelestriangle1boxedvoid),
[IsoscelesTriangle1BoxedBoolean](#isoscelestriangle1boxedboolean),
[IsoscelesTriangle1BoxedNumber](#isoscelestriangle1boxednumber),
[IsoscelesTriangle1BoxedString](#isoscelestriangle1boxedstring),
[IsoscelesTriangle1BoxedList](#isoscelestriangle1boxedlist),
[IsoscelesTriangle1BoxedMap](#isoscelestriangle1boxedmap)

A sealed class that stores validated payloads using boxed classes

## IsoscelesTriangle1BoxedVoid
public static final class IsoscelesTriangle1BoxedVoid<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IsoscelesTriangle1BoxedBoolean
public static final class IsoscelesTriangle1BoxedBoolean<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IsoscelesTriangle1BoxedNumber
public static final class IsoscelesTriangle1BoxedNumber<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IsoscelesTriangle1BoxedString
public static final class IsoscelesTriangle1BoxedString<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IsoscelesTriangle1BoxedList
public static final class IsoscelesTriangle1BoxedList<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IsoscelesTriangle1BoxedMap
public static final class IsoscelesTriangle1BoxedMap<br>
extends IsoscelesTriangle1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IsoscelesTriangle1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IsoscelesTriangle1
public static class IsoscelesTriangle1<br>
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
| [IsoscelesTriangle1BoxedString](#isoscelestriangle1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IsoscelesTriangle1BoxedVoid](#isoscelestriangle1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IsoscelesTriangle1BoxedNumber](#isoscelestriangle1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IsoscelesTriangle1BoxedBoolean](#isoscelestriangle1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IsoscelesTriangle1BoxedMap](#isoscelestriangle1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IsoscelesTriangle1BoxedList](#isoscelestriangle1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends Schema1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(Schema1Map data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Schema1Map | data<br>validated payload |

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
IsoscelesTriangle.Schema1Map validatedPayload =
    IsoscelesTriangle.Schema1.validate(
    new IsoscelesTriangle.Schema1MapBuilder()
        .triangleType("IsoscelesTriangle")

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
| String | triangleType()<br>[optional] must be one of ["IsoscelesTriangle"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## TriangleTypeBoxed
public static abstract sealed class TriangleTypeBoxed<br>
permits<br>
[TriangleTypeBoxedString](#triangletypeboxedstring)

A sealed class that stores validated payloads using boxed classes

## TriangleTypeBoxedString
public static final class TriangleTypeBoxedString<br>
extends TriangleTypeBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

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
String validatedPayload = IsoscelesTriangle.TriangleType.validate(
    "IsoscelesTriangle",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"IsoscelesTriangle"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringTriangleTypeEnums](#stringtriangletypeenums) arg, SchemaConfiguration configuration) |
| [TriangleTypeBoxedString](#triangletypeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringTriangleTypeEnums
public enum StringTriangleTypeEnums<br>
extends `Enum<StringTriangleTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| ISOSCELES_TRIANGLE | value = "IsoscelesTriangle" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
