# RequiredWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.RequiredWithEscapedCharacters.java
public class RequiredWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)<br> abstract sealed validated payload class |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedVoid](#requiredwithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedBoolean](#requiredwithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedNumber](#requiredwithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedString](#requiredwithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedList](#requiredwithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1BoxedMap](#requiredwithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1](#requiredwithescapedcharacters1)<br> schema class |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMapBuilder](#requiredwithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap)<br> output class for Map payloads |

## RequiredWithEscapedCharacters1Boxed
public static abstract sealed class RequiredWithEscapedCharacters1Boxed<br>
permits<br>
[RequiredWithEscapedCharacters1BoxedVoid](#requiredwithescapedcharacters1boxedvoid),
[RequiredWithEscapedCharacters1BoxedBoolean](#requiredwithescapedcharacters1boxedboolean),
[RequiredWithEscapedCharacters1BoxedNumber](#requiredwithescapedcharacters1boxednumber),
[RequiredWithEscapedCharacters1BoxedString](#requiredwithescapedcharacters1boxedstring),
[RequiredWithEscapedCharacters1BoxedList](#requiredwithescapedcharacters1boxedlist),
[RequiredWithEscapedCharacters1BoxedMap](#requiredwithescapedcharacters1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RequiredWithEscapedCharacters1BoxedVoid
public static final class RequiredWithEscapedCharacters1BoxedVoid<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RequiredWithEscapedCharacters1BoxedBoolean
public static final class RequiredWithEscapedCharacters1BoxedBoolean<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RequiredWithEscapedCharacters1BoxedNumber
public static final class RequiredWithEscapedCharacters1BoxedNumber<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RequiredWithEscapedCharacters1BoxedString
public static final class RequiredWithEscapedCharacters1BoxedString<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RequiredWithEscapedCharacters1BoxedList
public static final class RequiredWithEscapedCharacters1BoxedList<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RequiredWithEscapedCharacters1BoxedMap
public static final class RequiredWithEscapedCharacters1BoxedMap<br>
extends [RequiredWithEscapedCharacters1Boxed](#requiredwithescapedcharacters1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters1BoxedMap([RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | data<br>validated payload |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusFbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusNbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusFbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000000Builder](#requiredwithescapedcharactersmap000000builder) | setFooReverseSolidusTbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000001Builder](#requiredwithescapedcharactersmap000001builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000010Builder](#requiredwithescapedcharactersmap000010builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000011Builder](#requiredwithescapedcharactersmap000011builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000100Builder](#requiredwithescapedcharactersmap000100builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000101Builder](#requiredwithescapedcharactersmap000101builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000110Builder](#requiredwithescapedcharactersmap000110builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap000111Builder](#requiredwithescapedcharactersmap000111builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001000Builder](#requiredwithescapedcharactersmap001000builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusFbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001001Builder](#requiredwithescapedcharactersmap001001builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001010Builder](#requiredwithescapedcharactersmap001010builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001011Builder](#requiredwithescapedcharactersmap001011builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001100Builder](#requiredwithescapedcharactersmap001100builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001101Builder](#requiredwithescapedcharactersmap001101builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001110Builder](#requiredwithescapedcharactersmap001110builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap001111Builder](#requiredwithescapedcharactersmap001111builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010000Builder](#requiredwithescapedcharactersmap010000builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100000Builder](#requiredwithescapedcharactersmap100000builder) | setFooReverseSolidusNbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010001Builder](#requiredwithescapedcharactersmap010001builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100001Builder](#requiredwithescapedcharactersmap100001builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010010Builder](#requiredwithescapedcharactersmap010010builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100010Builder](#requiredwithescapedcharactersmap100010builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010011Builder](#requiredwithescapedcharactersmap010011builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100011Builder](#requiredwithescapedcharactersmap100011builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010100Builder](#requiredwithescapedcharactersmap010100builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100100Builder](#requiredwithescapedcharactersmap100100builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010101Builder](#requiredwithescapedcharactersmap010101builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100101Builder](#requiredwithescapedcharactersmap100101builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010110Builder](#requiredwithescapedcharactersmap010110builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100110Builder](#requiredwithescapedcharactersmap100110builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap010111Builder](#requiredwithescapedcharactersmap010111builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap100111Builder](#requiredwithescapedcharactersmap100111builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011000Builder](#requiredwithescapedcharactersmap011000builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101000Builder](#requiredwithescapedcharactersmap101000builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110000Builder](#requiredwithescapedcharactersmap110000builder) | setFooReverseSolidusFbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011001Builder](#requiredwithescapedcharactersmap011001builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101001Builder](#requiredwithescapedcharactersmap101001builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110001Builder](#requiredwithescapedcharactersmap110001builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011010Builder](#requiredwithescapedcharactersmap011010builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101010Builder](#requiredwithescapedcharactersmap101010builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110010Builder](#requiredwithescapedcharactersmap110010builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011011Builder](#requiredwithescapedcharactersmap011011builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101011Builder](#requiredwithescapedcharactersmap101011builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110011Builder](#requiredwithescapedcharactersmap110011builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011100Builder](#requiredwithescapedcharactersmap011100builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101100Builder](#requiredwithescapedcharactersmap101100builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110100Builder](#requiredwithescapedcharactersmap110100builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111000Builder](#requiredwithescapedcharactersmap111000builder) | setFooReverseSolidusRbar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011101Builder](#requiredwithescapedcharactersmap011101builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101101Builder](#requiredwithescapedcharactersmap101101builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110101Builder](#requiredwithescapedcharactersmap110101builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111001Builder](#requiredwithescapedcharactersmap111001builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011110Builder](#requiredwithescapedcharactersmap011110builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101110Builder](#requiredwithescapedcharactersmap101110builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110110Builder](#requiredwithescapedcharactersmap110110builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111010Builder](#requiredwithescapedcharactersmap111010builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111100Builder](#requiredwithescapedcharactersmap111100builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

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
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(Void value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(boolean value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(String value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(int value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(float value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(long value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(double value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(List<?> value) |
| [RequiredWithEscapedCharactersMap011111Builder](#requiredwithescapedcharactersmap011111builder) | setFooReverseSolidusTbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(Void value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(boolean value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(String value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(int value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(float value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(long value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(double value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(List<?> value) |
| [RequiredWithEscapedCharactersMap101111Builder](#requiredwithescapedcharactersmap101111builder) | setFooReverseSolidusNbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(Void value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(boolean value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(String value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(int value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(float value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(long value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(double value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(List<?> value) |
| [RequiredWithEscapedCharactersMap110111Builder](#requiredwithescapedcharactersmap110111builder) | setFooReverseSolidusFbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(Void value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(boolean value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(String value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(int value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(float value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(long value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(double value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(List<?> value) |
| [RequiredWithEscapedCharactersMap111011Builder](#requiredwithescapedcharactersmap111011builder) | setFooReverseSolidusRbar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111101Builder](#requiredwithescapedcharactersmap111101builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(Void value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(boolean value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(String value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| [RequiredWithEscapedCharactersMap111110Builder](#requiredwithescapedcharactersmap111110builder) | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

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
