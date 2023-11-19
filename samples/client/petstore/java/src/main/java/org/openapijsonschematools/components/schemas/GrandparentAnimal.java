package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class GrandparentAnimal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class PetType extends StringJsonSchema {}
    
    
    public static class GrandparentAnimalMap extends FrozenMap<String, Object> {
        GrandparentAnimalMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static GrandparentAnimalMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return GrandparentAnimal1.validate(arg, configuration);
        }
    }    
    
    public class GrandparentAnimal1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("pet_type", PetType.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "pet_type"
        ));
        protected static GrandparentAnimalMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new GrandparentAnimalMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(GrandparentAnimal1.class, arg, configuration);
        }
    }
}
