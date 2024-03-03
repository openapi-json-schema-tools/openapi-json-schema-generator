package org.openapijsonschematools.client.paths.commonparamsubdir.get.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.parameters.parameter0.Schema0;

public class Model0 {

    public static class Model01 extends SchemaParameter implements QueryParameter {
        public Model01() {
            super(
                "searchStr",
                ParameterInType.query,
                false,
                ParameterStyle.form,
                true,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
