package org.openapijsonschematools.client.schemas.validation;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class JsonSchemaInfo {
    public @Nullable Set<Class<?>> type = null;
    public JsonSchemaInfo type(@NonNull Set<Class<?>> type) {
        this.type = type;
        return this;
    }
    public @Nullable String format = null;
    public JsonSchemaInfo format(@NonNull String format) {
        this.format = format;
        return this;
    }
    public @Nullable Class<? extends JsonSchema> items = null;
    public JsonSchemaInfo items(@NonNull Class<? extends JsonSchema> items) {
        this.items = items;
        return this;
    }
    public @Nullable Map<String, Class<? extends JsonSchema>> properties = null;
    public JsonSchemaInfo properties(@NonNull Map<String, Class<? extends JsonSchema>> properties) {
        this.properties = properties;
        return this;
    }
    public @Nullable Set<String> required = null;
    public JsonSchemaInfo required(@NonNull Set<String> required) {
        this.required = required;
        return this;
    }
    public @Nullable Number exclusiveMaximum = null;
    public JsonSchemaInfo exclusiveMaximum(@NonNull Number exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public @Nullable Number exclusiveMinimum = null;
    public JsonSchemaInfo exclusiveMinimum(@NonNull Number exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public @Nullable Integer maxItems = null;
    public JsonSchemaInfo maxItems(@NonNull Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public @Nullable Integer minItems = null;
    public JsonSchemaInfo minItems(@NonNull Integer minItems) {
        this.minItems = minItems;
        return this;
    }
    public @Nullable Integer maxLength = null;
    public JsonSchemaInfo maxLength(@NonNull Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public @Nullable Integer minLength = null;
    public JsonSchemaInfo minLength(@NonNull Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public @Nullable Integer maxProperties = null;
    public JsonSchemaInfo maxProperties(@NonNull Integer maxProperties) {
        this.maxProperties = maxProperties;
        return this;
    }
    public @Nullable Integer minProperties = null;
    public JsonSchemaInfo minProperties(@NonNull Integer minProperties) {
        this.minProperties = minProperties;
        return this;
    }
    public @Nullable Number maximum = null;
    public JsonSchemaInfo maximum(@NonNull Number maximum) {
        this.maximum = maximum;
        return this;
    }
    public @Nullable Number minimum = null;
    public JsonSchemaInfo minimum(@NonNull Number minimum) {
        this.minimum = minimum;
        return this;
    }
    public @Nullable BigDecimal multipleOf = null;
    public JsonSchemaInfo multipleOf(@NonNull BigDecimal multipleOf) {
        this.multipleOf = multipleOf;
        return this;
    }
    public @Nullable Class<? extends JsonSchema> additionalProperties;
    public JsonSchemaInfo additionalProperties(@NonNull Class<? extends JsonSchema> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema>> allOf = null;
    public JsonSchemaInfo allOf(@NonNull List<Class<? extends JsonSchema>> allOf) {
        this.allOf = allOf;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema>> anyOf = null;
    public JsonSchemaInfo anyOf(@NonNull List<Class<? extends JsonSchema>> anyOf) {
        this.anyOf = anyOf;
        return this;
    }
    public @Nullable List<Class<? extends JsonSchema>> oneOf = null;
    public JsonSchemaInfo oneOf(@NonNull List<Class<? extends JsonSchema>> oneOf) {
        this.oneOf = oneOf;
        return this;
    }
    public @Nullable Class<? extends JsonSchema> not = null;
    public JsonSchemaInfo not(@NonNull Class<? extends JsonSchema> not) {
        this.not = not;
        return this;
    }
    public @Nullable Boolean uniqueItems = null;
    public JsonSchemaInfo uniqueItems(@NonNull Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
        return this;
    }
    public @Nullable Set<Object> enumValues = null;
    public JsonSchemaInfo enumValues(@NonNull Set<Object> enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public @Nullable Pattern pattern = null;
    public JsonSchemaInfo pattern(@NonNull Pattern pattern) {
        this.pattern = pattern;
        return this;
    }
}