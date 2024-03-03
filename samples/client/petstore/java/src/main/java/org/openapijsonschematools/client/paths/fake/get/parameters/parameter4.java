package org.openapijsonschematools.client.paths.fake.get.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter4.Schema4;

public class Model4 {

    public static class Model41 extends SchemaParameter implements QueryParameter {
        public Model41() {
            super(
                "enum_query_integer",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
