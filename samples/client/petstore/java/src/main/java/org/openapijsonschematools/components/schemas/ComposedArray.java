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

public class ComposedArray {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends AnyTypeJsonSchema {}
    
    
    public static class ComposedArrayList extends FrozenList<schemas.OUTPUT_BASE_TYPES> {


        ComposedArrayList(FrozenList<schemas.OUTPUT_BASE_TYPES> m) {


            super(m);
        }
    }    
    
    public class ComposedArray1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ComposedArrayList getListOutputInstance(FrozenList<Object> arg) {
            return new ComposedArrayList(arg);
        }
        public static ComposedArrayList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedArray1.class, arg, configuration);
        }
    }}
