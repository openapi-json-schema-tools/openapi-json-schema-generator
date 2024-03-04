package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter implements QueryParameter {
        public Parameter01() {
            super(
                "query",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                false,
                true,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
