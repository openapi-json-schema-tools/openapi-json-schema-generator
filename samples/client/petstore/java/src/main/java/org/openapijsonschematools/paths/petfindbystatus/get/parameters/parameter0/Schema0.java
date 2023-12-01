package org.openapijsonschematools.paths.petfindbystatus.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.EnumValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items0 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("enum", new EnumValidator(Set.of(
                "available",
                "pending",
                "sold"
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Items0.class, arg, configuration);
        }
    }    
    
    public static class SchemaList0 extends FrozenList<String> {
        SchemaList0(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList0 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema01.validate(arg, configuration);
        }
    }
    
    
    public static class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items0.class))
        ));
        
        protected static SchemaList0 getListOutputInstance(FrozenList<String> arg) {
            return new SchemaList0(arg);
        }
        public static SchemaList0 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }}
