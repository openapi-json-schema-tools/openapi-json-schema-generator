package org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaParameter implements QueryParameter {
        public Parameter11() {
            super(
                "compositionInProperty",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
