# ObjectWithOnlyOptionalProps
org.openapijsonschematools.client.components.schemas.ObjectWithOnlyOptionalProps.java
public class ObjectWithOnlyOptionalProps<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1Boxed](#objectwithonlyoptionalprops1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1](#objectwithonlyoptionalprops1)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap)<br> output class for Map payloads |
| sealed interface | [ObjectWithOnlyOptionalProps.ArrayPropertyBoxed](#arraypropertyboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOnlyOptionalProps.ArrayPropertyBoxedVoid](#arraypropertyboxedvoid)<br> boxed class to store validated null payloads |
| record | [ObjectWithOnlyOptionalProps.ArrayPropertyBoxedList](#arraypropertyboxedlist)<br> boxed class to store validated List payloads |
| static class | [ObjectWithOnlyOptionalProps.ArrayProperty](#arrayproperty)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ArrayPropertyListBuilder](#arraypropertylistbuilder)<br> builder for List payloads |
| static class | [ObjectWithOnlyOptionalProps.ArrayPropertyList](#arraypropertylist)<br> output class for List payloads |
| sealed interface | [ObjectWithOnlyOptionalProps.BBoxed](#bboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOnlyOptionalProps.BBoxedNumber](#bboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithOnlyOptionalProps.B](#b)<br> schema class |
| sealed interface | [ObjectWithOnlyOptionalProps.ABoxed](#aboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOnlyOptionalProps.ABoxedString](#aboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithOnlyOptionalProps.A](#a)<br> schema class |
| sealed interface | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [ObjectWithOnlyOptionalProps.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithOnlyOptionalProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithOnlyOptionalProps1Boxed
public sealed interface ObjectWithOnlyOptionalProps1Boxed<br>
permits<br>
[ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithOnlyOptionalProps1BoxedMap
public record ObjectWithOnlyOptionalProps1BoxedMap<br>
implements [ObjectWithOnlyOptionalProps1Boxed](#objectwithonlyoptionalprops1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOnlyOptionalProps1BoxedMap([ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectWithOnlyOptionalProps1
public static class ObjectWithOnlyOptionalProps1<br>
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
import org.openapijsonschematools.client.components.schemas.ObjectWithOnlyOptionalProps;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap validatedPayload =
    ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1.validate(
    new ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMapBuilder()
        .a("a")

        .b(1)

        .ArrayProperty(null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", [B.class](#b))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ArrayProperty", [ArrayProperty.class](#arrayproperty)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | validate([Map&lt;?, ?&gt;](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithOnlyOptionalProps1BoxedMap](#objectwithonlyoptionalprops1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithOnlyOptionalProps1Boxed](#objectwithonlyoptionalprops1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ObjectWithOnlyOptionalPropsMapBuilder
public class ObjectWithOnlyOptionalPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithOnlyOptionalPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | a(String value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(int value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(float value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(long value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | b(double value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | ArrayProperty(Void value) |
| [ObjectWithOnlyOptionalPropsMapBuilder](#objectwithonlyoptionalpropsmapbuilder) | ArrayProperty(List<String> value) |

## ObjectWithOnlyOptionalPropsMap
public static class ObjectWithOnlyOptionalPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | of([Map<String, ? extends @Nullable Object>](#objectwithonlyoptionalpropsmapbuilder) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |
| [ArrayPropertyList](#arraypropertylist) | ArrayProperty()<br>[optional] |

## ArrayPropertyBoxed
public sealed interface ArrayPropertyBoxed<br>
permits<br>
[ArrayPropertyBoxedVoid](#arraypropertyboxedvoid),
[ArrayPropertyBoxedList](#arraypropertyboxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayPropertyBoxedVoid
public record ArrayPropertyBoxedVoid<br>
implements [ArrayPropertyBoxed](#arraypropertyboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayPropertyBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayPropertyBoxedList
public record ArrayPropertyBoxedList<br>
implements [ArrayPropertyBoxed](#arraypropertyboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayPropertyBoxedList([ArrayPropertyList](#arraypropertylist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayPropertyList](#arraypropertylist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayProperty
public static class ArrayProperty<br>
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
import org.openapijsonschematools.client.components.schemas.ObjectWithOnlyOptionalProps;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// null validation
Void validatedPayload = ObjectWithOnlyOptionalProps.ArrayProperty.validate(
    (Void) null,
    configuration
);

// List validation
ObjectWithOnlyOptionalProps.ArrayPropertyList validatedPayload =
    ObjectWithOnlyOptionalProps.ArrayProperty.validate(
    new ObjectWithOnlyOptionalProps.ArrayPropertyListBuilder()
        .add("_abc")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;List.class<br/>)<br/> |
| Class<? extends JsonSchema> | items = [EnumClass.EnumClass1.class](../../components/schemas/EnumClass.md#enumclass1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [ArrayPropertyBoxedVoid](#arraypropertyboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ArrayPropertyList](#arraypropertylist) | validate([List<?>](#arraypropertylistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayPropertyBoxedList](#arraypropertyboxedlist) | validateAndBox([List<?>](#arraypropertylistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayPropertyBoxed](#arraypropertyboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayPropertyListBuilder
public class ArrayPropertyListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayPropertyListBuilder()<br>Creates an empty list |
| ArrayPropertyListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayPropertyListBuilder | add(String item) |
| ArrayPropertyListBuilder | add([EnumClass.StringEnumClassEnums](../../components/schemas/EnumClass.md#stringenumclassenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayPropertyList
public class ArrayPropertyList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayPropertyList](#arraypropertylist) | of([List<String>](#arraypropertylistbuilder) arg, SchemaConfiguration configuration) |

## BBoxed
public sealed interface BBoxed<br>
permits<br>
[BBoxedNumber](#bboxednumber)

sealed interface that stores validated payloads using boxed classes

## BBoxedNumber
public record BBoxedNumber<br>
implements [BBoxed](#bboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## B
public static class B<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ABoxed
public sealed interface ABoxed<br>
permits<br>
[ABoxedString](#aboxedstring)

sealed interface that stores validated payloads using boxed classes

## ABoxedString
public record ABoxedString<br>
implements [ABoxed](#aboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## A
public static class A<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
