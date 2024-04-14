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

package org.openapijsonschematools.codegen.generators.generatorloader;

import org.openapijsonschematools.codegen.config.GeneratorSettings;
import org.openapijsonschematools.codegen.config.WorkflowSettings;
import org.openapijsonschematools.codegen.generators.Generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class GeneratorLoader {
    public static Generator getGenerator(String name, GeneratorSettings generatorSettings, WorkflowSettings workflowSettings) {
        ServiceLoader<Generator> loader = ServiceLoader.load(Generator.class, Generator.class.getClassLoader());

        StringBuilder availableConfigs = new StringBuilder();
        for (Generator config : loader) {
            availableConfigs.append(config.getName()).append("\n");
        }

        GeneratorNotFoundException exc = new GeneratorNotFoundException("Can't load config class with name '".concat(name) + "'\nAvailable:\n" + availableConfigs);
        for (Generator config : loader) {
            if (config.getGeneratorMetadata().getName().equals(name)) {
                try {
                    Constructor<?> constructor = config.getClass().getDeclaredConstructor(GeneratorSettings.class, WorkflowSettings.class);
                    return (Generator) constructor.newInstance(generatorSettings, workflowSettings);
                } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                         IllegalAccessException e) {
                    throw exc;
                }
            }
        }
        throw exc;
    }

    /**
     * Tries to load config class with SPI first, then with class name directly from classpath
     *
     * @param name name of config, or full qualified class name in classpath
     * @return config class
     */
    @Deprecated
    public static Generator forName(String name) {
        ServiceLoader<Generator> loader = ServiceLoader.load(Generator.class, Generator.class.getClassLoader());

        StringBuilder availableConfigs = new StringBuilder();

        for (Generator config : loader) {
            if (config.getName().equals(name)) {
                return config;
            }

            availableConfigs.append(config.getName()).append("\n");
        }

        // else try to load directly
        try {
            return (Generator) Class.forName(name).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new GeneratorNotFoundException("Can't load config class with name '".concat(name) + "'\nAvailable:\n" + availableConfigs, e);
        }
    }

    public static List<Generator> getAll() {
        ServiceLoader<Generator> loader = ServiceLoader.load(Generator.class, Generator.class.getClassLoader());
        List<Generator> output = new ArrayList<Generator>();
        for (Generator aLoader : loader) {
            output.add(aLoader);
        }
        return output;
    }
}
