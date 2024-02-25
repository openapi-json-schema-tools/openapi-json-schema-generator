# QuadrilateralInterface
org.openapijsonschematools.client.components.schemas.QuadrilateralInterface.java
public class QuadrilateralInterface<br>

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
| sealed interface | [QuadrilateralInterface.QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)<br> sealed interface for validated payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedVoid](#quadrilateralinterface1boxedvoid)<br> boxed class to store validated null payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedBoolean](#quadrilateralinterface1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedNumber](#quadrilateralinterface1boxednumber)<br> boxed class to store validated Number payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedString](#quadrilateralinterface1boxedstring)<br> boxed class to store validated String payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedList](#quadrilateralinterface1boxedlist)<br> boxed class to store validated List payloads |
| record | [QuadrilateralInterface.QuadrilateralInterface1BoxedMap](#quadrilateralinterface1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [QuadrilateralInterface.QuadrilateralInterface1](#quadrilateralinterface1)<br> schema class |
| static class | [QuadrilateralInterface.QuadrilateralInterfaceMapBuilder](#quadrilateralinterfacemapbuilder)<br> builder for Map payloads |
| static class | [QuadrilateralInterface.QuadrilateralInterfaceMap](#quadrilateralinterfacemap)<br> output class for Map payloads |
| sealed interface | [QuadrilateralInterface.QuadrilateralTypeBoxed](#quadrilateraltypeboxed)<br> sealed interface for validated payloads |
| record | [QuadrilateralInterface.QuadrilateralTypeBoxedString](#quadrilateraltypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [QuadrilateralInterface.QuadrilateralType](#quadrilateraltype)<br> schema class |
| sealed interface | [QuadrilateralInterface.ShapeTypeBoxed](#shapetypeboxed)<br> sealed interface for validated payloads |
| record | [QuadrilateralInterface.ShapeTypeBoxedString](#shapetypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [QuadrilateralInterface.ShapeType](#shapetype)<br> schema class |
| enum | [QuadrilateralInterface.StringShapeTypeEnums](#stringshapetypeenums)<br>String enum |

## QuadrilateralInterface1Boxed
public sealed interface QuadrilateralInterface1Boxed<br>
permits<br>
[QuadrilateralInterface1BoxedVoid](#quadrilateralinterface1boxedvoid),
[QuadrilateralInterface1BoxedBoolean](#quadrilateralinterface1boxedboolean),
[QuadrilateralInterface1BoxedNumber](#quadrilateralinterface1boxednumber),
[QuadrilateralInterface1BoxedString](#quadrilateralinterface1boxedstring),
[QuadrilateralInterface1BoxedList](#quadrilateralinterface1boxedlist),
[QuadrilateralInterface1BoxedMap](#quadrilateralinterface1boxedmap)

sealed interface that stores validated payloads using boxed classes

## QuadrilateralInterface1BoxedVoid
public record QuadrilateralInterface1BoxedVoid<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1BoxedBoolean
public record QuadrilateralInterface1BoxedBoolean<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1BoxedNumber
public record QuadrilateralInterface1BoxedNumber<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1BoxedString
public record QuadrilateralInterface1BoxedString<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1BoxedList
public record QuadrilateralInterface1BoxedList<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1BoxedMap
public record QuadrilateralInterface1BoxedMap<br>
implements [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterface1BoxedMap([QuadrilateralInterfaceMap](#quadrilateralinterfacemap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QuadrilateralInterfaceMap](#quadrilateralinterfacemap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QuadrilateralInterface1
public static class QuadrilateralInterface1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapeType", [ShapeType.class](#shapetype))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("quadrilateralType", [QuadrilateralType.class](#quadrilateraltype)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"quadrilateralType",<br>&nbsp;&nbsp;&nbsp;&nbsp;"shapeType"<br>)<br> |

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
| [QuadrilateralInterfaceMap](#quadrilateralinterfacemap) | validate([Map&lt;?, ?&gt;](#quadrilateralinterfacemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedString](#quadrilateralinterface1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedVoid](#quadrilateralinterface1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedNumber](#quadrilateralinterface1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedBoolean](#quadrilateralinterface1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedMap](#quadrilateralinterface1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#quadrilateralinterfacemapbuilder) arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1BoxedList](#quadrilateralinterface1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [QuadrilateralInterface1Boxed](#quadrilateralinterface1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QuadrilateralInterfaceMap00Builder
public class QuadrilateralInterfaceMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterfaceMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, Void value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, boolean value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, String value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, int value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, float value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, long value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, double value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, List<?> value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | additionalProperty(String key, Map<String, ?> value) |

## QuadrilateralInterfaceMap01Builder
public class QuadrilateralInterfaceMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterfaceMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | shapeType(String value) |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | shapeType([StringShapeTypeEnums](#stringshapetypeenums) value) |

## QuadrilateralInterfaceMap10Builder
public class QuadrilateralInterfaceMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterfaceMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QuadrilateralInterfaceMap00Builder](#quadrilateralinterfacemap00builder) | quadrilateralType(String value) |

## QuadrilateralInterfaceMapBuilder
public class QuadrilateralInterfaceMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuadrilateralInterfaceMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QuadrilateralInterfaceMap01Builder](#quadrilateralinterfacemap01builder) | quadrilateralType(String value) |
| [QuadrilateralInterfaceMap10Builder](#quadrilateralinterfacemap10builder) | shapeType(String value) |
| [QuadrilateralInterfaceMap10Builder](#quadrilateralinterfacemap10builder) | shapeType([StringShapeTypeEnums](#stringshapetypeenums) value) |

## QuadrilateralInterfaceMap
public static class QuadrilateralInterfaceMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QuadrilateralInterfaceMap](#quadrilateralinterfacemap) | of([Map<String, ? extends @Nullable Object>](#quadrilateralinterfacemapbuilder) arg, SchemaConfiguration configuration) |
| String | quadrilateralType()<br> |
| String | shapeType()<br> must be one of ["Quadrilateral"] |
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
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ShapeTypeBoxed
public sealed interface ShapeTypeBoxed<br>
permits<br>
[ShapeTypeBoxedString](#shapetypeboxedstring)

sealed interface that stores validated payloads using boxed classes

## ShapeTypeBoxedString
public record ShapeTypeBoxedString<br>
implements [ShapeTypeBoxed](#shapetypeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
String validatedPayload = QuadrilateralInterface.ShapeType.validate(
    "Quadrilateral",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"Quadrilateral"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringShapeTypeEnums](#stringshapetypeenums) arg, SchemaConfiguration configuration) |
| [ShapeTypeBoxedString](#shapetypeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ShapeTypeBoxed](#shapetypeboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringShapeTypeEnums
public enum StringShapeTypeEnums<br>
extends `Enum<StringShapeTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| QUADRILATERAL | value = "Quadrilateral" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
