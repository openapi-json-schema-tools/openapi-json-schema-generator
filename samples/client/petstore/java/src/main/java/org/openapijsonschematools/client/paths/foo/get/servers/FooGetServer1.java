package org.openapijsonschematools.client.paths.foo.get.servers;

import org.openapijsonschematools.client.servers.ServerWithVariables;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.paths.foo.get.servers.server1.Variables;

import java.util.AbstractMap;

class FooGetServer1 extends ServerWithVariables<Variables.VariablesMap> {

    public FooGetServer1() {
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
    public FooGetServer1(Variables.VariablesMap variables) {
        super("https://petstore.swagger.io/{version}", variables);
    }
}
