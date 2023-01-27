/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapijsonschematools.codegen;

import io.swagger.v3.oas.models.ExternalDocumentation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenMediaType;
import org.openapijsonschematools.codegen.model.CodegenServer;
import org.openapijsonschematools.codegen.model.CodegenTag;

import java.util.*;

public class CodegenOperation {
    public boolean hasAuthMethods, hasConsumes, hasProduces, hasParams,
            subresourceOperation, isMultipart,
            isRestfulIndex, isRestfulShow, isRestfulCreate, isRestfulUpdate, isRestfulDestroy,
            isRestful, isDeprecated, isCallbackRequest, uniqueItems, hasDefaultResponse = false,
            hasErrorResponseObject; // if 4xx, 5xx responses have at least one error object defined
    public String path, operationId, httpMethod,
            summary, unescapedNotes, notes, baseName;
    public List<Map<String, String>> consumes, produces, prioritizedContentTypes;
    public List<CodegenServer> servers = new ArrayList<CodegenServer>();
    public CodegenRequestBody requestBody;
    public List<CodegenParameter> allParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> pathParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> queryParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> headerParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> implicitHeadersParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> cookieParams = new ArrayList<CodegenParameter>();
    public List<CodegenRequestBodyBase> requiredParams = new ArrayList<CodegenRequestBodyBase>();
    public List<CodegenRequestBodyBase> optionalParams = new ArrayList<CodegenRequestBodyBase>();
    public List<CodegenSecurity> authMethods;
    public Map<String, CodegenTag> tags;
    public TreeMap<String, CodegenResponse> responses = null;
    public TreeMap<Integer, CodegenResponse> statusCodeResponses = null;
    public TreeMap<Integer, CodegenResponse> wildcardCodeResponses = null;

    public TreeMap<String, CodegenResponse> nonDefaultResponses = null;
    public CodegenResponse defaultResponse = null;
    public List<CodegenCallback> callbacks = new ArrayList<>();
    public Set<String> imports = new HashSet<String>();
    public List<Map<String, String>> examples;
    public List<Map<String, String>> requestBodyExamples;
    public ExternalDocumentation externalDocs;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    public String nickname; // legacy support
    public String operationIdOriginal; // for plug-in
    public String operationIdLowerCase; // for markdown documentation
    public String operationIdCamelCase; // for class names
    public String operationIdSnakeCase;

    /**
     * Check if there's at least one parameter
     *
     * @return true if parameter exists, false otherwise
     */
    private static boolean nonEmpty(List<?> params) {
        return params != null && !params.isEmpty();
    }

    private static boolean nonEmpty(Map<?, ?> params) {
        return params != null && !params.isEmpty();
    }

    /**
     * Check if there's at least one query parameter
     *
     * @return true if query parameter exists, false otherwise
     */
    public boolean getHasQueryParams() {
        return nonEmpty(queryParams);
    }

    /**
     * Check if there's at least one query parameter or passing API keys in query
     *
     * @return true if query parameter exists or passing API keys in query, false otherwise
     */
    public boolean getHasQueryParamsOrAuth() {
        return getHasQueryParams() || (authMethods != null && authMethods.stream().anyMatch(authMethod -> authMethod.isKeyInQuery));
    }

    /**
     * Check if there's at least one header parameter
     *
     * @return true if header parameter exists, false otherwise
     */
    public boolean getHasHeaderParams() {
        return nonEmpty(headerParams);
    }

    /**
     * Check if there's at least one path parameter
     *
     * @return true if path parameter exists, false otherwise
     */
    public boolean getHasPathParams() {
        return nonEmpty(pathParams);
    }

    /**
     * Check if there's at least one form parameter
     *
     * @return true if any cookie parameter exists, false otherwise
     */
    public boolean getHasCookieParams() {
        return nonEmpty(cookieParams);
    }

    /**
     * Check if there's at least one optional parameter
     *
     * @return true if any optional parameter exists, false otherwise
     */
    public boolean getHasOptionalParams() {
        return nonEmpty(optionalParams);
    }

    /**
     * Check if there's at least one required parameter
     *
     * @return true if any optional parameter exists, false otherwise
     */
    public boolean getHasRequiredParams() {
        return nonEmpty(requiredParams);
    }

    /**
     * Check if there's at least one example parameter
     *
     * @return true if examples parameter exists, false otherwise
     */
    public boolean getHasExamples() {
        return nonEmpty(examples);
    }

    public boolean getAllResponsesAreErrors() {
        if (responses.size() == 1 && defaultResponse != null) {
            return false;
        }
        for (String code: nonDefaultResponses.keySet()) {
            String firstNumber = code.substring(0, 1);
            switch (firstNumber) {
                case "1": case "2": case "3":
                    return false;
            }
        }
        if (defaultResponse != null) {
            // 404 + default, unable to tell if default is a success or an error status code
            return false;
        }
        return true;
    }

    /**
     * @return contentTypeToOperation
     * returns a map where the key is the request body content type and the value is the current CodegenOperation
     * this is needed by templates when a different signature is needed for each request body content type
     */
    @JsonIgnore
    public Map<String, CodegenOperation> getContentTypeToOperation() {
        LinkedHashMap<String, CodegenOperation> contentTypeToOperation = new LinkedHashMap<>();
        if (requestBody == null) {
            return null;
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (requestBody.refInfo() != null) {
            content = requestBody.getDeepestRef().content();
        } else {
            content = requestBody.content();
        }
        for (CodegenKey contentKey: content.keySet()) {
            contentTypeToOperation.put(contentKey.name, this);
        }
        return contentTypeToOperation;
    }

    /**
     * Check if there's at least one vendor extension
     *
     * @return true if vendor extensions exists, false otherwise
     */
    public boolean getHasVendorExtensions() {
        return nonEmpty(vendorExtensions);
    }

    /**
     * Check if act as Restful index method
     *
     * @return true if act as Restful index method, false otherwise
     */
    public boolean isRestfulIndex() {
        return "GET".equalsIgnoreCase(httpMethod) && "".equals(pathWithoutBaseName());
    }

    /**
     * Check if act as Restful show method
     *
     * @return true if act as Restful show method, false otherwise
     */
    public boolean isRestfulShow() {
        return "GET".equalsIgnoreCase(httpMethod) && isMemberPath();
    }

    /**
     * Check if act as Restful create method
     *
     * @return true if act as Restful create method, false otherwise
     */
    public boolean isRestfulCreate() {
        return "POST".equalsIgnoreCase(httpMethod) && "".equals(pathWithoutBaseName());
    }

    /**
     * Check if act as Restful update method
     *
     * @return true if act as Restful update method, false otherwise
     */
    public boolean isRestfulUpdate() {
        return Arrays.asList("PUT", "PATCH").contains(httpMethod.toUpperCase(Locale.ROOT)) && isMemberPath();
    }

    /**
     * Check if body param is allowed for the request method
     *
     * @return true request method is PUT, PATCH or POST; false otherwise
     */
    public boolean isBodyAllowed() {
        return Arrays.asList("PUT", "PATCH", "POST").contains(httpMethod.toUpperCase(Locale.ROOT));
    }

    /**
     * Check if act as Restful destroy method
     *
     * @return true if act as Restful destroy method, false otherwise
     */
    public boolean isRestfulDestroy() {
        return "DELETE".equalsIgnoreCase(httpMethod) && isMemberPath();
    }

    /**
     * Check if Restful-style
     *
     * @return true if Restful-style, false otherwise
     */
    public boolean isRestful() {
        return isRestfulIndex() || isRestfulShow() || isRestfulCreate() || isRestfulUpdate() || isRestfulDestroy();
    }

    /**
     * Get the substring except baseName from path
     *
     * @return the substring
     */
    private String pathWithoutBaseName() {
        return baseName != null ? path.replace("/" + baseName.toLowerCase(Locale.ROOT), "") : path;
    }

    /**
     * Check if the path match format /xxx/:id
     *
     * @return true if path act as member
     */
    private boolean isMemberPath() {
        if (pathParams.size() != 1) return false;
        String id = pathParams.get(0).baseName;
        return ("/{" + id + "}").equals(pathWithoutBaseName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenOperation{");
        sb.append(", hasAuthMethods=").append(hasAuthMethods);
        sb.append(", hasConsumes=").append(hasConsumes);
        sb.append(", hasProduces=").append(hasProduces);
        sb.append(", hasParams=").append(hasParams);
        sb.append(", subresourceOperation=").append(subresourceOperation);
        sb.append(", isMultipart=").append(isMultipart);
        sb.append(", hasDefaultResponse=").append(hasDefaultResponse);
        sb.append(", isRestfulIndex=").append(isRestfulIndex);
        sb.append(", isRestfulShow=").append(isRestfulShow);
        sb.append(", isRestfulCreate=").append(isRestfulCreate);
        sb.append(", isRestfulUpdate=").append(isRestfulUpdate);
        sb.append(", isRestfulDestroy=").append(isRestfulDestroy);
        sb.append(", isRestful=").append(isRestful);
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", isCallbackRequest=").append(isCallbackRequest);
        sb.append(", uniqueItems='").append(uniqueItems);
        sb.append(", path='").append(path).append('\'');
        sb.append(", operationId='").append(operationId).append('\'');
        sb.append(", httpMethod='").append(httpMethod).append('\'');
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", unescapedNotes='").append(unescapedNotes).append('\'');
        sb.append(", notes='").append(notes).append('\'');
        sb.append(", baseName='").append(baseName).append('\'');
        sb.append(", defaultResponse='").append(defaultResponse).append('\'');
        sb.append(", consumes=").append(consumes);
        sb.append(", produces=").append(produces);
        sb.append(", prioritizedContentTypes=").append(prioritizedContentTypes);
        sb.append(", servers=").append(servers);
        sb.append(", requestBody=").append(requestBody);
        sb.append(", allParams=").append(allParams);
        sb.append(", pathParams=").append(pathParams);
        sb.append(", queryParams=").append(queryParams);
        sb.append(", headerParams=").append(headerParams);
        sb.append(", cookieParams=").append(cookieParams);
        sb.append(", requiredParams=").append(requiredParams);
        sb.append(", optionalParams=").append(optionalParams);
        sb.append(", authMethods=").append(authMethods);
        sb.append(", tags=").append(tags);
        sb.append(", responses=").append(responses);
        sb.append(", statusCodeResponses=").append(statusCodeResponses);
        sb.append(", wildcardCodeResponses=").append(wildcardCodeResponses);
        sb.append(", nonDefaultResponses=").append(nonDefaultResponses);
        sb.append(", callbacks=").append(callbacks);
        sb.append(", imports=").append(imports);
        sb.append(", examples=").append(examples);
        sb.append(", requestBodyExamples=").append(requestBodyExamples);
        sb.append(", externalDocs=").append(externalDocs);
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", operationIdOriginal='").append(operationIdOriginal).append('\'');
        sb.append(", operationIdLowerCase='").append(operationIdLowerCase).append('\'');
        sb.append(", operationIdCamelCase='").append(operationIdCamelCase).append('\'');
        sb.append(", operationIdSnakeCase='").append(operationIdSnakeCase).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenOperation that = (CodegenOperation) o;
        return hasAuthMethods == that.hasAuthMethods &&
                hasConsumes == that.hasConsumes &&
                hasProduces == that.hasProduces &&
                hasParams == that.hasParams &&
                subresourceOperation == that.subresourceOperation &&
                isMultipart == that.isMultipart &&
                hasDefaultResponse == that.hasDefaultResponse &&
                isRestfulIndex == that.isRestfulIndex &&
                isRestfulShow == that.isRestfulShow &&
                isRestfulCreate == that.isRestfulCreate &&
                isRestfulUpdate == that.isRestfulUpdate &&
                isRestfulDestroy == that.isRestfulDestroy &&
                isRestful == that.isRestful &&
                isDeprecated == that.isDeprecated &&
                isCallbackRequest == that.isCallbackRequest &&
                uniqueItems == that.uniqueItems &&
                Objects.equals(path, that.path) &&
                Objects.equals(operationId, that.operationId) &&
                Objects.equals(httpMethod, that.httpMethod) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(unescapedNotes, that.unescapedNotes) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(defaultResponse, that.defaultResponse) &&
                Objects.equals(consumes, that.consumes) &&
                Objects.equals(produces, that.produces) &&
                Objects.equals(prioritizedContentTypes, that.prioritizedContentTypes) &&
                Objects.equals(servers, that.servers) &&
                Objects.equals(requestBody, that.requestBody) &&
                Objects.equals(allParams, that.allParams) &&
                Objects.equals(pathParams, that.pathParams) &&
                Objects.equals(queryParams, that.queryParams) &&
                Objects.equals(headerParams, that.headerParams) &&
                Objects.equals(cookieParams, that.cookieParams) &&
                Objects.equals(requiredParams, that.requiredParams) &&
                Objects.equals(optionalParams, that.optionalParams) &&
                Objects.equals(authMethods, that.authMethods) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(responses, that.responses) &&
                Objects.equals(statusCodeResponses, that.statusCodeResponses) &&
                Objects.equals(wildcardCodeResponses, that.wildcardCodeResponses) &&
                Objects.equals(nonDefaultResponses, that.nonDefaultResponses) &&
                Objects.equals(callbacks, that.callbacks) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(examples, that.examples) &&
                Objects.equals(requestBodyExamples, that.requestBodyExamples) &&
                Objects.equals(externalDocs, that.externalDocs) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(operationIdOriginal, that.operationIdOriginal) &&
                Objects.equals(operationIdLowerCase, that.operationIdLowerCase) &&
                Objects.equals(operationIdCamelCase, that.operationIdCamelCase) &&
                Objects.equals(operationIdSnakeCase, that.operationIdSnakeCase);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hasAuthMethods, hasConsumes, hasProduces, hasParams,
                subresourceOperation,
                isMultipart,
                hasDefaultResponse, isRestfulIndex, isRestfulShow, isRestfulCreate, isRestfulUpdate, isRestfulDestroy,
                isRestful, isDeprecated, isCallbackRequest, uniqueItems, path, operationId, httpMethod,
                summary, unescapedNotes, notes, baseName, defaultResponse,
                consumes, produces, prioritizedContentTypes, servers, requestBody, allParams,
                pathParams, queryParams, headerParams, cookieParams, requiredParams, optionalParams,
                authMethods, tags, responses, callbacks, imports, examples, requestBodyExamples, externalDocs,
                vendorExtensions, nickname, operationIdOriginal, operationIdLowerCase, operationIdCamelCase,
                operationIdSnakeCase, statusCodeResponses, wildcardCodeResponses,
                nonDefaultResponses);
    }
}
