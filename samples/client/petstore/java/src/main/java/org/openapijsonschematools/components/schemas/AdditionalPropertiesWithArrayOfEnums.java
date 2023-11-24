package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AdditionalPropertiesWithArrayOfEnums {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalPropertiesList extends FrozenList<String> {

        AdditionalPropertiesList(FrozenList<String> m) {

            super(m);
        }
        public static AdditionalPropertiesList of(List<String> arg, SchemaConfiguration configuration) {

            return AdditionalProperties.validate(arg, configuration);
        }
    }
    
    
    public class AdditionalProperties extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(EnumClass.EnumClass1.class))
        ));
        protected static AdditionalPropertiesList getListOutputInstance(FrozenList<String> arg) {

            return new AdditionalPropertiesList(arg);
        }
        public static AdditionalPropertiesList validate(List<String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AdditionalProperties.class, arg, configuration);
        }
    }    
    
    public static class AdditionalPropertiesWithArrayOfEnumsMap extends FrozenMap<String, AdditionalPropertiesList> {

        AdditionalPropertiesWithArrayOfEnumsMap(FrozenMap<String, AdditionalPropertiesList> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalPropertiesWithArrayOfEnumsMap of(Map<String, List<String>> arg, SchemaConfiguration configuration) {


            return AdditionalPropertiesWithArrayOfEnums1.validate(arg, configuration);
        }
        
        public AdditionalPropertiesList getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                AdditionalPropertiesList,
                val
            )
        }
    }    
    
    public class AdditionalPropertiesWithArrayOfEnums1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static AdditionalPropertiesWithArrayOfEnumsMap getMapOutputInstance(FrozenMap<String, AdditionalPropertiesList> arg) {

            return new AdditionalPropertiesWithArrayOfEnumsMap(arg);
        }
        public static AdditionalPropertiesWithArrayOfEnumsMap validate(Map<String, List<String>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(AdditionalPropertiesWithArrayOfEnums1.class, arg, configuration);
        }
    }
}
