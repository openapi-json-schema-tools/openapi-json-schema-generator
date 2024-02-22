# SimpleQuadrilateral
org.openapijsonschematools.client.components.schemas.SimpleQuadrilateral.java
public class SimpleQuadrilateral<br>

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
| sealed interface | [SimpleQuadrilateral.SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)<br> sealed interface for validated payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedVoid](#simplequadrilateral1boxedvoid)<br> boxed class to store validated null payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedBoolean](#simplequadrilateral1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedNumber](#simplequadrilateral1boxednumber)<br> boxed class to store validated Number payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedString](#simplequadrilateral1boxedstring)<br> boxed class to store validated String payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedList](#simplequadrilateral1boxedlist)<br> boxed class to store validated List payloads |
| record | [SimpleQuadrilateral.SimpleQuadrilateral1BoxedMap](#simplequadrilateral1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SimpleQuadrilateral.SimpleQuadrilateral1](#simplequadrilateral1)<br> schema class |
| sealed interface | [SimpleQuadrilateral.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [SimpleQuadrilateral.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SimpleQuadrilateral.Schema1](#schema1)<br> schema class |
| static class | [SimpleQuadrilateral.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [SimpleQuadrilateral.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [SimpleQuadrilateral.QuadrilateralTypeBoxed](#quadrilateraltypeboxed)<br> sealed interface for validated payloads |
| record | [SimpleQuadrilateral.QuadrilateralTypeBoxedString](#quadrilateraltypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [SimpleQuadrilateral.QuadrilateralType](#quadrilateraltype)<br> schema class |
| enum | [SimpleQuadrilateral.StringQuadrilateralTypeEnums](#stringquadrilateraltypeenums)<br>String enum |

## SimpleQuadrilateral1Boxed
public sealed interface SimpleQuadrilateral1Boxed<br>
permits<br>
[SimpleQuadrilateral1BoxedVoid](#simplequadrilateral1boxedvoid),
[SimpleQuadrilateral1BoxedBoolean](#simplequadrilateral1boxedboolean),
[SimpleQuadrilateral1BoxedNumber](#simplequadrilateral1boxednumber),
[SimpleQuadrilateral1BoxedString](#simplequadrilateral1boxedstring),
[SimpleQuadrilateral1BoxedList](#simplequadrilateral1boxedlist),
[SimpleQuadrilateral1BoxedMap](#simplequadrilateral1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SimpleQuadrilateral1BoxedVoid
public record SimpleQuadrilateral1BoxedVoid<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1BoxedBoolean
public record SimpleQuadrilateral1BoxedBoolean<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1BoxedNumber
public record SimpleQuadrilateral1BoxedNumber<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1BoxedString
public record SimpleQuadrilateral1BoxedString<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1BoxedList
public record SimpleQuadrilateral1BoxedList<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1BoxedMap
public record SimpleQuadrilateral1BoxedMap<br>
implements [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleQuadrilateral1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SimpleQuadrilateral1
public static class SimpleQuadrilateral1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[QuadrilateralInterface.QuadrilateralInterface1.class](../../components/schemas/QuadrilateralInterface.md#quadrilateralinterface1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

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
| [SimpleQuadrilateral1BoxedString](#simplequadrilateral1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1BoxedVoid](#simplequadrilateral1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1BoxedNumber](#simplequadrilateral1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1BoxedBoolean](#simplequadrilateral1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1BoxedMap](#simplequadrilateral1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1BoxedList](#simplequadrilateral1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [SimpleQuadrilateral1Boxed](#simplequadrilateral1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
SimpleQuadrilateral.Schema1Map validatedPayload =
    SimpleQuadrilateral.Schema1.validate(
    new SimpleQuadrilateral.Schema1MapBuilder()
        .quadrilateralType("SimpleQuadrilateral")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("quadrilateralType", [QuadrilateralType.class](#quadrilateraltype)))<br>)<br> |

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
| [Schema1MapBuilder](#schema1mapbuilder) | quadrilateralType(String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | quadrilateralType([StringQuadrilateralTypeEnums](#stringquadrilateraltypeenums) value) |
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
| String | quadrilateralType()<br>[optional] must be one of ["SimpleQuadrilateral"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## QuadrilateralTypeBoxed
public sealed interface QuadrilateralTypeBoxed<br>
permits<br>
[QuadrilateralTypeBoxedString](#quadrilateraltypeboxedstring)

sealed interface that stores validated payloads using boxed classes

## QuadrilateralTypeBoxedString
public record QuadrilateralTypeBoxedString<br>
implements [QuadrilateralTypeBoxed](#quadrilateraltypeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralType
public static class QuadrilateralType<br>
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
String validatedPayload = SimpleQuadrilateral.QuadrilateralType.validate(
    "SimpleQuadrilateral",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"SimpleQuadrilateral"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringQuadrilateralTypeEnums](#stringquadrilateraltypeenums) arg, SchemaConfiguration configuration) |
| [QuadrilateralTypeBoxedString](#quadrilateraltypeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [QuadrilateralTypeBoxed](#quadrilateraltypeboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringQuadrilateralTypeEnums
public enum StringQuadrilateralTypeEnums<br>
extends `Enum<StringQuadrilateralTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| SIMPLE_QUADRILATERAL | value = "SimpleQuadrilateral" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
