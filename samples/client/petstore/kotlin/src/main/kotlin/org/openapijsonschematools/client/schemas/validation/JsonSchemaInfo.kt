package org.openapijsonschematools.client.schemas.validation;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class JsonSchemaInfo {
    public @Nullable Set<Class<?>> type = null;
    public JsonSchemaInfo type(Set<Class<?>> type) {
        this.type = type;
        return this;
    }
    public @Nullable String format = null;
    public JsonSchemaInfo format(String format) {
        this.format = format;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> items = null;
    public JsonSchemaInfo items(Class<? extends JsonSchema<?>> items) {
        this.items = items;
        return this;
    }
    public @Nullable Map<String, Class<? extends JsonSchema<?>>> properties = null;
    public JsonSchemaInfo properties(Map<String, Class<? extends JsonSchema<?>>> properties) {
        this.properties = properties;
        return this;
    }
    public @Nullable Set<String> required = null;
    public JsonSchemaInfo required(Set<String> required) {
        this.required = required;
        return this;
    }
    public @Nullable Number exclusiveMaximum = null;
    public JsonSchemaInfo exclusiveMaximum(Number exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public @Nullable Number exclusiveMinimum = null;
    public JsonSchemaInfo exclusiveMinimum(Number exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public @Nullable Integer maxItems = null;
    public JsonSchemaInfo maxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public @Nullable Integer minItems = null;
    public JsonSchemaInfo minItems(Integer minItems) {
        this.minItems = minItems;
        return this;
    }
    public @Nullable Integer maxLength = null;
    public JsonSchemaInfo maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public @Nullable Integer minLength = null;
    public JsonSchemaInfo minLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public @Nullable Integer maxProperties = null;
    public JsonSchemaInfo maxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
        return this;
    }
    public @Nullable Integer minProperties = null;
    public JsonSchemaInfo minProperties(Integer minProperties) {
        this.minProperties = minProperties;
        return this;
    }
    public @Nullable Number maximum = null;
    public JsonSchemaInfo maximum(Number maximum) {
        this.maximum = maximum;
        return this;
    }
    public @Nullable Number minimum = null;
    public JsonSchemaInfo minimum(Number minimum) {
        this.minimum = minimum;
        return this;
    }
    public @Nullable BigDecimal multipleOf = null;
    public JsonSchemaInfo multipleOf(BigDecimal multipleOf) {
        this.multipleOf = multipleOf;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> additionalProperties;
    public JsonSchemaInfo additionalProperties(Class<? extends JsonSchema<?>> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema<?>>> allOf = null;
    public JsonSchemaInfo allOf(List<Class<? extends JsonSchema<?>>> allOf) {
        this.allOf = allOf;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema<?>>> anyOf = null;
    public JsonSchemaInfo anyOf(List<Class<? extends JsonSchema<?>>> anyOf) {
        this.anyOf = anyOf;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema<?>>> oneOf = null;
    public JsonSchemaInfo oneOf(List<Class<? extends JsonSchema<?>>> oneOf) {
        this.oneOf = oneOf;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> not = null;
    public JsonSchemaInfo not(Class<? extends JsonSchema<?>> not) {
        this.not = not;
        return this;
    }
    public @Nullable Boolean uniqueItems = null;
    public JsonSchemaInfo uniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
        return this;
    }
    public @Nullable Set<@Nullable Object> enumValues = null;
    public JsonSchemaInfo enumValues(Set<@Nullable Object> enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public @Nullable Pattern pattern = null;
    public JsonSchemaInfo pattern(Pattern pattern) {
        this.pattern = pattern;
        return this;
    }
    public @Nullable Object defaultValue = null;
    public boolean defaultValueSet = false;
    public JsonSchemaInfo defaultValue(@Nullable Object defaultValue) {
        this.defaultValue = defaultValue;
        this.defaultValueSet = true;
        return this;
    }
    public @Nullable Object constValue = null;
    public boolean constValueSet = false;
    public JsonSchemaInfo constValue(@Nullable Object constValue) {
        this.constValue = constValue;
        this.constValueSet = true;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> contains = null;
    public JsonSchemaInfo contains(Class<? extends JsonSchema<?>> contains) {
        this.contains = contains;
        return this;
    }
    public @Nullable Integer maxContains = null;
    public JsonSchemaInfo maxContains(Integer maxContains) {
        this.maxContains = maxContains;
        return this;
    }
    public @Nullable Integer minContains = null;
    public JsonSchemaInfo minContains(Integer minContains) {
        this.minContains = minContains;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> propertyNames = null;
    public JsonSchemaInfo propertyNames(Class<? extends JsonSchema<?>> propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }
    public @Nullable Map<String, Set<String>> dependentRequired = null;
    public JsonSchemaInfo dependentRequired(Map<String, Set<String>> dependentRequired) {
        this.dependentRequired = dependentRequired;
        return this;
    }
    public @Nullable Map<String, Class<? extends JsonSchema<?>>> dependentSchemas = null;
    public JsonSchemaInfo dependentSchemas(Map<String, Class<? extends JsonSchema<?>>> dependentSchemas) {
        this.dependentSchemas = dependentSchemas;
        return this;
    }
    public @Nullable Map<Pattern, Class<? extends JsonSchema<?>>> patternProperties = null;
    public JsonSchemaInfo patternProperties(Map<Pattern, Class<? extends JsonSchema<?>>> patternProperties) {
        this.patternProperties = patternProperties;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema<?>>> prefixItems = null;
    public JsonSchemaInfo prefixItems(List<Class<? extends JsonSchema<?>>> prefixItems) {
        this.prefixItems = prefixItems;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> ifSchema = null;
    public JsonSchemaInfo ifSchema(Class<? extends JsonSchema<?>> ifSchema) {
        this.ifSchema = ifSchema;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> then = null;
    public JsonSchemaInfo then(Class<? extends JsonSchema<?>> then) {
        this.then = then;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> elseSchema = null;
    public JsonSchemaInfo elseSchema(Class<? extends JsonSchema<?>> elseSchema) {
        this.elseSchema = elseSchema;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> unevaluatedItems = null;
    public JsonSchemaInfo unevaluatedItems(Class<? extends JsonSchema<?>> unevaluatedItems) {
        this.unevaluatedItems = unevaluatedItems;
        return this;
    }
    public @Nullable Class<? extends JsonSchema<?>> unevaluatedProperties = null;
    public JsonSchemaInfo unevaluatedProperties(Class<? extends JsonSchema<?>> unevaluatedProperties) {
        this.unevaluatedProperties = unevaluatedProperties;
        return this;
    }
}