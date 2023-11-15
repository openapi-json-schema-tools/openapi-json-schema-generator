package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Capitalization {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record SmallCamel(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static SmallCamel withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SmallCamel(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SmallCamel.class, arg, configuration);
        }
    }    
    
    public record CapitalCamel(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static CapitalCamel withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new CapitalCamel(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(CapitalCamel.class, arg, configuration);
        }
    }    
    
    public record SmallSnake(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static SmallSnake withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SmallSnake(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SmallSnake.class, arg, configuration);
        }
    }    
    
    public record CapitalSnake(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static CapitalSnake withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new CapitalSnake(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(CapitalSnake.class, arg, configuration);
        }
    }    
    
    public record SCAETHFlowPoints(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static SCAETHFlowPoints withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SCAETHFlowPoints(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SCAETHFlowPoints.class, arg, configuration);
        }
    }    
    
    public record ATTNAME(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ATTNAME withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ATTNAME(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ATTNAME.class, arg, configuration);
        }
    }    
    
    public record Capitalization1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static Capitalization1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("smallCamel", SmallCamel.class);
            properties.put("CapitalCamel", CapitalCamel.class);
            properties.put("small_Snake", SmallSnake.class);
            properties.put("Capital_Snake", CapitalSnake.class);
            properties.put("SCA_ETH_Flow_Points", SCAETHFlowPoints.class);
            properties.put("ATT_NAME", ATTNAME.class);
            return new Capitalization1(type, properties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Capitalization1.class, arg, configuration);
        }
    }
}
