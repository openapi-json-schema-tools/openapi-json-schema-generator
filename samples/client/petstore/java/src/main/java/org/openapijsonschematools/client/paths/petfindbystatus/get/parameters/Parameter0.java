package org.openapijsonschematools.client.paths.petfindbystatus.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.petfindbystatus.get.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaQueryParameter {
        public Parameter01() {
            super(
                "status",
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
