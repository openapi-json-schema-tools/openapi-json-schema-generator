package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter3.Schema3;

public class Parameter3 {

    public static class Parameter31 extends SchemaParameter implements QueryParameter {
        public Parameter31() {
            super(
                "self",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema3.Schema31.getInstance()
            );
        }
    }
}
