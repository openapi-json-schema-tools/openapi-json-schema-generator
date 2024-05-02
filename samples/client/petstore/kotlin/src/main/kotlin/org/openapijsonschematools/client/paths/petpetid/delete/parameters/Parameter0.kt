package org.openapijsonschematools.client.paths.petpetid.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.petpetid.delete.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter {
        public Parameter01() {
            super(
                "api_key",
                ParameterInType.HEADER,
                false,
                ParameterStyle.SIMPLE,
                false,
                false,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
