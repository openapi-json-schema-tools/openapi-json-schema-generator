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

public class AbstractStepMessage {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Discriminator extends StringJsonSchema {}
    
    
    public static class AbstractStepMessageMap extends FrozenMap<String, Object> {
        AbstractStepMessageMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AbstractStepMessageMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return AbstractStepMessage1.validate(arg, configuration);
        }
    }    
    
    public class AbstractStepMessage1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Abstract Step
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("discriminator", Discriminator.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "description",
            "discriminator",
            "sequenceNumber"
        ));
        protected static AbstractStepMessageMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new AbstractStepMessageMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AbstractStepMessage1.class, arg, configuration);
        }
    }
}
