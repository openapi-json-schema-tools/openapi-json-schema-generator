package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.server1.Server1Variables;

import java.util.AbstractMap;

public class Server1 extends ServerWithVariables<Server1Variables.VariablesMap> {
    /*
    The local server
    */
    private static Server1Variables.VariablesMap getVariables() {
        try {
            return Server1Variables.Server1Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", Server1Variables.Version.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public Server1() {
        super(
            "https://localhost:8080/{version}",
            getVariables()
        );
    }
    public Server1(Server1Variables.VariablesMap variables) {
        super("https://localhost:8080/{version}", variables);
    }
}
