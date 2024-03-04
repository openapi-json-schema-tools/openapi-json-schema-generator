package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;

public class Parameter4 {

    public static class Parameter41 extends SchemaQueryParameter {
        public Parameter41() {
            super(
                "context",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                true,
                false,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
