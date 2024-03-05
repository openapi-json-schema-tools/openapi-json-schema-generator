package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaQueryParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;

public class Parameter3 {

    public static class Parameter31 extends SchemaQueryParameter {
        public Parameter31() {
            super(
                "string_group",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                true,
                false,
                Schema3.Schema31.getInstance()
            );
        }
    }
}
