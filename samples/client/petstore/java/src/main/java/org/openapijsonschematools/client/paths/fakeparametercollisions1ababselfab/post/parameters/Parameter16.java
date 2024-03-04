package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;

public class Parameter16 {

    public static class Parameter161 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter161() {
            super(
                "Ab",
                ParameterInType.cookie,
                false,
                ParameterStyle.form,
                true,
                Schema16.Schema161.getInstance()
            );
        }
    }
}
