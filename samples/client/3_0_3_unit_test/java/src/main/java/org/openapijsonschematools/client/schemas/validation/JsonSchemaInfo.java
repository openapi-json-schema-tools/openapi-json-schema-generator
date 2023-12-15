package org.openapijsonschematools.client.schemas.validation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class JsonSchemaInfo {
    public Set<Class<?>> type;
    public String format;
    public Class<? extends JsonSchema> items;
    public Map<String, Class<? extends JsonSchema>> properties;
    public Set<String> required;
    public Number exclusiveMaximum;
    public Number exclusiveMinimum;
    public Integer maxItems;
    public Integer minItems;
    public Integer maxLength;
    public Integer minLength;
    public Integer maxProperties;
    public Integer minProperties;
    public Number maximum;
    public Number minimum;
    public BigDecimal multipleOf;
    public Class<? extends JsonSchema> additionalProperties;
    public List<Class<? extends JsonSchema>> allOf;
    public List<Class<? extends JsonSchema>> anyOf;
    public List<Class<? extends JsonSchema>> oneOf;
    public Class<? extends JsonSchema> not;
    public Boolean uniqueItems;
    public Set<Object> enumValues;
    public Pattern pattern;
}
