package org.openapijsonschematools.client.components.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.components.parameters.pathusername.Schema;

public class PathUserName {

    public static class PathUserName1 extends SchemaParameter implements NonQueryQueryParameter {
        public PathUserName1() {
            super(
                "username",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema.Schema1.getInstance()
            );
        }
    }
}
