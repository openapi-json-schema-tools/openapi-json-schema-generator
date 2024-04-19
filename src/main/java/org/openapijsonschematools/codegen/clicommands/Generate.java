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

package org.openapijsonschematools.codegen.clicommands;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import io.airlift.airline.Command;
import io.airlift.airline.Option;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.config.ClientOptInput;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generatorrunner.DefaultGeneratorRunner;
import org.openapijsonschematools.codegen.generatorrunner.GeneratorRunner;
import org.openapijsonschematools.codegen.generators.DefaultGenerator;
import org.openapijsonschematools.codegen.generators.generatorloader.GeneratorNotFoundException;
import org.openapijsonschematools.codegen.config.CodegenConfigurator;
import org.openapijsonschematools.codegen.config.CodegenConfiguratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"java:S106"})
@Command(name = "generate", description = "Generate code with the specified generator.")
public class Generate extends AbstractCommand {
    private final Logger LOGGER = LoggerFactory.getLogger(Generate.class);

    CodegenConfigurator configurator;
    GeneratorRunner generatorRunner;

    @Option(name = {"-v", "--verbose"}, description = "verbose mode")
    private Boolean verbose;

    @Option(name = {"-g", "--generator-name"}, title = "generator name",
            description = "generator to use (see list command for list)")
    private String generatorName;

    @Option(name = {"-o", "--output"}, title = "output directory",
            description = "where to write the generated files (current dir by default)")
    private String output = "";

    @Option(name = {"-i", "--input-spec"}, title = "spec file",
            description = "location of the OpenAPI spec, as URL or file (required if not loaded via config using -c)")
    private String spec;

    @Option(name = {"-t", "--template-dir"}, title = "template directory",
            description = "folder containing the template files")
    private String templateDir;

    @Option(name = {"-e", "--engine"}, title = "templating engine",
            description = "templating engine: \"handlebars\"(default) or \"mustache\"")
    private String templatingEngine;

    @Option(
            name = {"-a", "--auth"},
            title = "authorization",
            description = "adds authorization headers when fetching the OpenAPI definitions remotely. "
                    + "Pass in a URL-encoded string of name:header with a comma separating multiple values")
    private String auth;

    @Option(
            name = {"--global-property"},
            title = "global properties",
            description = "sets specified global properties (previously called 'system properties') in "
                    + "the format of name=value,name=value (or multiple options, each with name=value)")
    private List<String> globalProperties = new ArrayList<>();

    @Option(
            name = {"-c", "--config"},
            title = "configuration file",
            description = "Path to configuration file. It can be JSON or YAML. "
                    + "If file is JSON, the content should have the format {\"optionKey\":\"optionValue\", \"optionKey1\":\"optionValue1\"...}. "
                    + "If file is YAML, the content should have the format optionKey: optionValue. "
                    + "Supported options can be different for each language. Run config-help -g {generator name} command for language-specific config options.")
    private String configFile;

    @Option(name = {"-s", "--skip-overwrite"}, title = "skip overwrite",
            description = "specifies if the existing files should be "
                    + "overwritten during the generation.")
    private Boolean skipOverwrite;

    @Option(name = { "--dry-run" }, title = "Dry run",
            description = "Try things out and report on potential changes (without actually making changes).")
    private Boolean isDryRun;

    @Option(name = {"--package-name"}, title = "package name",
            description = CodegenConstants.PACKAGE_NAME_DESC)
    private String packageName;

    @Option(name = {"--api-package"}, title = "api package",
            description = CodegenConstants.API_PACKAGE_DESC)
    private String apiPackage;

    @Option(name = {"--api-name-suffix"}, title = "api name suffix",
            description = CodegenConstants.API_NAME_SUFFIX_DESC)
    private String apiNameSuffix;

    @Option(name = {"--model-name-prefix"}, title = "model name prefix",
            description = CodegenConstants.MODEL_NAME_PREFIX_DESC)
    private String modelNamePrefix;

    @Option(name = {"--model-name-suffix"}, title = "model name suffix",
            description = CodegenConstants.MODEL_NAME_SUFFIX_DESC)
    private String modelNameSuffix;

    @Option(
            name = {"-p", "--additional-properties"},
            title = "additional properties",
            description = "sets additional properties that can be referenced by the mustache templates in the format of name=value,name=value."
                    + " You can also have multiple occurrences of this option.")
    private List<String> additionalProperties = new ArrayList<>();

    @Option(name = {"--invoker-package"}, title = "invoker package",
            description = CodegenConstants.INVOKER_PACKAGE_DESC)
    private String invokerPackage;

    @Option(name = {"--group-id"}, title = "group id", description = CodegenConstants.GROUP_ID_DESC)
    private String groupId;

    @Option(name = {"--artifact-id"}, title = "artifact id",
            description = CodegenConstants.ARTIFACT_ID_DESC)
    private String artifactId;

    @Option(name = {"--artifact-version"}, title = "artifact version",
            description = CodegenConstants.ARTIFACT_VERSION_DESC)
    private String artifactVersion;
    @Option(name = {"--git-host"}, title = "git host",
            description = CodegenConstants.GIT_HOST_DESC)
    private String gitHost;

    @Option(name = {"--git-user-id"}, title = "git user id",
            description = CodegenConstants.GIT_USER_ID_DESC)
    private String gitUserId;

    @Option(name = {"--git-repo-id"}, title = "git repo id",
            description = CodegenConstants.GIT_REPO_ID_DESC)
    private String gitRepoId;

    @Option(name = {"--release-note"}, title = "release note",
            description = CodegenConstants.RELEASE_NOTE_DESC)
    private String releaseNote;

    @Option(name = {"--http-user-agent"}, title = "http user agent",
            description = CodegenConstants.HTTP_USER_AGENT_DESC)
    private String httpUserAgent;

    @Option(name = {"--ignore-file-override"}, title = "ignore file override location",
            description = CodegenConstants.IGNORE_FILE_OVERRIDE_DESC)
    private String ignoreFileOverride;

    @Option(name = {"--remove-operation-id-prefix"}, title = "remove prefix of the operationId",
            description = CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DESC)
    private Boolean removeOperationIdPrefix;

    @Option(name = {"--remove-enum-value-prefix"}, title = "remove prefix of the enum values",
        description = CodegenConstants.REMOVE_ENUM_VALUE_PREFIX_DESC)
    private Boolean removeEnumValuePrefix;

    @Option(name = {"--skip-operation-example"}, title = "skip examples defined in the operation",
            description = CodegenConstants.SKIP_OPERATION_EXAMPLE_DESC)
    private Boolean skipOperationExample;

    @Option(name = {"--inst-allowed-for-float-double-formats"}, title = "allow int payloads when type is number and format is double/float",
        description = CodegenConstants.INTS_ALLOWED_FOR_FLOAT_DOUBLE_FORMATS_DESC)
    private Boolean intsAllowedForFloatDoubleFormats;

    @Option(name = {"--skip-validate-spec"},
            title = "skip spec validation",
            description = "Skips the default behavior of validating an input specification.")
    private Boolean skipValidateSpec;

    @Option(name = {"--strict-spec"},
            title = "true/false strict behavior",
            description = "'MUST' and 'SHALL' wording in OpenAPI spec is strictly adhered to. e.g. when false, no fixes will be applied to documents which pass validation but don't follow the spec.",
            arity = 1)
    private Boolean strictSpecBehavior;

    @Option(name = {"--enable-post-process-file"}, title = "enable post-processing of files (in generators supporting it)", description = CodegenConstants.ENABLE_POST_PROCESS_FILE_DESC)
    private Boolean enablePostProcessFile;

    @Option(name = {"--minimal-update"},
        title = "Minimal update",
        description = "Only write output files that have changed.")
    private Boolean minimalUpdate;

    @Option(name = {"--hide-generation-timestamp"}, title = "hides the generation timestamp in the generated files",
        description = CodegenConstants.HIDE_GENERATION_TIMESTAMP_DESC)
    private Boolean hideGenerationTimestamp;

    @Override
    public void execute() {
        // this initial check allows for field-level package private injection (for unit testing)
        if (configurator == null) {
            if (configFile != null && configFile.length() > 0) {
                // attempt to load from configFile
                configurator = CodegenConfigurator.fromFile(configFile);
            } else if (StringUtils.isEmpty(spec)) {
                // if user doesn't pass configFile and does not pass spec, we can fail immediately because one of these two is required to run.
                System.err.println("[error] Required option '-i' is missing");
                System.exit(1);
            }

            // if a config file wasn't specified, or we were unable to read it
            if (configurator == null) {
                // create a fresh configurator
                configurator = new CodegenConfigurator();
            }
        }

        // now override with any specified parameters
        if (skipValidateSpec != null) {
            configurator.setValidateSpec(false);
        }

        if (verbose != null) {
            configurator.setVerbose(verbose);
        }

        if (skipOverwrite != null) {
            configurator.setSkipOverwrite(skipOverwrite);
        }

        if (isNotEmpty(spec)) {
            if (!spec.matches("^http(s)?://.*") && !new File(spec).exists()) {
                System.err.println("[error] The spec file is not found: " + spec);
                System.err.println("[error] Check the path of the OpenAPI spec and try again.");
                System.exit(1);
            }
            configurator.setInputSpec(spec);
        }

        // GeneratorRunner name should not be validated here, as it's validated in toClientOptInput
        if (isNotEmpty(generatorName)) {
            configurator.setGeneratorName(generatorName);
        }

        if (isNotEmpty(output)) {
            configurator.setOutputDir(output);
        }

        if (isNotEmpty(auth)) {
            configurator.setAuth(auth);
        }

        if (isNotEmpty(templateDir)) {
            configurator.setTemplateDir(templateDir);
        }

        if (isNotEmpty(templatingEngine)) {
            configurator.setTemplatingEngineName(templatingEngine);
        }

        if (isNotEmpty(apiPackage)) {
            configurator.setApiPackage(apiPackage);
        }

        if (isNotEmpty(apiNameSuffix)) {
            configurator.setApiNameSuffix(apiNameSuffix);
        }

        if (isNotEmpty(modelNamePrefix)) {
            configurator.setModelNamePrefix(modelNamePrefix);
        }

        if (isNotEmpty(modelNameSuffix)) {
            configurator.setModelNameSuffix(modelNameSuffix);
        }

        if (isNotEmpty(invokerPackage)) {
            configurator.setInvokerPackage(invokerPackage);
        }

        if (isNotEmpty(groupId)) {
            configurator.setGroupId(groupId);
        }

        if (isNotEmpty(artifactId)) {
            configurator.setArtifactId(artifactId);
        }

        if (isNotEmpty(artifactVersion)) {
            configurator.setArtifactVersion(artifactVersion);
        }

        if (isNotEmpty(gitHost)) {
            configurator.setGitHost(gitHost);
        }

        if (isNotEmpty(gitUserId)) {
            configurator.setGitUserId(gitUserId);
        }

        if (isNotEmpty(gitRepoId)) {
            configurator.setGitRepoId(gitRepoId);
        }

        if (isNotEmpty(releaseNote)) {
            configurator.setReleaseNote(releaseNote);
        }

        if (isNotEmpty(httpUserAgent)) {
            configurator.setHttpUserAgent(httpUserAgent);
        }

        if (isNotEmpty(ignoreFileOverride)) {
            configurator.setIgnoreFileOverride(ignoreFileOverride);
        }

        if (removeOperationIdPrefix != null) {
            configurator.setRemoveOperationIdPrefix(removeOperationIdPrefix);
        }

        if (removeEnumValuePrefix != null) {
            configurator.setRemoveEnumValuePrefix(removeEnumValuePrefix);
        }

        if (intsAllowedForFloatDoubleFormats != null) {
            configurator.setIntsAllowedForFloatDoubleFormats(intsAllowedForFloatDoubleFormats);
        }

        if (hideGenerationTimestamp != null) {
            configurator.setHideGenerationTimestamp(hideGenerationTimestamp);
        }

        if (skipOperationExample != null) {
            configurator.setSkipOperationExample(skipOperationExample);
        }

        if (enablePostProcessFile != null) {
            configurator.setEnablePostProcessFile(enablePostProcessFile);
        }

        if (minimalUpdate != null) {
            configurator.setEnableMinimalUpdate(minimalUpdate);
        }

        if (strictSpecBehavior != null) {
            configurator.setStrictSpecBehavior(strictSpecBehavior);
        }

        if (globalProperties != null && !globalProperties.isEmpty()) {
            CodegenConfiguratorUtils.applyGlobalPropertiesKvpList(globalProperties, configurator);
        }

        if (isNotEmpty(packageName)) {
            configurator.setPackageName(packageName);
        }

        CodegenConfiguratorUtils.applyAdditionalPropertiesKvpList(additionalProperties, configurator);

        try {
            final ClientOptInput clientOptInput = configurator.toClientOptInput();

            // this null check allows us to inject for unit testing.
            if (generatorRunner == null) {
                generatorRunner = new DefaultGeneratorRunner(isDryRun);
            }

            generatorRunner.opts(clientOptInput);
            generatorRunner.generate();
        } catch (GeneratorNotFoundException e) {
            System.err.println(e.getMessage());
            System.err.println("[error] Check the spelling of the generator's name and try again.");
            System.exit(1);
        }
    }
}
