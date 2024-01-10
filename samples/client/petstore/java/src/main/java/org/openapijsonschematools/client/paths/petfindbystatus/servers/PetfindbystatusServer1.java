package org.openapijsonschematools.client.paths.petfindbystatus.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.servers.ServerWithVariables;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.server1.Variables;

import java.util.AbstractMap;

class PetfindbystatusServer1 extends ServerWithVariables<Variables.VariablesMap> {

    public PetfindbystatusServer1() {
        super(
            "https://petstore.swagger.io/{version}",
            Variables.Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", Variables.Version.getInstance().defaultValue())
                ),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone())
            )
        );
    }
    public PetfindbystatusServer1(Variables.VariablesMap variables) {
        super("https://petstore.swagger.io/{version}", variables);
    }
}
