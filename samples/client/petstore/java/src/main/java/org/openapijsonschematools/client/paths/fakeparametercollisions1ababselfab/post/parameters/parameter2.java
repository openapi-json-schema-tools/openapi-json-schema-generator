package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter2.Schema2;

public class Model2 {

    public static class Model21 extends SchemaParameter implements QueryParameter {
        public Model21() {
            super(
                "Ab",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
