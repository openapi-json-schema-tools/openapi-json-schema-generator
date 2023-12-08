package org.openapijsonschematools.client.paths.petfindbytags.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items0 extends StringJsonSchema {}
    
    
    public static class SchemaList0 extends FrozenList<String> {
        SchemaList0(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList0 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema01.class).validate(arg, configuration);
        }
    }
    
    public class SchemaListInput0 {
        // class to build List<String>
    }
    
    
    public static class Schema01 extends JsonSchema<FrozenMap, SchemaList0> {
        public Schema01() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items0.class))
            ));
        }
        
        @Override
        protected SchemaList0 getListOutputInstance(FrozenList<?> arg) {
            return new SchemaList0((FrozenList<String>) arg);
        }
        public SchemaList0 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
