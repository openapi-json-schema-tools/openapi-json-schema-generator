package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter2.Schema2;

public class Parameter2 {

    public static class Parameter21 extends SchemaParameter implements QueryParameter {
        public Parameter21() {
            super(
                "some_var",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                false,
                true,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
