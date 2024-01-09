package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.servers.server0.Variables;

import java.util.AbstractMap;

class Server0 extends ServerWithVariables<Variables.VariablesMap> {
    /*
    petstore server
    */

    public Server0() {
        super(
            "http://{server}.swagger.io:{port}/v2",
            Variables.Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("port", (String) Variables.Port.getInstance().defaultValue),
                    new AbstractMap.SimpleEntry<>("server", (String) Variables.Server.getInstance().defaultValue)
                ),
                null
            )
        );
    }
    public Server0(Variables.VariablesMap variables) {
        super("http://{server}.swagger.io:{port}/v2", variables);
    }
}
