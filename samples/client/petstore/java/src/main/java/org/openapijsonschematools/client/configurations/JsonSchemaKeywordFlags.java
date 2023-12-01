package org.openapijsonschematools.client.configurations;

import java.util.LinkedHashSet;

public record JsonSchemaKeywordFlags(
        boolean additionalProperties,
        boolean allOf,
        boolean anyOf,
        boolean const_,
        boolean contains,
        boolean dependentRequired,
        boolean dependentSchemas,
        boolean discriminator,
        boolean else_,
        boolean enum_,
        boolean exclusiveMaximum,
        boolean exclusiveMinimum,
        boolean format,
        boolean if_,
        boolean maximum,
        boolean minimum,
        boolean items,
        boolean maxContains,
        boolean maxItems,
        boolean maxLength,
        boolean maxProperties,
        boolean minContains,
        boolean minItems,
        boolean minLength,
        boolean minProperties,
        boolean multipleOf,
        boolean not,
        boolean oneOf,
        boolean pattern,
        boolean patternProperties,
        boolean prefixItems,
        boolean properties,
        boolean propertyNames,
        boolean required,
        boolean then,
        boolean type,
        boolean uniqueItems,
        boolean unevaluatedItems,
        boolean unevaluatedProperties
    ) {

    public static JsonSchemaKeywordFlags ofNone() {
        return new JsonSchemaKeywordFlags(
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false
        );
    }

    public LinkedHashSet<String> getKeywords() {
        LinkedHashSet<String> enabledKeywords = new LinkedHashSet<>();
        if (additionalProperties) { enabledKeywords.add("additionalProperties"); }
        if (allOf) { enabledKeywords.add("allOf"); }
        if (anyOf) { enabledKeywords.add("anyOf"); }
        if (const_) { enabledKeywords.add("const_"); }
        if (contains) { enabledKeywords.add("contains"); }
        if (dependentRequired) { enabledKeywords.add("dependentRequired"); }
        if (dependentSchemas) { enabledKeywords.add("dependentSchemas"); }
        if (discriminator) { enabledKeywords.add("discriminator"); }
        if (else_) { enabledKeywords.add("else_"); }
        if (enum_) { enabledKeywords.add("enum_"); }
        if (exclusiveMaximum) { enabledKeywords.add("exclusiveMaximum"); }
        if (exclusiveMinimum) { enabledKeywords.add("exclusiveMinimum"); }
        if (format) { enabledKeywords.add("format"); }
        if (if_) { enabledKeywords.add("if_"); }
        if (maximum) { enabledKeywords.add("maximum"); }
        if (minimum) { enabledKeywords.add("minimum"); }
        if (items) { enabledKeywords.add("items"); }
        if (maxContains) { enabledKeywords.add("maxContains"); }
        if (maxItems) { enabledKeywords.add("maxItems"); }
        if (maxLength) { enabledKeywords.add("maxLength"); }
        if (maxProperties) { enabledKeywords.add("maxProperties"); }
        if (minContains) { enabledKeywords.add("minContains"); }
        if (minItems) { enabledKeywords.add("minItems"); }
        if (minLength) { enabledKeywords.add("minLength"); }
        if (minProperties) { enabledKeywords.add("minProperties"); }
        if (multipleOf) { enabledKeywords.add("multipleOf"); }
        if (not) { enabledKeywords.add("not"); }
        if (oneOf) { enabledKeywords.add("oneOf"); }
        if (pattern) { enabledKeywords.add("pattern"); }
        if (patternProperties) { enabledKeywords.add("patternProperties"); }
        if (prefixItems) { enabledKeywords.add("prefixItems"); }
        if (properties) { enabledKeywords.add("properties"); }
        if (propertyNames) { enabledKeywords.add("propertyNames"); }
        if (required) { enabledKeywords.add("required"); }
        if (then) { enabledKeywords.add("then"); }
        if (type) { enabledKeywords.add("type"); }
        if (uniqueItems) { enabledKeywords.add("uniqueItems"); }
        if (unevaluatedItems) { enabledKeywords.add("unevaluatedItems"); }
        if (unevaluatedProperties) { enabledKeywords.add("unevaluatedProperties"); }
        return enabledKeywords;
    }
}