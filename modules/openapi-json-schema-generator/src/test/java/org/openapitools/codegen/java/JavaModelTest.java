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

package org.openapitools.codegen.java;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.QueryParameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.mozilla.javascript.optimizer.Codegen;
import org.openapitools.codegen.*;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.JavaClientCodegen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.List;

public class JavaModelTest {

    @Test(description = "convert a simple java model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema()
                        .example("Tony"))
                .addProperties("createdAt", new DateTimeSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        CodegenKey ck = codegen.getKey("id");
        final CodegenProperty property1 = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property1.name.getName(), "id");
        Assert.assertEquals(property1.name.getCamelCaseName(), "Id");
        Assert.assertEquals(property1.name.getSnakeCaseName(), "ID");
        Assert.assertEquals(property1.isInteger, true);
        Assert.assertEquals(property1.getFormat(), "int64");
        Assert.assertEquals(property1.name, "id");
        Assert.assertNull(property1.defaultValue);
        Assert.assertEquals(property1.baseType, "Long");

        ck = codegen.getKey("name");
        final CodegenProperty property2 = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property2.name.getName(), "name");
        Assert.assertEquals(property2.name.getCamelCaseName(), "Name");
        Assert.assertEquals(property2.name.getSnakeCaseName(), "NAME");
        Assert.assertEquals(property2.isString, true);
        Assert.assertNull(property2.defaultValue);
        Assert.assertEquals(property2.baseType, "String");
        Assert.assertEquals(property2.example, "Tony");

        ck = codegen.getKey("createdAt");
        final CodegenProperty property3 = cm.getProperties().get(ck);
        Assert.assertEquals(property3.name.getName(), "createdAt");
        Assert.assertEquals(property3.name.getCamelCaseName(), "CreatedAt");
        Assert.assertEquals(property3.name.getSnakeCaseName(), "CREATED_AT");
        Assert.assertEquals(property3.isDate, true);
        Assert.assertNull(property3.defaultValue);
        Assert.assertEquals(property3.baseType, "Date");
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        CodegenKey ck = codegen.getKey("urls");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "urls");
        Assert.assertEquals(property.name, "urls");
        Assert.assertEquals(property.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property.baseType, "List");
        Assert.assertTrue(property.isArray);
    }

    @Test(description = "convert a model with set property")
    public void setPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema())
                        .uniqueItems(true))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        CodegenKey ck = codegen.getKey("urls");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "urls");
        Assert.assertEquals(property.defaultValue, "new LinkedHashSet<>()");
        Assert.assertEquals(property.baseType, "Set");
        Assert.assertTrue(property.isArray);
    }

    @Test(description = "convert a model with a map property")
    public void mapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("translations");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "translations");
        Assert.assertEquals(property.name, "translations");
        Assert.assertEquals(property.defaultValue, "new HashMap<>()");
        Assert.assertEquals(property.baseType, "Map");
        Assert.assertTrue(property.isMap);
    }

    @Test(description = "convert a model with a map with complex list property")
    public void mapWithListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new ArraySchema().items(new Schema().$ref("Pet"))))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("translations");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "translations");
        Assert.assertEquals(property.defaultValue, "new HashMap<>()");
        Assert.assertEquals(property.baseType, "Map");
        Assert.assertEquals(property.isMap, true);
    }

    @Test(description = "convert a model with a 2D list property")
    public void list2DPropertyTest() {
        final Schema model = new Schema()
                .name("sample")
                .addProperties("list2D", new ArraySchema().items(
                        new ArraySchema().items(new Schema().$ref("Pet"))));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("list2D");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "list2D");
        Assert.assertEquals(property.name, "list2D");
        Assert.assertEquals(property.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property.baseType, "List");
        Assert.assertTrue(property.isArray);
    }

    @Test(description = "convert a model with restricted characters")
    public void restrictedCharactersPropertiesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("@Some:restricted%characters#to!handle+", new BooleanSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("@Some:restricted%characters#to!handle+");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "@Some:restricted%characters#to!handle+");
        Assert.assertTrue(property.isBoolean);
        Assert.assertEquals(property.name, "atSomeColonRestrictedPercentCharactersHashToExclamationHandlePlus");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "Boolean");
    }

    @Test(description = "convert a model with complex properties")
    public void complexPropertiesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/components/schemas/Children"));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.refClass, "Children");
        Assert.assertEquals(property.name, "children");
        // "null" as default value for model
        Assert.assertEquals(property.defaultValue, "null");
        Assert.assertEquals(property.baseType, "Children");
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.items.refClass, "Children");
        Assert.assertTrue(property.isArray);
        Assert.assertEquals(property.name, "children");
        Assert.assertEquals(property.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property.baseType, "List");
    }

    @Test(description = "convert a model with complex map property")
    public void complexMapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new MapSchema()
                        .additionalProperties(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Map", "Children")).size(), 2);

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.additionalProperties.refClass, "Children");
        Assert.assertTrue(property.isMap);
        Assert.assertEquals(property.name, "children");
        Assert.assertEquals(property.defaultValue, "new HashMap<>()");
        Assert.assertEquals(property.baseType, "Map");
    }

    @Test(description = "convert a model with complex array property")
    public void complexArrayPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("List", "Children")).size(), 2);

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.items.refClass, "Children");
        Assert.assertEquals(property.name, "children");
        Assert.assertEquals(property.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property.baseType, "List");
        Assert.assertTrue(property.isArray);
    }

    @Test(description = "convert a model with complex set property")
    public void complexSetPropertyTest() {
        Schema set = new ArraySchema().items(new Schema().$ref("#/components/schemas/Children"));
        set.setUniqueItems(true); // set
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", set);
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertTrue(cm.imports.contains("Set"));

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.items.refClass, "Children");
        Assert.assertEquals(property.name, "children");
        Assert.assertEquals(property.defaultValue, "new LinkedHashSet<>()");
        Assert.assertEquals(property.baseType, "Set");
        Assert.assertTrue(property.isArray);
        Assert.assertTrue(property.getUniqueItems());
    }
    @Test(description = "convert a model with an array property with item name")
    public void arrayModelWithItemNameTest() {
        final Schema propertySchema = new ArraySchema()
                .items(new Schema().$ref("#/components/schemas/Child"))
                .description("an array property");
        propertySchema.addExtension("x-item-name", "child");
        final Schema schema = new Schema()
                .type("object")
                .description("a sample model")
                .addProperties("children", propertySchema);


        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("List", "Child")).size(), 2);

        CodegenKey ck = codegen.getKey("children");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "children");
        Assert.assertEquals(property.items.refClass, "Child");
        Assert.assertEquals(property.name, "children");
        Assert.assertEquals(property.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property.baseType, "List");
        Assert.assertTrue(property.isArray);

        final CodegenProperty itemsProperty = property.items;
        Assert.assertEquals(itemsProperty.name.getName(), "child");
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().name("elobjeto").$ref("#/components/schemas/Children"))
                .name("arraySchema")
                .description("an array model");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "ArrayList<Children>");
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "List", "ArrayList")).size(), 3);
    }

    @Test(description = "convert a set model")
    public void setModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().name("elobjeto").$ref("#/components/schemas/Children"))
                .uniqueItems(true)
                .name("arraySchema")
                .description("an array model");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "LinkedHashSet<Children>");
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "Set", "LinkedHashSet")).size(), 3);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/components/schemas/Children"));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "HashMap<String, Children>");
        Assert.assertEquals(cm.imports.size(), 4);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "Map", "HashMap", "Children")).size(), 4);
    }

    @Test(description = "convert a model with upper-case property names")
    public void upperCaseNamesTest() {
        final Schema schema = new Schema()
                .description("a model with upper-case property names")
                .addProperties("NAME", new StringSchema())
                .addRequiredItem("NAME");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("NAME");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "NAME");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
        Assert.assertFalse(property.isString);
    }

    @Test(description = "convert a model with upper-case property names and Numbers")
    public void upperCaseNamesNumbersTest() {
        final Schema schema = new Schema()
                .description("a model with upper-case property names and numbers")
                .addProperties("NAME1", new StringSchema())
                .addRequiredItem("NAME1");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("NAME1");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "NAME1");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
        Assert.assertTrue(property.isString);
    }

    @Test(description = "convert a model with a 2nd char upper-case property names")
    public void secondCharUpperCaseNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a 2nd char upper-case property names")
                .addProperties("pId", new StringSchema())
                .addRequiredItem("pId");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("pId");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "pId");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
        Assert.assertTrue(property.isString);
    }

    @Test(description = "convert a model starting with two upper-case letter property names")
    public void firstTwoUpperCaseLetterNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a property name starting with two upper-case letters")
                .addProperties("ATTName", new StringSchema())
                .addRequiredItem("ATTName");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("ATTName");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "ATTName");
        Assert.assertTrue(property.isString);
        Assert.assertEquals(property.name, "atTName");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
    }

    @Test(description = "convert a model with an all upper-case letter and one non letter property names")
    public void allUpperCaseOneNonLetterNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a property name starting with two upper-case letters")
                .addProperties("ATT_NAME", new StringSchema())
                .addRequiredItem("ATT_NAME");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("ATT_NAME");
        final CodegenProperty property = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "ATT_NAME");
        Assert.assertTrue(property.isString);
        Assert.assertEquals(property.name, "ATT_NAME");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
    }

    @Test(description = "convert hyphens per issue 503")
    public void hyphensTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("created-at", new DateTimeSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        CodegenKey ck = codegen.getKey("created-at");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "created-at");
        Assert.assertEquals(property.name.getCamelCaseName(), "createdAt");
    }

    @Test(description = "convert query[password] to queryPassword")
    public void squareBracketsTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("query[password]", new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        CodegenKey ck = codegen.getKey("query[password]");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "query[password]");
        Assert.assertEquals(property.name.getCamelCaseName(), "queryPassword");
    }

    @Test(description = "properly escape names per 567")
    public void escapeNamesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("created-at", new DateTimeSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("with.dots", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("with.dots", schema);

        Assert.assertEquals(cm.classname, "WithDots");
    }

    @Test(description = "convert a model with binary data")
    public void binaryDataTest() {
        final Schema schema = new Schema()
                .description("model with binary")
                .addProperties("inputBinaryData", new ByteArraySchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        CodegenKey ck = codegen.getKey("inputBinaryData");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "inputBinaryData");
        Assert.assertTrue(property.isBinary);
        Assert.assertEquals(property.name, "inputBinaryData");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "byte[]");
    }

    @Test(description = "translate an invalid param name")
    public void invalidParamNameTest() {
        final Schema schema = new Schema()
                .description("a model with a 2nd char upper-case property names")
                .addProperties("_", new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        CodegenKey ck = codegen.getKey("_");
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), "_");
        Assert.assertTrue(property.isString);
        Assert.assertEquals(property.name.getSnakeCaseName(), "u");
        Assert.assertNull(property.defaultValue);
        Assert.assertEquals(property.baseType, "String");
    }

    @Test(description = "convert a parameter")
    public void convertParameterTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Parameter parameter = new QueryParameter()
                .description("this is a description")
                .name("limit")
                .schema(new Schema())
                .required(true);
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenParameter p = codegen.fromParameter(parameter, "0");

        Assert.assertNull(p.getSchema().allowableValues);
        Assert.assertEquals(p.description, "this is a description");
    }

    @Test(description = "types used by inner properties should be imported")
    public void mapWithAnListOfBigDecimalTest() {
        Schema decimal = new StringSchema();
        decimal.setFormat("number");

        Schema schema1 = new Schema()
                .description("model with Map<String, List<BigDecimal>>")
                .addProperties("map", new MapSchema()
                        .additionalProperties(new ArraySchema().items(decimal)));
        OpenAPI openAPI1 = TestUtils.createOpenAPIWithOneSchema("sample", schema1);
        JavaClientCodegen codegen1 = new JavaClientCodegen();
        codegen1.setOpenAPI(openAPI1);
        final CodegenModel cm1 = codegen1.fromModel("sample", schema1);
        Assert.assertTrue(cm1.imports.contains("BigDecimal"));

        Schema schema2 = new Schema()
                .description("model with Map<String, Map<String, List<BigDecimal>>>")
                .addProperties("map", new MapSchema()
                        .additionalProperties(new MapSchema()
                                .additionalProperties(new ArraySchema().items(decimal))));
        OpenAPI openAPI2 = TestUtils.createOpenAPIWithOneSchema("sample", schema2);
        JavaClientCodegen codegen2 = new JavaClientCodegen();
        codegen2.setOpenAPI(openAPI2);
        final CodegenModel cm2 = codegen2.fromModel("sample", schema2);
        Assert.assertTrue(cm2.imports.contains("BigDecimal"));
    }

    @DataProvider(name = "modelNames")
    public static Object[][] primeNumbers() {
        return new Object[][]{
                {"sample", "Sample"},
                {"sample_name", "SampleName"},
                {"sample__name", "SampleName"},
                {"/sample", "Sample"},
                {"\\sample", "Sample"},
                {"sample.name", "SampleName"},
                {"_sample", "Sample"},
                {"Sample", "Sample"},
        };
    }

    @Test(dataProvider = "modelNames", description = "avoid inner class")
    public void modelNameTest(String name, String expectedName) {
        final Schema schema = new Schema();
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema(name, schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel(name, schema);

        Assert.assertEquals(cm.name, name);
        Assert.assertEquals(cm.classname, expectedName);
    }

    @DataProvider(name = "classProperties")
    public static Object[][] classProperties() {
        return new Object[][]{
                {"class", "getPropertyClass", "setPropertyClass", "propertyClass"},
                {"_class", "getPropertyClass", "setPropertyClass", "propertyClass"},
                {"__class", "getPropertyClass", "setPropertyClass", "propertyClass"}
        };
    }

    @Test(dataProvider = "classProperties", description = "handle 'class' properties")
    public void classPropertyTest(String baseName, String getter, String setter, String name) {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties(baseName, new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        CodegenKey ck = codegen.getKey(baseName);
        final CodegenProperty property = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property.name.getName(), baseName);
        Assert.assertEquals(property.name.getSnakeCaseName(), name);
    }


    @Test(description = "test models with xml")
    public void modelWithXmlTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .xml(new XML()
                        .prefix("my")
                        .namespace("xmlNamespace")
                        .name("customXmlName"))
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema()
                        .example("Tony")
                        .xml(new XML()
                                .attribute(true)
                                .prefix("my")
                                .name("myName")))
                .addProperties("createdAt", new DateTimeSchema()
                        .xml(new XML()
                                .prefix("my")
                                .namespace("myNamespace")
                                .name("myCreatedAt")))
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.xmlPrefix, "my");
        Assert.assertEquals(cm.xmlName, "customXmlName");
        Assert.assertEquals(cm.xmlNamespace, "xmlNamespace");
        Assert.assertEquals(cm.vars.size(), 3);

        CodegenKey ck = codegen.getKey("name");
        final CodegenProperty property2 = cm.getRequiredProperties().get(ck);
        Assert.assertEquals(property2.name.getName(), "name");
        Assert.assertTrue(property2.isString);
        Assert.assertEquals(property2.name, "name");
        Assert.assertNull(property2.defaultValue);
        Assert.assertEquals(property2.baseType, "String");
        Assert.assertEquals(property2.example, "Tony");
        Assert.assertTrue(property2.isXmlAttribute);
        Assert.assertEquals(property2.xmlName, "myName");
        Assert.assertNull(property2.xmlNamespace);

        ck = codegen.getKey("createdAt");
        final CodegenProperty property3 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property3.name.getName(), "createdAt");
        Assert.assertTrue(property3.isDate);
        Assert.assertNull(property3.defaultValue);
        Assert.assertEquals(property3.baseType, "Date");
        Assert.assertFalse(property3.isXmlAttribute);
        Assert.assertEquals(property3.xmlName, "myCreatedAt");
        Assert.assertEquals(property3.xmlNamespace, "myNamespace");
        Assert.assertEquals(property3.xmlPrefix, "my");
    }

    @Test(description = "test models with wrapped xml")
    public void modelWithWrappedXmlTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .xml(new XML()
                        .prefix("my")
                        .namespace("xmlNamespace")
                        .name("customXmlName"))
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("array", new ArraySchema()
                        .items(new StringSchema()
                                .xml(new XML()
                                        .name("i")))
                        .xml(new XML()
                                .prefix("my")
                                .wrapped(true)
                                .namespace("myNamespace")
                                .name("xmlArray")))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.xmlPrefix, "my");
        Assert.assertEquals(cm.xmlName, "customXmlName");
        Assert.assertEquals(cm.xmlNamespace, "xmlNamespace");
        Assert.assertEquals(cm.vars.size(), 2);

        CodegenKey ck = codegen.getKey("array");
        final CodegenProperty property2 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(property2.name.getName(), "array");
        Assert.assertEquals(property2.name, "array");
        Assert.assertEquals(property2.defaultValue, "new ArrayList<>()");
        Assert.assertEquals(property2.baseType, "List");
        Assert.assertTrue(property2.isArray);
        Assert.assertTrue(property2.isXmlWrapped);
        Assert.assertEquals(property2.xmlName, "xmlArray");
        Assert.assertNotNull(property2.xmlNamespace);
        Assert.assertNotNull(property2.items);
        CodegenProperty items = property2.items;
        Assert.assertEquals(items.xmlName, "i");
        Assert.assertEquals(items.name.getName(), "array");
    }

    @Test(description = "convert a boolean parameter")
    public void booleanPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final BooleanSchema property = new BooleanSchema();
        final JavaClientCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setBooleanGetterPrefix("is");
        final CodegenProperty cp = codegen.fromProperty(property, null);

        Assert.assertEquals(cp.name.getName(), "property");
        Assert.assertTrue(cp.isBoolean);
        Assert.assertEquals(cp.baseType, "Boolean");
        Assert.assertTrue(cp.isBoolean);
    }

    @Test(description = "convert an integer property")
    public void integerPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final IntegerSchema property = new IntegerSchema();
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty(property, null);

        Assert.assertEquals(cp.name.getName(), "property");
        Assert.assertEquals(cp.baseType, "Integer");
        Assert.assertTrue(cp.isInteger);
        Assert.assertFalse(cp.isLong);
    }

    @Test(description = "convert a long property")
    public void longPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final IntegerSchema property = new IntegerSchema().format("int64");
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty(property, null);

        Assert.assertEquals(cp.name.getName(), "property");
        Assert.assertEquals(cp.baseType, "Long");
        Assert.assertTrue(cp.isLong);
        Assert.assertFalse(cp.isInteger);
    }

    @Test(description = "convert an integer property in a referenced schema")
    public void integerPropertyInReferencedSchemaTest() {
        final IntegerSchema longProperty = new IntegerSchema().format("int32");
        final Schema testSchema = new ObjectSchema()
                .addProperties("Integer1", new Schema<>().$ref("#/components/schemas/IntegerProperty"))
                .addProperties("Integer2", new IntegerSchema().format("int32"));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("IntegerProperty", longProperty);
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.getProperties().size(), 2);

        CodegenKey ck = codegen.getKey("Integer1");
        CodegenProperty cp1 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp1.name.getName(), "Integer1");
        Assert.assertEquals(cp1.name.getCamelCaseName(), "Integer1");
        Assert.assertEquals(cp1.name.getSnakeCaseName(), "INTEGER1");
        Assert.assertTrue(cp1.isInteger);
        Assert.assertEquals(cp1.baseType, "Integer");

        ck = codegen.getKey("Integer2");
        CodegenProperty cp2 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp2.name.getName(), "Integer2");
        Assert.assertEquals(cp2.name.getCamelCaseName(), "Integer2");
        Assert.assertEquals(cp2.name.getSnakeCaseName(), "INTEGER2");
        Assert.assertTrue(cp2.isInteger);
        Assert.assertEquals(cp2.baseType, "Integer");
    }

    @Test(description = "convert a long property in a referenced schema")
    public void longPropertyInReferencedSchemaTest() {
        final IntegerSchema longProperty = new IntegerSchema().format("int64");
        final Schema TestSchema = new ObjectSchema()
                .addProperties("Long1", new Schema<>().$ref("#/components/schemas/LongProperty"))
                .addProperties("Long2", new IntegerSchema().format("int64"));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("LongProperty", longProperty);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", TestSchema);

        Assert.assertEquals(cm.getProperties().size(), 2);

        CodegenKey ck = codegen.getKey("Long1");
        CodegenProperty cp1 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp1.name.getName(), "Long1");
        Assert.assertTrue(cp1.isLong);
        Assert.assertEquals(cp1.baseType, "Long");

        ck = codegen.getKey("Long2");
        CodegenProperty cp2 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp2.name.getName(), "Long2");
        Assert.assertTrue(cp2.isLong);
        Assert.assertEquals(cp2.baseType, "Long");
    }

    @Test(description = "convert string property")
    public void stringPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty(
                property, null);

        Assert.assertEquals(cp.name.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getSnakeCaseName(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getSnakeCaseName(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.baseType, "String");
        Assert.assertFalse(cp.isLong);
        Assert.assertFalse(cp.isInteger);
        Assert.assertTrue(cp.isString);
        Assert.assertEquals(cp.minLength, Integer.valueOf(3));
        Assert.assertEquals(cp.maxLength, Integer.valueOf(10));
        Assert.assertEquals(cp.pattern, "^[A-Z]+$");
    }

    @Test(description = "convert string property in an object")
    public void stringPropertyInObjectTest() {
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final Schema myObject = new ObjectSchema().addProperties("somePropertyWithMinMaxAndPattern", property);

        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("myObject", myObject);
        codegen.setOpenAPI(openAPI);
        CodegenModel cm = codegen.fromModel("myObject", myObject);

        Assert.assertEquals(cm.getProperties().size(), 1);

        CodegenKey ck = codegen.getKey("somePropertyWithMinMaxAndPattern");
        CodegenProperty cp = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp.name.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getCamelCaseName(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getSnakeCaseName(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.name, "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.baseType, "String");
        Assert.assertFalse(cp.isLong);
        Assert.assertFalse(cp.isInteger);
        Assert.assertTrue(cp.isString);
        Assert.assertEquals(cp.minLength, Integer.valueOf(3));
        Assert.assertEquals(cp.maxLength, Integer.valueOf(10));
        Assert.assertEquals(cp.pattern, "^[A-Z]+$");
    }

    @Test(description = "convert referenced string property in an object")
    public void stringPropertyReferencedInObjectTest() {
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final Schema myObject = new ObjectSchema().addProperties("somePropertyWithMinMaxAndPattern", new ObjectSchema().$ref("refObj"));

        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPI();
        openAPI.setComponents(new Components()
                .addSchemas("myObject", myObject)
                .addSchemas("refObj", property)
        );
        codegen.setOpenAPI(openAPI);
        CodegenModel cm = codegen.fromModel("myObject", myObject);

        Assert.assertEquals(cm.getProperties().size(), 1);

        CodegenKey ck = codegen.getKey("somePropertyWithMinMaxAndPattern");
        CodegenProperty cp = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp.name.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getCamelCaseName(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.name.getSnakeCaseName(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.name, "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.baseType, "String");
        Assert.assertFalse(cp.isLong);
        Assert.assertFalse(cp.isInteger);
        Assert.assertTrue(cp.isString);
        Assert.assertEquals(cp.minLength, Integer.valueOf(3));
        Assert.assertEquals(cp.maxLength, Integer.valueOf(10));
        Assert.assertEquals(cp.pattern, "^[A-Z]+$");
    }

    @Test(description = "convert an array schema")
    public void arraySchemaTest() {
        final Schema testSchema = new ObjectSchema()
                .addProperties("pets", new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.getProperties().size(), 1);

        CodegenKey ck = codegen.getKey("pets");
        CodegenProperty cp1 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp1.name.getName(), "pets");
        Assert.assertEquals(cp1.baseType, "List");
        Assert.assertTrue(cp1.isArray);
        Assert.assertFalse(cp1.isMap);
        Assert.assertEquals(cp1.items.baseType, "Pet");

        Assert.assertTrue(cm.imports.contains("List"));
        Assert.assertTrue(cm.imports.contains("Pet"));
    }

    @Test(description = "convert an array schema in a RequestBody")
    public void arraySchemaTestInRequestBody() {
        final Schema testSchema = new ArraySchema()
                .items(new Schema<>().$ref("#/components/schemas/Pet"));
        Operation operation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema))))
                .responses(
                        new ApiResponses().addApiResponse("204", new ApiResponse()
                                .description("Ok response")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.bodyParams.size(), 1);
        CodegenParameter cp1 = co.requestBody;
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().baseType, "List");
        Assert.assertTrue(cp1.getContent().get("application/json").getSchema().isArray);
        Assert.assertFalse(cp1.getContent().get("application/json").getSchema().isMap);
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().items.baseType, "Pet");
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().items.refClass, "Pet");

        Assert.assertEquals(co.responses.size(), 1);

        Assert.assertTrue(cp1.imports.contains("List"));
        Assert.assertTrue(cp1.imports.contains("Pet"));
    }

    @Test(description = "convert an array schema in an ApiResponse")
    public void arraySchemaTestInOperationResponse() {
        final Schema testSchema = new ArraySchema()
                .items(new Schema<>().$ref("#/components/schemas/Pet"));
        Operation operation = new Operation().responses(
                new ApiResponses().addApiResponse("200", new ApiResponse()
                        .description("Ok response")
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema)))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.responses.size(), 1);
        CodegenResponse cr = co.responses.get("200");
        Assert.assertEquals(cr.getContent().get("application/json").getSchema().baseType, "List");
        Assert.assertEquals(cr.getContent().get("application/json").getSchema().items.refClass, "Pet");
        Assert.assertEquals(cr.getContent().get("application/json").getSchema().isArray, true);

        Assert.assertTrue(cr.imports.contains("Pet"));
    }

    @Test(description = "convert an array of array schema")
    public void arrayOfArraySchemaTest() {
        final Schema testSchema = new ObjectSchema()
                .addProperties("pets", new ArraySchema()
                        .items(new ArraySchema()
                                .items(new Schema<>().$ref("#/components/schemas/Pet"))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.getProperties().size(), 1);

        CodegenKey ck = codegen.getKey("pets");
        CodegenProperty cp1 = cm.getOptionalProperties().get(ck);
        Assert.assertEquals(cp1.name.getName(), "pets");
        Assert.assertTrue(cp1.isArray);
        Assert.assertTrue(cp1.items.isArray);
        Assert.assertEquals(cp1.items.items.refClass, "Pet");
        Assert.assertEquals(cp1.name, "pets");
        Assert.assertEquals(cp1.baseType, "List");

        Assert.assertTrue(cm.imports.contains("List"));
        Assert.assertTrue(cm.imports.contains("Pet"));
    }

    @Test(description = "convert an array of array schema in a RequestBody")
    public void arrayOfArraySchemaTestInRequestBody() {
        final Schema testSchema = new ArraySchema()
                .items(new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        Operation operation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema))))
                .responses(
                        new ApiResponses().addApiResponse("204", new ApiResponse()
                                .description("Ok response")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.bodyParams.size(), 1);
        CodegenParameter cp1 = co.requestBody;
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().baseType, "List");
        Assert.assertTrue(cp1.getContent().get("application/json").getSchema().isArray);
        Assert.assertFalse(cp1.getContent().get("application/json").getSchema().isMap);
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().items.baseType, "List");
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().items.items.refClass, "Pet");
        Assert.assertEquals(cp1.getContent().get("application/json").getSchema().items.items.baseType, "Pet");

        Assert.assertEquals(co.responses.size(), 1);

        Assert.assertTrue(cp1.imports.contains("Pet"));
        Assert.assertTrue(cp1.imports.contains("List"));
    }

    @Test(description = "convert an array schema in an ApiResponse")
    public void arrayOfArraySchemaTestInOperationResponse() {
        final Schema testSchema = new ArraySchema()
                .items(new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        Operation operation = new Operation().responses(
                new ApiResponses().addApiResponse("200", new ApiResponse()
                        .description("Ok response")
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema)))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.responses.size(), 1);
        CodegenResponse cr = co.responses.get("200");
        Assert.assertEquals(cr.getContent().get("application/json").getSchema().baseType, "List");

        Assert.assertTrue(cr.imports.contains("Pet"));
    }

    @Test
    public void generateModel() throws Exception {
        String inputSpec = "src/test/resources/3_0/petstore.json";

        final File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        Assert.assertTrue(new File(inputSpec).exists());

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("java")
                .setLibrary("jersey2")
                //.addAdditionalProperty("withXml", true)
                .addAdditionalProperty(CodegenConstants.SERIALIZABLE_MODEL, true)
                .setInputSpec(inputSpec)
                .setOutputDir(output.getAbsolutePath());

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();

        File orderFile = new File(output, "src/main/java/org/openapitools/client/model/Order.java");
        Assert.assertTrue(orderFile.exists());
    }

    @Test
    public void generateEmpty() throws Exception {
        String inputSpec = "src/test/resources/3_0/ping.yaml";

        final File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();
        Assert.assertTrue(new File(inputSpec).exists());

        JavaClientCodegen config = new org.openapitools.codegen.languages.JavaClientCodegen();
        config.setHideGenerationTimestamp(true);
        config.setOutputDir(output.getAbsolutePath());

        final OpenAPI openAPI = TestUtils.parseFlattenSpec(inputSpec);

        final ClientOptInput opts = new ClientOptInput();
        opts.config(config);
        opts.openAPI(openAPI);
        new DefaultGenerator().opts(opts).generate();

        File orderFile = new File(output, "src/main/java/org/openapitools/client/api/DefaultApi.java");
        Assert.assertTrue(orderFile.exists());
    }
}
