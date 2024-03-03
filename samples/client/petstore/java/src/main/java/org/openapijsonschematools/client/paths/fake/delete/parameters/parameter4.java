package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter4.Schema4;

public class Model4 {

    public static class Model41 extends SchemaParameter implements NonQueryQueryParameter {
        public Model41() {
            super(
                "boolean_group",
                ParameterInType.header,
                false,
                ParameterStyle.simple,
                false,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
