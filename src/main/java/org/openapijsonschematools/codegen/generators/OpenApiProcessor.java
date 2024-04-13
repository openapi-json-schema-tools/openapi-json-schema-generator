package org.openapijsonschematools.codegen.generators;

import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;
import org.apache.commons.lang3.tuple.Pair;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenList;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenOperation;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPathItem;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRequestBody;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementObject;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementValue;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenServer;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenTag;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface OpenApiProcessor {
    CodegenSchema fromSchema(Schema<?> schema, String sourceJsonPath, String currentJsonPath);
    CodegenTag fromTag(String name, String description);
    CodegenList<CodegenSecurityRequirementObject> fromSecurity(List<SecurityRequirement> security, String jsonPath);
    CodegenOperation fromOperation(Operation operation, String jsonPath, LinkedHashMap<Pair<String, String>, CodegenParameter> pathItemParameters, CodegenList<CodegenServer> rootOrPathServers, CodegenList<CodegenSecurityRequirementObject> rootSecurity);
    CodegenSecurityScheme fromSecurityScheme(SecurityScheme securityScheme, String jsonPath);
    HashMap<String, CodegenSecurityRequirementValue> fromSecurityRequirement(SecurityRequirement securityScheme, String jsonPath);
    TreeMap<CodegenKey, CodegenPathItem> fromPaths(Paths paths, CodegenList<CodegenServer> rootServers, CodegenList<CodegenSecurityRequirementObject> rootSecurity);
    CodegenPathItem fromPathItem(PathItem pathItem, String jsonPath, CodegenList<CodegenServer> rootServers, CodegenList<CodegenSecurityRequirementObject> rootSecurity);
    CodegenList<CodegenServer> fromServers(List<Server> servers, String jsonPath);
    CodegenSchema fromServerVariables(Map<String, ServerVariable> variables, String jsonPath);
    CodegenRequestBody fromRequestBody(RequestBody body, String sourceJsonPath);
    CodegenResponse fromResponse(ApiResponse response, String sourceJsonPath);
    CodegenHeader fromHeader(Header parameter, String sourceJsonPath);
    CodegenParameter fromParameter(Parameter parameter, String sourceJsonPath);

}
