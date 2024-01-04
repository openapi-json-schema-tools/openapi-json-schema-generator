# ObjectModelWithRefProps
org.openapijsonschematools.client.components.schemas.ObjectModelWithRefProps.java
public class ObjectModelWithRefProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectModelWithRefProps.ObjectModelWithRefProps1](#objectmodelwithrefprops1)<br> schema class |
| static class | [ObjectModelWithRefProps.ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder)<br> builder for Map payloads |
| static class | [ObjectModelWithRefProps.ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap)<br> output class for Map payloads |

## ObjectModelWithRefProps1
public static class ObjectModelWithRefProps1<br>
extends JsonSchema

A schema class that validates payloads

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

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
ObjectModelWithRefProps.ObjectModelWithRefPropsMap validatedPayload =
    ObjectModelWithRefProps.ObjectModelWithRefProps1.validate(
    MapUtils.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("myNumber", [NumberWithValidations.NumberWithValidations1.class](../../components/schemas/NumberWithValidations.md#numberwithvalidations1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("myString", [StringSchema.StringSchema1.class](../../components/schemas/StringSchema.md#stringschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("myBoolean", [BooleanSchema.BooleanSchema1.class](../../components/schemas/BooleanSchema.md#booleanschema1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap) | validate([Map&lt;?, ?&gt;](#objectmodelwithrefpropsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectModelWithRefPropsMapBuilder
public class ObjectModelWithRefPropsMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithRefPropsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(Void value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(boolean value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(String value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(int value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(float value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(long value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(double value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(List<?> value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myNumber(Map<String, ?> value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(Void value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(boolean value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(String value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(int value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(float value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(long value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(double value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(List<?> value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myString(Map<String, ?> value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(Void value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(boolean value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(String value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(int value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(float value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(long value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(double value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(List<?> value) |
| [ObjectModelWithRefPropsMapBuilder](#objectmodelwithrefpropsmapbuilder) | myBoolean(Map<String, ?> value) |

## ObjectModelWithRefPropsMap
public static class ObjectModelWithRefPropsMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap) | of([Map<String, ? extends @Nullable Object>](#objectmodelwithrefpropsmapbuilder) arg, SchemaConfiguration configuration) |
| Number | myNumber()<br>[optional] |
| String | myString()<br>[optional] |
| boolean | myBoolean()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
