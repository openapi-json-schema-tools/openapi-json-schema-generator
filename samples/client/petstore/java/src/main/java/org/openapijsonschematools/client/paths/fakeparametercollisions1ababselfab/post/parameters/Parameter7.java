package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;

public class Parameter7 {

    public static class Parameter71 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter71() {
            super(
                "self",
                ParameterInType.header,
                false,
                ParameterStyle.simple,
                false,
                Schema7.Schema71.getInstance()
            );
        }
    }
}
