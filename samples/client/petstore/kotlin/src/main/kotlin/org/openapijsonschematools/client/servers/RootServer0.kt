package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.rootserver0.RootServer0Variables;

import java.util.AbstractMap;

public class RootServer0 extends ServerWithVariables<RootServer0Variables.VariablesMap> {
    /*
    petstore server
    */
    private static RootServer0Variables.VariablesMap getVariables() {
        try {
            return RootServer0Variables.RootServer0Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("port", RootServer0Variables.Port.getInstance().defaultValue()),
                    new AbstractMap.SimpleEntry<>("server", RootServer0Variables.Server.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public RootServer0() {
        super(
            "http://{server}.swagger.io:{port}/v2",
            getVariables()
        );
    }
    public RootServer0(RootServer0Variables.VariablesMap variables) {
        super("http://{server}.swagger.io:{port}/v2", variables);
    }
}
