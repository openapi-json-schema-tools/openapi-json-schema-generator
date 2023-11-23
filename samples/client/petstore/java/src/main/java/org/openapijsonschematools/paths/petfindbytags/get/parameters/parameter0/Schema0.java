package org.openapijsonschematools.paths.petfindbytags.get.parameters.parameter0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items0 extends StringJsonSchema {}
    
    
    public static class SchemaList0 extends FrozenList<String> {

        SchemaList0(FrozenList<String> m) {

            super(m);
        }
        public static SchemaList0 of(List<String> arg, SchemaConfiguration configuration) {

            return Schema01.validate(arg, configuration);
        }
    }
    
    
    public class SchemaListInput0 extends ArrayList<String> {

    }
    
    
    public class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items0.class))
        ));
        protected static SchemaList0 getListOutputInstance(FrozenList<String> arg) {

            return new SchemaList0(arg);
        }
        public static SchemaList0 validate(List<String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }}
