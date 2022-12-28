package org.openapitools.codegen;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.meta.FeatureSet;
import org.openapitools.codegen.meta.features.SchemaSupportFeature;
import org.openapitools.codegen.utils.ModelUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public interface OpenapiComponent {
    // set only if the instance is at the json path of a component
    String getComponentModule();

    void setComponentModule(String componentModule);

    // always set
    // used for spec name (name.getName)
    // module name (name.getSnakeCaseName)
    // class name (name.getCamelCaseName)
    // used when instances are defined inline and do not $ref another location
    CodegenKey getName();

    void setName(CodegenKey name);

    String getRef();

    void setRef(String ref);

    String getRefModule();

    void setRefModule(String refModule);

    // TODO add refClass here when all components use classes in their python definition
}
