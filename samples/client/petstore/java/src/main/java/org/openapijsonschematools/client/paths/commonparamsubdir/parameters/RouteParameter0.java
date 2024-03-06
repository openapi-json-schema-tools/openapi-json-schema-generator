package org.openapijsonschematools.client.paths.commonparamsubdir.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.routeparameter0.RouteParamSchema0;

public class RouteParameter0 {

    public static class RouteParameter01 extends SchemaParameter {
        public RouteParameter01() {
            super(
                "subDir",
                ParameterInType.PATH,
                true,
                ParameterStyle.SIMPLE,
                false,
                false,
                RouteParamSchema0.RouteParamSchema01.getInstance()
            );
        }
    }
}
