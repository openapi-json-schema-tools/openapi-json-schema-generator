package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;

public class Model10 {

    public static class Model101 extends SchemaParameter implements NonQueryQueryParameter {
        public Model101() {
            super(
                "aB",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema10.Schema101.getInstance()
            );
        }
    }
}
