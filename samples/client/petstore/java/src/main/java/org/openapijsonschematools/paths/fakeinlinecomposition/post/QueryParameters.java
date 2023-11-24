package org.openapijsonschematools.paths.fakeinlinecomposition.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {


        QueryParametersMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return QueryParameters1.validate(arg, configuration);
        }
        
        public Object compositionAtRoot() {

            val = self.get("compositionAtRoot", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                Object,

                val
            )
        
        public Schema1.SchemaMap1 compositionInProperty() {

            val = self.get("compositionInProperty", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                Schema1.SchemaMap1,

                val
            )
    }    
    
    public class QueryParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("compositionAtRoot", Schema0.Schema01.class),
                new PropertyEntry("compositionInProperty", Schema1.Schema11.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
