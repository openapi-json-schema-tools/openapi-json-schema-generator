package org.openapijsonschematools.client.paths.fake.get.parameters.parameter2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
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
    
    
    public static class Items2 extends JsonSchema {
        public Items2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    ">",
                    "$"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
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
    
    
    public static class Schema21 extends JsonSchema<Object, FrozenMap<String, Object>, String, SchemaList2> {
        public Schema21() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            )));
        }
        
        @Override
        protected SchemaList2 getListOutputInstance(FrozenList<?> arg) {
            return new SchemaList2((FrozenList<String>) arg);
        }
        public SchemaList2 validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
