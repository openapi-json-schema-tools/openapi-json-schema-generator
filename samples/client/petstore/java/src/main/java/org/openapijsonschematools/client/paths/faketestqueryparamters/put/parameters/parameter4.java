package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;

public class Model4 {

    public static class Model41 extends SchemaParameter implements QueryParameter {
        public Model41() {
            super(
                "context",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                true,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
