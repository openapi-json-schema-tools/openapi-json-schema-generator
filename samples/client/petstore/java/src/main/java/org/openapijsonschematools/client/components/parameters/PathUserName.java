package org.openapijsonschematools.client.components.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.components.parameters.pathusername.Schema;

public class PathUserName {

    public static class PathUserName1 extends SchemaParameter {
        public PathUserName1() {
            super(
                "username",
                ParameterInType.PATH,
                true,
                ParameterStyle.SIMPLE,
                false,
                false,
                Schema.Schema1.getInstance()
            );
        }
    }
}
