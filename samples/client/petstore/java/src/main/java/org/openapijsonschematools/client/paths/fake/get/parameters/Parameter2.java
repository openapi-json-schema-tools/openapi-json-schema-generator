package org.openapijsonschematools.client.paths.fake.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaParameter implements QueryParameter {
        public Parameter21() {
            super(
                "enum_query_string_array",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
