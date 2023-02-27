package org.openapijsonschematools.codegen.utils;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.openapijsonschematools.codegen.model.CodegenSchema;

import java.util.Map;
import java.util.TreeMap;

public class ProcessUtils {
    /**
     * Add x-index extension to the model's properties
     *
     * @param models       List of models
     * @param initialIndex starting index to use
     */
    public static void addIndexToProperties(TreeMap<String, CodegenSchema> models, int initialIndex) {
        for (CodegenSchema cm : models.values()) {
            int i = initialIndex;
            for (CodegenSchema var : cm.properties.values()) {
                var.vendorExtensions.put("x-index", i);
                i++;
            }
        }
    }

    /**
     * Add x-index extension to the model's properties
     *
     * @param models List of models
     */
    public static void addIndexToProperties(TreeMap<String, CodegenSchema> models) {
        addIndexToProperties(models, 0);
    }

    /**
     * Returns true if the specified OAS model has at least one operation with HTTP bearer authentication.
     *
     * @param openAPI An instance of OpenAPI
     * @return True if at least one operation has HTTP bearer security scheme defined
     */
    public static boolean hasHttpBearerMethods(OpenAPI openAPI) {
        final Map<String, SecurityScheme> securitySchemes = getSecuritySchemes(openAPI);
        if (securitySchemes != null) {
            for (Map.Entry<String, SecurityScheme> scheme : securitySchemes.entrySet()) {
                if (SecurityScheme.Type.HTTP.equals(scheme.getValue().getType()) && "bearer".equals(scheme.getValue().getScheme())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns true if the specified OAS model has at least one operation with HTTP basic authentication.
     *
     * @param openAPI An instance of OpenAPI
     * @return True if at least one operation has HTTP basic security scheme defined
     */
    public static boolean hasHttpBasicMethods(OpenAPI openAPI) {
        final Map<String, SecurityScheme> securitySchemes = getSecuritySchemes(openAPI);
        if (securitySchemes != null) {
            for (Map.Entry<String, SecurityScheme> scheme : securitySchemes.entrySet()) {
                if (SecurityScheme.Type.HTTP.equals(scheme.getValue().getType()) && "basic".equals(scheme.getValue().getScheme())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns true if the specified OAS model has at least one operation with HTTP signature authentication.
     *
     * @param openAPI An instance of OpenAPI
     * @return True if at least one operation has HTTP signature security scheme defined
     */
    public static boolean hasHttpSignatureMethods(OpenAPI openAPI) {
        final Map<String, SecurityScheme> securitySchemes = getSecuritySchemes(openAPI);
        if (securitySchemes != null) {
            for (Map.Entry<String, SecurityScheme> scheme : securitySchemes.entrySet()) {
                if (SecurityScheme.Type.HTTP.equals(scheme.getValue().getType()) && "signature".equals(scheme.getValue().getScheme())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns true if the specified OAS model has at least one operation with API key authentication.
     *
     * @param openAPI An instance of OpenAPI
     * @return True if at least one operation has API key security scheme defined
     */
    public static boolean hasApiKeyMethods(OpenAPI openAPI) {
        final Map<String, SecurityScheme> securitySchemes = getSecuritySchemes(openAPI);
        if (securitySchemes != null) {
            for (Map.Entry<String, SecurityScheme> scheme : securitySchemes.entrySet()) {
                if (SecurityScheme.Type.APIKEY.equals(scheme.getValue().getType())) {
                    return true;
                }
            }
        }

        return false;
    }

    public static Map<String, SecurityScheme> getSecuritySchemes(OpenAPI openAPI) {
        if (openAPI == null) {
            return null;
        } else {
            return openAPI.getComponents() != null ? openAPI.getComponents().getSecuritySchemes() : null;
        }
    }
}

