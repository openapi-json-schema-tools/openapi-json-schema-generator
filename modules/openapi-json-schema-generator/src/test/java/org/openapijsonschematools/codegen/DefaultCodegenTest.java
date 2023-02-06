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

import com.google.common.collect.Sets;
import com.samskivert.mustache.Mustache.Lambda;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.MapSchema;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.NumberSchema;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.parser.core.models.ParseOptions;
import org.openapijsonschematools.codegen.model.CodegenDiscriminator;
import org.openapijsonschematools.codegen.model.CodegenEncoding;
import org.openapijsonschematools.codegen.model.CodegenHeader;
import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenMediaType;
import org.openapijsonschematools.codegen.model.CodegenOperation;
import org.openapijsonschematools.codegen.model.CodegenParameter;
import org.openapijsonschematools.codegen.model.CodegenRequestBody;
import org.openapijsonschematools.codegen.model.CodegenResponse;
import org.openapijsonschematools.codegen.model.CodegenSchema;
import org.openapijsonschematools.codegen.model.CodegenSecurity;
import org.openapijsonschematools.codegen.model.EnumValue;
import org.openapijsonschematools.codegen.templating.mustache.CamelCaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.IndentedLambda;
import org.openapijsonschematools.codegen.templating.mustache.LowercaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.TitlecaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.UppercaseLambda;
import org.openapijsonschematools.codegen.utils.ModelUtils;
import org.openapijsonschematools.codegen.utils.SemVer;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


public class DefaultCodegenTest {

    @Test
    public void testDeeplyNestedAdditionalPropertiesImports() {
        final DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openApi = TestUtils.parseFlattenSpec("src/test/resources/3_0/additional-properties-deeply-nested.yaml");
        codegen.setOpenAPI(openApi);
        PathItem path = openApi.getPaths().get("/ping");
        CodegenOperation operation = codegen.fromOperation("/ping", "post", path.getPost(), path.getServers());
        Assert.assertEquals(operation.responses.get("default").imports, null);
    }

    @Test
    public void testRefedEnumParameter() {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.addSchemaImportsFromV3SpecLocations = true;
        final OpenAPI openApi = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_12445.yaml");
        codegen.setOpenAPI(openApi);
        PathItem path = openApi.getPaths().get("/pets/petType/{type}");
        codegen.fromSchema(
                openApi.getComponents().getSchemas().get("PetByType"),
                "#/components/schemas/PetByType",
                "#/components/schemas/PetByType"
        );
        CodegenOperation operation = codegen.fromOperation("/pets/petType/{type}", "get", path.getGet(), path.getServers());
        assertEquals(operation.pathParams.get(0).imports, null);
        assertEquals(operation.pathParams.get(0).schema.imports.size(), 1);
        Assert.assertTrue(operation.pathParams.get(0).schema.refInfo.ref.enumNameToValue != null);
    }

    @Test
    public void testHasBodyParameter() {
        final Schema refSchema = new Schema<>().$ref("#/components/schemas/Pet");
        Operation pingOperation = new Operation()
                .responses(
                        new ApiResponses().addApiResponse("204", new ApiResponse()
                                .description("Ok response")));
        Operation createOperation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(refSchema))))
                .responses(
                        new ApiResponses().addApiResponse("201", new ApiResponse()
                                .description("Created response")));
        OpenAPI openAPI = new OpenAPI();
        openAPI.setComponents(new Components());
        openAPI.getComponents().addSchemas("Pet", new ObjectSchema());

        final DefaultCodegen codegen = new DefaultCodegen();

        Assert.assertFalse(codegen.hasBodyParameter(openAPI, pingOperation));
        Assert.assertTrue(codegen.hasBodyParameter(openAPI, createOperation));
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testParameterEmptyDescription() {
        DefaultCodegen codegen = new DefaultCodegen();

        codegen.fromRequestBody(null, null);
    }

    @Test
    public void testGetConsumesInfoAndGetProducesInfo() throws Exception {
        final Schema refSchema = new Schema<>().$ref("#/components/schemas/Pet");
        OpenAPI openAPI = new OpenAPI();
        openAPI.setComponents(new Components());
        openAPI.getComponents().addSchemas("Pet", new ObjectSchema());
        openAPI.getComponents().addRequestBodies("MyRequestBody", new RequestBody()
                .content(new Content().addMediaType("application/json",
                        new MediaType().schema(refSchema))));
        openAPI.getComponents().addResponses("MyResponse", new ApiResponse()
                .description("Ok response")
                .content(new Content().addMediaType("application/xml",
                        new MediaType().schema(refSchema))));

        Operation createOperation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content()
                                .addMediaType("application/json", new MediaType().schema(refSchema))
                                .addMediaType("application/xml", new MediaType().schema(refSchema))
                        ))
                .responses(
                        new ApiResponses().addApiResponse("201", new ApiResponse()
                                .description("Created response")));
        Set<String> createConsumesInfo = DefaultCodegen.getConsumesInfo(openAPI, createOperation);
        Assert.assertEquals(createConsumesInfo.size(), 2);
        Assert.assertTrue(createConsumesInfo.contains("application/json"), "contains 'application/json'");
        Assert.assertTrue(createConsumesInfo.contains("application/xml"), "contains 'application/xml'");
        Set<String> createProducesInfo = DefaultCodegen.getProducesInfo(openAPI, createOperation);
        Assert.assertEquals(createProducesInfo.size(), 0);
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        CodegenOperation coCreate = codegen.fromOperation("somepath", "post", createOperation, null);
        Assert.assertTrue(!coCreate.requestBody.content.isEmpty());
        Assert.assertEquals(coCreate.requestBody.content.size(), 2);
        Assert.assertNull(coCreate.produces);

        Operation updateOperationWithRef = new Operation()
                .requestBody(new RequestBody().$ref("#/components/requestBodies/MyRequestBody"))
                .responses(new ApiResponses().addApiResponse("201", new ApiResponse().$ref("#/components/responses/MyResponse")));
        Set<String> updateConsumesInfo = DefaultCodegen.getConsumesInfo(openAPI, updateOperationWithRef);
        Assert.assertEquals(updateConsumesInfo.size(), 1);
        Assert.assertTrue(updateConsumesInfo.contains("application/json"), "contains 'application/json'");
        Set<String> updateProducesInfo = DefaultCodegen.getProducesInfo(openAPI, updateOperationWithRef);
        Assert.assertEquals(updateProducesInfo.size(), 1);
        Assert.assertTrue(updateProducesInfo.contains("application/xml"), "contains 'application/xml'");

        CodegenOperation coUpdate = codegen.fromOperation("somepath", "post", updateOperationWithRef, null);
        Assert.assertTrue(!coUpdate.requestBody.content.isEmpty());
        Assert.assertEquals(coUpdate.requestBody.content.size(), 2);
        CodegenKey ck = codegen.getKey("application/json");
        Assert.assertTrue(coUpdate.requestBody.content.containsKey(ck));
        Assert.assertTrue(!coUpdate.produces.isEmpty());
        Assert.assertEquals(coUpdate.produces.size(), 1);
        Assert.assertTrue(coUpdate.produces.contains("application/xml"));
    }

    @Test
    public void testGetProducesInfo() throws Exception {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/produces.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        Operation textOperation = openAPI.getPaths().get("/ping/text").getGet();
        CodegenOperation coText = codegen.fromOperation("/ping/text", "get", textOperation, null);
        Assert.assertTrue(!coText.produces.isEmpty());
        Assert.assertEquals(coText.produces.size(), 1);
        Assert.assertTrue(coText.produces.contains("text/plain"));

        Operation jsonOperation = openAPI.getPaths().get("/ping/json").getGet();
        CodegenOperation coJson = codegen.fromOperation("/ping/json", "get", jsonOperation, null);
        Assert.assertTrue(!coJson.produces.isEmpty());
        Assert.assertEquals(coJson.produces.size(), 1);
        Assert.assertTrue(coJson.produces.contains("application/json"));

        Operation issue443Operation = openAPI.getPaths().get("/other/issue443").getGet();
        CodegenOperation coIssue443 = codegen.fromOperation("/other/issue443", "get", issue443Operation, null);
        Assert.assertTrue(!coIssue443.produces.isEmpty());
        Assert.assertEquals(coIssue443.produces.size(), 2);
        Assert.assertTrue(coIssue443.produces.contains("application/json"));
        Assert.assertTrue(coIssue443.produces.contains("application/text"));
    }

    @Test
    public void testInitialConfigValues() throws Exception {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.TRUE);
        Assert.assertTrue(codegen.isHideGenerationTimestamp());
    }

    @Test
    public void testSettersForConfigValues() throws Exception {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setHideGenerationTimestamp(false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
        Assert.assertFalse(codegen.isHideGenerationTimestamp());
    }

    @Test
    public void testAdditionalPropertiesPutForConfigValues() throws Exception {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.additionalProperties().put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
        Assert.assertFalse(codegen.isHideGenerationTimestamp());
    }

    @Test
    public void testArraySchemaIsNotIncludedInAliases() throws Exception {
        final DefaultCodegen codegen = new DefaultCodegen();
        Map<String, Schema> schemas = new HashMap<String, Schema>() {
            {
                put("ArraySchemaTest", new ArraySchema());
            }

        };

        Map<String, String> aliases = codegen.getAllAliases(schemas);

        Assert.assertEquals(aliases.size(), 0);
    }

    @Test
    public void testDateTimeFormParameterHasDefaultValue() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/spring/date-time-parameter-types-for-testing.yml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        RequestBody reqBody = openAPI.getPaths().get("/thingy/{date}").getPost().getRequestBody();
        CodegenRequestBody codegenParameter = codegen.fromRequestBody(reqBody, "#/paths/~1thingy~1{date}/post/requestBody");

        CodegenKey ck = codegen.getKey("application/x-www-form-urlencoded");
        Assert.assertNotNull(codegenParameter.content.get(ck).schema.refInfo);

        Schema specModel = openAPI.getComponents().getSchemas().get("updatePetWithForm_request");
        CodegenSchema model = codegen.fromSchema(
                specModel,
                "#/components/schemas/updatePetWithForm_request",
                "#/components/schemas/updatePetWithForm_request"
        );
        ck = codegen.getKey("visitDate");
        assertEquals(model.properties.get(ck).defaultValue, "1971-12-19T03:39:57-08:00");
    }

    @Test
    public void testOriginalOpenApiDocumentVersion() {
        // Test with OAS 2.0 document.
        String location = "src/test/resources/2_0/python-prior/petstore-with-fake-endpoints-models-for-testing.yaml";
        OpenAPI openAPI = TestUtils.parseFlattenSpec(location);
        SemVer version = ModelUtils.getOpenApiVersion(openAPI, location, null);
        Assert.assertEquals(version, new SemVer("2.0.0"));

        // Test with OAS 3.0 document.
        location = "src/test/resources/3_0/python/petstore_customized.yaml";
        openAPI = TestUtils.parseFlattenSpec(location);
        version = ModelUtils.getOpenApiVersion(openAPI, location, null);
        Assert.assertEquals(version, new SemVer("3.0.0"));
    }

    @Test
    public void testAdditionalPropertiesV3SpecDisallowAdditionalPropertiesIfNotPresentFalse() {
        OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/python/petstore_customized.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);
        codegen.supportsAdditionalPropertiesWithComposedSchema = true;
        codegen.setOpenAPI(openAPI);

        Schema componentSchema = openAPI.getComponents().getSchemas().get("AdditionalPropertiesClass");
        Assert.assertNull(componentSchema.getAdditionalProperties());

        // When the 'additionalProperties' keyword is not present, the schema may be
        // extended with any undeclared properties.
        Schema addProps = ModelUtils.getAdditionalProperties(openAPI, componentSchema);
        Assert.assertNotNull(addProps);
        Assert.assertEquals(addProps, new Schema());
        CodegenSchema cm = codegen.fromSchema(
                componentSchema,
                "#/components/schemas/AdditionalPropertiesClass",
                "#/components/schemas/AdditionalPropertiesClass"
        );
        Assert.assertNull(cm.additionalProperties);

        Map<String, Schema> modelPropSchemas = componentSchema.getProperties();
        Schema map_with_undeclared_properties_string_sc = modelPropSchemas.get("map_with_undeclared_properties_string");
        CodegenSchema map_with_undeclared_properties_string_cp = null;
        Schema map_with_undeclared_properties_anytype_1_sc = modelPropSchemas.get("map_with_undeclared_properties_anytype_1");
        CodegenSchema map_with_undeclared_properties_anytype_1_cp = null;
        Schema map_with_undeclared_properties_anytype_2_sc = modelPropSchemas.get("map_with_undeclared_properties_anytype_2");
        CodegenSchema map_with_undeclared_properties_anytype_2_cp = null;
        Schema map_with_undeclared_properties_anytype_3_sc = modelPropSchemas.get("map_with_undeclared_properties_anytype_3");
        CodegenSchema map_with_undeclared_properties_anytype_3_cp = null;
        Schema empty_map_sc = modelPropSchemas.get("empty_map");
        CodegenSchema empty_map_cp = null;

        for (CodegenSchema cp : cm.properties.values()) {
            if ("map_with_undeclared_properties_string".equals(cp.name.name)) {
                map_with_undeclared_properties_string_cp = cp;
            } else if ("map_with_undeclared_properties_anytype_1".equals(cp.name.name)) {
                map_with_undeclared_properties_anytype_1_cp = cp;
            } else if ("map_with_undeclared_properties_anytype_2".equals(cp.name.name)) {
                map_with_undeclared_properties_anytype_2_cp = cp;
            } else if ("map_with_undeclared_properties_anytype_3".equals(cp.name.name)) {
                map_with_undeclared_properties_anytype_3_cp = cp;
            } else if ("empty_map".equals(cp.name.name)) {
                empty_map_cp = cp;
            }
        }

        // map_with_undeclared_properties_string
        // This property has the following inline schema.
        // additionalProperties:
        //   type: string
        Assert.assertNotNull(map_with_undeclared_properties_string_sc);
        Assert.assertNotNull(map_with_undeclared_properties_string_sc.getAdditionalProperties());
        Assert.assertNotNull(map_with_undeclared_properties_string_cp.additionalProperties);

        // map_with_undeclared_properties_anytype_1
        // This property does not use the additionalProperties keyword,
        // which means by default undeclared properties are allowed.
        Assert.assertNotNull(map_with_undeclared_properties_anytype_1_sc);
        Assert.assertNull(map_with_undeclared_properties_anytype_1_sc.getAdditionalProperties());
        addProps = ModelUtils.getAdditionalProperties(openAPI, map_with_undeclared_properties_anytype_1_sc);
        Assert.assertNotNull(addProps);
        Assert.assertEquals(addProps, new Schema());
        Assert.assertNull(map_with_undeclared_properties_anytype_1_cp.additionalProperties);

        // map_with_undeclared_properties_anytype_2
        // This property does not use the additionalProperties keyword,
        // which means by default undeclared properties are allowed.
        Assert.assertNotNull(map_with_undeclared_properties_anytype_2_sc);
        Assert.assertNull(map_with_undeclared_properties_anytype_2_sc.getAdditionalProperties());
        addProps = ModelUtils.getAdditionalProperties(openAPI, map_with_undeclared_properties_anytype_2_sc);
        Assert.assertNotNull(addProps);
        Assert.assertEquals(addProps, new Schema());
        Assert.assertNull(map_with_undeclared_properties_anytype_2_cp.additionalProperties);

        // map_with_undeclared_properties_anytype_3
        // This property has the following inline schema.
        // additionalProperties: true
        Assert.assertNotNull(map_with_undeclared_properties_anytype_3_sc);
        // Unlike the V2 spec, in V3 we CAN differentiate between 'additionalProperties' not present and
        // additionalProperties: true.
        Assert.assertNotNull(map_with_undeclared_properties_anytype_3_sc.getAdditionalProperties());
        Assert.assertEquals(map_with_undeclared_properties_anytype_3_sc.getAdditionalProperties(), Boolean.TRUE);
        addProps = ModelUtils.getAdditionalProperties(openAPI, map_with_undeclared_properties_anytype_3_sc);
        Assert.assertNotNull(addProps);
        Assert.assertEquals(addProps, new Schema());
        Assert.assertNotNull(map_with_undeclared_properties_anytype_3_cp.additionalProperties);
        Assert.assertTrue(map_with_undeclared_properties_anytype_3_cp.additionalProperties.isBooleanSchemaTrue);

        // empty_map
        // This property has the following inline schema.
        // additionalProperties: false
        Assert.assertNotNull(empty_map_sc);
        // Unlike the V2 spec, in V3 we CAN differentiate between 'additionalProperties' not present and
        // additionalProperties: false.
        Assert.assertNotNull(empty_map_sc.getAdditionalProperties());
        Assert.assertEquals(empty_map_sc.getAdditionalProperties(), Boolean.FALSE);
        addProps = ModelUtils.getAdditionalProperties(openAPI, empty_map_sc);
        Assert.assertNull(addProps);
        Assert.assertNotNull(empty_map_cp.additionalProperties);
        Assert.assertTrue(empty_map_cp.additionalProperties.isBooleanSchemaFalse);

        // check of composed schema model
        String schemaName = "SomeObject";
        Schema schema = openAPI.getComponents().getSchemas().get(schemaName);
        cm = codegen.fromSchema(
                schema,
                "#/components/schemas/" + schemaName,
                "#/components/schemas/" + schemaName
        );
        Assert.assertNull(cm.additionalProperties);
    }

    @Test
    public void testAdditionalPropertiesV3SpecDisallowAdditionalPropertiesIfNotPresentTrue() {
        // As per OAS spec, when the 'additionalProperties' keyword is not present, the schema may be
        // extended with any undeclared properties.
        // However, in legacy 'additionalProperties' mode, this is interpreted as
        // 'no additional properties are allowed'.
        OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/petstore-with-fake-endpoints-models-for-testing-with-http-signature.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setDisallowAdditionalPropertiesIfNotPresent(true);
        codegen.setOpenAPI(openAPI);

        Schema schema = openAPI.getComponents().getSchemas().get("AdditionalPropertiesClass");
        Assert.assertNull(schema.getAdditionalProperties());

        Schema addProps = ModelUtils.getAdditionalProperties(openAPI, schema);
        Assert.assertNull(addProps);
    }

    @Test
    public void testEnsureNoDuplicateProduces() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/two-responses.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        Operation operation = openAPI.getPaths().get("/test").getGet();
        CodegenOperation co = codegen.fromOperation("/test", "get", operation, null);

        Assert.assertEquals(co.produces.size(), 1);
        Assert.assertTrue(co.produces.contains("application/json"));
    }

    @Test
    public void testComposedSchemaOneOfWithProperties() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/oneOf.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();

        final Schema schema = openAPI.getComponents().getSchemas().get("fruit");
        codegen.setOpenAPI(openAPI);
        CodegenSchema fruit = codegen.fromSchema(
                schema,
                "#/components/schemas/fruit",
                "#/components/schemas/fruit"
        );

        Assert.assertEquals(fruit.oneOf.get(0).refInfo.refClass, "Apple");
        Assert.assertEquals(fruit.oneOf.get(1).refInfo.refClass, "Banana");
        assertEquals(fruit.optionalProperties.size(), 1);
    }


    @Test
    public void testEscapeText() {
        final DefaultCodegen codegen = new DefaultCodegen();

        Assert.assertEquals(codegen.escapeText("\n"), " ");
        Assert.assertEquals(codegen.escapeText("\r"), " ");
        Assert.assertEquals(codegen.escapeText("\t"), " ");
        Assert.assertEquals(codegen.escapeText("\\"), "\\\\");
        Assert.assertEquals(codegen.escapeText("\""), "\\\"");
        Assert.assertEquals(codegen.escapeText("\\/"), "/");
    }

    @Test
    public void testEscapeTextWhileAllowingNewLines() {
        final DefaultCodegen codegen = new DefaultCodegen();

        // allow new lines
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\n"), "\n");
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\r"), "\r");

        // escape other special characters
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\t"), " ");
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\\"), "\\\\");
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\""), "\\\"");
        Assert.assertEquals(codegen.escapeTextWhileAllowingNewLines("\\/"), "/");
    }

    @Test
    public void updateCodegenPropertyEnum() {
        CodegenSchema array = codegenPropertyWithArrayOfIntegerValues();

        Map<String, EnumValue> enumVars = array.items.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("_1").value, "\"1\"");
        Assert.assertEquals(enumVars.get("_1").type, "number");
    }

    @Test
    public void updateCodegenPropertyEnumWithExtension() {
        DefaultCodegen codegen = new DefaultCodegen();
        {
            CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("dog", "cat"), "updateCodegenPropertyEnumWithExtension1", Arrays.asList("DOGVAR", "CATVAR"));
            LinkedHashMap<String, EnumValue> enumVars = enumProperty.enumNameToValue;
            Assert.assertNotNull(enumVars);
            Assert.assertEquals(enumVars.get("DOGVAR").value, "\"dog\"");
            Assert.assertEquals(enumVars.get("CATVAR").value, "\"cat\"");
        }
        {
            CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("1", "2"), "updateCodegenPropertyEnumWithExtension2", Arrays.asList("ONE", "TWO"));
            Map<String, EnumValue> enumVars = enumProperty.enumNameToValue;
            Assert.assertEquals(enumVars.get("ONE").value, "\"1\"");
            Assert.assertEquals(enumVars.get("TWO").value, "\"2\"");
        }
        {
            CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("a", "b", "c", "d"), "updateCodegenPropertyEnumWithExtension3", Arrays.asList("FOO", "BAR"));
            Map<String, EnumValue> enumVars = enumProperty.enumNameToValue;
            Assert.assertEquals(enumVars.get("FOO").value, "a");
            Assert.assertEquals(enumVars.get("BAR").value, "b");
            Assert.assertEquals(enumVars.get("C").value, "c");
            Assert.assertEquals(enumVars.get("D").value, "d");
        }
        {
            CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("a", "b"), "updateCodegenPropertyEnumWithExtension3", Arrays.asList("FOO", "BAR", "BAZ"));
            Map<String, EnumValue> enumVars = enumProperty.enumNameToValue;
            Assert.assertEquals(enumVars.get("FOO").value, "a");
            Assert.assertEquals(enumVars.get("BAR").value, "b");
            Assert.assertEquals(enumVars.size(), 2);
        }
    }

    @Test
    public void updateCodegenPropertyEnumWithPrefixRemoved() {
        DefaultCodegen codegen = new DefaultCodegen();
        CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("animal_dog", "animal_cat"), "updateCodegenPropertyEnumWithPrefixRemoved", null);

        Map<String, EnumValue> enumVars = enumProperty.items.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("DOG").value, "\"animal_dog\"");
        Assert.assertEquals(enumVars.get("CAT").value, "\"animal_cat\"");
    }

    @Test
    public void updateCodegenPropertyEnumWithoutPrefixRemoved() {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setRemoveEnumValuePrefix(false);

        CodegenSchema enumProperty = codegenProperty(codegen, Arrays.asList("animal_dog", "animal_cat"), "updateCodegenPropertyEnumWithoutPrefixRemoved", null);

        Map<String, EnumValue> enumVars = enumProperty.items.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("ANIMAL_DOG").value, "\"animal_dog\"");
        Assert.assertEquals(enumVars.get("ANIMAL_CAT").value, "\"animal_cat\"");
    }

    @Test
    public void postProcessModelsEnumWithPrefixRemoved() {
        TreeMap<String, CodegenSchema> schemas = codegenModel(Arrays.asList("animal_dog", "animal_cat"), "postProcessModelsEnumWithPrefixRemoved", null, null);
        CodegenSchema cm = schemas.get("model");

        Map<String, EnumValue> enumVars = cm.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("DOG").value, "\"animal_dog\"");
        Assert.assertEquals(enumVars.get("CAT").value, "\"animal_cat\"");
    }

    @Test
    public void postProcessModelsEnumWithoutPrefixRemoved() {
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setRemoveEnumValuePrefix(false);
        TreeMap<String, CodegenSchema> objs = codegenModel(Arrays.asList("animal_dog", "animal_cat"), "postProcessModelsEnumWithoutPrefixRemoved", null, null);
        CodegenSchema cm = objs.get("model");

        Map<String, EnumValue> enumVars = cm.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("ANIMAL_DOG").value, "\"animal_dog\"");
        Assert.assertEquals(enumVars.get("ANIMAL_CAT").value, "\"animal_cat\"");
    }

    @Test
    public void postProcessModelsEnumWithExtension() {
        TreeMap<String, CodegenSchema> objs = codegenModel(Arrays.asList("animal_dog", "animal_cat"), "postProcessModelsEnumWithExtension", Arrays.asList("DOGVAR", "CATVAR"), Arrays.asList("This is a dog", "This is a cat"));
        CodegenSchema cm = objs.get("model");

        Map<String, EnumValue> enumVars = cm.enumNameToValue;
        Assert.assertNotNull(enumVars);
        Assert.assertEquals(enumVars.get("DOGVAR").value, "\"dog\"");
        Assert.assertEquals(enumVars.get("DOGVAR").description, "This is a dog");
        Assert.assertEquals(enumVars.get("CATVAR").value, "\"cat\"");
        Assert.assertEquals(enumVars.get("CATVAR").description, "This is a cat");
    }

    @Test
    public void testExample1() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/examples.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();

        PathItem path = openAPI.getPaths().get("/example1/singular");
        CodegenOperation op = codegen.fromOperation("/example1/singular", "get", path.getGet(), path.getServers());
        assertEquals(op.queryParams.get(0).example, "example1 value");

        path = openAPI.getPaths().get("/example1/plural");
        op = codegen.fromOperation("/example1/plural", "get", path.getGet(), path.getServers());
        assertEquals(op.queryParams.get(0).example, "An example1 value");
    }

    @Test
    public void testExample2() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/examples.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();

        PathItem path = openAPI.getPaths().get("/example2/singular");
        CodegenOperation op = codegen.fromOperation("/example2/singular", "get", path.getGet(), path.getServers());
        assertEquals(op.queryParams.get(0).example, "example2 value");
    }

    @Test
    public void testExample3() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/examples.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();

        PathItem path = openAPI.getPaths().get("/example3/singular");
        CodegenOperation op = codegen.fromOperation("/example3/singular", "get", path.getGet(), path.getServers());
        assertEquals(op.queryParams.get(0).example, "example3: parameter value");

        path = openAPI.getPaths().get("/example3/plural");
        op = codegen.fromOperation("/example3/plural", "get", path.getGet(), path.getServers());
        assertEquals(op.queryParams.get(0).example, "An example3 value");
    }

    @Test
    public void testDiscriminator() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        DefaultCodegen codegen = new DefaultCodegen();

        Schema animal = openAPI.getComponents().getSchemas().get("Animal");
        codegen.setOpenAPI(openAPI);
        CodegenSchema animalModel = codegen.fromSchema(
                animal,
                "#/components/schemas/Animal",
                "#/components/schemas/Animal"
        );
        CodegenDiscriminator discriminator = animalModel.discriminator;
        String propertyName = "className";
        String propertyBaseName = "className";
        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        mappedModels.add(new CodegenDiscriminator.MappedModel("BigCat", "BigCat"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Cat", "Cat"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Dog", "Dog"));

        CodegenDiscriminator expectedDiscriminator = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, mappedModels);
        Assert.assertEquals(discriminator, expectedDiscriminator);
        assertEquals(animalModel.hasDiscriminatorWithNonEmptyMapping(), true);
    }

    @Test
    public void testDiscriminatorWithCustomMapping() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        Schema person = openAPI.getComponents().getSchemas().get("Person");
        codegen.setOpenAPI(openAPI);
        CodegenSchema personModel = codegen.fromSchema(
                person,
                "#/components/schemas/Person",
                "#/components/schemas/Person"
        );
        verifyPersonDiscriminator(personModel.discriminator);
        assertEquals(personModel.hasDiscriminatorWithNonEmptyMapping(), true);
    }

    @Test
    public void testAllOfRequired() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf-required.yaml");
        DefaultCodegen codegen = new DefaultCodegen();

        Schema child = openAPI.getComponents().getSchemas().get("clubForCreation");
        codegen.setOpenAPI(openAPI);
        CodegenSchema childModel = codegen.fromSchema(
                child,
                "#/components/schemas/clubForCreation",
                "#/components/schemas/clubForCreation"
        );
        assertEquals(childModel.requiredProperties.size(), 1);
    }

    @Test
    public void testComposedSchemaAllOfDiscriminatorMap() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf_composition_discriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setLegacyDiscriminatorBehavior(false);
        Schema sc;
        String modelName;

        String propertyName = "petType";
        String propertyBaseName = propertyName;
        CodegenDiscriminator emptyMapDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, new TreeSet<>());

        // all leaf Schemas have discriminators with PropertyName/BaseName + empty discriminator maps
        List<String> leafModelNames = Arrays.asList("Cat", "Dog", "Lizard", "Snake");
        for (String leafModelName : leafModelNames) {
            Schema leafSc = openAPI.getComponents().getSchemas().get(leafModelName);
            CodegenSchema leafCm = codegen.fromSchema(
                    leafSc,
                    "#/components/schemas/" + leafModelName,
                    "#/components/schemas/" + leafModelName
            );
            assertEquals(leafCm.discriminator, emptyMapDisc);
            assertEquals(leafCm.hasDiscriminatorWithNonEmptyMapping(), false);
        }

        // the Pet discriminator map contains all animals + Reptile (children + grandchildren)
        TreeSet hs = new TreeSet<>();
        for (String leafModelName : leafModelNames) {
            hs.add(new CodegenDiscriminator.MappedModel(leafModelName, codegen.toModelName(leafModelName)));
        }
        hs.add(new CodegenDiscriminator.MappedModel("Reptile", codegen.toModelName("Reptile")));
        CodegenDiscriminator petDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        modelName = "Pet";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema pet = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(pet.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(pet.discriminator, petDisc);

        // the Reptile discriminator contains both reptiles
        List<String> reptileModelNames = Arrays.asList("Lizard", "Snake");
        hs.clear();
        for (String reptileModelName : reptileModelNames) {
            hs.add(new CodegenDiscriminator.MappedModel(reptileModelName, codegen.toModelName(reptileModelName)));
        }
        CodegenDiscriminator reptileDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        modelName = "Reptile";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema reptile = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(reptile.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(reptile.discriminator, reptileDisc);

        // the MyPets discriminator contains Cat and Lizard
        List<String> myPetNames = Arrays.asList("Cat", "Lizard");
        hs.clear();
        for (String myPetName : myPetNames) {
            hs.add(new CodegenDiscriminator.MappedModel(myPetName, codegen.toModelName(myPetName)));
        }
        CodegenDiscriminator myPetDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        modelName = "MyPets";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema myPets = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(myPets.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(myPets.discriminator, myPetDisc);

        // the MyPetsNoDisc discriminator is created because all oneOf classes have the same discriminator
        modelName = "MyPetsNoDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema myPetsNoDisc = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(myPetsNoDisc.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(myPetsNoDisc.discriminator, myPetDisc);

        CodegenSchema cm;

        // the mapping in b is in A
        modelName = "A";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs.clear();
        hs.add(new CodegenDiscriminator.MappedModel("b", codegen.toModelName("B")));
        hs.add(new CodegenDiscriminator.MappedModel("B", codegen.toModelName("B")));
        hs.add(new CodegenDiscriminator.MappedModel("C", codegen.toModelName("C")));
        assertEquals(cm.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(cm.discriminator.mappedModels, hs);

        // the mapping in b is in B
        modelName = "B";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs.clear();
        hs.add(new CodegenDiscriminator.MappedModel("b", codegen.toModelName("B")));
        hs.add(new CodegenDiscriminator.MappedModel("C", codegen.toModelName("C")));
        assertEquals(cm.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(cm.discriminator.mappedModels, hs);

        // the mapping in b is in C
        modelName = "C";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs.clear();
        hs.add(new CodegenDiscriminator.MappedModel("b", codegen.toModelName("B")));
        assertEquals(cm.hasDiscriminatorWithNonEmptyMapping(), true);
        assertEquals(cm.discriminator.mappedModels, hs);
    }

    @Test
    public void testComposedSchemaAllOfDiscriminatorMapLegacy() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf_composition_discriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        // codegen.legacyDiscriminatorBehavior remains false in the legacy use case
        codegen.setOpenAPI(openAPI);
        Schema sc;
        String modelName;

        String propertyName = "petType";
        String propertyBaseName = propertyName;
        CodegenDiscriminator emptyMapDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, null);

        // all leaf Schemas have discriminators with PropertyName/BaseName + empty discriminator maps
        List<String> leafModelNames = Arrays.asList("Cat", "Dog", "Lizard", "Snake");
        for (String leafModelName : leafModelNames) {
            Schema leafSc = openAPI.getComponents().getSchemas().get(leafModelName);
            CodegenSchema leafCm = codegen.fromSchema(
                    leafSc,
                    "#/components/schemas/" + leafModelName,
                    "#/components/schemas/" + leafModelName
            );
            Assert.assertNull(leafCm.discriminator);
        }

        // the Pet discriminator map contains all animals + Reptile (children + grandchildren)
        TreeSet hs = new TreeSet<>();
        for (String leafModelName : leafModelNames) {
            hs.add(new CodegenDiscriminator.MappedModel(leafModelName, codegen.toModelName(leafModelName)));
        }
        hs.add(new CodegenDiscriminator.MappedModel("Reptile", codegen.toModelName("Reptile")));
        CodegenDiscriminator petDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        modelName = "Pet";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema pet = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(pet.discriminator, petDisc);

        // the Reptile discriminator contains both reptiles
        List<String> reptileModelNames = Arrays.asList("Lizard", "Snake");
        hs.clear();
        for (String reptileModelName : reptileModelNames) {
            hs.add(new CodegenDiscriminator.MappedModel(reptileModelName, codegen.toModelName(reptileModelName)));
        }
        CodegenDiscriminator reptileDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        modelName = "Reptile";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema reptile = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        Assert.assertNull(reptile.discriminator);

        // the MyPets discriminator contains Cat and Lizard
        CodegenDiscriminator myPetDisc = new CodegenDiscriminator(propertyName, propertyBaseName, null, false, hs);
        hs.clear();
        modelName = "MyPets";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema myPets = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(myPets.discriminator, myPetDisc);

        // the MyPetsNoDisc discriminator is created because all oneOf classes have the same discriminator
        modelName = "MyPetsNoDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema myPetsNoDisc = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        Assert.assertNull(myPetsNoDisc.discriminator);

        CodegenSchema cm;

        // the mapping in b is in A
        modelName = "A";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs.clear();
        hs.add(new CodegenDiscriminator.MappedModel("b", codegen.toModelName("B")));
        assertEquals(cm.discriminator.mappedModels, hs);

        // the mapping in b is in B
        modelName = "B";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        Assert.assertNull(cm.discriminator);

        // the mapping in b is in C
        modelName = "C";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        Assert.assertNull(cm.discriminator);
    }

    @Test
    public void testComposedSchemaOneOfDiscriminatorsInvalid() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/oneOfDiscriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        HashMap<String, String> hm = new HashMap<>();
        hm.put("ComposedDiscMissingNoProperties", "'ComposedDiscMissingNoProperties' defines discriminator 'fruitType', but the referenced schema 'DiscMissingNoProperties' is incorrect. fruitType is missing from the schema, define it as required and type string");
        hm.put("ComposedDiscMissingFromProperties", "'ComposedDiscMissingFromProperties' defines discriminator 'fruitType', but the referenced schema 'DiscMissingFromProperties' is incorrect. fruitType is missing from the schema, define it as required and type string");
        hm.put("ComposedDiscOptionalTypeCorrect", "'ComposedDiscOptionalTypeCorrect' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeCorrect' is incorrect. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscOptionalTypeIncorrect", "'ComposedDiscOptionalTypeIncorrect' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeIncorrect' is incorrect. invalid type for fruitType, set it to string. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscOptionalTypeInconsistent", "'ComposedDiscOptionalTypeInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeIncorrect' is incorrect. invalid type for fruitType, set it to string. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscTypeIncorrect", "'ComposedDiscTypeIncorrect' defines discriminator 'fruitType', but the referenced schema 'DiscTypeIncorrect' is incorrect. invalid type for fruitType, set it to string");
        hm.put("ComposedDiscTypeInconsistent", "'ComposedDiscTypeInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscTypeIncorrect' is incorrect. invalid type for fruitType, set it to string");
        hm.put("ComposedDiscRequiredInconsistent", "'ComposedDiscRequiredInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeCorrect' is incorrect. invalid optional definition of fruitType, include it in required");

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            String modelName = entry.getKey();
            String errorMessageExpected = entry.getValue();

            Schema sc = openAPI.getComponents().getSchemas().get(modelName);

            /*
            // comment out below as we're now showing warnings instead of throwing exceptions
            try {
                codegen.fromSchema(modelName, sc);
                Assert.assertTrue(false, "A RuntimeException should have been thrown when processing "+modelName+ " but it was not");
            } catch (RuntimeException re) {
                Assert.assertEquals(re.getMessage(), errorMessageExpected);
            }
            */
        }
    }

    @Test
    public void testComposedSchemaAnyOfDiscriminatorsInvalid() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/anyOfDiscriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        HashMap<String, String> hm = new HashMap<>();
        hm.put("ComposedDiscMissingNoProperties", "'ComposedDiscMissingNoProperties' defines discriminator 'fruitType', but the referenced schema 'DiscMissingNoProperties' is incorrect. fruitType is missing from the schema, define it as required and type string");
        hm.put("ComposedDiscMissingFromProperties", "'ComposedDiscMissingFromProperties' defines discriminator 'fruitType', but the referenced schema 'DiscMissingFromProperties' is incorrect. fruitType is missing from the schema, define it as required and type string");
        hm.put("ComposedDiscOptionalTypeCorrect", "'ComposedDiscOptionalTypeCorrect' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeCorrect' is incorrect. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscOptionalTypeIncorrect", "'ComposedDiscOptionalTypeIncorrect' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeIncorrect' is incorrect. invalid type for fruitType, set it to string. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscOptionalTypeInconsistent", "'ComposedDiscOptionalTypeInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeIncorrect' is incorrect. invalid type for fruitType, set it to string. invalid optional definition of fruitType, include it in required");
        hm.put("ComposedDiscTypeIncorrect", "'ComposedDiscTypeIncorrect' defines discriminator 'fruitType', but the referenced schema 'DiscTypeIncorrect' is incorrect. invalid type for fruitType, set it to string");
        hm.put("ComposedDiscTypeInconsistent", "'ComposedDiscTypeInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscTypeIncorrect' is incorrect. invalid type for fruitType, set it to string");
        hm.put("ComposedDiscRequiredInconsistent", "'ComposedDiscRequiredInconsistent' defines discriminator 'fruitType', but the referenced schema 'DiscOptionalTypeCorrect' is incorrect. invalid optional definition of fruitType, include it in required");

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            String modelName = entry.getKey();
            String errorMessageExpected = entry.getValue();

            Schema sc = openAPI.getComponents().getSchemas().get(modelName);

            /*
            // comment out below as we're now showing warnings instead of throwing exceptions
            try {
                codegen.fromSchema(modelName, sc);
                Assert.assertTrue(false, "A RuntimeException should have been thrown when processing "+modelName+ " but it was not");
            } catch (RuntimeException re) {
                Assert.assertEquals(re.getMessage(), errorMessageExpected);
            }
            */
        }
    }

    @Test
    public void testComposedSchemaAnyOfDiscriminatorMap() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/anyOfDiscriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        String modelName;
        Schema sc;
        CodegenSchema cm;
        java.util.LinkedHashSet hs;
        String mn;

        // inline anyOf models work because the inline schemas are turned into $refs
        modelName = "FruitInlineDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "FruitInlineDisc_anyOf";
        hs.add(new CodegenDiscriminator.MappedModel(mn, codegen.toModelName(mn)));
        mn = "FruitInlineDisc_anyOf_1";
        hs.add(new CodegenDiscriminator.MappedModel(mn, codegen.toModelName(mn)));
        assertEquals(cm.discriminator.mappedModels, hs);

        // inline anyOf with inline anyOf model doesn't work because we have null $refs and we throw an exception
        final String fmodelName = "FruitInlineInlineDisc";
        final Schema fsc = openAPI.getComponents().getSchemas().get(fmodelName);
        // comment out below as we're now showing warnings instead of throwing exceptions
        //Assert.assertThrows(() -> codegen.fromSchema(fmodelName, fsc));

        // ref anyOf models with discriminator in properties in those models
        modelName = "FruitReqDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleReqDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaReqDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in allOf in those models
        modelName = "FruitAllOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleAllOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaAllOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in anyOf in those models
        modelName = "FruitAnyOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in anyOf in those models
        modelName = "FruitAnyOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in the grandparent schemas of those anyof models
        modelName = "FruitGrandparentDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleGrandparentDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaGrandparentDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);
    }

    @Test
    public void testComposedSchemaOneOfDiscriminatorMap() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/oneOfDiscriminator.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        String modelName;
        Schema sc;
        CodegenSchema cm;
        java.util.LinkedHashSet hs;
        String mn;

        // inline oneOf models work because the inline schemas are turned into $refs
        modelName = "FruitInlineDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "FruitInlineDisc_oneOf";
        hs.add(new CodegenDiscriminator.MappedModel(mn, codegen.toModelName(mn)));
        mn = "FruitInlineDisc_oneOf_1";
        hs.add(new CodegenDiscriminator.MappedModel(mn, codegen.toModelName(mn)));
        assertEquals(cm.discriminator.mappedModels, hs);

        // inline oneOf with inline oneOf model doesn't work because we have null $refs and we throw an exception
        final String fmodelName = "FruitInlineInlineDisc";
        final Schema fsc = openAPI.getComponents().getSchemas().get(fmodelName);
        // comment out below as we're now showing warnings instead of throwing exceptions
        //Assert.assertThrows(() -> codegen.fromSchema(fmodelName, fsc));

        // ref oneOf models with discriminator in properties in those models
        modelName = "FruitReqDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleReqDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaReqDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in allOf in those models
        modelName = "FruitAllOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleAllOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaAllOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in anyOf in those models
        modelName = "FruitAnyOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaAnyOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in oneOf in those models
        modelName = "FruitOneOfDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleOneOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaOneOfDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);

        // ref oneOf models with discriminator in the grandparent schemas of those oneof models
        modelName = "FruitGrandparentDisc";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        hs = new java.util.LinkedHashSet();
        mn = "AppleGrandparentDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        mn = "BananaGrandparentDisc";
        hs.add(new CodegenDiscriminator.MappedModel(mn, mn));
        assertEquals(cm.discriminator.mappedModels, hs);
    }

    @Test
    public void testComposedSchemaMyPetsOneOfDiscriminatorMap() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf_composition_discriminator.yaml");

        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        Schema pet = openAPI.getComponents().getSchemas().get("MyPets");
        CodegenSchema petModel = codegen.fromSchema(
                pet,
                "#/components/schemas/MyPets",
                "#/components/schemas/MyPets"
        );
        verifyMyPetsDiscriminator(petModel.discriminator);
    }

    @Test
    public void testComposedSchemaAllOfHierarchy() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf_composition_discriminator.yaml");

        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setLegacyDiscriminatorBehavior(false);
        codegen.setOpenAPI(openAPI);

        Schema pet = openAPI.getComponents().getSchemas().get("Lizard");
        CodegenSchema petModel = codegen.fromSchema(
                pet,
                "#/components/schemas/Lizard",
                "#/components/schemas/Lizard"
        );
        verifyLizardDiscriminator(petModel.discriminator);

        pet = openAPI.getComponents().getSchemas().get("Reptile");
        petModel = codegen.fromSchema(
                pet,
                "#/components/schemas/Reptile",
                "#/components/schemas/Reptile"
        );
        verifyReptileDiscriminator(petModel.discriminator);
    }

    private void verifyLizardDiscriminator(CodegenDiscriminator discriminator) {
        String prop = "petType";
        String propertyName = prop;
        String propertyBaseName = prop;
        Map<String, String> mapping = null;
        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        CodegenDiscriminator test = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, false, mappedModels);
        assertEquals(discriminator, test);
    }

    private void verifyReptileDiscriminator(CodegenDiscriminator discriminator) {
        String prop = "petType";
        String propertyName = prop;
        String propertyBaseName = prop;
        Map<String, String> mapping = null;
        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        mappedModels.add(new CodegenDiscriminator.MappedModel("Lizard", "Lizard"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Snake", "Snake"));
        CodegenDiscriminator expectedDiscriminator = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, false, mappedModels);
        assertEquals(discriminator, expectedDiscriminator);
    }

    private void verifyMyPetsDiscriminator(CodegenDiscriminator discriminator) {
        String prop = "petType";
        String propertyName = prop;
        String propertyBaseName = prop;
        Map<String, String> mapping = null;
        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        mappedModels.add(new CodegenDiscriminator.MappedModel("Cat", "Cat"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Lizard", "Lizard"));
        CodegenDiscriminator expectedDiscriminator = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, false, mappedModels);
        assertEquals(discriminator, expectedDiscriminator);
    }

    @Test
    public void verifyXDiscriminatorValue() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/x-discriminator-value.yaml");
        final DefaultCodegen config = new DefaultCodegen();
        config.setOpenAPI(openAPI);

        String modelName;
        CodegenDiscriminator discriminator;
        Schema sc;
        CodegenSchema cm;

        Boolean dryRun = Boolean.TRUE;
        final DefaultGenerator generator = new DefaultGenerator(dryRun);
        generator.openAPI = openAPI;
        generator.config = config;
        generator.configureGeneratorProperties();

        // check that the model's children contain the x-discriminator-values
        modelName = "BaseObj";
        cm = generator.config.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        Assert.assertNotNull(cm);

        // check that the discriminator's MappedModels also contains the x-discriminator-values
        String prop = "object_type";
        String propertyName = config.toVarName(prop);
        String propertyBaseName = prop;
        Map<String, String> mapping = null;
        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        mappedModels.add(new CodegenDiscriminator.MappedModel("daily", "DailySubObj"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("DailySubObj", "DailySubObj"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("sub-obj", "SubObj"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("SubObj", "SubObj"));
        discriminator = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, false, mappedModels);
        assertEquals(cm.discriminator, discriminator);
    }


    @Test
    public void testAllOfSingleRefNoOwnProps() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/composed-allof.yaml");
        final DefaultCodegen codegen = new CodegenWithMultipleInheritance();

        Schema schema = openAPI.getComponents().getSchemas().get("NewMessageEventCoreNoOwnProps");
        codegen.setOpenAPI(openAPI);
        CodegenSchema model = codegen.fromSchema(
                schema,
                "#/components/schemas/NewMessageEventCoreNoOwnProps",
                "#/components/schemas/NewMessageEventCoreNoOwnProps"
        );
        assertEquals(
                model.properties,
                null
        );
    }

    @Test
    public void testAllOfParent() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf-required-parent.yaml");
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        Schema person = openAPI.getComponents().getSchemas().get("person");
        CodegenSchema personModel = codegen.fromSchema(
                person,
                "#/components/schemas/person",
                "#/components/schemas/person"
        );
        assertEquals(personModel.requiredProperties.size(), 1);

        Schema personForCreation = openAPI.getComponents().getSchemas().get("personForCreation");
        CodegenSchema personForCreationModel = codegen.fromSchema(
                personForCreation,
                "#/components/schemas/personForCreation",
                "#/components/schemas/personForCreation"
        );
        assertEquals(personForCreationModel.requiredProperties.size(), 3);

        Schema personForUpdate = openAPI.getComponents().getSchemas().get("personForUpdate");
        CodegenSchema personForUpdateModel = codegen.fromSchema(
                personForUpdate,
                "#/components/schemas/personForUpdate",
                "#/components/schemas/personForUpdate"
        );
        assertEquals(personForUpdateModel.requiredProperties, null);
    }

    private List<String> getRequiredVars(CodegenSchema model) {
        return model.requiredProperties.keySet().stream().map(ck -> ck.name).collect(Collectors.toList());
    }

    @Test
    public void testCallbacks() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/callbacks.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        final String path = "/streams";
        Operation subscriptionOperation = openAPI.getPaths().get("/streams").getPost();
        CodegenOperation op = codegen.fromOperation(path, "post", subscriptionOperation, null);

        Assert.assertNotNull(op.operationId);
        Assert.assertEquals(op.callbacks.size(), 2);

        CodegenCallback cbB = op.callbacks.get(1);
        Assert.assertEquals(cbB.name, "dummy");
        Assert.assertEquals(cbB.urls.size(), 0);

        CodegenCallback cbA = op.callbacks.get(0);
        Assert.assertEquals(cbA.name, "onData");

        Assert.assertEquals(cbA.urls.size(), 2);

        CodegenCallback.Url urlB = cbA.urls.get(1);
        Assert.assertEquals(urlB.expression, "{$request.query.callbackUrl}/test");
        Assert.assertEquals(urlB.requests.size(), 0);

        CodegenCallback.Url urlA = cbA.urls.get(0);
        Assert.assertEquals(urlA.expression, "{$request.query.callbackUrl}/data");
        Assert.assertEquals(urlA.requests.size(), 2);

        urlA.requests.forEach(req -> {
            Assert.assertNull(req.callbacks);
            Assert.assertNotNull(req.requestBody);
            Assert.assertEquals(req.responses.size(), 2);

            CodegenKey ck = codegen.getKey("application/json");
            switch (req.httpMethod.name) {
                case "post":
                    Assert.assertEquals(req.operationId.camelCaseName, "OnDataDataPost");
                    Assert.assertEquals(req.requestBody.content.get(ck).schema.refInfo.refClass, "NewNotificationData");
                    break;
                case "delete":
                    Assert.assertEquals(req.operationId.camelCaseName, "OnDataDataDelete");
                    Assert.assertEquals(req.requestBody.content.get(ck).schema.refInfo.refClass, "DeleteNotificationData");
                    break;
                default:
                    Assert.fail(String.format(Locale.getDefault(), "invalid callback request http method '%s'", req.httpMethod.name));
            }
        });
    }

    @Test
    public void testLeadingSlashIsAddedIfMissing() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        Operation operation1 = new Operation().operationId("op1").responses(new ApiResponses().addApiResponse("201", new ApiResponse().description("OK")));
        openAPI.path("/here", new PathItem().get(operation1));
        Operation operation2 = new Operation().operationId("op2").responses(new ApiResponses().addApiResponse("201", new ApiResponse().description("OK")));
        openAPI.path("some/path", new PathItem().get(operation2));
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        CodegenOperation co1 = codegen.fromOperation("/here", "get", operation2, null);
        Assert.assertEquals(co1.path.name, "/here");
        CodegenOperation co2 = codegen.fromOperation("some/path", "get", operation2, null);
        Assert.assertEquals(co2.path.name, "/some/path");
    }

    @Test
    public void testDefaultResponseShouldBeLast() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        Operation myOperation = new Operation().operationId("myOperation").responses(
                new ApiResponses()
                        .addApiResponse(
                                "default", new ApiResponse().description("Default"))
                        .addApiResponse(
                                "422", new ApiResponse().description("Error"))
        );
        openAPI.path("/here", new PathItem().get(myOperation));
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        CodegenOperation co = codegen.fromOperation("/here", "get", myOperation, null);
        Assert.assertEquals(co.responses.get("422").message, "Error");
        Assert.assertEquals(co.responses.get("default").message, "Default");
    }

    @Test
    public void testResponseWithNoSchemaInHeaders() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        ApiResponse response2XX = new ApiResponse()
                .description("OK")
                .addHeaderObject("x-custom-header", new Header()
                        .description("a custom header")
                        .style(Header.StyleEnum.SIMPLE));
        Operation operation1 = new Operation().operationId("op1").responses(new ApiResponses().addApiResponse("2XX", response2XX));
        openAPI.path("/here", new PathItem().get(operation1));
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        CodegenResponse cr = codegen.fromResponse(response2XX, "");
        Assert.assertNotNull(cr);
        Assert.assertNotNull(cr.headers);
    }

    @Test
    public void testNullableProperty() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/examples.yaml");
        new InlineModelResolver().flatten(openAPI);
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("User_address"),
                "#/components/schemas/User_address",
                "#/components/schemas/User_address"
        );
        CodegenSchema property = codegen.fromSchema(
                (Schema) openAPI.getComponents().getSchemas().get("User").getProperties().get("address"),
                "#/components/schemas/User",
                "#/components/schemas/User/properties/address"
        );
        Assert.assertTrue(property.refInfo.ref.nullable);
    }

    @Test
    public void testDeprecatedModel() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/component-deprecated.yml");
        new InlineModelResolver().flatten(openAPI);
        final DefaultCodegen codegen = new DefaultCodegen();

        CodegenSchema codegenPetModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("Pet"),
                "#/components/schemas/Pet",
                "#/components/schemas/Pet"
        );
        Assert.assertTrue(codegenPetModel.deprecated);

        CodegenSchema codegenFoodModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("Food"),
                "#/components/schemas/Food",
                "#/components/schemas/Food"
        );
        Assert.assertTrue(codegenFoodModel.deprecated);
    }

    @Test
    public void testDeprecatedProperty() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/property-deprecated.yaml");
        new InlineModelResolver().flatten(openAPI);
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        final Map responseProperties = Collections.unmodifiableMap(openAPI.getComponents().getSchemas().get("Response").getProperties());
        final Map requestProperties = Collections.unmodifiableMap(openAPI.getComponents().getSchemas().get("Request").getProperties());

        Assert.assertTrue(codegen.fromSchema(
                (Schema) responseProperties.get("firstName"),
                "#/components/schemas/Response",
                "#/components/schemas/Response/properties/firstName"
        ).deprecated);
        assertNull(codegen.fromSchema(
                (Schema) responseProperties.get("customerCode"),
                "#/components/schemas/Response",
                "#/components/schemas/Response/properties/customerCode"
        ).deprecated);
        Assert.assertTrue(codegen.fromSchema(
                (Schema) requestProperties.get("firstName"),
                "#/components/schemas/Request",
                "#/components/schemas/Request/properties/firstName"
        ).deprecated);
        assertNull(codegen.fromSchema(
                (Schema) requestProperties.get("customerCode"),
                "#/components/schemas/Request",
                "#/components/schemas/Request/properties/customerCode"
        ).deprecated);
    }

    @Test
    public void testDeprecatedRef() {
        final OpenAPI openAPI = TestUtils.parseSpec("src/test/resources/3_0/model-deprecated.yaml");
        new InlineModelResolver().flatten(openAPI);
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        final Map<String, Schema> requestProperties = openAPI.getComponents().getSchemas().get("complex").getProperties();

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("deprecated"),
                "#/components/schemas/deprecated",
                "#/components/schemas/deprecated"
        );
        Assert.assertTrue(codegen.fromSchema(
                requestProperties.get("deprecated"),
                "#/components/schemas/complex",
                "#/components/schemas/complex/properties/deprecated"
        ).refInfo.ref.deprecated);
        assertNull(codegen.fromSchema(
                requestProperties.get("current"),
                "#/components/schemas/complex",
                "#/components/schemas/complex/properties/current"
        ).deprecated);
    }

    @Test
    public void integerSchemaPropertyAndModelTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new IntegerSchema().format("int32");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        //Property:
        final CodegenSchema cp = codegen.fromSchema(
                schema,
                "#/components/schemas/A",
                "#/components/schemas/A/properties/someProperty"
        );
        Assert.assertEquals(cp.name.name, "someProperty");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("integer"));

        //Model:
        final CodegenSchema cm = codegen.fromSchema(
                schema,
                "#/components/schemas/someModel",
                "#/components/schemas/someModel"
        );
        Assert.assertEquals(cm.name.name, "someModel");
        Assert.assertTrue(cm.types.contains("integer"));
        Assert.assertTrue(cm.types.size() == 1);
    }

    @Test
    public void longSchemaPropertyAndModelTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new IntegerSchema().format("int64");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        //Property:
        final CodegenSchema cp = codegen.fromSchema(
                schema,
                "#/components/schemas/A/properties/someProperty",
                "#/components/schemas/A/properties/someProperty"
        );
        Assert.assertEquals(cp.name.name, "someProperty");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("integer"));
        Assert.assertTrue(cp.format.equals("int64"));

        //Model:
        final CodegenSchema cm = codegen.fromSchema(
                schema,
                "#/components/schemas/someModel",
                "#/components/schemas/someModel"
        );
        Assert.assertEquals(cm.name.name, "someModel");
        Assert.assertTrue(cm.types.size() == 1);
        Assert.assertTrue(cm.types.contains("integer"));
        Assert.assertTrue(cm.format.equals("int64"));
    }

    @Test
    public void numberSchemaPropertyAndModelTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new NumberSchema();
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        //Property:
        final CodegenSchema cp = codegen.fromSchema(
                schema,
                "#/components/schemas/A/properties/someProperty",
                "#/components/schemas/A/properties/someProperty"
        );
        Assert.assertEquals(cp.name.name, "someProperty");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("number"));

        //Model:
        final CodegenSchema cm = codegen.fromSchema(
                schema,
                "#/components/schemas/someModel",
                "#/components/schemas/someModel"
        );
        Assert.assertEquals(cm.name.name, "someModel");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("number"));
    }

    @Test
    public void numberFloatSchemaPropertyAndModelTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new NumberSchema().format("float");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        //Property:
        final CodegenSchema cp = codegen.fromSchema(
                schema,
                "#/components/schemas/A",
                "#/components/schemas/A/properties/someProperty"
        );
        Assert.assertEquals(cp.name.name, "someProperty");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("number"));
        Assert.assertTrue(cp.format.equals("float"));

        //Model:
        final CodegenSchema cm = codegen.fromSchema(
                schema,
                "#/components/schemas/someModel",
                "#/components/schemas/someModel"
        );
        Assert.assertEquals(cm.name.name, "someModel");
        assertEquals(cm.types.size(), 1);
        Assert.assertTrue(cm.types.contains("number"));
        assertEquals(cm.format, "float");
    }

    @Test
    public void numberDoubleSchemaPropertyAndModelTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new NumberSchema().format("double");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        //Property:
        final CodegenSchema cp = codegen.fromSchema(
                schema,
                "#/components/schemas/A",
                "#/components/schemas/A/properties/someProperty"
        );
        Assert.assertEquals(cp.name.name, "someProperty");
        Assert.assertTrue(cp.types.size() == 1);
        Assert.assertTrue(cp.types.contains("number"));
        Assert.assertTrue(cp.format.equals("double"));

        //Model:
        final CodegenSchema cm = codegen.fromSchema(
                schema,
                "#/components/schemas/someModel",
                "#/components/schemas/someModel"
        );
        Assert.assertEquals(cm.name.name, "someModel");
        Assert.assertTrue(cm.types.size() == 1);
        Assert.assertTrue(cm.types.contains("number"));
        Assert.assertTrue(cm.format.equals("double"));
    }

    @Test
    public void testAlias() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/type_alias.yaml");
        new InlineModelResolver().flatten(openAPI);

        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("TypeAliasToString"),
                "#/components/schemas/TypeAliasToString",
                "#/components/schemas/TypeAliasToString"
        );
        CodegenSchema typeAliasModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("MyParameterTextField"),
                "#/components/schemas/MyParameterTextField",
                "#/components/schemas/MyParameterTextField"
        );
        assertTrue(typeAliasModel.refInfo.ref.types.size() == 1);
        assertTrue(typeAliasModel.refInfo.ref.types.contains("string"));
    }

    private void verifyPersonDiscriminator(CodegenDiscriminator discriminator) {
        String propertyName = "DollarUnderscoretype";
        String propertyBaseName = "$_type";
        HashMap<String, String> mapping = new HashMap<>();
        mapping.put("a", "#/components/schemas/Adult");
        mapping.put("c", "Child");

        TreeSet<CodegenDiscriminator.MappedModel> mappedModels = new TreeSet<>();
        mappedModels.add(new CodegenDiscriminator.MappedModel("a", "Adult"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("c", "Child"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Adult", "Adult"));
        mappedModels.add(new CodegenDiscriminator.MappedModel("Child", "Child"));
        CodegenDiscriminator expectedDiscriminator = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, false, mappedModels);
        Assert.assertEquals(discriminator, expectedDiscriminator);
    }

    private CodegenSchema codegenPropertyWithArrayOfIntegerValues() {
        IntegerSchema itemsSchema = new IntegerSchema();
        itemsSchema.setEnum(Arrays.asList(1));
        ArraySchema arraySchema = new ArraySchema();
        arraySchema.setItems(itemsSchema);

        final DefaultCodegen codegen = new DefaultCodegen();
        String jsonPath = "#/components/schemas/codegenPropertyWithArrayOfIntegerValues";
        return codegen.fromSchema(arraySchema, jsonPath, jsonPath);
    }

    private CodegenSchema codegenProperty(DefaultCodegen codegen, List<String> values, String identifier, List<String> xEnumVarnames) {
        StringSchema itemsSchema = new StringSchema();
        itemsSchema.setEnum(values);
        if (xEnumVarnames != null) {
            HashMap<String, Object> extensions = new HashMap<>();
            extensions.put("x-enum-varnames", xEnumVarnames);
            itemsSchema.setExtensions(extensions);
        }
        ArraySchema arraySchema = new ArraySchema();
        arraySchema.setItems(itemsSchema);
        String jsonPath = "#/components/schemas/ModelWithProp/properties/" + identifier;
        return codegen.fromSchema(arraySchema, jsonPath, jsonPath);
    }

    private TreeMap<String, CodegenSchema> codegenModel(List<String> values, String identifier, List<String> xEnumVarnames, List<String> xEnumDescriptions) {
        StringSchema itemsSchema = new StringSchema();
        itemsSchema.setEnum(values);
        if (xEnumVarnames != null || xEnumDescriptions != null) {
            HashMap<String, Object> extensions = new HashMap<>();
            if (xEnumVarnames != null) {
                extensions.put("x-enum-varnames", xEnumVarnames);
            }
            if (xEnumVarnames != null) {
                extensions.put("x-enum-descriptions", xEnumDescriptions);
            }
            itemsSchema.setExtensions(extensions);
        }
        final DefaultCodegen codegen = new DefaultCodegen();
        String jsonPath = "#/components/schemas/" + identifier;
        CodegenSchema cm = codegen.fromSchema(itemsSchema, jsonPath, jsonPath);
        TreeMap<String, CodegenSchema> schemas = new TreeMap<>();
        schemas.put("model", cm);
        return schemas;
    }

    @Test
    public void modelDoNotContainInheritedVars() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.supportsInheritance = true;

        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/generic.yaml");
        codegen.setOpenAPI(openAPI);

        CodegenSchema codegenModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("Dog"),
                "#/components/schemas/Dog",
                "#/components/schemas/Dog"
        );

        assertEquals(codegenModel.properties, null);
    }

    @Test
    public void importMapping() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.importMapping.put("TypeAlias", "foo.bar.TypeAlias");

        OpenAPI openAPI = new OpenAPIParser()
                .readLocation("src/test/resources/3_0/type-alias.yaml", null, new ParseOptions()).getOpenAPI();
        codegen.setOpenAPI(openAPI);


        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("TypeAlias"),
                "#/components/schemas/TypeAlias",
                "#/components/schemas/TypeAlias"
        );
        CodegenSchema codegenModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("ParentType"),
                "#/components/schemas/ParentType",
                "#/components/schemas/ParentType"
        );

        assertEquals(codegenModel.properties.size(), 1);
        CodegenKey ck = codegen.getKey("typeAlias");
        Assert.assertTrue(codegenModel.optionalProperties.get(ck).refInfo.ref.types.contains("string"));
    }

    @Test
    public void schemaMapping() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.schemaMapping.put("TypeAlias", "foo.bar.TypeAlias");

        OpenAPI openAPI = new OpenAPIParser()
                .readLocation("src/test/resources/3_0/type-alias.yaml", null, new ParseOptions()).getOpenAPI();
        codegen.setOpenAPI(openAPI);

        CodegenSchema codegenModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("ParentType"),
                "#/components/schemas/ParentType",
                "#/components/schemas/ParentType"
        );

        assertEquals(codegenModel.properties.size(), 1);

        Assert.assertEquals(codegenModel.properties.get(codegen.getKey("typeAlias")).refInfo.refClass, "TypeAlias");
    }

    @Test
    public void modelWithPrefixDoNotContainInheritedVars() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.supportsInheritance = true;
        codegen.setModelNamePrefix("prefix");

        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/generic.yaml");
        codegen.setOpenAPI(openAPI);

        CodegenSchema codegenModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("Dog"),
                "#/components/schemas/Dog",
                "#/components/schemas/Dog"
        );

        assertEquals(codegenModel.properties, null);
    }

    @Test
    public void modelWithSuffixDoNotContainInheritedVars() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.supportsInheritance = true;
        codegen.setModelNameSuffix("suffix");

        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/generic.yaml");
        codegen.setOpenAPI(openAPI);

        CodegenSchema codegenModel = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("Dog"),
                "#/components/schemas/Dog",
                "#/components/schemas/Dog"
        );

        assertEquals(codegenModel.properties, null);
    }

    @Test
    public void arrayInnerReferencedSchemaMarkedAsModel_30() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/arrayRefBody.yaml");
        new InlineModelResolver().flatten(openAPI);
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        RequestBody body = openAPI.getPaths().get("/examples").getPost().getRequestBody();

        CodegenRequestBody codegenParameter = codegen.fromRequestBody(body, "#/paths/~1examples/post/requestBody");

        CodegenKey ck = codegen.getKey("application/json");
        Assert.assertTrue(codegenParameter.content.get(ck).schema.types.contains("array"));
        Assert.assertTrue(codegenParameter.content.get(ck).schema.items.refInfo != null);
        Assert.assertTrue(codegenParameter.content.get(ck).schema.items.refInfo.refClass != null);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void commonLambdasRegistrationTest() {

        DefaultCodegen codegen = new DefaultCodegen();
        Object lambdasObj = codegen.additionalProperties.get("lambda");

        assertNotNull(lambdasObj, "Expecting lambda in additionalProperties");

        Map<String, Lambda> lambdas = (Map<String, Lambda>) lambdasObj;

        assertTrue(lambdas.get("lowercase") instanceof LowercaseLambda, "Expecting LowercaseLambda class");
        assertTrue(lambdas.get("uppercase") instanceof UppercaseLambda, "Expecting UppercaseLambda class");
        assertTrue(lambdas.get("titlecase") instanceof TitlecaseLambda, "Expecting TitlecaseLambda class");
        assertTrue(lambdas.get("camelcase") instanceof CamelCaseLambda, "Expecting CamelCaseLambda class");
        assertTrue(lambdas.get("indented") instanceof IndentedLambda, "Expecting IndentedLambda class");
        assertTrue(lambdas.get("indented_8") instanceof IndentedLambda, "Expecting IndentedLambda class");
        assertTrue(lambdas.get("indented_12") instanceof IndentedLambda, "Expecting IndentedLambda class");
        assertTrue(lambdas.get("indented_16") instanceof IndentedLambda, "Expecting IndentedLambda class");
    }

    @Test
    public void convertApiNameWithEmptySuffix() {
        DefaultCodegen codegen = new DefaultCodegen();
        assertEquals(codegen.toApiName("Fake"), "FakeApi");
        assertEquals(codegen.toApiName(""), "DefaultApi");
    }

    @Test
    public void convertApiNameWithSuffix() {
        DefaultCodegen codegen = new DefaultCodegen();
        codegen.setApiNameSuffix("Test");
        assertEquals(codegen.toApiName("Fake"), "FakeTest");
        assertEquals(codegen.toApiName(""), "DefaultApi");
    }

    @Test
    public void testFormComposedSchema() {
        OpenAPI openAPI = TestUtils.parseContent("openapi: 3.0.1\n" +
                "info:\n" +
                "  version: '1.0.0'\n" +
                "  title: the title\n" +
                "\n" +
                "paths:\n" +
                "  '/users/me':\n" +
                "    post:\n" +
                "      description: Change user password.\n" +
                "      operationId: changeCurrentUserPassword\n" +
                "      requestBody:\n" +
                "        required: true\n" +
                "        content:\n" +
                "          multipart/form-data:\n" +
                "            schema:\n" +
                "              $ref: '#/components/schemas/ChangePasswordRequest'\n" +
                "      responses:\n" +
                "        '200':\n" +
                "          description: Successful operation\n" +
                "          content: {}\n" +
                "\n" +
                "components:\n" +
                "  schemas:\n" +
                "    CommonPasswordRequest:\n" +
                "      type: object\n" +
                "      required: [ password, passwordConfirmation ]\n" +
                "      properties:\n" +
                "        password:\n" +
                "          type: string\n" +
                "          format: password\n" +
                "        passwordConfirmation:\n" +
                "          type: string\n" +
                "          format: password\n" +
                "\n" +
                "    ChangePasswordRequest:\n" +
                "      type: object\n" +
                "      allOf:\n" +
                "        - $ref: '#/components/schemas/CommonPasswordRequest'\n" +
                "        - type: object\n" +
                "          required: [ oldPassword ]\n" +
                "          properties:\n" +
                "            oldPassword:\n" +
                "              type: string\n" +
                "              format: password\n");

        final DefaultCodegen cg = new DefaultCodegen();
        cg.setOpenAPI(openAPI);
        cg.preprocessOpenAPI(openAPI);

        final PathItem path = openAPI.getPaths().get("/users/me");
        final CodegenOperation operation = cg.fromOperation(
                "/users/me",
                "post",
                path.getPost(),
                path.getServers());
        assertEquals(operation.allParams.size(), 0);
        assertNotNull(operation.requestBody);
    }

    @Test
    public void inlineAllOfSchemaDoesNotThrowException() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue7262.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String modelName = "UserTimeBase";
        Schema sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );

        final Set<CodegenDiscriminator.MappedModel> expectedMappedModels = Sets.newHashSet(new CodegenDiscriminator.MappedModel("UserSleep", "UserSleep"));
        final Set<CodegenDiscriminator.MappedModel> mappedModels = cm.discriminator.mappedModels;
        assertEquals(mappedModels, expectedMappedModels);

        modelName = "UserSleep";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.allOf.get(0).refInfo.refClass, "UserTimeBase");
        assertEquals(openAPI.getComponents().getSchemas().size(), 2);
        assertNull(cm.discriminator);
    }

    @Test
    public void arrayModelHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue7356.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String modelName = "ArrayWithValidations";
        Schema sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals((int) cm.minItems, 1);
    }

    @Test
    public void testOauthMultipleFlows() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7193.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        final Map<String, SecurityScheme> securitySchemes = openAPI.getComponents().getSecuritySchemes();
        final List<CodegenSecurity> securities = codegen.fromSecurity(securitySchemes);

        assertEquals(securities.size(), 2);
        final List<String> flows = securities.stream().map(c -> c.flow).collect(Collectors.toList());
        assertTrue(flows.containsAll(Arrays.asList("password", "application")));
    }

    @Test
    public void testItemsPresent() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String modelName;
        Schema sc;
        CodegenSchema cm;

        modelName = "ArrayWithValidationsInItems";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.items.maximum, "7");

        modelName = "ObjectWithValidationsInArrayPropItems";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenKey ck = codegen.getKey("arrayProp");
        assertEquals(cm.properties.get(ck).items.maximum, "7");

        String path;
        Operation operation;
        CodegenOperation co;

        path = "/ref_array_with_validations_in_items/{items}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertEquals(co.pathParams.get(0).schema.refInfo.ref.items.maximum, "7"); // disabled because refed
        CodegenKey applicationJson = codegen.getKey("application/json");
        assertEquals(co.requestBody.content.get(applicationJson).schema.refInfo.ref.items.maximum, "7");  // disabled because refed
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.items.maximum, "7");  // disabled because refed

        path = "/array_with_validations_in_items/{items}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertEquals(co.pathParams.get(0).schema.items.maximum, "7");
        assertEquals(co.requestBody.content.get(applicationJson).schema.items.maximum, "7");
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.items.maximum, "7");
    }

    @Test
    public void testAdditionalPropertiesPresentInModels() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName;
        Schema sc;
        CodegenSchema cm;
        CodegenSchema anyTypeSchema = codegen.fromSchema(
                new Schema(),
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue/additionalProperties"
        );

        modelName = "AdditionalPropertiesUnset";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.additionalProperties, null);

        modelName = "AdditionalPropertiesTrue";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.additionalProperties, anyTypeSchema);
        assertTrue(cm.additionalProperties.isBooleanSchemaTrue);

        modelName = "AdditionalPropertiesFalse";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.additionalProperties.isBooleanSchemaFalse);

        modelName = "AdditionalPropertiesSchema";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenSchema stringCp = codegen.fromSchema(
                new Schema().type("string"),
                "#/components/schemas/AdditionalPropertiesSchema",
                "#/components/schemas/AdditionalPropertiesSchema/additionalProperties"
        );
        assertEquals(cm.additionalProperties, stringCp);
    }

    @Test
    public void testAdditionalPropertiesPresentInModelProperties() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName;
        Schema sc;
        CodegenSchema cm;
        CodegenSchema anyTypeSchema = codegen.fromSchema(
                new Schema(),
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue/properties/child/additionalProperties"
        );
        CodegenSchema stringCp = codegen.fromSchema(
                new Schema().type("string"),
                "#/components/schemas/ObjectModelWithAddPropsInProps",
                "#/components/schemas/ObjectModelWithAddPropsInProps/properties/map_with_additional_properties_schema/additionalProperties"
        );
        CodegenSchema mapWithAddPropsUnset;
        CodegenSchema mapWithAddPropsTrue;
        CodegenSchema mapWithAddPropsFalse;
        CodegenSchema mapWithAddPropsSchema;

        modelName = "ObjectModelWithRefAddPropsInProps";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenKey ck = codegen.getKey("map_with_additional_properties_unset");
        mapWithAddPropsUnset = cm.properties.get(ck);
        assertEquals(mapWithAddPropsUnset.additionalProperties, null);
        assertEquals(mapWithAddPropsUnset.refInfo.refClass, "AdditionalPropertiesUnset");

        mapWithAddPropsTrue = cm.properties.get(codegen.getKey("map_with_additional_properties_true"));
        assertEquals(mapWithAddPropsTrue.additionalProperties, null);
        assertEquals(mapWithAddPropsTrue.refInfo.refClass, "AdditionalPropertiesTrue");

        mapWithAddPropsFalse = cm.properties.get(codegen.getKey("map_with_additional_properties_false"));
        assertEquals(mapWithAddPropsFalse.additionalProperties, null);
        assertEquals(mapWithAddPropsFalse.refInfo.refClass, "AdditionalPropertiesFalse");

        mapWithAddPropsSchema = cm.properties.get(codegen.getKey("map_with_additional_properties_schema"));
        assertEquals(mapWithAddPropsSchema.additionalProperties, null);
        assertEquals(mapWithAddPropsSchema.refInfo.refClass, "AdditionalPropertiesSchema");

        modelName = "ObjectModelWithAddPropsInProps";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );

        mapWithAddPropsUnset = cm.properties.get(codegen.getKey("map_with_additional_properties_unset"));
        assertEquals(mapWithAddPropsUnset.additionalProperties, null);

        mapWithAddPropsTrue = cm.properties.get(codegen.getKey("map_with_additional_properties_true"));
        assertEquals(mapWithAddPropsTrue.additionalProperties, anyTypeSchema);
        assertTrue(mapWithAddPropsTrue.additionalProperties.isBooleanSchemaTrue);

        mapWithAddPropsFalse = cm.properties.get(codegen.getKey("map_with_additional_properties_false"));
        assertNotNull(mapWithAddPropsFalse.additionalProperties);
        assertTrue(mapWithAddPropsFalse.additionalProperties.isBooleanSchemaFalse);

        mapWithAddPropsSchema = cm.properties.get(codegen.getKey("map_with_additional_properties_schema"));
        assertEquals(mapWithAddPropsSchema.additionalProperties, stringCp);
    }

    @Test
    public void testAdditionalPropertiesPresentInParameters() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesUnset"),
                "#/components/schemas/AdditionalPropertiesUnset",
                "#/components/schemas/AdditionalPropertiesUnset"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesTrue"),
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesFalse"),
                "#/components/schemas/AdditionalPropertiesFalse",
                "#/components/schemas/AdditionalPropertiesFalse"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesSchema"),
                "#/components/schemas/AdditionalPropertiesSchema",
                "#/components/schemas/AdditionalPropertiesSchema"
        );
        CodegenParameter mapWithAddPropsUnset;
        CodegenParameter mapWithAddPropsTrue;
        CodegenParameter mapWithAddPropsFalse;
        CodegenParameter mapWithAddPropsSchema;

        path = "/ref_additional_properties/";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        mapWithAddPropsUnset = co.queryParams.get(0);
        assertEquals(mapWithAddPropsUnset.schema.refInfo.ref.additionalProperties, null);
        mapWithAddPropsTrue = co.queryParams.get(1);
        assertNotNull(mapWithAddPropsTrue.schema.refInfo);
        assertTrue(mapWithAddPropsTrue.schema.refInfo.ref.additionalProperties.isBooleanSchemaTrue);
        mapWithAddPropsFalse = co.queryParams.get(2);
        assertNotNull(mapWithAddPropsFalse.schema.refInfo.ref.additionalProperties);
        assertTrue(mapWithAddPropsFalse.schema.refInfo.ref.additionalProperties.isBooleanSchemaFalse);
        mapWithAddPropsSchema = co.queryParams.get(3);
        assertNotNull(mapWithAddPropsSchema.schema.refInfo);

        path = "/additional_properties/";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        mapWithAddPropsUnset = co.queryParams.get(0);
        assertEquals(mapWithAddPropsUnset.schema.additionalProperties, null);
        mapWithAddPropsTrue = co.queryParams.get(1);
        assertTrue(mapWithAddPropsTrue.schema.additionalProperties.isBooleanSchemaTrue);
        mapWithAddPropsFalse = co.queryParams.get(2);
        assertTrue(mapWithAddPropsFalse.schema.additionalProperties.isBooleanSchemaFalse);
        mapWithAddPropsSchema = co.queryParams.get(3);
        assertTrue(mapWithAddPropsSchema.schema.additionalProperties.types.contains("string"));
    }

    @Test
    public void testAdditionalPropertiesPresentInResponses() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;

        CodegenResponse mapWithAddPropsUnset;
        CodegenResponse mapWithAddPropsTrue;
        CodegenResponse mapWithAddPropsFalse;
        CodegenResponse mapWithAddPropsSchema;

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesUnset"),
                "#/components/schemas/AdditionalPropertiesUnset",
                "#/components/schemas/AdditionalPropertiesUnset"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesTrue"),
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesFalse"),
                "#/components/schemas/AdditionalPropertiesFalse",
                "#/components/schemas/AdditionalPropertiesFalse"
        );
        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("AdditionalPropertiesSchema"),
                "#/components/schemas/AdditionalPropertiesSchema",
                "#/components/schemas/AdditionalPropertiesSchema"
        );

        path = "/ref_additional_properties/";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        mapWithAddPropsUnset = co.responses.get("200");
        CodegenKey ck = codegen.getKey("application/json");
        assertEquals(mapWithAddPropsUnset.content.get(ck).schema.refInfo.ref.additionalProperties, null);
        mapWithAddPropsTrue = co.responses.get("201");
        ck = codegen.getKey("application/xml");
        assertNotNull(mapWithAddPropsTrue.content.get(ck).schema.refInfo.ref.additionalProperties);
        assertTrue(mapWithAddPropsTrue.content.get(ck).schema.refInfo.ref.additionalProperties.isBooleanSchemaTrue);
        mapWithAddPropsFalse = co.responses.get("202");
        ck = codegen.getKey("application/x-www-form-urlencoded");
        assertNotNull(mapWithAddPropsFalse.content.get(ck).schema.refInfo.ref.additionalProperties);
        assertTrue(mapWithAddPropsFalse.content.get(ck).schema.refInfo.ref.additionalProperties.isBooleanSchemaFalse);
        mapWithAddPropsSchema = co.responses.get("203");
        ck = codegen.getKey("application/*");
        assertNotNull(mapWithAddPropsSchema.content.get(ck).schema.refInfo);

        path = "/additional_properties/";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        mapWithAddPropsUnset = co.responses.get("200");
        ck = codegen.getKey("application/json");
        assertEquals(mapWithAddPropsUnset.content.get(ck).schema.additionalProperties, null);
        mapWithAddPropsTrue = co.responses.get("201");
        ck = codegen.getKey("application/xml");
        assertNotNull(mapWithAddPropsTrue.content.get(ck).schema.additionalProperties);
        assertTrue(mapWithAddPropsTrue.content.get(ck).schema.additionalProperties.isBooleanSchemaTrue);
        mapWithAddPropsFalse = co.responses.get("202");
        ck = codegen.getKey("application/x-www-form-urlencoded");
        assertNotNull(mapWithAddPropsFalse.content.get(ck).schema.additionalProperties);
        assertTrue(mapWithAddPropsFalse.content.get(ck).schema.additionalProperties.isBooleanSchemaFalse);
        mapWithAddPropsSchema = co.responses.get("203");
        ck = codegen.getKey("application/*");
        assertTrue(mapWithAddPropsSchema.content.get(ck).schema.additionalProperties.types.contains("string"));
    }

    @Test
    public void testAdditionalPropertiesAnyType() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_9282.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        CodegenSchema anyTypeSchema = codegen.fromSchema(
                new Schema(),
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue/properties/child/additionalProperties"
        );

        Schema sc;
        CodegenSchema cm;

        sc = openAPI.getComponents().getSchemas().get("AdditionalPropertiesTrue");
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/AdditionalPropertiesTrue",
                "#/components/schemas/AdditionalPropertiesTrue"
        );
        CodegenKey ck = codegen.getKey("child");
        assertEquals(cm.properties.get(ck).additionalProperties, anyTypeSchema);

        sc = openAPI.getComponents().getSchemas().get("AdditionalPropertiesAnyType");
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/AdditionalPropertiesAnyType",
                "#/components/schemas/AdditionalPropertiesAnyType"
        );
        assertEquals(cm.properties.get(ck).additionalProperties, anyTypeSchema);
    }

    @Test
    public void testIsXPresence() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String modelName;
        Schema sc;
        CodegenSchema cm;

        modelName = "DateWithValidation";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("string"));
        assertEquals(cm.format, "date");

        modelName = "NullModel";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("null"));

        modelName = "ObjectWithTypeNullProperties";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenKey ck = codegen.getKey("nullProp");
        assertTrue(cm.properties.get(ck).types.contains("null"));
        assertTrue(cm.properties.get(codegen.getKey("listOfNulls")).items.types.contains("null"));
        assertTrue(cm.additionalProperties.types.contains("null"));

        modelName = "ArrayOfNulls";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.items.types.contains("null"));

        modelName = "ObjectWithDateWithValidation";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        ck = codegen.getKey("dateWithValidation");
        assertTrue(cm.properties.get(ck).types.contains("string"));
        assertEquals(cm.properties.get(ck).format, "date");

        String path;
        Operation operation;
        CodegenOperation co;

        path = "/ref_date_with_validation/{date}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.pathParams.get(0).schema.refInfo.ref.format, "date");
        CodegenKey applicationJson = codegen.getKey("application/json");
        assertTrue(co.requestBody.content.get(applicationJson).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.requestBody.content.get(applicationJson).schema.refInfo.ref.format, "date");
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.format, "date");

        path = "/date_with_validation/{date}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.types.contains("string"));
        assertEquals(co.pathParams.get(0).schema.format, "date");
        assertTrue(co.requestBody.content.get(applicationJson).schema.types.contains("string"));
        assertEquals(co.requestBody.content.get(applicationJson).schema.format, "date");
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.types.contains("string"));
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.format, "date");

        modelName = "DateTimeWithValidation";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("string"));
        assertEquals(cm.format, "date-time");

        modelName = "ObjectWithDateTimeWithValidation";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        ck = codegen.getKey("dateWithValidation");
        assertTrue(cm.properties.get(ck).types.contains("string"));
        assertEquals(cm.properties.get(ck).format, "date-time");

        path = "/ref_date_time_with_validation/{dateTime}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.pathParams.get(0).schema.refInfo.ref.format, "date-time");
        assertTrue(co.requestBody.content.get(applicationJson).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.requestBody.content.get(applicationJson).schema.refInfo.ref.format, "date-time");
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.types.contains("string"));
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.format, "date-time");

        path = "/date_time_with_validation/{dateTime}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.types.contains("string"));
        assertEquals(co.pathParams.get(0).schema.format, "date-time");
        assertTrue(co.requestBody.content.get(applicationJson).schema.types.contains("string"));
        assertEquals(co.requestBody.content.get(applicationJson).schema.format, "date-time");
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.types.contains("string"));
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.format, "date-time");

        path = "/null/{param}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.types.contains("null"));
        assertTrue(co.requestBody.content.get(applicationJson).schema.types.contains("null"));
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.types.contains("null"));

        path = "/ref_null/{param}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.refInfo.ref.types.contains("null"));
        assertTrue(co.requestBody.content.get(applicationJson).schema.refInfo.ref.types.contains("null"));
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.refInfo.ref.types.contains("null"));
    }

    @Test
    public void testModelGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        Schema sc;
        CodegenSchema cm;

        List<String> modelNames = Arrays.asList(
                "ArrayWithMaxItems",
                "ArrayWithMinItems",
                "ArrayWithUniqueItems",
                "ObjectWithMinProperties",
                "ObjectWithMaxProperties",
                "StringWithMinLength",
                "DateWithMinLength",
                "DateTimeWithMinLength",
                "ByteWithMinLength",
                "BinaryWithMinLength",
                "StringWithMaxLength",
                "DateWithMaxLength",
                "DateTimeWithMaxLength",
                "ByteWithMaxLength",
                "BinaryWithMaxLength",
                "IntegerWithMultipleOf",
                "Integer32WithMultipleOf",
                "Integer64WithMultipleOf",
                "NumberWithMultipleOf",
                "NumberFloatWithMultipleOf",
                "NumberDoubleWithMultipleOf",
                "StringWithPattern",
                "DateWithPattern",
                "DateTimeWithPattern",
                "ByteWithPattern",
                "BinaryWithPattern",
                "IntegerWithMinimum",
                "Integer32WithMinimum",
                "Integer64WithMinimum",
                "NumberWithMinimum",
                "NumberFloatWithMinimum",
                "NumberDoubleWithMinimum",
                "IntegerWithMaximum",
                "Integer32WithMaximum",
                "Integer64WithMaximum",
                "NumberWithMaximum",
                "NumberFloatWithMaximum",
                "NumberDoubleWithMaximum",
                "IntegerWithExclusiveMaximum",
                "Integer32WithExclusiveMaximum",
                "Integer64WithExclusiveMaximum",
                "NumberWithExclusiveMaximum",
                "NumberFloatWithExclusiveMaximum",
                "NumberDoubleWithExclusiveMaximum",
                "IntegerWithExclusiveMinimum",
                "Integer32WithExclusiveMinimum",
                "Integer64WithExclusiveMinimum",
                "NumberWithExclusiveMinimum",
                "NumberFloatWithExclusiveMinimum",
                "NumberDoubleWithExclusiveMinimum"
        );
        for (String modelName : modelNames) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            assertTrue(cm.hasValidation());
        }
    }

    @Test
    public void testPropertyGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String modelName = "ObjectWithPropertiesThatHaveValidations";
        Schema sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );

        List<CodegenSchema> props = cm.properties.values().stream().collect(Collectors.toList());
        assertEquals(props.size(), 50);
        for (CodegenSchema prop : props) {
            assertTrue(prop.hasValidation());
        }
    }

    @Test
    public void testQueryParametersGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String path = "/queryParametersWithValidation";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);
        List<CodegenParameter> params = co.queryParams;
        assertEquals(params.size(), 50);
        for (CodegenParameter param : params) {
            assertTrue(param.schema.hasValidation());
        }
    }

    @Test
    public void testHeaderParametersGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String path = "/headerParametersWithValidation";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);
        List<CodegenParameter> params = co.headerParams;
        assertEquals(params.size(), 50);
        for (CodegenParameter param : params) {
            assertTrue(param.schema.hasValidation());
        }
    }

    @Test
    public void testCookieParametersGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String path = "/cookieParametersWithValidation";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);
        List<CodegenParameter> params = co.cookieParams;
        assertEquals(params.size(), 50);
        for (CodegenParameter param : params) {
            assertTrue(param.schema.hasValidation());
        }
    }

    @Test
    public void testPathParametersGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        String path = "/pathParametersWithValidation";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);
        List<CodegenParameter> params = co.pathParams;
        assertEquals(params.size(), 50);
        for (CodegenParameter param : params) {
            assertTrue(param.schema.hasValidation());
        }
    }

    @Test
    public void testBodyAndResponseGetHasValidation() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7651.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        List<String> modelNames = Arrays.asList(
                "ArrayWithMaxItems",
                "ArrayWithMinItems",
                "ArrayWithUniqueItems",
                "ObjectWithMinProperties",
                "ObjectWithMaxProperties",
                "StringWithMinLength",
                "DateWithMinLength",
                "DateTimeWithMinLength",
                "ByteWithMinLength",
                "BinaryWithMinLength",
                "StringWithMaxLength",
                "DateWithMaxLength",
                "DateTimeWithMaxLength",
                "ByteWithMaxLength",
                "BinaryWithMaxLength",
                "StringWithPattern",
                "DateWithPattern",
                "DateTimeWithPattern",
                "ByteWithPattern",
                "BinaryWithPattern",
                "IntegerWithMultipleOf",
                "Integer32WithMultipleOf",
                "Integer64WithMultipleOf",
                "NumberWithMultipleOf",
                "NumberFloatWithMultipleOf",
                "NumberDoubleWithMultipleOf",
                "IntegerWithMinimum",
                "Integer32WithMinimum",
                "Integer64WithMinimum",
                "NumberWithMinimum",
                "NumberFloatWithMinimum",
                "NumberDoubleWithMinimum",
                "IntegerWithMaximum",
                "Integer32WithMaximum",
                "Integer64WithMaximum",
                "NumberWithMaximum",
                "NumberFloatWithMaximum",
                "NumberDoubleWithMaximum",
                "IntegerWithExclusiveMaximum",
                "Integer32WithExclusiveMaximum",
                "Integer64WithExclusiveMaximum",
                "NumberWithExclusiveMaximum",
                "NumberFloatWithExclusiveMaximum",
                "NumberDoubleWithExclusiveMaximum",
                "IntegerWithExclusiveMinimum",
                "Integer32WithExclusiveMinimum",
                "Integer64WithExclusiveMinimum",
                "NumberWithExclusiveMinimum",
                "NumberFloatWithExclusiveMinimum",
                "NumberDoubleWithExclusiveMinimum"
        );

        String path;
        Operation operation;
        CodegenOperation co;

        for (String modelName : modelNames) {
            path = "/" + modelName;
            operation = openAPI.getPaths().get(path).getPost();
            co = codegen.fromOperation(path, "POST", operation, null);
            CodegenKey ck = codegen.getKey("application/json");
            assertTrue(co.requestBody.content.get(ck).schema.hasValidation());
            assertTrue(co.responses.get("200").content.get(ck).schema.hasValidation());
        }
    }

    @Test
    public void testVarsAndRequiredVarsPresent() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName;
        Schema sc;
        CodegenSchema cm;
        modelName = "ObjectWithOptionalAndRequiredProps";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.properties.size(), 3);
        assertEquals(cm.requiredProperties.size(), 2);

        String path;
        Operation operation;
        CodegenOperation co;

        path = "/object_with_optional_and_required_props/{objectData}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        // null because they are refs
        assertEquals(co.pathParams.get(0).schema.properties, null);
        assertEquals(co.pathParams.get(0).schema.requiredProperties, null);
        CodegenKey applicationJson = codegen.getKey("application/json");
        assertEquals(co.requestBody.content.get(applicationJson).schema.properties, null);
        assertEquals(co.requestBody.content.get(applicationJson).schema.requiredProperties, null);

        // CodegenOperation puts the inline schema into schemas and refs it
        assertEquals(co.responses.get("200").content.get(applicationJson).schema.refInfo.refClass, "ObjectWithOptionalAndRequiredPropsRequest");
        modelName = "objectWithOptionalAndRequiredProps_request";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertEquals(cm.properties.size(), 3);
        assertEquals(cm.requiredProperties.size(), 2);

        // CodegenSchema puts the inline schema into schemas and refs it
        modelName = "ObjectPropContainsProps";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenKey ck = codegen.getKey("a");
        CodegenSchema cp = cm.properties.get(ck);
        assertEquals(cp.refInfo.refClass, "ObjectWithOptionalAndRequiredPropsRequest");
    }

    @Test
    public void testHasVarsInModel() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        Schema sc;
        CodegenSchema cm;
        List<String> modelNames;

        modelNames = Arrays.asList(
                "ArrayWithValidationsInItems",
                "ObjectWithValidationsInAdditionalProperties",
                "AdditionalPropertiesUnset",
                "AdditionalPropertiesTrue",
                "AdditionalPropertiesFalse",
                "AdditionalPropertiesSchema"
        );
        for (String modelName : modelNames) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            assertTrue(cm.properties == null);
        }

        modelNames = Arrays.asList(
                "ObjectModelWithRefAddPropsInProps",
                "ObjectModelWithAddPropsInProps",
                "ObjectWithOptionalAndRequiredProps",
                "ObjectPropContainsProps"
        );
        for (String modelName : modelNames) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            assertTrue(cm.properties.size() > 0);
        }
    }

    @Test
    public void testHasVarsInProperty() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        Schema sc;
        CodegenSchema cm;
        List<String> modelNames;

        modelNames = Arrays.asList(
                "ObjectWithValidationsInArrayPropItems",
                "ObjectModelWithRefAddPropsInProps",
                "ObjectModelWithAddPropsInProps",
                "ObjectWithOptionalAndRequiredProps"
        );
        HashMap<String, String> hm = new HashMap<>();
        hm.put("ObjectWithValidationsInArrayPropItems", "arrayProp");
        hm.put("ObjectModelWithRefAddPropsInProps", "map_with_additional_properties_unset");
        hm.put("ObjectModelWithAddPropsInProps", "map_with_additional_properties_unset");
        hm.put("ObjectWithOptionalAndRequiredProps", "a");
        for (String modelName : modelNames) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            CodegenKey ck = codegen.getKey(hm.get(modelName));
            assertTrue(cm.properties.get(ck).properties == null);
        }

        String modelName;
        modelName = "ArrayWithObjectWithPropsInItems";
        ArraySchema as = (ArraySchema) openAPI.getComponents().getSchemas().get(modelName);
        assertEquals("#/components/schemas/ArrayWithObjectWithPropsInItems_inner", as.getItems().get$ref());
        sc = openAPI.getComponents().getSchemas().get("ArrayWithObjectWithPropsInItems_inner");
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.properties.size() > 0);

        modelName = "ObjectWithObjectWithPropsInAdditionalProperties";
        MapSchema ms = (MapSchema) openAPI.getComponents().getSchemas().get(modelName);
        Schema addProps = (Schema) ms.getAdditionalProperties();
        assertEquals("#/components/schemas/ArrayWithObjectWithPropsInItems_inner", addProps.get$ref());
        sc = openAPI.getComponents().getSchemas().get("ArrayWithObjectWithPropsInItems_inner");
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.properties.size() > 0);
    }

    @Test
    public void testHasVarsInParameter() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;

        path = "/array_with_validations_in_items/{items}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        assertTrue(co.pathParams.get(0).schema.properties == null);
        CodegenKey ck = codegen.getKey("application/json");
        assertTrue(co.requestBody.content.get(ck).schema.properties == null);

        path = "/object_with_optional_and_required_props/{objectData}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        // no vars because it's a ref
        assertTrue(co.pathParams.get(0).schema.properties == null);
        assertTrue(co.requestBody.content.get(ck).schema.properties == null);
    }

    @Test
    public void testHasVarsInResponse() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_7613.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;

        path = "/additional_properties/";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        CodegenKey applicationJson = codegen.getKey("application/json");
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.properties == null);

        path = "/object_with_optional_and_required_props/{objectData}";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        // does not have vars because the inline schema was extracted into a component ref
        assertTrue(co.responses.get("200").content.get(applicationJson).schema.properties == null);
    }

    @Test
    public void testHasRequiredInModel() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_8906.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        Schema sc;
        CodegenSchema cm;

        List<String> modelNamesWithoutRequired = Arrays.asList(
                "EmptyObject",
                "ObjectWithOptionalB",
                "AnyTypeNoPropertiesNoRequired",
                "AnyTypeHasPropertiesNoRequired",
                "ObjectNoPropertiesNoRequired",
                "ObjectHasPropertiesNoRequired",
                "ComposedNoAllofPropsNoPropertiesNoRequired",
                "ComposedNoAllofPropsHasPropertiesNoRequired",
                "ComposedHasAllofOptPropNoPropertiesNoRequired",
                "ComposedHasAllofOptPropHasPropertiesNoRequired",
                "ComposedHasAllofReqPropNoPropertiesNoRequired",
                "ComposedHasAllofReqPropHasPropertiesNoRequired"
        );
        for (String modelName : modelNamesWithoutRequired) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            LinkedHashMap<CodegenKey, CodegenSchema> requiredProps = cm.requiredProperties;
            assertNull(requiredProps);
        }

        List<String> modelNamesWithRequired = Arrays.asList(
                "AnyTypeHasPropertiesHasRequired",
                "ObjectHasPropertiesHasRequired",
                "AnyTypeNoPropertiesHasRequired",
                "ComposedNoAllofPropsHasPropertiesHasRequired",
                "ComposedHasAllofOptPropHasPropertiesHasRequired",
                "ComposedHasAllofReqPropHasPropertiesHasRequired",
                "ComposedNoAllofPropsNoPropertiesHasRequired",
                "ComposedHasAllofOptPropNoPropertiesHasRequired",
                "ComposedHasAllofReqPropNoPropertiesHasRequired"
        );
        for (String modelName : modelNamesWithRequired) {
            sc = openAPI.getComponents().getSchemas().get(modelName);
            cm = codegen.fromSchema(
                    sc,
                    "#/components/schemas/" + modelName,
                    "#/components/schemas/" + modelName
            );
            LinkedHashMap<CodegenKey, CodegenSchema> requiredProps = cm.requiredProperties;
            assertNotNull(requiredProps);
            assertTrue(requiredProps.size() > 0);
        }
    }

    @Test
    public void testHasRequiredInProperties() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_8906.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName = "CodegenPropertiesModel";
        Schema sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );

        HashSet<String> propertyNamesWithoutRequired = new HashSet(Arrays.asList(
                "EmptyObject",
                "ObjectWithOptionalB",
                "AnyTypeNoPropertiesNoRequired",
                "AnyTypeHasPropertiesNoRequired",
                "ObjectNoPropertiesNoRequired",
                "ObjectHasPropertiesNoRequired",
                "ComposedNoAllofPropsNoPropertiesNoRequired",
                "ComposedNoAllofPropsHasPropertiesNoRequired",
                "ComposedHasAllofOptPropNoPropertiesNoRequired",
                "ComposedHasAllofOptPropHasPropertiesNoRequired",
                "ComposedHasAllofReqPropNoPropertiesNoRequired",
                "ComposedHasAllofReqPropHasPropertiesNoRequired",
                "AnyTypeHasPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ObjectHasPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ComposedNoAllofPropsHasPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ComposedHasAllofOptPropNoPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ComposedHasAllofOptPropHasPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ComposedHasAllofReqPropNoPropertiesHasRequired",  // remove when delete/turn off inline model resolver
                "ComposedHasAllofReqPropHasPropertiesHasRequired"  // remove when delete/turn off inline model resolver
        ));
        for (CodegenKey key: cm.properties.keySet()) {
            CodegenSchema prop = cm.properties.get(key);
            if (propertyNamesWithoutRequired.contains(key.name)) {
                assertNull(prop.requiredProperties);
            } else {
                assertNotNull(prop.requiredProperties);
                assertTrue(!prop.requiredProperties.isEmpty());
            }
        }
    }

    @Test
    public void testHasRequiredInParameters() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_8906.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path = "/schemasInQueryParamsAndResponses";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);

        HashSet<String> modelNamesWithoutRequired = new HashSet(Arrays.asList(
                "EmptyObject",
                "ObjectWithOptionalB",
                "AnyTypeNoPropertiesNoRequired",
                "AnyTypeHasPropertiesNoRequired",
                "AnyTypeNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "AnyTypeHasPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ObjectNoPropertiesNoRequired",
                "ObjectHasPropertiesNoRequired", // Note: this is extracted into another component and is a ref
                "ObjectNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedNoAllofPropsNoPropertiesNoRequired",
                "ComposedNoAllofPropsHasPropertiesNoRequired",
                "ComposedNoAllofPropsNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedHasAllofOptPropNoPropertiesNoRequired",
                "ComposedHasAllofOptPropHasPropertiesNoRequired",
                "ComposedHasAllofOptPropNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ObjectHasPropertiesHasRequired", // False because this is extracted into another component and is a ref
                "ComposedNoAllofPropsHasPropertiesHasRequired", // False because this is extracted into another component and is a ref
                "ComposedHasAllofOptPropHasPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedHasAllofReqPropNoPropertiesNoRequired",
                "ComposedHasAllofReqPropHasPropertiesNoRequired",
                "ComposedHasAllofReqPropNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedHasAllofReqPropHasPropertiesHasRequired"  // TODO: hasRequired should be true, fix this
        ));
        for (CodegenParameter param : co.pathParams) {
            if (!modelNamesWithoutRequired.contains(param.baseName)) {
                // All variables must be in the above sets
                fail();
            }
        }
    }

    @Test
    public void testHasRequiredInResponses() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_8906.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path = "/schemasInQueryParamsAndResponses";
        Operation operation = openAPI.getPaths().get(path).getPost();
        CodegenOperation co = codegen.fromOperation(path, "POST", operation, null);

        HashSet<String> modelNamesWithoutRequired = new HashSet(Arrays.asList(
                "EmptyObject",
                "ObjectWithOptionalB",
                "AnyTypeNoPropertiesNoRequired",
                "AnyTypeHasPropertiesNoRequired",
                "AnyTypeHasPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ObjectNoPropertiesNoRequired",
                "ObjectHasPropertiesNoRequired", // Note: this is extracted into another component and is a ref
                "ComposedNoAllofPropsNoPropertiesNoRequired",
                "ComposedNoAllofPropsHasPropertiesNoRequired",
                "ComposedHasAllofOptPropNoPropertiesNoRequired",
                "ComposedHasAllofOptPropHasPropertiesNoRequired",
                "ComposedHasAllofOptPropNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ObjectHasPropertiesHasRequired", // False because this is extracted into another component and is a ref
                "ComposedNoAllofPropsHasPropertiesHasRequired", // False because this is extracted into another component and is a ref
                "ComposedHasAllofOptPropHasPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedHasAllofReqPropNoPropertiesNoRequired",
                "ComposedHasAllofReqPropHasPropertiesNoRequired",
                "ComposedHasAllofReqPropNoPropertiesHasRequired",  // TODO: hasRequired should be true, fix this
                "ComposedHasAllofReqPropHasPropertiesHasRequired"  // TODO: hasRequired should be true, fix this
        ));
        CodegenKey ck = codegen.getKey("application/json");
        for (CodegenResponse cr : co.responses.values()) {
            LinkedHashMap<CodegenKey, CodegenSchema> reqProps = cr.content.get(ck).schema.requiredProperties;
            if (modelNamesWithoutRequired.contains(cr.message)) {
                assertNull(reqProps);
            } else {
                assertNotNull(reqProps);
                assertTrue(!reqProps.isEmpty());
            }
        }
    }

    @Test
    public void testBooleansSetForIntSchemas() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_9447.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName;
        Schema sc;
        CodegenSchema cm;

        modelName = "UnboundedInteger";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("integer"));
        assertTrue(cm.format == null);

        modelName = "Int32";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("integer"));
        assertEquals(cm.format, "int32");

        modelName = "Int64";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("integer"));
        assertTrue(cm.format.equals("int64"));

        modelName = "ObjectModelWithIntegerProps";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        cm = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(cm.types.contains("object"));

        CodegenSchema cp;
        CodegenKey ck = codegen.getKey("UnboundedInteger");
        cp = cm.properties.get(ck);
        assertTrue(cp.types.contains("integer"));
        assertNull(cp.format);

        ck = codegen.getKey("Int32");
        cp = cm.properties.get(ck);
        assertTrue(cp.types.contains("integer"));
        assertEquals(cp.format, "int32");

        ck = codegen.getKey("Int64");
        cp = cm.properties.get(ck);
        assertTrue(cp.types.contains("integer"));
        assertEquals(cp.format, "int64");

        String path;
        Operation operation;
        CodegenOperation co;
        CodegenParameter cpa;
        CodegenResponse cr;

        path = "/UnboundedInteger";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        cpa = co.pathParams.get(0);
        assertTrue(cpa.schema.types.contains("integer"));
        assertNull(cpa.schema.format);
        CodegenRequestBody crb = co.requestBody;
        ck = codegen.getKey("application/json");
        assertTrue(crb.content.get(ck).schema.types.contains("integer"));
        assertNull(crb.content.get(ck).schema.format);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("integer"));
        assertNull(cr.content.get(ck).schema.format);

        path = "/Int32";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        cpa = co.pathParams.get(0);
        assertTrue(cpa.schema.types.contains("integer"));
        assertEquals(cpa.schema.format, "int32");
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("integer"));
        assertEquals(crb.content.get(ck).schema.format, "int32");
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("integer"));
        assertEquals(cr.content.get(ck).schema.format, "int32");

        path = "/Int64";
        operation = openAPI.getPaths().get(path).getPost();
        co = codegen.fromOperation(path, "POST", operation, null);
        cpa = co.pathParams.get(0);
        assertTrue(cpa.schema.types.contains("integer"));
        assertEquals(cpa.schema.format, "int64");
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("integer"));
        assertEquals(crb.content.get(ck).schema.format, "int64");
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("integer"));
        assertEquals(cr.content.get(ck).schema.format, "int64");
    }

    @Test
    public void testRemoveOperationIdPrefix() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/bugs/issue_9719.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, ".");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, 2);
        codegen.processOpts();
        path = "/dotDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "UsersGetAll");

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, ".");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, -1);
        codegen.processOpts();
        path = "/dotDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "GetAll");

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, ".");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, 10);
        codegen.processOpts();
        path = "/dotDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "GetAll");

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, "_");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, 2);
        codegen.processOpts();
        path = "/underscoreDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "UsersGetAll");

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, "_");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, -1);
        codegen.processOpts();
        path = "/underscoreDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "GetAll");

        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX, "True");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER, "_");
        codegen.additionalProperties().put(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT, 10);
        codegen.processOpts();
        path = "/underscoreDelimiter";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertEquals(co.operationId.camelCaseName, "GetAll");
    }

    @Test
    @Ignore
    public void testComposedPropertyTypes() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10330.yaml");
        codegen.setOpenAPI(openAPI);
        String modelName;

        modelName = "ObjectWithComposedProperties";
        CodegenSchema m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        /* TODO inline allOf schema are created as separate models and the following assumptions that
           the properties are non-model are no longer valid and need to be revised
        assertTrue(m.vars.get(0).getIsMap());
        assertTrue(m.vars.get(1).getIsNumber());
        assertTrue(m.vars.get(2).getIsUnboundedInteger());
        assertTrue(m.vars.get(3).getIsString());
        assertTrue(m.vars.get(4).getIsBoolean());
        assertTrue(m.vars.get(5).getIsArray());
        assertTrue(m.vars.get(6).getIsNull());
        assertTrue(m.vars.get(7).getIsAnyType());
        */
    }

    @Test
    public void testComposedModelTypes() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10330.yaml");
        codegen.setOpenAPI(openAPI);
        String modelName;
        CodegenSchema m;

        modelName = "ComposedObject";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("object"));

        modelName = "ComposedNumber";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("number"));

        modelName = "ComposedInteger";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("integer"));

        modelName = "ComposedString";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("string"));

        modelName = "ComposedBool";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("boolean"));

        modelName = "ComposedArray";
        m = codegen.fromSchema(openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("array"));

        modelName = "ComposedNone";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types.contains("null"));

        modelName = "ComposedAnyType";
        m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        assertTrue(m.types == null);
    }

    @Test
    public void testComposedResponseTypes() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10330.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;
        CodegenResponse cr;

        path = "/ComposedObject";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        CodegenKey ck = codegen.getKey("application/json");
        assertTrue(cr.content.get(ck).schema.types.contains("object"));

        path = "/ComposedNumber";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("number"));

        path = "/ComposedInteger";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("integer"));

        path = "/ComposedString";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("string"));

        path = "/ComposedBool";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("boolean"));

        path = "/ComposedArray";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("array"));

        path = "/ComposedNone";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("null"));

        path = "/ComposedAnyType";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types == null);
    }

    @Test
    public void testComposedRequestBodyTypes() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10330.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;
        CodegenRequestBody crb;

        path = "/ComposedObject";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        CodegenKey ck = codegen.getKey("application/json");
        assertTrue(crb.content.get(ck).schema.types.contains("object"));

        path = "/ComposedNumber";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("number"));

        path = "/ComposedInteger";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("integer"));

        path = "/ComposedString";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("string"));

        path = "/ComposedBool";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("boolean"));

        path = "/ComposedArray";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("array"));

        path = "/ComposedNone";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types.contains("null"));

        path = "/ComposedAnyType";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        crb = co.requestBody;
        assertTrue(crb.content.get(ck).schema.types == null);
    }

    @Test
    public void testComposedRequestQueryParamTypes() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10330.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;
        CodegenParameter cp;

        path = "/ComposedObject";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("object"));

        path = "/ComposedNumber";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("number"));

        path = "/ComposedInteger";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("integer"));

        path = "/ComposedString";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("string"));

        path = "/ComposedBool";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("boolean"));

        path = "/ComposedArray";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("array"));

        path = "/ComposedNone";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types.contains("null"));

        path = "/ComposedAnyType";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        cp = co.queryParams.get(0);
        assertTrue(cp.schema.types == null);
    }

    @Test
    public void testByteArrayTypeInSchemas() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_10725.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;
        CodegenRequestBody crb;

        path = "/TxRxByteArray";
        co = codegen.fromOperation(path, "POST", openAPI.getPaths().get(path).getPost(), null);
        crb = co.requestBody;
        CodegenKey ck = codegen.getKey("application/json");
        assertTrue(crb.content.get(ck).schema.types.contains("string"));
        assertEquals(crb.content.get(ck).schema.format, "byte");
        CodegenResponse cr = co.responses.get("200");
        assertTrue(cr.content.get(ck).schema.types.contains("string"));
        assertEquals(cr.content.get(ck).schema.format, "byte");

        String modelName = "ObjectContainingByteArray";
        CodegenSchema m = codegen.fromSchema(
                openAPI.getComponents().getSchemas().get(modelName),
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        ck = codegen.getKey("byteArray");
        CodegenSchema pr = m.properties.get(ck);
        assertTrue(pr.types.contains("string"));
        assertEquals(pr.format, "byte");
    }

    @Test
    public void testResponses() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/response-tests.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String path;
        Operation operation;
        CodegenOperation co;
        CodegenResponse cr;

        path = "/pet/{petId}";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        //assertTrue(co.hasErrorResponseObject);
        cr = co.responses.get("200");
        CodegenKey applicationJson = codegen.getKey("application/json");
        assertTrue(cr.content.get(applicationJson).schema.refInfo.refClass != null);
        cr = co.responses.get("500");
        CodegenKey applicationApplication = codegen.getKey("application/application");
        assertTrue(cr.content.get(applicationApplication).schema.refInfo.refClass != null);

        path = "/pet";
        operation = openAPI.getPaths().get(path).getPut();
        co = codegen.fromOperation(path, "PUT", operation, null);
        assertTrue(co.hasErrorResponseObject);

        cr = co.responses.get("200");
        assertTrue(cr.content.get(applicationJson).schema.refInfo.refClass != null);

        cr = co.responses.get("400");
        assertTrue(cr.content.get(applicationJson).schema.refInfo.refClass != null);

        path = "/pet/findByTags";
        operation = openAPI.getPaths().get(path).getGet();
        co = codegen.fromOperation(path, "GET", operation, null);
        assertFalse(co.hasErrorResponseObject);
        cr = co.responses.get("200");
        assertNotNull(cr.content.get(applicationJson).schema.items.refInfo.refClass);
    }

    @Test
    public void testRequestParameterContent() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/content-data.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;

        String jsonPath = "#/components/schemas/coordinates";
        codegen.fromSchema(openAPI.getComponents().getSchemas().get("coordinates"), jsonPath, jsonPath);

        path = "/jsonQueryParams";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        CodegenParameter coordinatesInlineSchema = co.queryParams.get(0);
        LinkedHashMap<CodegenKey, CodegenMediaType> content = coordinatesInlineSchema.content;
        assertNotNull(content);
        CodegenKey ck = codegen.getKey("application/json");
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(ck)));
        CodegenMediaType mt = content.get(ck);
        assertNull(mt.encoding);
        CodegenSchema cp = mt.schema;
        assertTrue(cp.types.contains("object"));
        assertEquals(cp.refInfo, null);
        assertEquals(cp.name.name, "schema");

        CodegenParameter coordinatesReferencedSchema = co.queryParams.get(1);
        content = coordinatesReferencedSchema.content;
        mt = content.get(ck);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertTrue(cp.refInfo.ref.types.contains("object")); // because it is a referenced schema
        assertEquals(cp.refInfo.refClass, "Coordinates");
        assertEquals(cp.name.name, "schema");
    }

    @Test
    public void testRequestBodyContent() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/content-data.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;

        path = "/inlineRequestBodySchemasDifferingByContentType";
        co = codegen.fromOperation(path, "POST", openAPI.getPaths().get(path).getPost(), null);
        CodegenRequestBody bodyParameter = co.requestBody;
        LinkedHashMap<CodegenKey, CodegenMediaType> content = bodyParameter.content;
        assertNotNull(content);
        CodegenKey jsonKey = codegen.getKey("application/json");
        CodegenKey textKey = codegen.getKey("text/plain");
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(jsonKey, textKey)));
        CodegenMediaType mt = content.get(jsonKey);
        assertNull(mt.encoding);
        CodegenSchema cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertNotNull(cp);

        mt = content.get(textKey);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertNotNull(cp);
        // Note: the inline model resolver has a bug for this use case; it extracts an inline request body into a component
        // but the schema it references is not string type

        path = "/refRequestBodySchemasDifferingByContentType";
        co = codegen.fromOperation(path, "POST", openAPI.getPaths().get(path).getPost(), null);
        bodyParameter = co.requestBody;
        content = bodyParameter.content;
        assertNotNull(content);
        CodegenKey applicationJson = codegen.getKey("application/json");
        CodegenKey textPlain = codegen.getKey("text/plain");
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(applicationJson, textPlain)));
        mt = content.get(applicationJson);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertEquals(cp.refInfo.refClass, "Coordinates");

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("stringWithMinLength"),
                "#/components/schemas/stringWithMinLength",
                "#/components/schemas/stringWithMinLength"
        );

        mt = content.get(textPlain);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertTrue(cp.refInfo.ref.types.contains("string"));

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("_requestBodyWithEncodingTypes_post_request"),
                "#/components/schemas/_requestBodyWithEncodingTypes_post_request",
                "#/components/schemas/_requestBodyWithEncodingTypes_post_request"
        );

        path = "/requestBodyWithEncodingTypes";
        co = codegen.fromOperation(path, "POST", openAPI.getPaths().get(path).getPost(), null);
        CodegenKey applicationXWwwFormUrlencoded = codegen.getKey("application/x-www-form-urlencoded");
        CodegenSchema formSchema = co.requestBody.content.get(applicationXWwwFormUrlencoded).schema;
        assertEquals(formSchema.refInfo.ref.properties.size(), 6);

        LinkedHashMap<String, CodegenEncoding> encoding = co.requestBody.content.get(applicationXWwwFormUrlencoded).encoding;
        assertEquals(encoding.get("int-param").explode, true);
        assertEquals(encoding.get("explode-false").explode, false);
    }

    @Test
    public void testResponseContentAndHeader() {
        DefaultCodegen codegen = new DefaultCodegen();
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/content-data.yaml");
        codegen.setOpenAPI(openAPI);
        String path;
        CodegenOperation co;

        String jsonPath = "#/components/schemas/coordinates";
        codegen.fromSchema(openAPI.getComponents().getSchemas().get("coordinates"), jsonPath, jsonPath);

        path = "/jsonQueryParams";
        co = codegen.fromOperation(path, "GET", openAPI.getPaths().get(path).getGet(), null);
        CodegenParameter coordinatesInlineSchema = co.queryParams.get(0);
        LinkedHashMap<CodegenKey, CodegenMediaType> content = coordinatesInlineSchema.content;
        assertNotNull(content);
        CodegenKey ck = codegen.getKey("application/json");
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(ck)));

        CodegenParameter schemaParam = co.queryParams.get(2);
        assertEquals(schemaParam.schema.name.name, "schema");

        CodegenResponse cr = co.responses.get("200");
        Map<String, CodegenHeader> responseHeaders = cr.headers;
        assertEquals(2, responseHeaders.size());
        CodegenHeader header1 = responseHeaders.get("X-Rate-Limit");
        assertTrue(header1.schema.types.contains("integer"));
        assertEquals(header1.schema.name.name, "schema");

        codegen.fromHeader(
                openAPI.getComponents().getHeaders().get("X-Rate-Limit"),
                "#/components/headers/X-Rate-Limit"
        );

        CodegenHeader header2 = responseHeaders.get("X-Rate-Limit-Ref");
        assertTrue(header2.refInfo.ref.schema.types.contains("integer"));
        assertEquals(header2.refInfo.ref.schema.name.name, "schema");

        content = cr.content;
        CodegenKey applicationJson = codegen.getKey("application/json");
        CodegenKey textPlain = codegen.getKey("text/plain");
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(applicationJson, textPlain)));
        CodegenMediaType mt = content.get(applicationJson);
        assertNull(mt.encoding);
        CodegenSchema cp = mt.schema;
        assertTrue(cp.refInfo.ref.types.contains("object"));
        assertEquals(cp.refInfo.refClass, "Coordinates");
        assertEquals(cp.name.name, "schema");

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("stringWithMinLength"),
                "#/components/schemas/stringWithMinLength",
                "#/components/schemas/stringWithMinLength"
        );

        mt = content.get(textPlain);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertTrue(cp.refInfo.ref.types.contains("string"));

        codegen.fromSchema(
                openAPI.getComponents().getSchemas().get("coordinates"),
                "#/components/schemas/coordinates",
                "#/components/schemas/coordinates"
        );

        cr = co.responses.get("201");
        content = cr.content;
        assertEquals(content.keySet(), new HashSet<>(Arrays.asList(applicationJson, textPlain)));
        mt = content.get(applicationJson);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertTrue(cp.refInfo.ref.types.contains("object"));
        assertEquals(cp.refInfo.refClass, "Coordinates");
        assertEquals(cp.name.name, "schema");

        mt = content.get(textPlain);
        assertNull(mt.encoding);
        cp = mt.schema;
        assertEquals(cp.name.name, "schema");
        assertTrue(cp.refInfo.ref.types.contains("string"));
    }

    @Test
    public void testUnalias() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/schema-unalias-test.yml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);

        Schema requestBodySchema = ModelUtils.getSchemaFromRequestBody(
                openAPI.getPaths().get("/thingy/{date}").getPost().getRequestBody());
        Assert.assertEquals(requestBodySchema.get$ref(), "#/components/schemas/updatePetWithForm_request");
        Assert.assertEquals(ModelUtils.getSimpleRef(requestBodySchema.get$ref()), "updatePetWithForm_request");
        Assert.assertNotNull(openAPI.getComponents().getSchemas().get(ModelUtils.getSimpleRef(requestBodySchema.get$ref())));

        Schema requestBodySchema2 = ModelUtils.unaliasSchema(openAPI, requestBodySchema);
        // get$ref is not null as unaliasSchem returns the schema with the last $ref to the actual schema
        Assert.assertNotNull(requestBodySchema2.get$ref());
        Assert.assertEquals(requestBodySchema2.get$ref(), "#/components/schemas/updatePetWithForm_request");

        RequestBody reqBody = openAPI.getPaths().get("/thingy/{date}").getPost().getRequestBody();
        CodegenRequestBody codegenParameter = codegen.fromRequestBody(reqBody, "#/paths/~1thingy~1{date}/post/requestBody");

        CodegenKey ck = codegen.getKey("application/x-www-form-urlencoded");
        Assert.assertNotNull(codegenParameter.content.get(ck).schema.refInfo);
    }

    @Test
    public void testFromPropertyRequiredAndOptional() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/issue_12857.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setDisallowAdditionalPropertiesIfNotPresent(false);

        String modelName = "FooRequired";
        Schema sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema fooRequired = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        modelName = "FooOptional";
        sc = openAPI.getComponents().getSchemas().get(modelName);
        CodegenSchema fooOptional = codegen.fromSchema(
                sc,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );
        CodegenKey ck = codegen.getKey("foo");
        Assert.assertEquals(fooRequired.properties.get(ck).name.name, "foo");

        assertEquals(fooRequired.requiredProperties.size(), 1);
        Assert.assertEquals(fooRequired.requiredProperties.get(ck).name.name, "foo");

        Assert.assertEquals(fooOptional.properties.get(ck).name.name, "foo");
        assertEquals(fooOptional.requiredProperties, null);
    }

    @Test
    public void testAssigning310SpecWorks() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_1/petstore.yaml");
        final DefaultCodegen codegen = new DefaultCodegen();
        codegen.setOpenAPI(openAPI);
        assertEquals(openAPI, codegen.openAPI);
    }

    public static class FromParameter {
        private CodegenParameter codegenParameter(String path) {
            final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/fromParameter.yaml");
            new InlineModelResolver().flatten(openAPI);
            final DefaultCodegen codegen = new DefaultCodegen();
            codegen.setOpenAPI(openAPI);

            return codegen
                    .fromParameter(
                            openAPI
                                    .getPaths()
                                    .get(path)
                                    .getGet()
                                    .getParameters()
                                    .get(0),
                            "#/paths/" + ModelUtils.encodeSlashes(path) + "/get/parameters/0"
                    );
        }

        @Test
        public void setStyle() {
            CodegenParameter parameter = codegenParameter("/set_style");
            assertEquals(parameter.style, "form");
        }

        @Test
        public void setShouldExplode() {
            CodegenParameter parameter = codegenParameter("/set_should_explode");
            assertTrue(parameter.isExplode);
        }

        @Test
        public void testConvertPropertyToBooleanAndWriteBack_Boolean_true() {
            final DefaultCodegen codegen = new DefaultCodegen();
            Map<String, Object> additionalProperties = codegen.additionalProperties();
            additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, true);
            boolean result = codegen.convertPropertyToBooleanAndWriteBack(CodegenConstants.SERIALIZABLE_MODEL);
            Assert.assertTrue(result);
        }

        @Test
        public void testConvertPropertyToBooleanAndWriteBack_Boolean_false() {
            final DefaultCodegen codegen = new DefaultCodegen();
            Map<String, Object> additionalProperties = codegen.additionalProperties();
            additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, false);
            boolean result = codegen.convertPropertyToBooleanAndWriteBack(CodegenConstants.SERIALIZABLE_MODEL);
            Assert.assertFalse(result);
        }

        @Test
        public void testConvertPropertyToBooleanAndWriteBack_String_true() {
            final DefaultCodegen codegen = new DefaultCodegen();
            Map<String, Object> additionalProperties = codegen.additionalProperties();
            additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, "true");
            boolean result = codegen.convertPropertyToBooleanAndWriteBack(CodegenConstants.SERIALIZABLE_MODEL);
            Assert.assertTrue(result);
        }

        @Test
        public void testConvertPropertyToBooleanAndWriteBack_String_false() {
            final DefaultCodegen codegen = new DefaultCodegen();
            Map<String, Object> additionalProperties = codegen.additionalProperties();
            additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, "false");
            boolean result = codegen.convertPropertyToBooleanAndWriteBack(CodegenConstants.SERIALIZABLE_MODEL);
            Assert.assertFalse(result);
        }

        @Test
        public void testConvertPropertyToBooleanAndWriteBack_String_blibb() {
            final DefaultCodegen codegen = new DefaultCodegen();
            Map<String, Object> additionalProperties = codegen.additionalProperties();
            additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, "blibb");
            boolean result = codegen.convertPropertyToBooleanAndWriteBack(CodegenConstants.SERIALIZABLE_MODEL);
            Assert.assertFalse(result);
        }
    }

    class CodegenWithMultipleInheritance extends DefaultCodegen {
        public CodegenWithMultipleInheritance() {
            super();
            supportsInheritance = true;
            supportsMultipleInheritance = true;
        }
    }
}
