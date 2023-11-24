package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Drawing {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ShapesList extends FrozenList<Object> {

        ShapesList(FrozenList<Object> m) {

            super(m);
        }
        public static ShapesList of(List<Object> arg, SchemaConfiguration configuration) {

            return Shapes.validate(arg, configuration);
        }
    }
    
    
    public class Shapes extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Shape.Shape1.class))
        ));
        protected static ShapesList getListOutputInstance(FrozenList<Object> arg) {

            return new ShapesList(arg);
        }
        public static ShapesList validate(List<Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Shapes.class, arg, configuration);
        }
    }    
    
    public static class DrawingMap extends FrozenMap<String, Object> {

        DrawingMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static DrawingMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Drawing1.validate(arg, configuration);
        }
    }    
    
    public class Drawing1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("mainShape", Shape.Shape1.class),
                new PropertyEntry("shapeOrNull", ShapeOrNull.ShapeOrNull1.class),
                new PropertyEntry("nullableShape", NullableShape.NullableShape1.class),
                new PropertyEntry("shapes", Shapes.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(Fruit.Fruit1.class))
        ));
        protected static DrawingMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new DrawingMap(arg);
        }
        public static DrawingMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Drawing1.class, arg, configuration);
        }
    }
}
