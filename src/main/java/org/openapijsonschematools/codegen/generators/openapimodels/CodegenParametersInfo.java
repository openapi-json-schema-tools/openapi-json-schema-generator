package org.openapijsonschematools.codegen.generators.openapimodels;

public class CodegenParametersInfo {
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final ParameterCollection parameters;
    public final CodegenSchema pathParametersSchema;
    public final CodegenSchema queryParametersSchema;
    public final CodegenSchema headerParametersSchema;
    public final CodegenSchema cookieParametersSchema;
    public final ParameterCollection pathItemParameters;
    public final boolean hasRequired;

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
        if (parameters != null) {
            for (CodegenParameter param: parameters.allParameters) {
                if (Boolean.TRUE.equals(param.getSelfOrDeepestRef().required)) {
                    hasRequired = true;
                    break;
                }
            }
        }
        if (!hasRequired) {
            for (CodegenParameter param: pathItemParameters.allParameters) {
                if (Boolean.TRUE.equals(param.getSelfOrDeepestRef().required)) {
                    hasRequired = true;
                    break;
                }
            }
        }
        this.hasRequired = hasRequired;
    }
}
