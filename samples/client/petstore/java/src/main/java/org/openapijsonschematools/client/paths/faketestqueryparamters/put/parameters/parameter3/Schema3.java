package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends StringJsonSchema {}
    
    
    public static class SchemaList3 extends FrozenList<String> {
        SchemaList3(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList3 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema31.validate(arg, configuration);
        }
    }
    
    
    public static class Schema31 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items3.class))
        ));
        
        protected static SchemaList3 getListOutputInstance(FrozenList<String> arg) {
            return new SchemaList3(arg);
        }
        public static SchemaList3 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema31.class, arg, configuration);
        }
    }}
