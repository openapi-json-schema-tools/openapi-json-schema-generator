/*
 * Copyright 2019 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

package org.openapijsonschematools.codegen.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.*;

/**
 * Represents those settings applied to a generator.
 */
public final class GeneratorSettings implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorSettings.class);
    private static final String DEFAULT_GIT_HOST = "github.com";
    private static final String DEFAULT_GIT_USER_ID = "GIT_USER_ID";
    private static final String DEFAULT_GIT_REPO_ID = "GIT_REPO_ID";
    private static final String DEFAULT_RELEASE_NOTE = "Minor update";

    private String generatorName;
    private String apiPackage;
    private String modelPackage;
    private String invokerPackage;
    private String packageName;
    private String apiNameSuffix;
    private String modelNamePrefix;
    private String modelNameSuffix;
    private String groupId;
    private String artifactId;
    private String artifactVersion;

    private final Map<String, Object> additionalProperties;

    private String gitHost;
    private String gitUserId;
    private String gitRepoId;
    private String releaseNote;
    private String httpUserAgent;

    /**
     * Gets the name of the generator to use.
     *
     * @return the generator name
     */
    public String getGeneratorName() {
        return generatorName;
    }

    /**
     * Gets the api package name for generated sources.
     *
     * @return the api package
     */
    public String getApiPackage() {
        return apiPackage;
    }

    /**
     * Gets the model package name for generated sources
     *
     * @return the model package
     */
    public String getModelPackage() {
        return modelPackage;
    }

    /**
     * Gets the invoker package name for generated sources.
     *
     * @return the invoker package
     */
    public String getInvokerPackage() {
        return invokerPackage;
    }

    /**
     * Gets the overall package name for generated sources.
     *
     * @return the package name
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Gets a api name suffix for generated models. This name will be appended to a api name.
     * <p>
     * This option is often used to circumvent compilation issues where models match keywords.
     * <p>
     * Example:
     * <p>
     * Suffix <code>Gen</code> applied to <code>Object</code> results in a generated class named <code>ObjectGen</code>.
     *
     * @return the model name suffix
     */
    public String getApiNameSuffix() {
        return apiNameSuffix;
    }

    /**
     * Gets a model name prefix for generated models. This name will be prefixed to a model name.
     * <p>
     * This option is often used to circumvent compilation issues where models match keywords.
     * <p>
     * Example:
     * <p>
     * Prefix <code>My</code> applied to <code>Object</code> results in a generated class named <code>MyObject</code>.
     *
     * @return the model name prefix
     */
    public String getModelNamePrefix() {
        return modelNamePrefix;
    }

    /**
     * Gets a model name suffix for generated models. This name will be appended to a model name.
     * <p>
     * This option is often used to circumvent compilation issues where models match keywords.
     * <p>
     * Example:
     * <p>
     * Suffix <code>Gen</code> applied to <code>Object</code> results in a generated class named <code>ObjectGen</code>.
     *
     * @return the model name suffix
     */
    public String getModelNameSuffix() {
        return modelNameSuffix;
    }

    /**
     * Gets the group id for generated sources which support this concept (e.g. Java and pom.xml, Scala and SBT/Gradle/pom).
     *
     * @return the group id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Gets artifact id for generated sources which support this concept (e.g. Java and pom.xml, Scala and SBT/Gradle/pom).
     *
     * @return the artifact id
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * Gets artifact version for generated sources which support this concept (e.g. Java and pom.xml, Scala and SBT/Gradle/pom).
     *
     * @return the artifact version
     */
    public String getArtifactVersion() {
        return artifactVersion;
    }

    /**
     * Gets additional properties which will be passed to template as dynamic properties.
     *
     * @return the additional properties
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Gets git host. e.g. <strong>gitlab.com</strong>.
     * <p>
     * Generally used by git_push.sh in generated sources which support it.
     * This value may also be used by templates in maven style references, READMEs, or other documentation.
     *
     * @return the git host
     */
    public String getGitHost() {
        return gitHost;
    }

    /**
     * Gets git user id. e.g. <strong>openapijsonschematools</strong>.
     * <p>
     * Generally used by git_push.sh in generated sources which support it.
     * This value may also be used by templates in maven style references, READMEs, or other documentation.
     *
     * @return the git user id
     */
    public String getGitUserId() {
        return gitUserId;
    }

    /**
     * Gets git repo id. e.g. <strong>openapi-generator</strong>.
     * <p>
     * Generally used by git_push.sh in generated sources which support it.
     * This value may also be used by templates in maven style references, READMEs, or other documentation.
     *
     * @return the git repo id
     */
    public String getGitRepoId() {
        return gitRepoId;
    }

    /**
     * Gets release note for the generated instance.
     * <p>
     * Generally used by git_push.sh in generated sources which support it.
     * This value may also be used by templates in maven style references, READMEs, or other documentation.
     *
     * @return the release note
     */
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * Gets the http user agent to be used by client generators which support setting this value.
     * <p>
     * e.g. codegen_csharp_api_client, defaults to 'OpenAPI-Generator/{packageVersion}/{language}'
     *
     * @return the http user agent
     */
    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    private GeneratorSettings(Builder builder) {
        setDefaults();

        generatorName = builder.generatorName;
        apiPackage = builder.apiPackage;
        invokerPackage = builder.invokerPackage;
        packageName = builder.packageName;
        apiNameSuffix = builder.apiNameSuffix;
        modelNamePrefix = builder.modelNamePrefix;
        modelNameSuffix = builder.modelNameSuffix;
        groupId = builder.groupId;
        artifactId = builder.artifactId;
        artifactVersion = builder.artifactVersion;
        gitHost = builder.gitHost;
        gitUserId = builder.gitUserId;
        gitRepoId = builder.gitRepoId;
        releaseNote = builder.releaseNote;
        httpUserAgent = builder.httpUserAgent;

        Map<String, Object> additional = new HashMap<>(builder.additionalProperties);

        if (isNotEmpty(apiPackage)) {
            additional.put("apiPackage", apiPackage);
        }
        if (isNotEmpty(modelPackage)) {
            additional.put("modelPackage", modelPackage);
        }
        if (isNotEmpty(invokerPackage)) {
            additional.put("invokerPackage", invokerPackage);
        }
        if (isNotEmpty(packageName)) {
            additional.put("packageName", packageName);
        }
        if (isNotEmpty(groupId)) {
            additional.put("groupId", groupId);
        }
        if (isNotEmpty(artifactId)) {
            additional.put("artifactId", artifactId);
        }
        if (isNotEmpty(artifactVersion)) {
            additional.put("artifactVersion", artifactVersion);
        }
        if (isNotEmpty(apiNameSuffix)) {
            additional.put("apiNameSuffix", apiNameSuffix);
        }
        if (isNotEmpty(modelNamePrefix)) {
            additional.put("modelNamePrefix", modelNamePrefix);
        }
        if (isNotEmpty(modelNameSuffix)) {
            additional.put("modelNameSuffix", modelNameSuffix);
        }
        if (isNotEmpty(gitHost)) {
            additional.put("gitHost", gitHost);
        }
        if (isNotEmpty(gitUserId)) {
            additional.put("gitUserId", gitUserId);
        }
        if (isNotEmpty(gitRepoId)) {
            additional.put("gitRepoId", gitRepoId);
        }
        if (isNotEmpty(releaseNote)) {
            additional.put("releaseNote", releaseNote);
        }
        if (isNotEmpty(httpUserAgent)) {
            additional.put("httpUserAgent", httpUserAgent);
        }

        additionalProperties = Collections.unmodifiableMap(additional);
    }

    /**
     * Instantiates a new Generator settings.
     */
    @SuppressWarnings("unused")
    public GeneratorSettings() {
        setDefaults();
        additionalProperties = Collections.unmodifiableMap(new HashMap<>(0));
    }

    private void setDefaults() {
        gitHost = DEFAULT_GIT_HOST;
        gitUserId = DEFAULT_GIT_USER_ID;
        gitRepoId = DEFAULT_GIT_REPO_ID;
        releaseNote = DEFAULT_RELEASE_NOTE;
    }

    private boolean isNotEmpty(String value) {
        return value != null && value.length() > 0;
    }

    /**
     * New builder builder.
     *
     * @return the builder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(GeneratorSettings copy) {
        Builder builder = new Builder();
        builder.generatorName = copy.getGeneratorName();
        builder.apiPackage = copy.getApiPackage();
        builder.invokerPackage = copy.getInvokerPackage();
        builder.packageName = copy.getPackageName();
        builder.apiNameSuffix = copy.getApiNameSuffix();
        builder.modelNamePrefix = copy.getModelNamePrefix();
        builder.modelNameSuffix = copy.getModelNameSuffix();
        builder.groupId = copy.getGroupId();
        builder.artifactId = copy.getArtifactId();
        builder.artifactVersion = copy.getArtifactVersion();
        if (copy.getAdditionalProperties() != null) {
            builder.additionalProperties.putAll(copy.getAdditionalProperties());
        }
        builder.gitHost = copy.getGitHost();
        builder.gitUserId = copy.getGitUserId();
        builder.gitRepoId = copy.getGitRepoId();
        builder.releaseNote = copy.getReleaseNote();
        builder.httpUserAgent = copy.getHttpUserAgent();

        return builder;
    }

    /**
     * {@code GeneratorSettings} builder static inner class.
     */
    @SuppressWarnings("UnusedReturnValue")
    public static final class Builder {
        private String generatorName;
        private String apiPackage;
        private String invokerPackage;
        private String packageName;
        private String apiNameSuffix;
        private String modelNamePrefix;
        private String modelNameSuffix;
        private String groupId;
        private String artifactId;
        private String artifactVersion;
        private Map<String, Object> additionalProperties;
        private String gitHost;
        private String gitUserId;
        private String gitRepoId;
        private String releaseNote;
        private String httpUserAgent;

        public Map<String, Object> additionalProperties() {
            return additionalProperties;
        }

        /**
         * Instantiates a new Builder.
         */
        public Builder() {
            additionalProperties = new HashMap<>();

            gitHost = DEFAULT_GIT_HOST;
            gitUserId = DEFAULT_GIT_USER_ID;
            gitRepoId = DEFAULT_GIT_REPO_ID;
            releaseNote = DEFAULT_RELEASE_NOTE;
        }

        /**
         * Sets the {@code generatorName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param generatorName the {@code generatorName} to set
         * @return a reference to this Builder
         */
        public Builder withGeneratorName(String generatorName) {
            this.generatorName = generatorName;
            return this;
        }

        /**
         * Sets the {@code apiPackage} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param apiPackage the {@code apiPackage} to set
         * @return a reference to this Builder
         */
        public Builder withApiPackage(String apiPackage) {
            this.apiPackage = apiPackage;
            return this;
        }

        /**
         * Sets the {@code invokerPackage} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param invokerPackage the {@code invokerPackage} to set
         * @return a reference to this Builder
         */
        public Builder withInvokerPackage(String invokerPackage) {
            this.invokerPackage = invokerPackage;
            return this;
        }

        /**
         * Sets the {@code packageName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param packageName the {@code packageName} to set
         * @return a reference to this Builder
         */
        public Builder withPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        /**
         * Sets the {@code apiNameSuffix} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param apiNameSuffix the {@code apiNameSuffix} to set
         * @return a reference to this Builder
         */
        public Builder withApiNameSuffix(String apiNameSuffix) {
            this.apiNameSuffix = apiNameSuffix;
            return this;
        }

        /**
         * Sets the {@code modelNamePrefix} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param modelNamePrefix the {@code modelNamePrefix} to set
         * @return a reference to this Builder
         */
        public Builder withModelNamePrefix(String modelNamePrefix) {
            this.modelNamePrefix = modelNamePrefix;
            return this;
        }

        /**
         * Sets the {@code modelNameSuffix} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param modelNameSuffix the {@code modelNameSuffix} to set
         * @return a reference to this Builder
         */
        public Builder withModelNameSuffix(String modelNameSuffix) {
            this.modelNameSuffix = modelNameSuffix;
            return this;
        }

        /**
         * Sets the {@code groupId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param groupId the {@code groupId} to set
         * @return a reference to this Builder
         */
        public Builder withGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Sets the {@code artifactId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param artifactId the {@code artifactId} to set
         * @return a reference to this Builder
         */
        public Builder withArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * Sets the {@code artifactVersion} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param artifactVersion the {@code artifactVersion} to set
         * @return a reference to this Builder
         */
        public Builder withArtifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * Sets the {@code additionalProperties} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param additionalProperties the {@code additionalProperties} to set
         * @return a reference to this Builder
         */
        public Builder withAdditionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * Sets the {@code additionalProperties} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param key   A key for some additional property
         * @param value The value of some additional property
         * @return a reference to this Builder
         */
        public Builder withAdditionalProperty(String key, Object value) {
            if (this.additionalProperties == null) {
                this.additionalProperties = new HashMap<>();
            }
            this.additionalProperties.put(key, value);
            return this;
        }

        /**
         * Sets the {@code gitHost} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param gitHost the {@code gitHost} to set
         * @return a reference to this Builder
         */
        public Builder withGitHost(String gitHost) {
            this.gitHost = gitHost;
            return this;
        }

        /**
         * Sets the {@code gitUserId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param gitUserId the {@code gitUserId} to set
         * @return a reference to this Builder
         */
        public Builder withGitUserId(String gitUserId) {
            this.gitUserId = gitUserId;
            return this;
        }

        /**
         * Sets the {@code gitRepoId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param gitRepoId the {@code gitRepoId} to set
         * @return a reference to this Builder
         */
        public Builder withGitRepoId(String gitRepoId) {
            this.gitRepoId = gitRepoId;
            return this;
        }

        /**
         * Sets the {@code releaseNote} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param releaseNote the {@code releaseNote} to set
         * @return a reference to this Builder
         */
        public Builder withReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * Sets the {@code httpUserAgent} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param httpUserAgent the {@code httpUserAgent} to set
         * @return a reference to this Builder
         */
        public Builder withHttpUserAgent(String httpUserAgent) {
            this.httpUserAgent = httpUserAgent;
            return this;
        }

        /**
         * Returns a {@code GeneratorSettings} built from the parameters previously set.
         *
         * @return a {@code GeneratorSettings} built with parameters of this {@code GeneratorSettings.Builder}
         */
        public GeneratorSettings build() {
            GeneratorSettings instance = new GeneratorSettings(this);
            //noinspection PlaceholderCountMatchesArgumentCount
            LOGGER.debug("GeneratorSettings#build: %s", instance.toString());
            return instance;
        }
    }

    @Override
    public String toString() {
        return "GeneratorSettings{" +
                "generatorName='" + generatorName + '\'' +
                ", apiPackage='" + apiPackage + '\'' +
                ", modelPackage='" + modelPackage + '\'' +
                ", invokerPackage='" + invokerPackage + '\'' +
                ", packageName='" + packageName + '\'' +
                ", apiNameSuffix='" + apiNameSuffix + '\'' +
                ", modelNamePrefix='" + modelNamePrefix + '\'' +
                ", modelNameSuffix='" + modelNameSuffix + '\'' +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", artifactVersion='" + artifactVersion + '\'' +
                ", additionalProperties=" + additionalProperties +
                ", gitHost='" + gitHost + '\'' +
                ", gitUserId='" + gitUserId + '\'' +
                ", gitRepoId='" + gitRepoId + '\'' +
                ", releaseNote='" + releaseNote + '\'' +
                ", httpUserAgent='" + httpUserAgent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneratorSettings)) return false;
        GeneratorSettings that = (GeneratorSettings) o;
        return Objects.equals(getGeneratorName(), that.getGeneratorName()) &&
                Objects.equals(getApiPackage(), that.getApiPackage()) &&
                Objects.equals(getModelPackage(), that.getModelPackage()) &&
                Objects.equals(getInvokerPackage(), that.getInvokerPackage()) &&
                Objects.equals(getPackageName(), that.getPackageName()) &&
                Objects.equals(getApiNameSuffix(), that.getApiNameSuffix()) &&
                Objects.equals(getModelNamePrefix(), that.getModelNamePrefix()) &&
                Objects.equals(getModelNameSuffix(), that.getModelNameSuffix()) &&
                Objects.equals(getGroupId(), that.getGroupId()) &&
                Objects.equals(getArtifactId(), that.getArtifactId()) &&
                Objects.equals(getArtifactVersion(), that.getArtifactVersion()) &&
                Objects.equals(getAdditionalProperties(), that.getAdditionalProperties()) &&
                Objects.equals(getGitHost(), that.getGitHost()) &&
                Objects.equals(getGitUserId(), that.getGitUserId()) &&
                Objects.equals(getGitRepoId(), that.getGitRepoId()) &&
                Objects.equals(getReleaseNote(), that.getReleaseNote()) &&
                Objects.equals(getHttpUserAgent(), that.getHttpUserAgent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getGeneratorName(),
                getApiPackage(),
                getModelPackage(),
                getInvokerPackage(),
                getPackageName(),
                getApiNameSuffix(),
                getModelNamePrefix(),
                getModelNameSuffix(),
                getGroupId(),
                getArtifactId(),
                getArtifactVersion(),
                getAdditionalProperties(),
                getGitHost(),
                getGitUserId(),
                getGitRepoId(),
                getReleaseNote(),
                getHttpUserAgent()
        );
    }
}
