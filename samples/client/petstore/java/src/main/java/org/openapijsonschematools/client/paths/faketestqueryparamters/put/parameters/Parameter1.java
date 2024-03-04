package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaParameter implements QueryParameter {
        public Parameter11() {
            super(
                "ioutil",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                false,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
