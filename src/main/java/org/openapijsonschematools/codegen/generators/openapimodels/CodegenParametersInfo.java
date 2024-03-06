package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.ArrayList;
import java.util.List;

public class CodegenParametersInfo {
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final ParameterCollection parameters;
    public final ParameterCollection pathItemParameters;
    public final CodegenSchema pathParametersSchema;
    public final CodegenSchema queryParametersSchema;
    public final CodegenSchema headerParametersSchema;
    public final CodegenSchema cookieParametersSchema;
    public final boolean hasRequired;
    public final boolean hasOptional;

    public List<CodegenParameter> pathParameters() {
        List<CodegenParameter> params = new ArrayList<>();
        if (parameters != null && parameters.pathParameters != null) {
            for (CodegenParameter p: parameters.pathParameters) {
                params.add(p);
            }
        }
        if (pathItemParameters != null && pathItemParameters.pathParameters != null) {
            for (CodegenParameter p: pathItemParameters.pathParameters) {
                params.add(p);
            }
        }
        if (params.isEmpty()) {
            return null;
        }
        return params;
    }

    public List<CodegenParameter> queryParameters() {
        List<CodegenParameter> params = new ArrayList<>();
        if (parameters != null && parameters.queryParameters != null) {
            for (CodegenParameter p: parameters.queryParameters) {
                params.add(p);
            }
        }
        if (pathItemParameters != null && pathItemParameters.queryParameters != null) {
            for (CodegenParameter p: pathItemParameters.queryParameters) {
                params.add(p);
            }
        }
        if (params.isEmpty()) {
            return null;
        }
        return params;
    }

    public List<CodegenParameter> headerParameters() {
        List<CodegenParameter> params = new ArrayList<>();
        if (parameters != null && parameters.headerParameters != null) {
            for (CodegenParameter p: parameters.headerParameters) {
                params.add(p);
            }
        }
        if (pathItemParameters != null && pathItemParameters.headerParameters != null) {
            for (CodegenParameter p: pathItemParameters.headerParameters) {
                params.add(p);
            }
        }
        if (params.isEmpty()) {
            return null;
        }
        return params;
    }

    public List<CodegenParameter> cookieParameters() {
        List<CodegenParameter> params = new ArrayList<>();
        if (parameters != null && parameters.cookieParameters != null) {
            for (CodegenParameter p: parameters.cookieParameters) {
                params.add(p);
            }
        }
        if (pathItemParameters != null && pathItemParameters.cookieParameters != null) {
            for (CodegenParameter p: pathItemParameters.cookieParameters) {
                params.add(p);
            }
        }
        if (params.isEmpty()) {
            return null;
        }
        return params;
    }

    public CodegenParametersInfo(CodegenKey jsonPathPiece, String subpackage, ParameterCollection parameters, CodegenSchema pathParametersSchema, CodegenSchema queryParametersSchema, CodegenSchema headerParametersSchema, CodegenSchema cookieParametersSchema, ParameterCollection pathItemParameters) {
        this.jsonPathPiece = jsonPathPiece;
        this.subpackage = subpackage;
        this.parameters = parameters;
        this.pathParametersSchema = pathParametersSchema;
        this.queryParametersSchema = queryParametersSchema;
        this.headerParametersSchema = headerParametersSchema;
        this.cookieParametersSchema = cookieParametersSchema;
        this.pathItemParameters = pathItemParameters;
        boolean hasRequired = false;
        boolean hasOptional = false;
        if (parameters != null) {
            for (CodegenParameter param: parameters.allParameters) {
                if (Boolean.TRUE.equals(param.getSelfOrDeepestRef().required)) {
                    hasRequired = true;
                } else {
                    hasOptional = true;
                }
            }
        }
        if (!hasRequired && pathItemParameters != null) {
            for (CodegenParameter param : pathItemParameters.allParameters) {
                if (Boolean.TRUE.equals(param.getSelfOrDeepestRef().required)) {
                    hasRequired = true;
                } else {
                    hasOptional = true;
                }
            }
        }
        this.hasRequired = hasRequired;
        this.hasOptional = hasOptional;
    }
}
