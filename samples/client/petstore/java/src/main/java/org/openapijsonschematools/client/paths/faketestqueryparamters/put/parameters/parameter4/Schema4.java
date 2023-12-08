package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4;
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

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items4 extends StringJsonSchema {}
    
    
    public static class SchemaList4 extends FrozenList<String> {
        SchemaList4(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList4 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema41.class).validate(arg, configuration);
        }
    }
    
    public class SchemaListInput4 {
        // class to build List<String>
    }
    
    
    public static class Schema41 extends JsonSchema<FrozenMap, SchemaList4> {
        public Schema41() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items4.class))
            )));
        }
        
        @Override
        protected SchemaList4 getListOutputInstance(FrozenList<?> arg) {
            return new SchemaList4((FrozenList<String>) arg);
        }
        public SchemaList4 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
