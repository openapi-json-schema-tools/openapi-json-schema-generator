package org.openapijsonschematools.client.paths.fake.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter5.Schema5;

public class Parameter5 {

    public static class Parameter51 extends SchemaParameter implements QueryParameter {
        public Parameter51() {
            super(
                "enum_query_double",
                ParameterInType.QUERY,
                false,
                ParameterStyle.FORM,
                false,
                true,
                Schema5.Schema51.getInstance()
            );
        }
    }
}
