package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Drawing {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ShapesList extends FrozenList<Object> {
        protected ShapesList(FrozenList<Object> m) {
            super(m);
        }
        public static ShapesList of(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Shapes.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ShapesListInput {
        // class to build List<Object>
    }
    
    
    public static class Shapes extends JsonSchema implements ListSchemaValidator<Object, ShapesList> {
        private static Shapes instance;
    
        protected Shapes() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Shape.Shape1.class)
            );
        }
    
        public static Shapes getInstance() {
            if (instance == null) {
                instance = new Shapes();
            }
            return instance;
        }
        
        @Override
        public ShapesList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                Object castItem = (Object) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<Object> newInstanceItems = new FrozenList<>(items);
            return new ShapesList(newInstanceItems);
        }
        
        @Override
        public ShapesList validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class DrawingMap extends FrozenMap<Object> {
        protected DrawingMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "mainShape",
            "shapeOrNull",
            "nullableShape",
            "shapes"
        );
        public static DrawingMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Drawing1.getInstance().validate(arg, configuration);
        }
        
        public Object mainShape() {
            String key = "mainShape";
            throwIfKeyNotPresent(key);
            return (Object) get(key);
        }
        
        public Object shapeOrNull() {
            String key = "shapeOrNull";
            throwIfKeyNotPresent(key);
            return (Object) get(key);
        }
        
        public Object nullableShape() {
            String key = "nullableShape";
            throwIfKeyNotPresent(key);
            return (Object) get(key);
        }
        
        public ShapesList shapes() {
            String key = "shapes";
            throwIfKeyNotPresent(key);
            return (ShapesList) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (Object) get(name);
        }
    }
    public static class DrawingMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class Drawing1 extends JsonSchema implements MapSchemaValidator<Object, DrawingMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static Drawing1 instance;
    
        protected Drawing1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("mainShape", Shape.Shape1.class),
                    new PropertyEntry("shapeOrNull", ShapeOrNull.ShapeOrNull1.class),
                    new PropertyEntry("nullableShape", NullableShape.NullableShape1.class),
                    new PropertyEntry("shapes", Shapes.class)
                ))
                .additionalProperties(Fruit.Fruit1.class)
            );
        }
    
        public static Drawing1 getInstance() {
            if (instance == null) {
                instance = new Drawing1();
            }
            return instance;
        }
        
        public DrawingMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                String propertyName = (String) entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new DrawingMap(castProperties);
        }
        
        @Override
        public DrawingMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
