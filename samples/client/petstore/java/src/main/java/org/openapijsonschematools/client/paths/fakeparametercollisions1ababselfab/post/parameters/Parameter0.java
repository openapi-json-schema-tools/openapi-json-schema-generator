package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaQueryParameter {
        public Parameter01() {
            super(
                "1",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                true,
                false,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
