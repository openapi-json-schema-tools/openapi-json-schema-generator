package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;

public class Model18 {

    public static class Model181 extends SchemaParameter implements NonQueryQueryParameter {
        public Model181() {
            super(
                "A-B",
                ParameterInType.cookie,
                false,
                ParameterStyle.form,
                true,
                Schema18.Schema181.getInstance()
            );
        }
    }
}
