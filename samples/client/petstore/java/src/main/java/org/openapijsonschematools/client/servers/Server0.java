package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.server0.Variables;

import java.util.AbstractMap;

public class Server0 extends ServerWithVariables<Variables.VariablesMap> {
    /*
    petstore server
    */
    private static Variables.VariablesMap getVariables() {
        try {
            return Variables.Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("port", Variables.Port.getInstance().defaultValue()),
                    new AbstractMap.SimpleEntry<>("server", Variables.Server.getInstance().defaultValue())
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
    public Server0(Variables.VariablesMap variables) {
        super("http://{server}.swagger.io:{port}/v2", variables);
    }
}
