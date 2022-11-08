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

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.CodegenParameter;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AbstractJavaCodegenExampleValuesTest {

    private final AbstractJavaCodegen fakeJavaCodegen = new P_AbstractJavaCodegen();

    @Test
    void inlineEnum() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setEnum(
                Arrays.asList("first", "second")
        );
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "\"first\"");
    }

    @Test
    void inlineEnumArray() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("array");
        Schema items = new Schema();
        items.setType("string");
        items.setEnum(
                Arrays.asList("first", "second")
        );
        sc.setItems(items);
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "new List()");
    }

    @Test
    void dateDefault() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateGivenExample() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date");
        sc.setExample("2017-03-30");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateTimeDefault() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date-time");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void dateTimeGivenExample() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("date-time");
        sc.setExample("2007-12-03T10:15:30+01:00");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "new Date()");
    }

    @Test
    void uuidDefault() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("uuid");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
        Assert.assertEquals(p.example, "UUID.randomUUID()");
    }

    @Test
    void uuidGivenExample() {
        final CodegenParameter p = new CodegenParameter();
        Schema sc = new Schema();
        sc.setType("string");
        sc.setFormat("uuid");
        sc.setExample("13b48713-b931-45ea-bd60-b07491245960");
        CodegenProperty cp = fakeJavaCodegen.fromProperty("schema", sc, false, false, null);
        p.setSchema(cp);
        fakeJavaCodegen.setParameterExampleValue(p);
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
