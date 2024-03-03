package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter1.Schema1;

public class Model1 {

    public static class Model11 extends SchemaParameter implements NonQueryQueryParameter {
        public Model11() {
            super(
                "required_boolean_group",
                ParameterInType.header,
                true,
                ParameterStyle.simple,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
