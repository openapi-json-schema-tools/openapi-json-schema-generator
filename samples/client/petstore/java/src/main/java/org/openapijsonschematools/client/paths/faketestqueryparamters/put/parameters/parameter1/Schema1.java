package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1;
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

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items1 extends StringJsonSchema {}
    
    
    public static class SchemaList1 extends FrozenList<String> {
        SchemaList1(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList1 of(SchemaListInput1 arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema11.validate(arg, configuration);
        }
    }
    
    public interface SchemaListInput1 extends List<String> {}
    
    
    public static class Schema11 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items1.class))
        ));
        
        protected static SchemaList1 getListOutputInstance(FrozenList<String> arg) {
            return new SchemaList1(arg);
        }
        public static SchemaList1 validate(SchemaListInput1 arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema11.class, arg, configuration);
        }
    }}
