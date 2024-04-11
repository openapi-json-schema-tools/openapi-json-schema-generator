package org.openapijsonschematools.client.paths.foo.get.servers;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.servers.ServerWithVariables;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.paths.foo.get.servers.server1.FooGetServer1Variables;

import java.util.AbstractMap;

public class FooGetServer1 extends ServerWithVariables<FooGetServer1Variables.FooGetServer1Variables11> {
    private static FooGetServer1Variables.FooGetServer1Variables11 getVariables() {
        try {
            return FooGetServer1Variables.FooGetServer1Variables1.getInstance().validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>("version", FooGetServer1Variables.FooGetServer1Variables2.getInstance().defaultValue())
                ),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build())
            );
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public FooGetServer1() {
        super(
            "https://petstore.swagger.io/{version}",
            getVariables()
        );
    }
    public FooGetServer1(FooGetServer1Variables.FooGetServer1Variables11 variables) {
        super("https://petstore.swagger.io/{version}", variables);
    }
}
