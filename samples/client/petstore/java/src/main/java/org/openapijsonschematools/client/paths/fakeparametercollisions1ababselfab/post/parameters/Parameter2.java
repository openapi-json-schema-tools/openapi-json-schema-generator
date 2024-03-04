package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaParameter implements QueryParameter {
        public Parameter21() {
            super(
                "Ab",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                false,
                true,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
