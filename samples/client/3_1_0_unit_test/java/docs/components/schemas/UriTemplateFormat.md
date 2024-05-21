# UriTemplateFormat
unit_test_api.components.schemas.UriTemplateFormat.java
public class UriTemplateFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriTemplateFormat.UriTemplateFormat1Boxed](#uritemplateformat1boxed)<br> sealed interface for validated payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriTemplateFormat.UriTemplateFormat1](#uritemplateformat1)<br> schema class |

## UriTemplateFormat1Boxed
public sealed interface UriTemplateFormat1Boxed<br>
permits<br>
[UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid),
[UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean),
[UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber),
[UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring),
[UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist),
[UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriTemplateFormat1BoxedVoid
public record UriTemplateFormat1BoxedVoid<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1BoxedBoolean
public record UriTemplateFormat1BoxedBoolean<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1BoxedNumber
public record UriTemplateFormat1BoxedNumber<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1BoxedString
public record UriTemplateFormat1BoxedString<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1BoxedList
public record UriTemplateFormat1BoxedList<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1BoxedMap
public record UriTemplateFormat1BoxedMap<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriTemplateFormat1
public static class UriTemplateFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri-template"; |

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
| [UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UriTemplateFormat1Boxed](#uritemplateformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
