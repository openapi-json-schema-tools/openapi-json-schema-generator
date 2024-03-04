package org.openapijsonschematools.client.paths.petpetid.delete.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.petpetid.delete.parameters.parameter1.Schema1;

public class Parameter1 {

    public static class Parameter11 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter11() {
            super(
                "petId",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema1.Schema11.getInstance()
            );
        }
    }
}
