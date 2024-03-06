package org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter {
        public Parameter01() {
            super(
                "someHeader",
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
