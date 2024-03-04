package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaQueryParameter {
        public Parameter01() {
            super(
                "required_string_group",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                true,
                false,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
