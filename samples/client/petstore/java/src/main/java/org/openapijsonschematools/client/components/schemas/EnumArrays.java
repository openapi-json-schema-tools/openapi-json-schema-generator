package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class EnumArrays {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class JustSymbol extends NonCollectionJsonSchema {
        public JustSymbol() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    ">=",
                    "$"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class Items extends NonCollectionJsonSchema {
        public Items() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "fish",
                    "crab"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class ArrayEnumList extends FrozenList<String> {
        ArrayEnumList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayEnumList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayEnum.class).validate(arg, configuration);
        }
    }
    
    public class ArrayEnumListInput {
        // class to build List<String>
    }
    
    
    public static class ArrayEnum extends JsonSchema<Object, Object, FrozenMap<String, Object>, String, String, ArrayEnumList> {
        public ArrayEnum() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected ArrayEnumList getListOutputInstance(FrozenList<String> arg) {
            return new ArrayEnumList(arg);
        }
        public ArrayEnumList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class EnumArraysMap extends FrozenMap<String, Object> {
        EnumArraysMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "just_symbol",
            "array_enum"
        );
        public static EnumArraysMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(EnumArrays1.class).validate(arg, configuration);
        }
        
        public String just_symbol() {
            String key = "just_symbol";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public ArrayEnumList array_enum() {
            String key = "array_enum";
            throwIfKeyNotPresent(key);
            return (ArrayEnumList) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class EnumArraysMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class EnumArrays1 extends JsonSchema<Object, Object, EnumArraysMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public EnumArrays1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("just_symbol", JustSymbol.class),
                    new PropertyEntry("array_enum", ArrayEnum.class)
                )))
            )));
        }
        
        @Override
        protected EnumArraysMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new EnumArraysMap(arg);
        }
        public EnumArraysMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
