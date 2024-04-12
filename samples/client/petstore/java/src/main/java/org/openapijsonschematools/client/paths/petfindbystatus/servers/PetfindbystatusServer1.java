package org.openapijsonschematools.client.paths.petfindbystatus.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.servers.ServerWithVariables;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.server1.PetfindbystatusServer1Variables;

import java.util.AbstractMap;

public class PetfindbystatusServer1 extends ServerWithVariables<PetfindbystatusServer1Variables.VariablesMap> {
    private static PetfindbystatusServer1Variables.VariablesMap getVariables() {
        try {
            return PetfindbystatusServer1Variables.PetfindbystatusServer1Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", PetfindbystatusServer1Variables.Version.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public PetfindbystatusServer1() {
        super(
            "https://petstore.swagger.io/{version}",
            getVariables()
        );
    }
    public PetfindbystatusServer1(PetfindbystatusServer1Variables.VariablesMap variables) {
        super("https://petstore.swagger.io/{version}", variables);
    }
}
