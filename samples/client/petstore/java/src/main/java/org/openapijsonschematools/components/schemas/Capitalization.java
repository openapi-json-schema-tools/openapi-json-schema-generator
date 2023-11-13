package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Capitalization {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record SmallCamel(LinkedHashSet<Class<?>> type) implements Schema {
        public static SmallCamel withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SmallCamel(type);
        }
    }    
    
    public record CapitalCamel(LinkedHashSet<Class<?>> type) implements Schema {
        public static CapitalCamel withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new CapitalCamel(type);
        }
    }    
    
    public record SmallSnake(LinkedHashSet<Class<?>> type) implements Schema {
        public static SmallSnake withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SmallSnake(type);
        }
    }    
    
    public record CapitalSnake(LinkedHashSet<Class<?>> type) implements Schema {
        public static CapitalSnake withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new CapitalSnake(type);
        }
    }    
    
    public record SCAETHFlowPoints(LinkedHashSet<Class<?>> type) implements Schema {
        public static SCAETHFlowPoints withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new SCAETHFlowPoints(type);
        }
    }    
    
    public record ATTNAME(LinkedHashSet<Class<?>> type) implements Schema {
        public static ATTNAME withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ATTNAME(type);
        }
    }}
