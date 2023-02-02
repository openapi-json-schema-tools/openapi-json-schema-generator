package org.openapijsonschematools.codegen.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import io.swagger.v3.oas.models.ExternalDocumentation;

public class OpenApiSchema {
    // 3.0.3
    public String title;
    public Number multipleOf;
    public String maximum;
    public Boolean exclusiveMaximum;
    public String minimum;
    public Boolean exclusiveMinimum;
    public Integer maxLength;
    public Integer minLength;
    public String pattern;
    public Integer maxItems;
    public Integer minItems;
    public Boolean uniqueItems;
    public Integer maxProperties;
    public Integer minProperties;
    public LinkedHashMap<CodegenKey, CodegenSchema> requiredProperties; // used to store required info
    public List<String> _enum; // todo remove this
    public Map<String, Object> allowableValues; // enum info; created identifier to enum value
    public LinkedHashSet<String> types; // used 3.1.0 types here instead of 3.0.3 types
    public List<CodegenSchema> allOf = null;
    public List<CodegenSchema> anyOf = null;
    public List<CodegenSchema> oneOf = null;
    public CodegenSchema not = null;
    public CodegenSchema items;
    public LinkedHashMap<CodegenKey, CodegenSchema> properties;
    public CodegenSchema additionalProperties;
    public String description;
    public String format;
    public String defaultValue;

    // openapi specific
    // note: nullable not stored, instead null is added to types
    public CodegenDiscriminator discriminator;
    public boolean isReadOnly;
    public boolean isWriteOnly;
    // todo group these xml attributes into a codegenxml class
    public boolean isXmlAttribute = false;
    public String xmlPrefix;
    public String xmlName;
    public String xmlNamespace;
    public boolean isXmlWrapped = false;
    public ExternalDocumentation externalDocumentation;
    public String example;
    public boolean deprecated;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
}
