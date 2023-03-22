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

package org.openapijsonschematools.codegen.languages;

import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.CliOption;
import org.openapijsonschematools.codegen.CodegenConstants;
import org.openapijsonschematools.codegen.model.CodegenSchema;
import org.openapijsonschematools.codegen.SupportingFile;
import org.openapijsonschematools.codegen.meta.features.DocumentationFeature;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JavaJerseyServerCodegen extends AbstractJavaJAXRSServerCodegen {

    protected static final String LIBRARY_JERSEY1 = "jersey1";
    protected static final String LIBRARY_JERSEY2 = "jersey2";

    /**
     * Default library template to use. (Default: jersey2)
     */
    public static final String DEFAULT_JERSEY_LIBRARY = LIBRARY_JERSEY2;

    public JavaJerseyServerCodegen() {
        super();

        modifyFeatureSet(features -> features.includeDocumentationFeatures(DocumentationFeature.Readme));

        outputFolder = "generated-code/JavaJaxRS-Jersey";

        apiTestTemplateFiles.clear(); // TODO: add test template

        // clear model and api doc template as this codegen
        // does not support auto-generated markdown doc at the moment
        //TODO: add doc templates
        Map<String, String> modelDocTemplates = jsonPathDocTemplateFiles.get(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA
        );
        if (modelDocTemplates != null) {
            modelDocTemplates.remove("model_doc.mustache");
        }
        HashMap<String, String> temp = (HashMap<String, String>) jsonPathDocTemplateFiles.get(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG
        );
        temp.remove("api_doc.mustache");
        embeddedTemplateDir = templateDir = JAXRS_TEMPLATE_DIRECTORY_NAME;

        CliOption library = new CliOption(CodegenConstants.LIBRARY, CodegenConstants.LIBRARY_DESC).defaultValue(DEFAULT_JERSEY_LIBRARY);
        supportedLibraries.put(LIBRARY_JERSEY1, "Jersey core 1.x");
        supportedLibraries.put(LIBRARY_JERSEY2, "Jersey core 2.x");
        library.setEnum(supportedLibraries);

        cliOptions.add(library);
        cliOptions.add(CliOption.newBoolean(SUPPORT_JAVA6, "Whether to support Java6 with the Jersey1/2 library."));
    }

    @Override
    public String getName() {
        return "jaxrs-jersey";
    }

    @Override
    public String getHelp() {
        return "Generates a Java JAXRS Server application based on Jersey framework.";
    }

    @Override
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
        super.postProcessModelProperty(model, property);
        if ("null".equals(property.example)) {
            property.example = null;
        }

        //Add imports for Jackson
        if (model.enumValueToName == null) {
            model.imports.add("JsonProperty");
        }
    }

    @Override
    public void processOpts() {
        super.processOpts();

        // use default library if unset
        if (StringUtils.isEmpty(library)) {
            setLibrary(DEFAULT_JERSEY_LIBRARY);
        }

        if (additionalProperties.containsKey(CodegenConstants.IMPL_FOLDER)) {
            implFolder = (String) additionalProperties.get(CodegenConstants.IMPL_FOLDER);
        }

        if ("joda".equals(dateLibrary)) {
            supportingFiles.add(new SupportingFile("JodaDateTimeProvider.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "JodaDateTimeProvider.java"));
            supportingFiles.add(new SupportingFile("JodaLocalDateProvider.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "JodaLocalDateProvider.java"));
        } else if (dateLibrary.startsWith("java8")) {
            supportingFiles.add(new SupportingFile("OffsetDateTimeProvider.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "OffsetDateTimeProvider.java"));
            supportingFiles.add(new SupportingFile("LocalDateProvider.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "LocalDateProvider.java"));
        }

        supportingFiles.add(new SupportingFile("pom.mustache", "", "pom.xml")
                .doNotOverwrite());
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md")
                .doNotOverwrite());
        supportingFiles.add(new SupportingFile("ApiException.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "ApiException.java"));
        supportingFiles.add(new SupportingFile("ApiOriginFilter.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "ApiOriginFilter.java"));
        supportingFiles.add(new SupportingFile("ApiResponseMessage.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "ApiResponseMessage.java"));
        supportingFiles.add(new SupportingFile("NotFoundException.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "NotFoundException.java"));
        supportingFiles.add(new SupportingFile("jacksonJsonProvider.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "JacksonJsonProvider.java"));
        supportingFiles.add(new SupportingFile("RFC3339DateFormat.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "RFC3339DateFormat.java"));
        supportingFiles.add(new SupportingFile("bootstrap.mustache", (implFolder + '/' + apiPackage).replace(".", "/"), "Bootstrap.java")
                .doNotOverwrite());
        supportingFiles.add(new SupportingFile("web.mustache", ("src/main/webapp/WEB-INF"), "web.xml")
                .doNotOverwrite());
        supportingFiles.add(new SupportingFile("StringUtil.mustache", (sourceFolder + '/' + apiPackage).replace(".", "/"), "StringUtil.java"));

        // JsonNullable is not implemented for this generator
        openApiNullable = false;
    }

}
