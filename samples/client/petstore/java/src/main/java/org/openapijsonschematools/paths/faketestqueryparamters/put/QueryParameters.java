package org.openapijsonschematools.paths.faketestqueryparamters.put;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.schemas.StringWithValidation;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;
import org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;
import org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {
        QueryParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return QueryParameters1.validate(arg, configuration);
        }
    }    
    
    public class QueryParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("refParam", StringWithValidation.StringWithValidation1.class),
                new PropertyEntry("ioutil", Schema1.Schema11.class),
                new PropertyEntry("context", Schema4.Schema41.class),
                new PropertyEntry("http", Schema2.Schema21.class),
                new PropertyEntry("pipe", Schema0.Schema01.class),
                new PropertyEntry("url", Schema3.Schema31.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "context",
                "http",
                "ioutil",
                "pipe",
                "refParam",
                "url"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
