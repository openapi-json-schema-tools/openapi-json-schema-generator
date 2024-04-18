# RequiredWithEscapedCharacters
unit_test_api.components.schemas.RequiredWithEscapedCharacters.java
public class RequiredWithEscapedCharacters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)<br> sealed interface for validated payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedVoid](#requiredwithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedBoolean](#requiredwithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedNumber](#requiredwithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedString](#requiredwithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedList](#requiredwithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedMap](#requiredwithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1](#requiredwithescapedcharacters1)<br> schema class |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMapBuilder](#requiredwithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap)<br> output class for Map payloads |

## RequiredWithEscapedCharacters1Boxed
public sealed interface RequiredWithEscapedCharacters1Boxed<br>
permits<br>
[RequiredWithEscapedCharacters1BoxedVoid](#requiredwithescapedcharacters1boxedvoid),
[RequiredWithEscapedCharacters1BoxedBoolean](#requiredwithescapedcharacters1boxedboolean),
[RequiredWithEscapedCharacters1BoxedNumber](#requiredwithescapedcharacters1boxednumber),
[RequiredWithEscapedCharacters1BoxedString](#requiredwithescapedcharacters1boxedstring),
[RequiredWithEscapedCharacters1BoxedList](#requiredwithescapedcharacters1boxedlist),
[RequiredWithEscapedCharacters1BoxedMap](#requiredwithescapedcharacters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredWithEscapedCharacters1BoxedVoid
public record RequiredWithEscapedCharacters1BoxedVoid<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1BoxedBoolean
public record RequiredWithEscapedCharacters1BoxedBoolean<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1BoxedNumber
public record RequiredWithEscapedCharacters1BoxedNumber<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1BoxedString
public record RequiredWithEscapedCharacters1BoxedString<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1BoxedList
public record RequiredWithEscapedCharacters1BoxedList<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1BoxedMap
public record RequiredWithEscapedCharacters1BoxedMap<br>
implements [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedMap([RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredWithEscapedCharacters1
public static class RequiredWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\tbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\nbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\fbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\rbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\\bar"<br>)<br> |

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
| [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | validate([Map&lt;?, ?&gt;](#requiredwithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedString](#requiredwithescapedcharacters1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedVoid](#requiredwithescapedcharacters1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedNumber](#requiredwithescapedcharacters1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedBoolean](#requiredwithescapedcharacters1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedMap](#requiredwithescapedcharacters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#requiredwithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1BoxedList](#requiredwithescapedcharacters1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## RequiredWithEscapedCharactersMap000000Builder
public class RequiredWithEscapedCharactersMap000000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000001Builder
public class RequiredWithEscapedCharactersMap000001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000010Builder
public class RequiredWithEscapedCharactersMap000010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000011Builder
public class RequiredWithEscapedCharactersMap000011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000100Builder
public class RequiredWithEscapedCharactersMap000100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000101Builder
public class RequiredWithEscapedCharactersMap000101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000110Builder
public class RequiredWithEscapedCharactersMap000110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap000111Builder
public class RequiredWithEscapedCharactersMap000111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap000111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001000Builder
public class RequiredWithEscapedCharactersMap001000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusFbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001001Builder
public class RequiredWithEscapedCharactersMap001001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001010Builder
public class RequiredWithEscapedCharactersMap001010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001011Builder
public class RequiredWithEscapedCharactersMap001011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001100Builder
public class RequiredWithEscapedCharactersMap001100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001101Builder
public class RequiredWithEscapedCharactersMap001101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001110Builder
public class RequiredWithEscapedCharactersMap001110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap001111Builder
public class RequiredWithEscapedCharactersMap001111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap001111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010000Builder
public class RequiredWithEscapedCharactersMap010000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusNbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010001Builder
public class RequiredWithEscapedCharactersMap010001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010010Builder
public class RequiredWithEscapedCharactersMap010010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010011Builder
public class RequiredWithEscapedCharactersMap010011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010100Builder
public class RequiredWithEscapedCharactersMap010100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010101Builder
public class RequiredWithEscapedCharactersMap010101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010110Builder
public class RequiredWithEscapedCharactersMap010110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap010111Builder
public class RequiredWithEscapedCharactersMap010111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap010111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011000Builder
public class RequiredWithEscapedCharactersMap011000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusFbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011001Builder
public class RequiredWithEscapedCharactersMap011001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011010Builder
public class RequiredWithEscapedCharactersMap011010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011011Builder
public class RequiredWithEscapedCharactersMap011011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011100Builder
public class RequiredWithEscapedCharactersMap011100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011101Builder
public class RequiredWithEscapedCharactersMap011101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011110Builder
public class RequiredWithEscapedCharactersMap011110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap011111Builder
public class RequiredWithEscapedCharactersMap011111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap011111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100000Builder
public class RequiredWithEscapedCharactersMap100000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | fooReverseSolidusTbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100001Builder
public class RequiredWithEscapedCharactersMap100001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100010Builder
public class RequiredWithEscapedCharactersMap100010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100011Builder
public class RequiredWithEscapedCharactersMap100011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100100Builder
public class RequiredWithEscapedCharactersMap100100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100101Builder
public class RequiredWithEscapedCharactersMap100101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100110Builder
public class RequiredWithEscapedCharactersMap100110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap100111Builder
public class RequiredWithEscapedCharactersMap100111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap100111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101000Builder
public class RequiredWithEscapedCharactersMap101000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusFbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101001Builder
public class RequiredWithEscapedCharactersMap101001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101010Builder
public class RequiredWithEscapedCharactersMap101010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101011Builder
public class RequiredWithEscapedCharactersMap101011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101100Builder
public class RequiredWithEscapedCharactersMap101100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101101Builder
public class RequiredWithEscapedCharactersMap101101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101110Builder
public class RequiredWithEscapedCharactersMap101110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap101111Builder
public class RequiredWithEscapedCharactersMap101111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap101111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110000Builder
public class RequiredWithEscapedCharactersMap110000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | fooReverseSolidusNbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110001Builder
public class RequiredWithEscapedCharactersMap110001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110010Builder
public class RequiredWithEscapedCharactersMap110010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110011Builder
public class RequiredWithEscapedCharactersMap110011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110100Builder
public class RequiredWithEscapedCharactersMap110100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110101Builder
public class RequiredWithEscapedCharactersMap110101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110110Builder
public class RequiredWithEscapedCharactersMap110110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap110111Builder
public class RequiredWithEscapedCharactersMap110111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap110111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111000Builder
public class RequiredWithEscapedCharactersMap111000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | fooReverseSolidusFbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111001Builder
public class RequiredWithEscapedCharactersMap111001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111010Builder
public class RequiredWithEscapedCharactersMap111010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111011Builder
public class RequiredWithEscapedCharactersMap111011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111100Builder
public class RequiredWithEscapedCharactersMap111100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | fooReverseSolidusRbar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111101Builder
public class RequiredWithEscapedCharactersMap111101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap111110Builder
public class RequiredWithEscapedCharactersMap111110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMap111110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMapBuilder
public class RequiredWithEscapedCharactersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | fooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | fooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | fooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | fooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | fooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | fooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap
public static class RequiredWithEscapedCharactersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | of([Map<String, ? extends @Nullable Object>](#requiredwithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\tbar"], instance["foo\nbar"], instance["foo\fbar"], instance["foo\rbar"], instance["foo\&quot;bar"], instance["foo\\bar"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
