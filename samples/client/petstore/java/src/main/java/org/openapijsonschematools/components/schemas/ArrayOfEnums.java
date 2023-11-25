package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayOfEnums {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ArrayOfEnumsList extends FrozenList<String> {

        ArrayOfEnumsList(FrozenList<String> m) {

            super(m);
        }
        public static ArrayOfEnumsList of(List<String
            return ArrayOfEnums1.validate(arg, configuration);
        }
    }
    
    
    public class ArrayOfEnums1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(StringEnum.StringEnum1.class))
        ));
        protected static ArrayOfEnumsList getListOutputInstance(FrozenList<String> arg) {

            return new ArrayOfEnumsList(arg);
        }
        public static ArrayOfEnumsList validate(List<String
            return JsonSchema.validate(ArrayOfEnums1.class, arg, configuration);
        }
    }}
