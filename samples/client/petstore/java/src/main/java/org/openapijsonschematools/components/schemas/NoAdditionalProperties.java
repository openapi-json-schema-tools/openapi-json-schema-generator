package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class NoAdditionalProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class Id extends Int64JsonSchema {}
    
    
    public class PetId extends Int64JsonSchema {}
    
    
    public static class NoAdditionalPropertiesMap extends FrozenMap<String, Object> {
        NoAdditionalPropertiesMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static NoAdditionalPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return NoAdditionalProperties1.validate(arg, configuration);
        }
    }    
    
    public class NoAdditionalProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("id", Id.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("petId", PetId.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "id"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static NoAdditionalPropertiesMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new NoAdditionalPropertiesMap(arg);
        }
        public static NoAdditionalPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NoAdditionalProperties1.class, arg, configuration);
        }
    }
}
