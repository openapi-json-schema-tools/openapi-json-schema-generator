package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.JsonSchema;

public class AnimalFarm {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AnimalFarmTuple extends FrozenList<Object> {
        AnimalFarmTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class AnimalFarm1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Animal.Animal1.class;
        protected static AnimalFarmTuple getListOutputInstance(FrozenList<Object> arg) {
            return new AnimalFarmTuple(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnimalFarm1.class, arg, configuration);
        }
    }}
