# PathParamSchema0
public class PathParamSchema0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PathParamSchema0.PathParamSchema01Boxed](#pathparamschema01boxed)<br> sealed interface for validated payloads |
| record | [PathParamSchema0.PathParamSchema01BoxedString](#pathparamschema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [PathParamSchema0.PathParamSchema01](#pathparamschema01)<br> schema class |
| enum | [PathParamSchema0.StringPathParamSchemaEnums0](#stringpathparamschemaenums0)<br>String enum |

## PathParamSchema01Boxed
public sealed interface PathParamSchema01Boxed<br>
permits<br>
[PathParamSchema01BoxedString](#pathparamschema01boxedstring)

sealed interface that stores validated payloads using boxed classes

## PathParamSchema01BoxedString
public record PathParamSchema01BoxedString<br>
implements [PathParamSchema01Boxed](#pathparamschema01boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParamSchema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PathParamSchema01
public static class PathParamSchema01<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.routeparameter0.PathParamSchema0;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = PathParamSchema0.PathParamSchema01.validate(
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
| String | validate([StringPathParamSchemaEnums0](#stringpathparamschemaenums0) arg, SchemaConfiguration configuration) |
| [PathParamSchema01BoxedString](#pathparamschema01boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PathParamSchema01Boxed](#pathparamschema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringPathParamSchemaEnums0
public enum StringPathParamSchemaEnums0<br>
extends `Enum<StringPathParamSchemaEnums0>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| A | value = "a" |
| B | value = "b" |
