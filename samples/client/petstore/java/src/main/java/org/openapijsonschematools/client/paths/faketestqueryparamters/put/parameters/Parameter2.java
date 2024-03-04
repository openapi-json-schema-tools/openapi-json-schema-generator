package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaParameter implements QueryParameter {
        public Parameter21() {
            super(
                "http",
                ParameterInType.QUERY,
                true,
                ParameterStyle.SPACE_DELIMITED,
                false,
                false,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
