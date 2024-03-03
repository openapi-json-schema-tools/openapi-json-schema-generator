package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters.parameter0.Schema0;

public class Model0 {

    public static class Model01 extends SchemaParameter implements QueryParameter {
        public Model01() {
            super(
                "query",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                true,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
