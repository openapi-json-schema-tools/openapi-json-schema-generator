package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ObjectWithInvalidNamedRefedProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ObjectWithInvalidNamedRefedPropertiesMap extends FrozenMap<String, Object> {
        ObjectWithInvalidNamedRefedPropertiesMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ObjectWithInvalidNamedRefedPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ObjectWithInvalidNamedRefedProperties1.validate(arg, configuration);
        }
    }    
    
    public class ObjectWithInvalidNamedRefedProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("from", FromSchema.FromSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("!reference", ArrayWithValidationsInItems.ArrayWithValidationsInItems1.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "!reference",
            "from"
        ));
        protected static ObjectWithInvalidNamedRefedPropertiesMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ObjectWithInvalidNamedRefedPropertiesMap(arg);
        }
        public static ObjectWithInvalidNamedRefedPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithInvalidNamedRefedProperties1.class, arg, configuration);
        }
    }
}
