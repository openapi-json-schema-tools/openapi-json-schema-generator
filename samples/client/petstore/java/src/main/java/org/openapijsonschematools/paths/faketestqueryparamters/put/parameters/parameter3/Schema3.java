package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter3;
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

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items3 extends StringJsonSchema {}
    
    
    public static class SchemaList3 extends FrozenList<String> {

        SchemaList3(FrozenList<String> m) {

            super(m);
        }
        public static SchemaList3 of(List<String> arg, SchemaConfiguration configuration) {

            return Schema31.validate(arg, configuration);
        }
    }
    
    
    public class SchemaListInput3 extends ArrayList<String> {

    }
    
    
    public class Schema31 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items3.class))
        ));
        protected static SchemaList3 getListOutputInstance(FrozenList<String> arg) {

            return new SchemaList3(arg);
        }
        public static SchemaList3 validate(List<String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema31.class, arg, configuration);
        }
    }}
