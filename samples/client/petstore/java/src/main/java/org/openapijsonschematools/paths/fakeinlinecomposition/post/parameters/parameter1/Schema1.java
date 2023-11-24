package org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }    
    
    public class SomeProp1 extends JsonSchema {
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
    }    
    
    public static class SchemaMap1 extends FrozenMap<String, Object> {

        SchemaMap1(FrozenMap<String, Object> m) {

            super(m);
        }
        public static SchemaMap1 of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema11.validate(arg, configuration);
        }
    }    
    
    public class Schema11 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("someProp", SomeProp1.class)
            )))
        ));
        protected static SchemaMap1 getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new SchemaMap1(arg);
        }
        public static SchemaMap1 validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema11.class, arg, configuration);
        }
    }
}
