package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ArrayHoldingAnyType {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends AnyTypeJsonSchema {}
    
    
    public static class ArrayHoldingAnyTypeList extends FrozenList<Object> {
        ArrayHoldingAnyTypeList(FrozenList<Object> m) {
            super(m);
        }
        public static ArrayHoldingAnyTypeList of(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayHoldingAnyType1.class).validate(arg, configuration);
        }
    }
    
    public class ArrayHoldingAnyTypeListInput {
        // class to build List<Object>
    }
    
    
    public static class ArrayHoldingAnyType1 extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, ArrayHoldingAnyTypeList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ArrayHoldingAnyType1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected ArrayHoldingAnyTypeList getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayHoldingAnyTypeList(arg);
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        public ArrayHoldingAnyTypeList validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
