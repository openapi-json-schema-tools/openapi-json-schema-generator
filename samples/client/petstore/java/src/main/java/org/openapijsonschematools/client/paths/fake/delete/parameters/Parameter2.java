package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaQueryParameter {
        public Parameter21() {
            super(
                "required_int64_group",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                true,
                false,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
