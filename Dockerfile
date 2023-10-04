# syntax=docker/dockerfile:1

FROM maven:3.6.3-jdk-11-openj9 AS builder
ENV GEN_DIR /opt/openapi-json-schema-generator
WORKDIR ${GEN_DIR}
# Required from a licensing standpoint
COPY ./LICENSE ${GEN_DIR}
# copies source code in for jar packaging
COPY ./src ${GEN_DIR}/src
COPY ./pom.xml ${GEN_DIR}
# Pre-compile openapi-generator-cli
RUN mvn -am -pl . package
# # Remove src + samples dirs
RUN rm -rf src
RUN rm -rf samples

# multi stage build, jar in smaller image
FROM openjdk:11.0-jre-buster
ENV GEN_DIR /opt/openapi-json-schema-generator
COPY --from=builder ${GEN_DIR}/target/openapi-json-schema-generator-cli.jar ${GEN_DIR}/target/openapi-json-schema-generator-cli.jar
COPY bin/docker-entrypoint.sh /usr/local/bin/
ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["help"]
