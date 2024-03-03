package org.openapijsonschematools.client.paths.petpetiduploadimage.post.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.NonQueryQueryParameter;
import org.openapijsonschematools.client.parameter.SchemaParameter;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.parameters.parameter0.Schema0;

public class Model0 {

    public static class Model01 extends SchemaParameter implements NonQueryQueryParameter {
        public Model01() {
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
