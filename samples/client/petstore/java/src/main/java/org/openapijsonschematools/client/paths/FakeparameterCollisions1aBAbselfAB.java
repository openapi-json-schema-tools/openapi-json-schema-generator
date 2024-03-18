package org.openapijsonschematools.client.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class FakeparameterCollisions1aBAbselfAB extends ApiClient {
    protected static final String path = "/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/";

    public FakeparameterCollisions1aBAbselfAB(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}
