package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;

public class Parameter5 {

    public static class Parameter51 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter51() {
            super(
                "1",
                ParameterInType.header,
                false,
                ParameterStyle.simple,
                false,
                Schema5.Schema51.getInstance()
            );
        }
    }
}
