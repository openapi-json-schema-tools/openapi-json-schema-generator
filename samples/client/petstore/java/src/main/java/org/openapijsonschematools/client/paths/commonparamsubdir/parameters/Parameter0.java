package org.openapijsonschematools.client.paths.commonparamsubdir.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaNonQueryParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.parameter0.PathParamSchema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaNonQueryParameter {
        public Parameter01() {
            super(
                "subDir",
                ParameterInType.PATH,
                true,
                ParameterStyle.SIMPLE,
                false,
                false,
                PathParamSchema0.PathParamSchema01.getInstance()
            );
        }
    }
}
