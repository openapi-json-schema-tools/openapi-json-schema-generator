package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaQueryParameter {
        public Parameter11() {
            super(
                "SomeVar",
                ParameterInType.QUERY,
                true,
                ParameterStyle.FORM,
                true,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
