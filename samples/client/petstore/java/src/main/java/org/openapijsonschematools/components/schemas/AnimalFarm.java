package org.openapijsonschematools.components.schemas;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AnimalFarm {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AnimalFarmList extends FrozenList<Animal.AnimalMap> {

        AnimalFarmList(FrozenList<Animal.AnimalMap> m) {

            super(m);
        }
        public static AnimalFarmList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) {

            return AnimalFarm1.validate(arg, configuration);
        }
    }
    
    
    public class AnimalFarm1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Animal.Animal1.class))
        ));
        protected static AnimalFarmList getListOutputInstance(FrozenList<Animal.AnimalMap> arg) {

            return new AnimalFarmList(arg);
        }
        public static AnimalFarmList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AnimalFarm1.class, arg, configuration);
        }
    }}
