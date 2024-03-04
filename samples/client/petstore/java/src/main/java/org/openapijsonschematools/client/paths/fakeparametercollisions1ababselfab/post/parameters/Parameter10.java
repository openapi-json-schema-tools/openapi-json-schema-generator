package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaNonQueryParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;

public class Parameter10 {

    public static class Parameter101 extends SchemaNonQueryParameter {
        public Parameter101() {
            super(
                "aB",
                ParameterInType.PATH,
                true,
                ParameterStyle.SIMPLE,
                false,
                false,
                Schema10.Schema101.getInstance()
            );
        }
    }
}
