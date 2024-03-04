package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4.Schema4;

public class Parameter4 {

    public static class Parameter41 extends SchemaParameter implements QueryParameter {
        public Parameter41() {
            super(
                "A-B",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                false,
                true,
                Schema4.Schema41.getInstance()
            );
        }
    }
}
