# RouteParamSchema0
public class RouteParamSchema0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RouteParamSchema0.RouteParamSchema01Boxed](#routeparamschema01boxed)<br> sealed interface for validated payloads |
| record | [RouteParamSchema0.RouteParamSchema01BoxedString](#routeparamschema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [RouteParamSchema0.RouteParamSchema01](#routeparamschema01)<br> schema class |
| enum | [RouteParamSchema0.StringRouteParamSchemaEnums0](#stringrouteparamschemaenums0)<br>String enum |

## RouteParamSchema01Boxed
public sealed interface RouteParamSchema01Boxed<br>
permits<br>
[RouteParamSchema01BoxedString](#routeparamschema01boxedstring)

sealed interface that stores validated payloads using boxed classes

## RouteParamSchema01BoxedString
public record RouteParamSchema01BoxedString<br>
implements [RouteParamSchema01Boxed](#routeparamschema01boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RouteParamSchema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RouteParamSchema01
public static class RouteParamSchema01<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.routeparameter0.RouteParamSchema0;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = RouteParamSchema0.RouteParamSchema01.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"a",<br>&nbsp;&nbsp;&nbsp;&nbsp;"b"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringRouteParamSchemaEnums0](#stringrouteparamschemaenums0) arg, SchemaConfiguration configuration) |
| [RouteParamSchema01BoxedString](#routeparamschema01boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RouteParamSchema01Boxed](#routeparamschema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringRouteParamSchemaEnums0
public enum StringRouteParamSchemaEnums0<br>
extends `Enum<StringRouteParamSchemaEnums0>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| A | value = "a" |
| B | value = "b" |
