package org.openapijsonschematools.client.components.responses.successfulxmlandjsonarrayofpet.content.applicationjson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.components.schemas.RefPet;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SchemaList extends FrozenList<Pet.PetMap> {
        SchemaList(FrozenList<Pet.PetMap> m) {
            super(m);
        }
        public static SchemaList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema1.class).validate(arg, configuration);
        }
    }
    
    public class SchemaListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class Schema1 extends JsonSchema<Object, Object, FrozenMap<String, Object>, Map<String, Object>, Pet.PetMap, SchemaList> {
        public Schema1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(RefPet.RefPet1.class))
            )));
        }
        
        @Override
        protected SchemaList getListOutputInstance(FrozenList<Pet.PetMap> arg) {
            return new SchemaList(arg);
        }
        public SchemaList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
