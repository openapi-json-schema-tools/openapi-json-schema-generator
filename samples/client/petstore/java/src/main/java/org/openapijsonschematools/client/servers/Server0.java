package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.server0.Server0Variables;

import java.util.AbstractMap;

public class Server0 extends ServerWithVariables<Server0Variables.Server0Variables14> {
    /*
    petstore server
    */
    private static Server0Variables.Server0Variables14 getVariables() {
        try {
            return Server0Variables.Server0Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("port", Server0Variables.Server0Variables5.getInstance().defaultValue()),
                    new AbstractMap.SimpleEntry<>("server", Server0Variables.Server0Variables2.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public Server0() {
        super(
            "http://{server}.swagger.io:{port}/v2",
            getVariables()
        );
    }
    public Server0(Server0Variables.Server0Variables14 variables) {
        super("http://{server}.swagger.io:{port}/v2", variables);
    }
}
