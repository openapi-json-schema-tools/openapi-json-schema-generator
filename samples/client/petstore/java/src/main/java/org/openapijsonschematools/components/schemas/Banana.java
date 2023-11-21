package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Banana {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class LengthCm extends NumberJsonSchema {}
    
    
    public static class BananaMap extends FrozenMap<String, Object> {
        BananaMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static BananaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Banana1.validate(arg, configuration);
        }
    }    
    
    public class Banana1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("lengthCm", LengthCm.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "lengthCm"
        ));
        protected static BananaMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new BananaMap(arg);
        }
        public static BananaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Banana1.class, arg, configuration);
        }
    }
}
