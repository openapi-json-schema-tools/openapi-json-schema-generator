package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;

public class Model9 {

    public static class Model91 extends SchemaParameter implements NonQueryQueryParameter {
        public Model91() {
            super(
                "1",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema9.Schema91.getInstance()
            );
        }
    }
}
