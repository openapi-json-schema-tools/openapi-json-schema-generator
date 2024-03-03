package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter1.Schema1;

public class Model1 {

    public static class Model11 extends SchemaParameter implements QueryParameter {
        public Model11() {
            super(
                "aB",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
