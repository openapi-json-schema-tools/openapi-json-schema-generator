# TriangleInterface
org.openapijsonschematools.client.components.schemas.TriangleInterface.java
public class TriangleInterface

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
| static class | [TriangleInterface.TriangleInterface1Boxed](#triangleinterface1boxed)<br> sealed validated payload class |
| static class | [TriangleInterface.TriangleInterface1BoxedVoid](#triangleinterface1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [TriangleInterface.TriangleInterface1BoxedBoolean](#triangleinterface1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [TriangleInterface.TriangleInterface1BoxedNumber](#triangleinterface1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [TriangleInterface.TriangleInterface1BoxedString](#triangleinterface1boxedstring)<br> boxed class to store validated String payloads |
| static class | [TriangleInterface.TriangleInterface1BoxedList](#triangleinterface1boxedlist)<br> boxed class to store validated List payloads |
| static class | [TriangleInterface.TriangleInterface1BoxedMap](#triangleinterface1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TriangleInterface.TriangleInterface1](#triangleinterface1)<br> schema class |
| static class | [TriangleInterface.TriangleInterfaceMapBuilder](#triangleinterfacemapbuilder)<br> builder for Map payloads |
| static class | [TriangleInterface.TriangleInterfaceMap](#triangleinterfacemap)<br> output class for Map payloads |
| static class | [TriangleInterface.TriangleTypeBoxed](#triangletypeboxed)<br> sealed validated payload class |
| static class | [TriangleInterface.TriangleTypeBoxedString](#triangletypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [TriangleInterface.TriangleType](#triangletype)<br> schema class |
| static class | [TriangleInterface.ShapeTypeBoxed](#shapetypeboxed)<br> sealed validated payload class |
| static class | [TriangleInterface.ShapeTypeBoxedString](#shapetypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [TriangleInterface.ShapeType](#shapetype)<br> schema class |
| enum | [TriangleInterface.StringShapeTypeEnums](#stringshapetypeenums)<br>String enum |

## TriangleInterface1Boxed
public static abstract sealed class TriangleInterface1Boxed<br>
permits<br>
[TriangleInterface1BoxedVoid](#triangleinterface1boxedvoid),
[TriangleInterface1BoxedBoolean](#triangleinterface1boxedboolean),
[TriangleInterface1BoxedNumber](#triangleinterface1boxednumber),
[TriangleInterface1BoxedString](#triangleinterface1boxedstring),
[TriangleInterface1BoxedList](#triangleinterface1boxedlist),
[TriangleInterface1BoxedMap](#triangleinterface1boxedmap)

A sealed class that stores validated payloads using boxed classes

## TriangleInterface1BoxedVoid
public static final class TriangleInterface1BoxedVoid<br>
extends TriangleInterface1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## TriangleInterface1BoxedBoolean
public static final class TriangleInterface1BoxedBoolean<br>
extends TriangleInterface1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## TriangleInterface1BoxedNumber
public static final class TriangleInterface1BoxedNumber<br>
extends TriangleInterface1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## TriangleInterface1BoxedString
public static final class TriangleInterface1BoxedString<br>
extends TriangleInterface1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## TriangleInterface1BoxedList
public static final class TriangleInterface1BoxedList<br>
extends TriangleInterface1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## TriangleInterface1BoxedMap
public static final class TriangleInterface1BoxedMap<br>
extends TriangleInterface1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterface1BoxedMap(TriangleInterfaceMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| TriangleInterfaceMap | data<br>validated payload |

## TriangleInterface1
public static class TriangleInterface1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapeType", [ShapeType.class](#shapetype))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("triangleType", [TriangleType.class](#triangletype)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"shapeType",<br>&nbsp;&nbsp;&nbsp;&nbsp;"triangleType"<br>)<br> |

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
| [TriangleInterfaceMap](#triangleinterfacemap) | validate([Map&lt;?, ?&gt;](#triangleinterfacemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [TriangleInterface1BoxedString](#triangleinterface1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [TriangleInterface1BoxedVoid](#triangleinterface1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [TriangleInterface1BoxedNumber](#triangleinterface1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [TriangleInterface1BoxedBoolean](#triangleinterface1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TriangleInterfaceMap00Builder
public class TriangleInterfaceMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterfaceMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, Void value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, boolean value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, String value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, int value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, float value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, long value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, double value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, List<?> value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | additionalProperty(String key, Map<String, ?> value) |

## TriangleInterfaceMap01Builder
public class TriangleInterfaceMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterfaceMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | triangleType(String value) |

## TriangleInterfaceMap10Builder
public class TriangleInterfaceMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterfaceMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | shapeType(String value) |
| [TriangleInterfaceMap00Builder](#triangleinterfacemap00builder) | shapeType([StringShapeTypeEnums](#stringshapetypeenums) value) |

## TriangleInterfaceMapBuilder
public class TriangleInterfaceMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TriangleInterfaceMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TriangleInterfaceMap01Builder](#triangleinterfacemap01builder) | shapeType(String value) |
| [TriangleInterfaceMap01Builder](#triangleinterfacemap01builder) | shapeType([StringShapeTypeEnums](#stringshapetypeenums) value) |
| [TriangleInterfaceMap10Builder](#triangleinterfacemap10builder) | triangleType(String value) |

## TriangleInterfaceMap
public static class TriangleInterfaceMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TriangleInterfaceMap](#triangleinterfacemap) | of([Map<String, ? extends @Nullable Object>](#triangleinterfacemapbuilder) arg, SchemaConfiguration configuration) |
| String | shapeType()<br> must be one of ["Triangle"] |
| String | triangleType()<br> |
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
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ShapeTypeBoxed
public static abstract sealed class ShapeTypeBoxed<br>
permits<br>
[ShapeTypeBoxedString](#shapetypeboxedstring)

A sealed class that stores validated payloads using boxed classes

## ShapeTypeBoxedString
public static final class ShapeTypeBoxedString<br>
extends ShapeTypeBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ShapeType
public static class ShapeType<br>
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
String validatedPayload = TriangleInterface.ShapeType.validate(
    "Triangle",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"Triangle"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringShapeTypeEnums](#stringshapetypeenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringShapeTypeEnums
public enum StringShapeTypeEnums<br>
extends `Enum<StringShapeTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRIANGLE | value = "Triangle" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
