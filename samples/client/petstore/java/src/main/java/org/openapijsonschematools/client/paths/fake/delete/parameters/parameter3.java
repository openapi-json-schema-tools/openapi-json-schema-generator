package org.openapijsonschematools.client.paths.fake.delete.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;

public class Model3 {

    public static class Model31 extends SchemaParameter implements QueryParameter {
        public Model31() {
            super(
                "string_group",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema3.Schema31.getInstance()
            );
        }
    }
}
