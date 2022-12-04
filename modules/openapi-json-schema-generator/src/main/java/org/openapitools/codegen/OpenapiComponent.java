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
    String getModulePath();

    void setModulePath(String modulePath);
}
