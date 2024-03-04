package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;

public class Parameter15 {

    public static class Parameter151 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter151() {
            super(
                "aB",
                ParameterInType.cookie,
                false,
                ParameterStyle.form,
                true,
                Schema15.Schema151.getInstance()
            );
        }
    }
}
