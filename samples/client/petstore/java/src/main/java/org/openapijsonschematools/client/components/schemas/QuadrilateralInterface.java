package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class QuadrilateralInterface {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ShapeType extends NonCollectionJsonSchema {
        public ShapeType() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "Quadrilateral"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class QuadrilateralType extends StringJsonSchema {}
    
    
    public static class QuadrilateralInterfaceMap extends FrozenMap<String, Object> {
        QuadrilateralInterfaceMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "quadrilateralType",
            "shapeType"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static QuadrilateralInterfaceMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(QuadrilateralInterface1.class).validate(arg, configuration);
        }
        
        public String quadrilateralType() {
            return (String) get("quadrilateralType");
        }
        
        public String shapeType() {
            return (String) get("shapeType");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class QuadrilateralInterfaceMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class QuadrilateralInterface1 extends JsonSchema<Object, Object, QuadrilateralInterfaceMap, Object, Object, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public QuadrilateralInterface1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("shapeType", ShapeType.class),
                    new PropertyEntry("quadrilateralType", QuadrilateralType.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "quadrilateralType",
                    "shapeType"
                )))
            )));
        }
        
        @Override
        protected QuadrilateralInterfaceMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new QuadrilateralInterfaceMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public QuadrilateralInterfaceMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }}
