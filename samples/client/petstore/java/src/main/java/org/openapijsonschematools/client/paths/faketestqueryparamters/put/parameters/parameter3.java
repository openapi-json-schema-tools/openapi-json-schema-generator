package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;

public class Model3 {

    public static class Model31 extends SchemaParameter implements QueryParameter {
        public Model31() {
            super(
                "url",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                false,
                Schema3.Schema31.getInstance()
            );
        }
    }
}
