package org.openapijsonschematools.client.paths.fakerefobjinquery.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakerefobjinquery.get.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter implements QueryParameter {
        public Parameter01() {
            super(
                "mapBean",
                ParameterInType.QUERY,
                false,
                ParameterStyle.DEEP_OBJECT,
                false,
                true,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
