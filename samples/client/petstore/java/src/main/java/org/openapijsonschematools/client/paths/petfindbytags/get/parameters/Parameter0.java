package org.openapijsonschematools.client.paths.petfindbytags.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.petfindbytags.get.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter implements QueryParameter {
        public Parameter01() {
            super(
                "tags",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                false,
                false,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
