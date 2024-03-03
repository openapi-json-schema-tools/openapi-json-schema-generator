package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;

public class Model12 {

    public static class Model121 extends SchemaParameter implements NonQueryQueryParameter {
        public Model121() {
            super(
                "self",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema12.Schema121.getInstance()
            );
        }
    }
}
