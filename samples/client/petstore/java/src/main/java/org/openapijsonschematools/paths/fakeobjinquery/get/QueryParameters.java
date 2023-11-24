package org.openapijsonschematools.paths.fakeobjinquery.get;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0.Schema0;
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
    
    
    public static class QueryParametersMap extends FrozenMap<String, Schema0.SchemaMap0> {


        QueryParametersMap(FrozenMap<String, Schema0.SchemaMap0> m) {


            super(m);
        }
        public static QueryParametersMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) {


            return QueryParameters1.validate(arg, configuration);
        }
        
        public Schema0.SchemaMap0 mapBean() {

            val = self.get("mapBean", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return val
    }    
    
    public class QueryParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("mapBean", Schema0.Schema01.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<String, Schema0.SchemaMap0> arg) {


            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
