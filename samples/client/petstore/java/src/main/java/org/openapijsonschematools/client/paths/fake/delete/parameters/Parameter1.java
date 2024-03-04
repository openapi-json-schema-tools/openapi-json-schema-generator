package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaNonQueryParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaNonQueryParameter {
        public Parameter11() {
            super(
                "required_boolean_group",
                ParameterInType.HEADER,
                true,
                ParameterStyle.SIMPLE,
                false,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
