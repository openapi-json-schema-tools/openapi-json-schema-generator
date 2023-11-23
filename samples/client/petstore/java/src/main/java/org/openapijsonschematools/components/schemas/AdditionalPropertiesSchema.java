package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AdditionalPropertiesSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends AnyTypeJsonSchema {}
    
    
    public static class Schema0Map extends FrozenMap<String, Object> {
        Schema0Map(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static Schema0Map of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema0.validate(arg, configuration);
        }
    }    
    
    public class Schema0 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static Schema0Map getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new Schema0Map(arg);
        }
        public static Schema0Map validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties1 extends JsonSchema {
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
    }    
    
    public static class Schema1Map extends FrozenMap<String, Object> {
        Schema1Map(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static Schema1Map of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
        }
    }    
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
        ));
        protected static Schema1Map getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new Schema1Map(arg);
        }
        public static Schema1Map validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties2 extends JsonSchema {
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
    }    
    
    public static class Schema2Map extends FrozenMap<String, Object> {
        Schema2Map(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static Schema2Map of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema2.validate(arg, configuration);
        }
    }    
    
    public class Schema2 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
        ));
        protected static Schema2Map getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new Schema2Map(arg);
        }
        public static Schema2Map validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema2.class, arg, configuration);
        }
    }
    
    
    public class AdditionalPropertiesSchema1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)))
        ));
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalPropertiesSchema1.class, arg, configuration);
        }
    }
}
