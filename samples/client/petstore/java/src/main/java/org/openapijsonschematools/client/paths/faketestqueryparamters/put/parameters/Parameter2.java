package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaQueryParameter {
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
