package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;

public class Parameter18 {

    public static class Parameter181 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter181() {
            super(
                "A-B",
                ParameterInType.COOKIE,
                false,
                ParameterStyle.FORM,
                false,
                true,
                Schema18.Schema181.getInstance()
            );
        }
    }
}
