package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;

public class Model11 {

    public static class Model111 extends SchemaParameter implements NonQueryQueryParameter {
        public Model111() {
            super(
                "Ab",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema11.Schema111.getInstance()
            );
        }
    }
}
