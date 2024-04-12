package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.rootserver1.RootServer1Variables;

import java.util.AbstractMap;

public class RootServer1 extends ServerWithVariables<RootServer1Variables.VariablesMap> {
    /*
    The local server
    */
    private static RootServer1Variables.VariablesMap getVariables() {
        try {
            return RootServer1Variables.RootServer1Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", RootServer1Variables.Version.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public RootServer1() {
        super(
            "https://localhost:8080/{version}",
            getVariables()
        );
    }
    public RootServer1(RootServer1Variables.VariablesMap variables) {
        super("https://localhost:8080/{version}", variables);
    }
}
