package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaNonQueryParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;

public class Parameter6 {

    public static class Parameter61 extends SchemaNonQueryParameter {
        public Parameter61() {
            super(
                "aB",
                ParameterInType.HEADER,
                false,
                ParameterStyle.SIMPLE,
                false,
                false,
                Schema6.Schema61.getInstance()
            );
        }
    }
}
