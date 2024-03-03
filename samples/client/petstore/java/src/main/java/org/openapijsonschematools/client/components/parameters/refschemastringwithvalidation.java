package org.openapijsonschematools.client.components.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.components.parameters.refschemastringwithvalidation.Schema;

public class RefSchemaStringWithValidation {

    public static class RefSchemaStringWithValidation1 extends SchemaParameter implements NonQueryQueryParameter {
        public RefSchemaStringWithValidation1() {
            super(
                "RSstringWithValidation",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema.Schema1.getInstance()
            );
        }
    }
}
