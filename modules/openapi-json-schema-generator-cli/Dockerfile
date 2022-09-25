FROM openjdk:11.0-jre-buster

ADD target/openapi-json-schema-generator-cli.jar /opt/openapi-json-schema-generator/modules/openapi-json-schema-generator-cli/target/openapi-json-schema-generator-cli.jar

COPY docker-entrypoint.sh /usr/local/bin/

ENTRYPOINT ["docker-entrypoint.sh"]

CMD ["help"]
