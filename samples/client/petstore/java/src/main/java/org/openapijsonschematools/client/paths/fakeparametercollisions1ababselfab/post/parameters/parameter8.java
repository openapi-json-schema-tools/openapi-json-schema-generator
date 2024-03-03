package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;

public class Model8 {

    public static class Model81 extends SchemaParameter implements NonQueryQueryParameter {
        public Model81() {
            super(
                "A-B",
                ParameterInType.header,
                false,
                ParameterStyle.simple,
                false,
                Schema8.Schema81.getInstance()
            );
        }
    }
}
