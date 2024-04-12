package org.openapijsonschematools.client.paths.fake.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter4.Schema4;

public class Parameter4 {

    public static class Parameter41 extends SchemaParameter {
        public Parameter41() {
            super(
                "enum_query_integer",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                true,
                false,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
