package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2;
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

public class Schema2 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items2 extends StringJsonSchema {}
    
    
    public static class SchemaList2 extends FrozenList<String> {
        SchemaList2(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList2 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema21.class).validate(arg, configuration);
        }
    }
    
    public class SchemaListInput2 {
        // class to build List<String>
    }
    
    
    public static class Schema21 extends JsonSchema<FrozenMap, SchemaList2> {
        public Schema21() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            ));
        }
        
        @Override
        protected SchemaList2 getListOutputInstance(FrozenList<?> arg) {
            return new SchemaList2((FrozenList<String>) arg);
        }
        public SchemaList2 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
