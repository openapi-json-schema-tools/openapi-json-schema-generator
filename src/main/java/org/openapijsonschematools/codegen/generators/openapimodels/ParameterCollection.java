package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public class ParameterCollection {
    public List<CodegenParameter> allParameters;
    public List<CodegenParameter> pathParameters;
    public List<CodegenParameter> queryParameters;
    public List<CodegenParameter> headerParameters;
    public List<CodegenParameter> cookieParameters;

    public ParameterCollection(List<CodegenParameter> allParameters, List<CodegenParameter> pathParameters, List<CodegenParameter> queryParameters, List<CodegenParameter> headerParameters, List<CodegenParameter> cookieParameters) {
        this.allParameters = allParameters;
        this.pathParameters = pathParameters;
        this.queryParameters = queryParameters;
        this.headerParameters = headerParameters;
        this.cookieParameters = cookieParameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParameterCollection that = (ParameterCollection) o;
        return Objects.equals(allParameters, that.allParameters) &&
                Objects.equals(pathParameters, that.pathParameters) &&
                Objects.equals(queryParameters, that.queryParameters) &&
                Objects.equals(headerParameters, that.headerParameters) &&
                Objects.equals(cookieParameters, that.cookieParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allParameters, pathParameters, queryParameters, headerParameters, cookieParameters);
    }
}
