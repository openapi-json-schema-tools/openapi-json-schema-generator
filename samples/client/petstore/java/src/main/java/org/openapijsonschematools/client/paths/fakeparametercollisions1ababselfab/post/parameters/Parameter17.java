package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;

public class Parameter17 {

    public static class Parameter171 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter171() {
            super(
                "self",
                ParameterInType.cookie,
                false,
                ParameterStyle.form,
                true,
                Schema17.Schema171.getInstance()
            );
        }
    }
}
