package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.DoubleJsonSchema;
import org.openapijsonschematools.schemas.FloatJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.IntJsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NullJsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class ComposedAnyOfDifferentTypesNoValidations {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema0 extends MapJsonSchema {}
    
    
    public class Schema1 extends DateJsonSchema {}
    
    
    public class Schema2 extends DateTimeJsonSchema {}
    
    
    public class Schema3 implements JsonSchema {
        // BinarySchema
    }
    
    
    public class Schema4 extends StringJsonSchema {}
    
    
    public class Schema5 extends StringJsonSchema {}
    
    
    public class Schema6 extends MapJsonSchema {}
    
    
    public class Schema7 extends BooleanJsonSchema {}
    
    
    public class Schema8 extends NullJsonSchema {}
    
    
    public class Items extends AnyTypeJsonSchema {}
    
    
    public class Schema9 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema9.class, arg, configuration);
        }
    }    
    
    public class Schema10 extends NumberJsonSchema {}
    
    
    public class Schema11 extends FloatJsonSchema {}
    
    
    public class Schema12 extends DoubleJsonSchema {}
    
    
    public class Schema13 extends IntJsonSchema {}
    
    
    public class Schema14 extends Int32JsonSchema {}
    
    
    public class Schema15 extends Int64JsonSchema {}
    
    
    public class ComposedAnyOfDifferentTypesNoValidations1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedAnyOfDifferentTypesNoValidations1.class, arg, configuration);
        }
    }}
