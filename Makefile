.PHONY: docker_build

docker_build:
	docker build -t spacether/openapi-json-schema-generator-cli_test:latest .

docker_publish:
	docker push spacether/openapi-json-schema-generator-cli_test:latest
