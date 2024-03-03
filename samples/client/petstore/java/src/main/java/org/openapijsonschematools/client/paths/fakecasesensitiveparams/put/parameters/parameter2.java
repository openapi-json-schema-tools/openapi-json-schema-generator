package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter2.Schema2;

public class Model2 {

    public static class Model21 extends SchemaParameter implements QueryParameter {
        public Model21() {
            super(
                "some_var",
                ParameterInType.query,
                true,
                ParameterStyle.form,
                true,
                Schema2.Schema21.getInstance()
            );
        }
    }
}
