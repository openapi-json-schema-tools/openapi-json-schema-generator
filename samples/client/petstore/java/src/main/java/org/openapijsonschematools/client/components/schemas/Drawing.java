package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Drawing {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ShapesList extends FrozenList<@Nullable Object> {
        protected ShapesList(FrozenList<@Nullable Object> m) {
            super(m);
        }
        public static ShapesList of(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Shapes.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ShapesListBuilder {
        // class to build List<@Nullable Object>
        private final List<@Nullable Object> list;
    
        public ShapesListBuilder() {
            list = new ArrayList<>();
        }
    
        public ShapesListBuilder(List<@Nullable Object> list) {
            this.list = list;
        }
        
        public ShapesListBuilder add(Void item) {
            list.add(null);
            return this;
        }
        
        public ShapesListBuilder add(boolean item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(double item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(List<?> item) {
            list.add(item);
            return this;
        }
        
        public ShapesListBuilder add(Map<String, ?> item) {
            list.add(item);
            return this;
        }
    
        public List<@Nullable Object> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class ShapesBoxed permits ShapesBoxedList {}
    
    public static final class ShapesBoxedList extends ShapesBoxed {
        public final ShapesList data;
        private ShapesBoxedList(ShapesList data) {
            this.data = data;
        }
    }
    
    
    
    public static class Shapes extends JsonSchema implements ListSchemaValidator<ShapesList, ShapesBoxedList> {
        private static @Nullable Shapes instance = null;
    
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
            List<@Nullable Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((@Nullable Object) itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return new ShapesList(newInstanceItems);
        }
        
        public ShapesList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ShapesBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ShapesBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class DrawingMap extends FrozenMap<@Nullable Object> {
        protected DrawingMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "mainShape",
            "shapeOrNull",
            "nullableShape",
            "shapes"
        );
        public static DrawingMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Drawing1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object mainShape() throws UnsetPropertyException {
            String key = "mainShape";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Object)) {
                throw new InvalidTypeException("Invalid value stored for mainShape");
            }
            return (@Nullable Object) value;
        }
        
        public @Nullable Object shapeOrNull() throws UnsetPropertyException {
            String key = "shapeOrNull";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Object)) {
                throw new InvalidTypeException("Invalid value stored for shapeOrNull");
            }
            return (@Nullable Object) value;
        }
        
        public @Nullable Object nullableShape() throws UnsetPropertyException {
            String key = "nullableShape";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Object)) {
                throw new InvalidTypeException("Invalid value stored for nullableShape");
            }
            return (@Nullable Object) value;
        }
        
        public ShapesList shapes() throws UnsetPropertyException {
            String key = "shapes";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ShapesList)) {
                throw new InvalidTypeException("Invalid value stored for shapes");
            }
            return (ShapesList) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            var value = getOrThrow(name);
            if (!(value instanceof Object)) {
                throw new InvalidTypeException("Invalid value stored for " + name);
            }
            return (@Nullable Object) value;
        }
    }
    
    public interface SetterForMainShape <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMainShape(Map<String, @Nullable Object> instance);
        
        default T mainShape(Void value) {
            var instance = getInstance();
            instance.put("mainShape", null);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(boolean value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(String value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(int value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(float value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(long value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(double value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(List<?> value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
        
        default T mainShape(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("mainShape", value);
            return getBuilderAfterMainShape(instance);
        }
    }
    
    public interface SetterForShapeOrNull <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterShapeOrNull(Map<String, @Nullable Object> instance);
        
        default T shapeOrNull(Void value) {
            var instance = getInstance();
            instance.put("shapeOrNull", null);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(boolean value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(String value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(int value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(float value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(long value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(double value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(List<?> value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
        
        default T shapeOrNull(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("shapeOrNull", value);
            return getBuilderAfterShapeOrNull(instance);
        }
    }
    
    public interface SetterForNullableShape <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNullableShape(Map<String, @Nullable Object> instance);
        
        default T nullableShape(Void value) {
            var instance = getInstance();
            instance.put("nullableShape", null);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(boolean value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(String value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(int value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(float value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(long value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(double value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(List<?> value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
        
        default T nullableShape(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("nullableShape", value);
            return getBuilderAfterNullableShape(instance);
        }
    }
    
    public interface SetterForShapes <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterShapes(Map<String, @Nullable Object> instance);
        
        default T shapes(List<@Nullable Object> value) {
            var instance = getInstance();
            instance.put("shapes", value);
            return getBuilderAfterShapes(instance);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, boolean value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, int value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, float value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, long value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, double value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, List<?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, ?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class DrawingMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMainShape<DrawingMapBuilder>, SetterForShapeOrNull<DrawingMapBuilder>, SetterForNullableShape<DrawingMapBuilder>, SetterForShapes<DrawingMapBuilder>, SetterForAdditionalProperties<DrawingMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "mainShape",
            "shapeOrNull",
            "nullableShape",
            "shapes"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public DrawingMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public DrawingMapBuilder getBuilderAfterMainShape(Map<String, @Nullable Object> instance) {
            return this;
        }
        public DrawingMapBuilder getBuilderAfterShapeOrNull(Map<String, @Nullable Object> instance) {
            return this;
        }
        public DrawingMapBuilder getBuilderAfterNullableShape(Map<String, @Nullable Object> instance) {
            return this;
        }
        public DrawingMapBuilder getBuilderAfterShapes(Map<String, @Nullable Object> instance) {
            return this;
        }
        public DrawingMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class Drawing1Boxed permits Drawing1BoxedMap {}
    
    public static final class Drawing1BoxedMap extends Drawing1Boxed {
        public final DrawingMap data;
        private Drawing1BoxedMap(DrawingMap data) {
            this.data = data;
        }
    }
    
    
    public static class Drawing1 extends JsonSchema implements MapSchemaValidator<DrawingMap, Drawing1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Drawing1 instance = null;
    
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
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new DrawingMap(castProperties);
        }
        
        public DrawingMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Drawing1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Drawing1BoxedMap(validate(arg, configuration));
        }
    }

}
