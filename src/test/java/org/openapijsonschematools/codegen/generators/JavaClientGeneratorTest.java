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

package org.openapijsonschematools.codegen.generators;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.openapijsonschematools.codegen.TestUtils;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumValue;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Map;

public class JavaClientGeneratorTest {

    private final JavaClientGenerator generator = new JavaClientGenerator(null, null);

    @Test
    void inlineEnum() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setEnum(
                Arrays.asList("first", "second")
        );
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/inlineEnum");
        Assert.assertEquals(p.example, "\"first\"");
    }

    @Test
    void inlineEnumArray() {
        Schema sc = new ArraySchema();
        Schema items = new Schema();
        items.setType("string");
        items.setEnum(
                Arrays.asList("first", "second")
        );
        sc.setItems(items);
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/inlineEnumArray");
        Assert.assertEquals(p.example, "Arrays.asList()");
    }

    @Test
    void dateDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/dateDefault");
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateGivenExample() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date");
        sc.setExample("2017-03-30");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/dateGivenExample");
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateTimeDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date-time");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/dateTimeDefault");
        Assert.assertEquals(p.example, "LocalDate.now()");
    }

    @Test
    void dateTimeGivenExample() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date-time");
        sc.setExample("2007-12-03T10:15:30+01:00");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/dateTimeGivenExample");
        Assert.assertEquals(p.example, "LocalDate.parse(\"2007-12-03T10:15:30+01:00\")");
    }

    @Test
    void uuidDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("uuid");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/uuidDefault");
        Assert.assertEquals(p.example, "UUID.randomUUID()");
    }

    @Test
    void uuidGivenExample() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("uuid");
        sc.setExample("13b48713-b931-45ea-bd60-b07491245960");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = generator.fromParameter(parameter, "#/components/parameters/uuidGivenExample");
        Assert.assertEquals(p.example, "UUID.fromString(\"13b48713-b931-45ea-bd60-b07491245960\")");
    }

    @Test
    public void testEnumNames() {
        OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/70_schema_enum_names.yaml");
        var javaGenerator = new JavaClientGenerator(null, null);
        javaGenerator.setOpenAPI(openAPI);

        String modelName = "StringEnum";
        Schema schema = openAPI.getComponents().getSchemas().get(modelName);

        CodegenSchema cm = javaGenerator.fromSchema(
                schema,
                "#/components/schemas/" + modelName,
                "#/components/schemas/" + modelName
        );

        Map<EnumValue, String> enumVars = cm.enumInfo.valueToName;
        Assert.assertEquals(enumVars.size(), 3);
        Assert.assertEquals(enumVars.get(new EnumValue("#367B9C", "string", null)), "NUMBER_SIGN_367B9C");
        Assert.assertEquals(enumVars.get(new EnumValue("#FFA5A4", "string", null)), "NUMBER_SIGN_FFA5A4");
        Assert.assertEquals(enumVars.get(new EnumValue("2D_Object", "string", null)), "DIGIT_TWO_D_OBJECT");
    }
}
