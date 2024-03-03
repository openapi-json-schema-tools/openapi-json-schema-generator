package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;

public class Model13 {

    public static class Model131 extends SchemaParameter implements NonQueryQueryParameter {
        public Model131() {
            super(
                "A-B",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema13.Schema131.getInstance()
            );
        }
    }
}
