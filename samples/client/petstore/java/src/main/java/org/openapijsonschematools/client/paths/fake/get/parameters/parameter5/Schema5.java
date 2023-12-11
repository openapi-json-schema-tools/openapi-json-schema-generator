package org.openapijsonschematools.client.paths.fake.get.parameters.parameter5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema51 extends NonCollectionJsonSchema {
        public Schema51() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("double")),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    1.1,
                    -1.2
                )))
            )));
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }}
