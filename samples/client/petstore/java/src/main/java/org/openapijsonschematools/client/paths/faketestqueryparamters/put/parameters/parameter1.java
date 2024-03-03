package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;

public class Model1 {

    public static class Model11 extends SchemaParameter implements QueryParameter {
        public Model11() {
            super(
                "ioutil",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
