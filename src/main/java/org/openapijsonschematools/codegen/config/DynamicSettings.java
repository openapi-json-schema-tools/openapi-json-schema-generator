package org.openapijsonschematools.codegen.config;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.clicommands.Generate;
import org.openapijsonschematools.codegen.templating.TemplateDefinition;
import org.openapijsonschematools.codegen.templating.TemplateFileType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a serialization helper of {@link GeneratorSettings} and {@link WorkflowSettings}. When used to deserialize any available Jackson binding input,
 * this will accumulate any "unknown properties" into {@link GeneratorSettings#getAdditionalProperties()} as a side effect of calling
 * {@link DynamicSettings#getGeneratorSettings()}.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class DynamicSettings {
    private final Logger LOGGER = LoggerFactory.getLogger(DynamicSettings.class);
    @JsonAnySetter
    private Map<String, Object> dynamicProperties = new HashMap<>();

    @JsonUnwrapped
    @JsonDeserialize(builder = GeneratorSettings.Builder.class)
    private GeneratorSettings generatorSettings;

    @JsonUnwrapped
    @JsonDeserialize(builder = WorkflowSettings.Builder.class)
    private WorkflowSettings workflowSettings;

    /**
     * Gets the list of template files allowing user redefinition and addition of templating files
     *
     * @return A list of template files
     */
    public List<TemplateDefinition> getFiles() {
        if (files == null) return new ArrayList<>();

        return files.entrySet().stream().map(kvp -> {
            TemplateDefinition file = kvp.getValue();
            String templateFile = kvp.getKey();
            String destination = file.getDestinationFilename();
            if (TemplateFileType.SupportingFiles.equals(file.getTemplateType()) && StringUtils.isBlank(destination)) {
                // this special case allows definitions such as LICENSE:{}
                destination = templateFile;
            }
            TemplateDefinition definition = new TemplateDefinition(templateFile, file.getFolder(), destination);
            definition.setTemplateType(file.getTemplateType());
            return definition;
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    @JsonProperty("files")
    private Map<String, TemplateDefinition> files;

    /**
     * Gets the {@link GeneratorSettings} included in the config object.
     *
     * @return A new instance of settings
     */
    public GeneratorSettings getGeneratorSettings() {
        excludeSettingsFromDynamicProperties();
        GeneratorSettings.Builder builder = GeneratorSettings.newBuilder(generatorSettings);

        // This allows us to put any unknown top-level properties into additionalProperties of the generator object.
        for (Map.Entry<String, Object> entry : dynamicProperties.entrySet()) {
            builder.withAdditionalProperty(entry.getKey(), entry.getValue());
        }
        if (generatorSettings.getArtifactId() == null && generatorSettings.getAdditionalProperties().containsKey("artifactId")) {
            LOGGER.warn("Deprecated additionalProperties arg: artifactId should be passed in at the root level of the config file from now on");
            builder.withArtifactId((String) generatorSettings.getAdditionalProperties().get("artifactId"));
        }
        if (generatorSettings.getPackageName() == null && generatorSettings.getAdditionalProperties().containsKey("packageName")) {
            LOGGER.warn("Deprecated additionalProperties arg: packageName should be passed in at the root level of the config file from now on");
            builder.withPackageName((String) generatorSettings.getAdditionalProperties().get("packageName"));
        }
        return builder.build();
    }

    /**
     * Gets the {@link WorkflowSettings} included in the config object.
     *
     * @return A new instance of settings
     */
    public WorkflowSettings getWorkflowSettings() {
        excludeSettingsFromDynamicProperties();
        WorkflowSettings.Builder builder = WorkflowSettings.newBuilder(workflowSettings);
        if (generatorSettings.getAdditionalProperties().containsKey("hideGenerationTimestamp")) {
            LOGGER.warn("Deprecated additionalProperties arg: hideGenerationTimestamp should be passed in at the root level of the config file from now on");
            Boolean hideGenerationTimestamp = Boolean.valueOf((String) generatorSettings.getAdditionalProperties().get("hideGenerationTimestamp"));
            builder.withHideGenerationTimestamp(hideGenerationTimestamp);
        }
        return builder.build();
    }

    /**
     * <p>Constructor for DynamicSettings.</p>
     */
    @JsonCreator
    public DynamicSettings() { }

    /**
     * Gets all "custom" properties included in the config object.
     *
     * @return All user-specified custom properties.
     */
    public Map<String, Object> getDynamicProperties() {
        return dynamicProperties;
    }

    private void excludeSettingsFromDynamicProperties(){
        Set<String> fieldNames = new HashSet<>();
        for (Field field : GeneratorSettings.class.getDeclaredFields()) {
            fieldNames.add(field.getName());
        }
        for (Field field : WorkflowSettings.class.getDeclaredFields()) {
            fieldNames.add(field.getName());
        }
        dynamicProperties.keySet().removeAll(fieldNames);
    }
}
