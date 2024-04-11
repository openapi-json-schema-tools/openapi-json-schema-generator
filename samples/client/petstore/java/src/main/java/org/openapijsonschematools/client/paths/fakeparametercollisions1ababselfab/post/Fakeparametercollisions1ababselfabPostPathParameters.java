package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Fakeparametercollisions1ababselfabPostPathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Fakeparametercollisions1ababselfabPostadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Fakeparametercollisions1ababselfabPostadditionalProperties instance = null;
        public static Fakeparametercollisions1ababselfabPostadditionalProperties getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap extends FrozenMap<@Nullable Object> {
        protected Fakeparametercollisions1ababselfabPostPathParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Fakeparametercollisions1ababselfabPostPathParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Fakeparametercollisions1ababselfabPostPathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String Ab() {
                        @Nullable Object value = get("Ab");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for Ab");
            }
            return (String) value;
        }
        
        public String aB() {
                        @Nullable Object value = get("aB");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String self() {
                        @Nullable Object value = get("self");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPost1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPost1(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostAB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostAB(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostAb <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostAb(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostaB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostaB(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostself <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostself(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder implements SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder implements SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder implements SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder implements SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder implements SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder implements SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder implements SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder implements SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParametersMapBuilder implements SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder(instance);
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostPathParameters1Boxed permits Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap(Fakeparametercollisions1ababselfabPostPathParametersMap data) implements Fakeparametercollisions1ababselfabPostPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostPathParameters1Boxed> implements MapSchemaValidator<Fakeparametercollisions1ababselfabPostPathParametersMap, Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap> {
        private static @Nullable Fakeparametercollisions1ababselfabPostPathParameters1 instance = null;
    
        protected Fakeparametercollisions1ababselfabPostPathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("1", Schema9.Schema91.class),
                    new PropertyEntry("aB", Schema10.Schema101.class),
                    new PropertyEntry("Ab", Schema11.Schema111.class),
                    new PropertyEntry("A-B", Schema13.Schema131.class),
                    new PropertyEntry("self", Schema12.Schema121.class)
                ))
                .required(Set.of(
                    "1",
                    "A-B",
                    "Ab",
                    "aB",
                    "self"
                ))
                .additionalProperties(Fakeparametercollisions1ababselfabPostadditionalProperties.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostPathParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostPathParameters1();
            }
            return instance;
        }
        
        public Fakeparametercollisions1ababselfabPostPathParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new Fakeparametercollisions1ababselfabPostPathParametersMap(castProperties);
        }
        
        public Fakeparametercollisions1ababselfabPostPathParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Fakeparametercollisions1ababselfabPostPathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
