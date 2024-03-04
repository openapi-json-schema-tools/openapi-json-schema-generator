package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.parameters;

import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.parameters.parameter0.Schema0;

public class Parameter0 {

    public static class Parameter01 extends SchemaParameter implements NonQueryQueryParameter {
        public Parameter01() {
            super(
                "petId",
                ParameterInType.path,
                true,
                ParameterStyle.simple,
                false,
                Schema0.Schema01.getInstance()
            );
        }
    }
}
