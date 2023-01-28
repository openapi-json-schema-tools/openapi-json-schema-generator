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

package org.openapijsonschematools.codegen.java;

import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.openapijsonschematools.codegen.model.CodegenParameter;
import org.openapijsonschematools.codegen.CodegenType;
import org.openapijsonschematools.codegen.languages.AbstractJavaCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AbstractJavaCodegenExampleValuesTest {

    private final AbstractJavaCodegen fakeJavaCodegen = new P_AbstractJavaCodegen();

    @Test
    void inlineEnum() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setEnum(
                Arrays.asList("first", "second")
        );
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
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
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
        Assert.assertEquals(p.example, "Arrays.asList()");
    }

    @Test
    void dateDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
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
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateTimeDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date-time");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
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
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
        Assert.assertEquals(p.example, "LocalDate.parse(\"2007-12-03T10:15:30+01:00\")");
    }

    @Test
    void uuidDefault() {
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("uuid");
        Parameter parameter = new Parameter();
        parameter.setSchema(sc);
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
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
        final CodegenParameter p = fakeJavaCodegen.fromParameter(parameter, "#/components/parameters/A");
        Assert.assertEquals(p.example, "UUID.fromString(\"13b48713-b931-45ea-bd60-b07491245960\")");
    }

    private static class P_AbstractJavaCodegen extends AbstractJavaCodegen {
        @Override
        public CodegenType getTag() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getHelp() {
            return null;
        }

        /**
         * Gets artifact version.
         * Only for testing purposes.
         *
         * @return version
         */
        public String getArtifactVersion() {
            return this.artifactVersion;
        }
    }
}
