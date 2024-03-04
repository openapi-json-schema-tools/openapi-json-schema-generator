package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter5.Schema5;

public class Parameter5 {

    public static class Parameter51 extends SchemaParameter implements QueryParameter {
        public Parameter51() {
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
