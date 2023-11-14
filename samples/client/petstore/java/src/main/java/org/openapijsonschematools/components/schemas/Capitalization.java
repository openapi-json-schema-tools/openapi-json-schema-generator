package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
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
    }}
