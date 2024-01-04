# RequiredWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.RequiredWithEscapedCharacters.java
public class RequiredWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1](#requiredwithescapedcharacters1)<br> schema class |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMapBuilder](#requiredwithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [RequiredWithEscapedCharacters.RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap)<br> output class for Map payloads |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | validate([Map&lt;?, ?&gt;](#requiredwithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredWithEscapedCharacters000000MapBuilder
public class RequiredWithEscapedCharacters000000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |
## RequiredWithEscapedCharacters000001MapBuilder
public class RequiredWithEscapedCharacters000001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000010MapBuilder
public class RequiredWithEscapedCharacters000010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000011MapBuilder
public class RequiredWithEscapedCharacters000011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000100MapBuilder
public class RequiredWithEscapedCharacters000100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000101MapBuilder
public class RequiredWithEscapedCharacters000101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000110MapBuilder
public class RequiredWithEscapedCharacters000110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters000111MapBuilder
public class RequiredWithEscapedCharacters000111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters000111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001000MapBuilder
public class RequiredWithEscapedCharacters001000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001001MapBuilder
public class RequiredWithEscapedCharacters001001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001010MapBuilder
public class RequiredWithEscapedCharacters001010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001011MapBuilder
public class RequiredWithEscapedCharacters001011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001100MapBuilder
public class RequiredWithEscapedCharacters001100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001101MapBuilder
public class RequiredWithEscapedCharacters001101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001110MapBuilder
public class RequiredWithEscapedCharacters001110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters001111MapBuilder
public class RequiredWithEscapedCharacters001111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters001111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010000MapBuilder
public class RequiredWithEscapedCharacters010000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010001MapBuilder
public class RequiredWithEscapedCharacters010001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010010MapBuilder
public class RequiredWithEscapedCharacters010010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010011MapBuilder
public class RequiredWithEscapedCharacters010011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010100MapBuilder
public class RequiredWithEscapedCharacters010100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010101MapBuilder
public class RequiredWithEscapedCharacters010101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010110MapBuilder
public class RequiredWithEscapedCharacters010110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters010111MapBuilder
public class RequiredWithEscapedCharacters010111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters010111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011000MapBuilder
public class RequiredWithEscapedCharacters011000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011001MapBuilder
public class RequiredWithEscapedCharacters011001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011010MapBuilder
public class RequiredWithEscapedCharacters011010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011011MapBuilder
public class RequiredWithEscapedCharacters011011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011100MapBuilder
public class RequiredWithEscapedCharacters011100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011101MapBuilder
public class RequiredWithEscapedCharacters011101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011110MapBuilder
public class RequiredWithEscapedCharacters011110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters011111MapBuilder
public class RequiredWithEscapedCharacters011111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters011111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100000MapBuilder
public class RequiredWithEscapedCharacters100000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000000MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100001MapBuilder
public class RequiredWithEscapedCharacters100001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000001MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100010MapBuilder
public class RequiredWithEscapedCharacters100010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000010MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100011MapBuilder
public class RequiredWithEscapedCharacters100011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000011MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100100MapBuilder
public class RequiredWithEscapedCharacters100100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000100MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100101MapBuilder
public class RequiredWithEscapedCharacters100101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000101MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100110MapBuilder
public class RequiredWithEscapedCharacters100110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000110MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters100111MapBuilder
public class RequiredWithEscapedCharacters100111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters100111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters000111MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101000MapBuilder
public class RequiredWithEscapedCharacters101000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001000MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101001MapBuilder
public class RequiredWithEscapedCharacters101001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001001MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101010MapBuilder
public class RequiredWithEscapedCharacters101010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001010MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101011MapBuilder
public class RequiredWithEscapedCharacters101011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001011MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101100MapBuilder
public class RequiredWithEscapedCharacters101100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001100MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101101MapBuilder
public class RequiredWithEscapedCharacters101101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001101MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101110MapBuilder
public class RequiredWithEscapedCharacters101110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001110MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters101111MapBuilder
public class RequiredWithEscapedCharacters101111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters101111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters001111MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110000MapBuilder
public class RequiredWithEscapedCharacters110000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010000MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100000MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110001MapBuilder
public class RequiredWithEscapedCharacters110001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010001MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100001MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110010MapBuilder
public class RequiredWithEscapedCharacters110010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010010MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100010MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110011MapBuilder
public class RequiredWithEscapedCharacters110011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010011MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100011MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110100MapBuilder
public class RequiredWithEscapedCharacters110100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010100MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100100MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110101MapBuilder
public class RequiredWithEscapedCharacters110101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010101MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100101MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110110MapBuilder
public class RequiredWithEscapedCharacters110110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010110MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100110MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters110111MapBuilder
public class RequiredWithEscapedCharacters110111MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters110111MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters010111MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters100111MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111000MapBuilder
public class RequiredWithEscapedCharacters111000MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111000MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011000MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101000MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110000MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111001MapBuilder
public class RequiredWithEscapedCharacters111001MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111001MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011001MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101001MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110001MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111010MapBuilder
public class RequiredWithEscapedCharacters111010MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111010MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011010MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101010MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110010MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111011MapBuilder
public class RequiredWithEscapedCharacters111011MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111011MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011011MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101011MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110011MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111100MapBuilder
public class RequiredWithEscapedCharacters111100MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111100MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011100MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101100MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110100MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters111000MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111101MapBuilder
public class RequiredWithEscapedCharacters111101MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111101MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011101MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101101MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110101MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters111001MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |
## RequiredWithEscapedCharacters111110MapBuilder
public class RequiredWithEscapedCharacters111110MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharacters111110MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011110MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101110MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110110MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters111010MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters111100MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
## RequiredWithEscapedCharactersMapBuilder
public class RequiredWithEscapedCharactersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEscapedCharactersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(Void value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(boolean value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(String value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(int value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(float value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(long value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(double value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(List<?> value) |
| RequiredWithEscapedCharacters011111MapBuilder | setFooReverseSolidusTbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(Void value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(boolean value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(String value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(int value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(float value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(long value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(double value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(List<?> value) |
| RequiredWithEscapedCharacters101111MapBuilder | setFooReverseSolidusNbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(Void value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(boolean value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(String value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(int value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(float value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(long value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(double value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(List<?> value) |
| RequiredWithEscapedCharacters110111MapBuilder | setFooReverseSolidusFbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(Void value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(boolean value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(String value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(int value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(float value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(long value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(double value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(List<?> value) |
| RequiredWithEscapedCharacters111011MapBuilder | setFooReverseSolidusRbar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(Void value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(boolean value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(String value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(int value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(float value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(long value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(double value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| RequiredWithEscapedCharacters111101MapBuilder | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(Void value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(boolean value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(String value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(int value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(float value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(long value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(double value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(List<?> value) |
| RequiredWithEscapedCharacters111110MapBuilder | setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) |

## RequiredWithEscapedCharactersMap
public static class RequiredWithEscapedCharactersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEscapedCharactersMap](#requiredwithescapedcharactersmap) | of([Map<String, ? extends @Nullable Object>](#requiredwithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\tbar"], instance["foo\nbar"], instance["foo\fbar"], instance["foo\rbar"], instance["foo\&quot;bar"], instance["foo\\bar"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
