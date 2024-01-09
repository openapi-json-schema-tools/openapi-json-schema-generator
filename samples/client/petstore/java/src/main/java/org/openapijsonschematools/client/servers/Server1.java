package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.server1.Variables;

import java.util.AbstractMap;

class Server1 extends ServerWithVariables<Variables.VariablesMap> {
    /*
    The local server
    */

    public Server1() {
        super(
            "https://localhost:8080/{version}",
            Variables.Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", (String) Variables.Version.getInstance().defaultValue)
                ),
                null
            )
        );
    }
    public Server1(Variables.VariablesMap variables) {
        super("https://localhost:8080/{version}", variables);
    }
}
