package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;

public class Model17 {

    public static class Model171 extends SchemaParameter implements NonQueryQueryParameter {
        public Model171() {
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
