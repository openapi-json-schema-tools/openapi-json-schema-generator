package org.openapijsonschematools.client.paths.petfindbystatus.servers;

import org.openapijsonschematools.client.servers.ServerWithVariables;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.Server1.Variables;

import java.util.AbstractMap;

class Server1 extends ServerWithVariables<Variables.VariablesMap> {

    public Server1() {
        super(
            "https://petstore.swagger.io/{version}",
            Variables.Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", (String) Variables.Version.getInstance().defaultValue)
                ),
                null
            )
        );
    }
    public Server1(Variables.VariablesMap variables) {
        super("https://petstore.swagger.io/{version}", variables);
    }
}
