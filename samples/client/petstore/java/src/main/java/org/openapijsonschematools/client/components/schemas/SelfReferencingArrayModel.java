package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

public class SelfReferencingArrayModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SelfReferencingArrayModelList extends FrozenList<SelfReferencingArrayModelList> {
        SelfReferencingArrayModelList(FrozenList<SelfReferencingArrayModelList> m) {
            super(m);
        }
        public static SelfReferencingArrayModelList of(List<List> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(SelfReferencingArrayModel1.class).validate(arg, configuration);
        }
    }
    
    public class SelfReferencingArrayModelListInput {
        // class to build List<List>
    }
    
    
    public static class SelfReferencingArrayModel1 extends JsonSchema<Object, FrozenMap<String, Object>, List, SelfReferencingArrayModelList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public SelfReferencingArrayModel1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(SelfReferencingArrayModel1.class))
            )));
        }
        
        @Override
        protected SelfReferencingArrayModelList getListOutputInstance(FrozenList<?> arg) {
            return new SelfReferencingArrayModelList((FrozenList<SelfReferencingArrayModelList>) arg);
        }
        public SelfReferencingArrayModelList validate(List<List> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
