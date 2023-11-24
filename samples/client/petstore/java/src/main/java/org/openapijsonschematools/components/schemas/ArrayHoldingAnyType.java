package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayHoldingAnyType {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends AnyTypeJsonSchema {}
    
    
    public static class ArrayHoldingAnyTypeList extends FrozenList<Object> {


        ArrayHoldingAnyTypeList(FrozenList<Object> m) {


            super(m);
        }
        public static ArrayHoldingAnyTypeList of(List<Object> arg, SchemaConfiguration configuration) {

            return ArrayHoldingAnyType1.validate(arg, configuration);
        }
    }
    
    
    public class ArrayHoldingAnyType1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ArrayHoldingAnyTypeList getListOutputInstance(FrozenList<Object> arg) {


            return new ArrayHoldingAnyTypeList(arg);
        }
        public static ArrayHoldingAnyTypeList validate(List<Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ArrayHoldingAnyType1.class, arg, configuration);
        }
    }}
