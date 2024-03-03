package org.openapijsonschematools.client.paths.commonparamsubdir.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.parameter0.PathParamSchema0;

public class Model0 {

    public static class Model01 extends SchemaParameter implements NonQueryQueryParameter {
        public Model01() {
            super(
                "subDir",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                PathParamSchema0.PathParamSchema01.getInstance()
            );
        }
    }
}
