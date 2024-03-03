package org.openapijsonschematools.client.paths.commonparamsubdir.delete.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.parameters.parameter1.Schema1;

public class Model1 {

    public static class Model11 extends SchemaParameter implements NonQueryQueryParameter {
        public Model11() {
            super(
                "subDir",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
