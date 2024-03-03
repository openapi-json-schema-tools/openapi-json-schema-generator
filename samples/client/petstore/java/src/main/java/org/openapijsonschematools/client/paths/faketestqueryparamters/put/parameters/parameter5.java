package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter5.Schema5;

public class Model5 {

    public static class Model51 extends SchemaParameter implements QueryParameter {
        public Model51() {
            super(
                "refParam",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                true,
                Schema5.Schema51.getInstance()
            );
        }
    }
}
