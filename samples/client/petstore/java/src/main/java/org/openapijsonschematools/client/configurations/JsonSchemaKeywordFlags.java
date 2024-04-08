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

    public LinkedHashSet<String> getKeywords() {
        LinkedHashSet<String> enabledKeywords = new LinkedHashSet<>();
        if (additionalProperties) { enabledKeywords.add("additionalProperties"); }
        if (allOf) { enabledKeywords.add("allOf"); }
        if (anyOf) { enabledKeywords.add("anyOf"); }
        if (const_) { enabledKeywords.add("const"); }
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

    public static class Builder {
        private boolean additionalProperties;
        private boolean allOf;
        private boolean anyOf;
        private boolean const_;
        private boolean contains;
        private boolean dependentRequired;
        private boolean dependentSchemas;
        private boolean discriminator;
        private boolean else_;
        private boolean enum_;
        private boolean exclusiveMaximum;
        private boolean exclusiveMinimum;
        private boolean format;
        private boolean if_;
        private boolean maximum;
        private boolean minimum;
        private boolean items;
        private boolean maxContains;
        private boolean maxItems;
        private boolean maxLength;
        private boolean maxProperties;
        private boolean minContains;
        private boolean minItems;
        private boolean minLength;
        private boolean minProperties;
        private boolean multipleOf;
        private boolean not;
        private boolean oneOf;
        private boolean pattern;
        private boolean patternProperties;
        private boolean prefixItems;
        private boolean properties;
        private boolean propertyNames;
        private boolean required;
        private boolean then;
        private boolean type;
        private boolean uniqueItems;
        private boolean unevaluatedItems;
        private boolean unevaluatedProperties;

        public Builder() {}

        public Builder additionalProperties() {
            additionalProperties = true;
            return this;
        }
        public Builder allOf() {
            allOf = true;
            return this;
        }
        public Builder anyOf() {
            anyOf = true;
            return this;
        }
        public Builder const_() {
            const_ = true;
            return this;
        }
        public Builder contains() {
            contains = true;
            return this;
        }
        public Builder dependentRequired() {
            dependentRequired = true;
            return this;
        }
        public Builder dependentSchemas() {
            dependentSchemas = true;
            return this;
        }
        public Builder discriminator() {
            discriminator = true;
            return this;
        }
        public Builder else_() {
            else_ = true;
            return this;
        }
        public Builder enum_() {
            enum_ = true;
            return this;
        }
        public Builder exclusiveMaximum() {
            exclusiveMaximum = true;
            return this;
        }
        public Builder exclusiveMinimum() {
            exclusiveMinimum = true;
            return this;
        }
        public Builder format() {
            format = true;
            return this;
        }
        public Builder if_() {
            if_ = true;
            return this;
        }
        public Builder maximum() {
            maximum = true;
            return this;
        }
        public Builder minimum() {
            minimum = true;
            return this;
        }
        public Builder items() {
            items = true;
            return this;
        }
        public Builder maxContains() {
            maxContains = true;
            return this;
        }
        public Builder maxItems() {
            maxItems = true;
            return this;
        }
        public Builder maxLength() {
            maxLength = true;
            return this;
        }
        public Builder maxProperties() {
            maxProperties = true;
            return this;
        }
        public Builder minContains() {
            minContains = true;
            return this;
        }
        public Builder minItems() {
            minItems = true;
            return this;
        }
        public Builder minLength() {
            minLength = true;
            return this;
        }
        public Builder minProperties() {
            minProperties = true;
            return this;
        }
        public Builder multipleOf() {
            multipleOf = true;
            return this;
        }
        public Builder not() {
            not = true;
            return this;
        }
        public Builder oneOf() {
            oneOf = true;
            return this;
        }
        public Builder pattern() {
            pattern = true;
            return this;
        }
        public Builder patternProperties() {
            patternProperties = true;
            return this;
        }
        public Builder prefixItems() {
            prefixItems = true;
            return this;
        }
        public Builder properties() {
            properties = true;
            return this;
        }
        public Builder propertyNames() {
            propertyNames = true;
            return this;
        }
        public Builder required() {
            required = true;
            return this;
        }
        public Builder then() {
            then = true;
            return this;
        }
        public Builder type() {
            type = true;
            return this;
        }
        public Builder uniqueItems() {
            uniqueItems = true;
            return this;
        }
        public Builder unevaluatedItems() {
            unevaluatedItems = true;
            return this;
        }
        public Builder unevaluatedProperties() {
            unevaluatedProperties = true;
            return this;
        }
        public JsonSchemaKeywordFlags build() {
            return new JsonSchemaKeywordFlags(
                additionalProperties,
                allOf,
                anyOf,
                const_,
                contains,
                dependentRequired,
                dependentSchemas,
                discriminator,
                else_,
                enum_,
                exclusiveMaximum,
                exclusiveMinimum,
                format,
                if_,
                maximum,
                minimum,
                items,
                maxContains,
                maxItems,
                maxLength,
                maxProperties,
                minContains,
                minItems,
                minLength,
                minProperties,
                multipleOf,
                not,
                oneOf,
                pattern,
                patternProperties,
                prefixItems,
                properties,
                propertyNames,
                required,
                then,
                type,
                uniqueItems,
                unevaluatedItems,
                unevaluatedProperties
            );
        }
    }
}