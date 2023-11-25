package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items4 extends StringJsonSchema {}
    
    
    public static class SchemaList4 extends FrozenList<String> {
        SchemaList4(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList4 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema41.validate(arg, configuration);
        }
    }
    
    
    public class Schema41 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items4.class))
        ));
        protected static SchemaList4 getListOutputInstance(FrozenList<String> arg) {
            return new SchemaList4(arg);
        }
        public static SchemaList4 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema41.class, arg, configuration);
        }
    }}
