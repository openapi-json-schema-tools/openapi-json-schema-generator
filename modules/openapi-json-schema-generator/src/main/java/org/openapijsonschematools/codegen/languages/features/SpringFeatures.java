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

package org.openapijsonschematools.codegen.languages.features;

public interface SpringFeatures extends BeanValidationFeatures {

    String GENERATE_SPRING_APPLICATION = "generateSpringApplication";

    String GENERATE_SPRING_BOOT_APPLICATION = "generateSpringBootApplication";

    String USE_SPRING_ANNOTATION_CONFIG = "useSpringAnnotationConfig";

    void setGenerateSpringApplication(boolean useGenerateSpringApplication);

    void setGenerateSpringBootApplication(boolean generateSpringBootApplication);

    void setUseSpringAnnotationConfig(boolean useSpringAnnotationConfig);

}