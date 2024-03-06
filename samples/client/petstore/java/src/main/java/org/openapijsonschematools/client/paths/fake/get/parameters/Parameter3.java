package org.openapijsonschematools.client.paths.fake.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter3.Schema3;

public class Parameter3 {

    public static class Parameter31 extends SchemaParameter {
        public Parameter31() {
            super(
                "enum_query_string",
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
