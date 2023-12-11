package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3;
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

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends StringJsonSchema {}
    
    
    public static class SchemaList3 extends FrozenList<String> {
        SchemaList3(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList3 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema31.class).validate(arg, configuration);
        }
    }
    
    public class SchemaListInput3 {
        // class to build List<String>
    }
    
    
    public static class Schema31 extends JsonSchema<Object, Object, FrozenMap<String, Object>, String, String, SchemaList3> {
        public Schema31() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items3.class))
            )));
        }
        
        @Override
        protected SchemaList3 getListOutputInstance(FrozenList<String> arg) {
            return new SchemaList3(arg);
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        public SchemaList3 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
