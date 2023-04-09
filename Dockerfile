FROM maven:3.6.3-jdk-11-openj9

ENV GEN_DIR /opt/openapi-json-schema-generator
WORKDIR ${GEN_DIR}
VOLUME  ${MAVEN_HOME}/.m2/repository

# Required from a licensing standpoint
COPY ./LICENSE ${GEN_DIR}

# Required to compile openapi-generator
COPY ./google_checkstyle.xml ${GEN_DIR}

# Modules are copied individually here to allow for caching of docker layers between major.minor versions
COPY ./modules/openapi-json-schema-generator-cli ${GEN_DIR}/modules/openapi-json-schema-generator-cli
COPY ./modules/openapi-json-schema-generator-core ${GEN_DIR}/modules/openapi-json-schema-generator-core
COPY ./modules/openapi-json-schema-generator ${GEN_DIR}/modules/openapi-json-schema-generator
COPY ./pom.xml ${GEN_DIR}

# Pre-compile openapi-generator-cli
RUN mvn -am -pl "modules/openapi-json-schema-generator-cli" package

# This exists at the end of the file to benefit from cached layers when modifying docker-entrypoint.sh.
COPY docker-entrypoint.sh /usr/local/bin/
RUN ln -s /usr/local/bin/docker-entrypoint.sh /usr/local/bin/openapi-json-schema-generator

ENTRYPOINT ["/usr/local/bin/docker-entrypoint.sh"]

CMD ["help"]
