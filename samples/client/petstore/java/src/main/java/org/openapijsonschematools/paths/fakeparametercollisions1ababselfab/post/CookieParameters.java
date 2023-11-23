package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14.Schema14;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;
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

public class CookieParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class CookieParametersMap extends FrozenMap<String, Object> {
        CookieParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static CookieParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return CookieParameters1.validate(arg, configuration);
        }
    }    
    
    public class CookieParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("1", Schema14.Schema141.class),
                new PropertyEntry("aB", Schema15.Schema151.class),
                new PropertyEntry("Ab", Schema16.Schema161.class),
                new PropertyEntry("A-B", Schema18.Schema181.class),
                new PropertyEntry("self", Schema17.Schema171.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static CookieParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new CookieParametersMap(arg);
        }
        public static CookieParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(CookieParameters1.class, arg, configuration);
        }
    }
}
