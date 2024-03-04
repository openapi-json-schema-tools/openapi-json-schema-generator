package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaParameter implements QueryParameter {
        public Parameter11() {
            super(
                "aB",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                false,
                true,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
