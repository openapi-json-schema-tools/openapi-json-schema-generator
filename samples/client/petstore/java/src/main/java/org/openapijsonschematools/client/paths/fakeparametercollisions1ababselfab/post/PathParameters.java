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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
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

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class PathParametersMap extends FrozenMap<@Nullable Object> {
        protected PathParametersMap(FrozenMap<@Nullable Object> m) {
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
        public static PathParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return PathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String Ab() {
                        @Nullable Object value = get("Ab");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for Ab");
            }
            return (String) value;
        }
        
        public String aB() {
                        @Nullable Object value = get("aB");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String self() {
                        @Nullable Object value = get("self");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    
    public interface SetterForSchema1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSchema1(Map<String, @Nullable Object> instance);
        
        default T setPositive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterSchema1(instance);
        }
    }
    
    public interface SetterForAB1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB1(Map<String, @Nullable Object> instance);
        
        default T setAHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterAB1(instance);
        }
    }
    
    public interface SetterForAb <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAb(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterAb(instance);
        }
    }
    
    public interface SetterForAB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterAB(instance);
        }
    }
    
    public interface SetterForSelf <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSelf(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterSelf(instance);
        }
    }
    
    public static class PathParametersMap00000Builder implements GenericBuilder<Map<String, @Nullable Object>> {
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
        public PathParametersMap00000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class PathParametersMap00001Builder implements SetterForSelf<PathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00000Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00000Builder(instance);
        }
    }
    
    public static class PathParametersMap00010Builder implements SetterForAB<PathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00000Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00000Builder(instance);
        }
    }
    
    public static class PathParametersMap00011Builder implements SetterForAB<PathParametersMap00001Builder>, SetterForSelf<PathParametersMap00010Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00001Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00001Builder(instance);
        }
        public PathParametersMap00010Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00010Builder(instance);
        }
    }
    
    public static class PathParametersMap00100Builder implements SetterForAb<PathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00000Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00000Builder(instance);
        }
    }
    
    public static class PathParametersMap00101Builder implements SetterForAb<PathParametersMap00001Builder>, SetterForSelf<PathParametersMap00100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00001Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00001Builder(instance);
        }
        public PathParametersMap00100Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00100Builder(instance);
        }
    }
    
    public static class PathParametersMap00110Builder implements SetterForAb<PathParametersMap00010Builder>, SetterForAB<PathParametersMap00100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00010Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00010Builder(instance);
        }
        public PathParametersMap00100Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00100Builder(instance);
        }
    }
    
    public static class PathParametersMap00111Builder implements SetterForAb<PathParametersMap00011Builder>, SetterForAB<PathParametersMap00101Builder>, SetterForSelf<PathParametersMap00110Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap00111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00011Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00011Builder(instance);
        }
        public PathParametersMap00101Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00101Builder(instance);
        }
        public PathParametersMap00110Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00110Builder(instance);
        }
    }
    
    public static class PathParametersMap01000Builder implements SetterForAB1<PathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00000Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00000Builder(instance);
        }
    }
    
    public static class PathParametersMap01001Builder implements SetterForAB1<PathParametersMap00001Builder>, SetterForSelf<PathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00001Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00001Builder(instance);
        }
        public PathParametersMap01000Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01000Builder(instance);
        }
    }
    
    public static class PathParametersMap01010Builder implements SetterForAB1<PathParametersMap00010Builder>, SetterForAB<PathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00010Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00010Builder(instance);
        }
        public PathParametersMap01000Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01000Builder(instance);
        }
    }
    
    public static class PathParametersMap01011Builder implements SetterForAB1<PathParametersMap00011Builder>, SetterForAB<PathParametersMap01001Builder>, SetterForSelf<PathParametersMap01010Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00011Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00011Builder(instance);
        }
        public PathParametersMap01001Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01001Builder(instance);
        }
        public PathParametersMap01010Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01010Builder(instance);
        }
    }
    
    public static class PathParametersMap01100Builder implements SetterForAB1<PathParametersMap00100Builder>, SetterForAb<PathParametersMap01000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00100Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00100Builder(instance);
        }
        public PathParametersMap01000Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01000Builder(instance);
        }
    }
    
    public static class PathParametersMap01101Builder implements SetterForAB1<PathParametersMap00101Builder>, SetterForAb<PathParametersMap01001Builder>, SetterForSelf<PathParametersMap01100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00101Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00101Builder(instance);
        }
        public PathParametersMap01001Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01001Builder(instance);
        }
        public PathParametersMap01100Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01100Builder(instance);
        }
    }
    
    public static class PathParametersMap01110Builder implements SetterForAB1<PathParametersMap00110Builder>, SetterForAb<PathParametersMap01010Builder>, SetterForAB<PathParametersMap01100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00110Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00110Builder(instance);
        }
        public PathParametersMap01010Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01010Builder(instance);
        }
        public PathParametersMap01100Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01100Builder(instance);
        }
    }
    
    public static class PathParametersMap01111Builder implements SetterForAB1<PathParametersMap00111Builder>, SetterForAb<PathParametersMap01011Builder>, SetterForAB<PathParametersMap01101Builder>, SetterForSelf<PathParametersMap01110Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap01111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00111Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00111Builder(instance);
        }
        public PathParametersMap01011Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01011Builder(instance);
        }
        public PathParametersMap01101Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01101Builder(instance);
        }
        public PathParametersMap01110Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01110Builder(instance);
        }
    }
    
    public static class PathParametersMap10000Builder implements SetterForSchema1<PathParametersMap00000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00000Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00000Builder(instance);
        }
    }
    
    public static class PathParametersMap10001Builder implements SetterForSchema1<PathParametersMap00001Builder>, SetterForSelf<PathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00001Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00001Builder(instance);
        }
        public PathParametersMap10000Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10000Builder(instance);
        }
    }
    
    public static class PathParametersMap10010Builder implements SetterForSchema1<PathParametersMap00010Builder>, SetterForAB<PathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00010Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00010Builder(instance);
        }
        public PathParametersMap10000Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10000Builder(instance);
        }
    }
    
    public static class PathParametersMap10011Builder implements SetterForSchema1<PathParametersMap00011Builder>, SetterForAB<PathParametersMap10001Builder>, SetterForSelf<PathParametersMap10010Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00011Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00011Builder(instance);
        }
        public PathParametersMap10001Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10001Builder(instance);
        }
        public PathParametersMap10010Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10010Builder(instance);
        }
    }
    
    public static class PathParametersMap10100Builder implements SetterForSchema1<PathParametersMap00100Builder>, SetterForAb<PathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00100Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00100Builder(instance);
        }
        public PathParametersMap10000Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10000Builder(instance);
        }
    }
    
    public static class PathParametersMap10101Builder implements SetterForSchema1<PathParametersMap00101Builder>, SetterForAb<PathParametersMap10001Builder>, SetterForSelf<PathParametersMap10100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00101Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00101Builder(instance);
        }
        public PathParametersMap10001Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10001Builder(instance);
        }
        public PathParametersMap10100Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10100Builder(instance);
        }
    }
    
    public static class PathParametersMap10110Builder implements SetterForSchema1<PathParametersMap00110Builder>, SetterForAb<PathParametersMap10010Builder>, SetterForAB<PathParametersMap10100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00110Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00110Builder(instance);
        }
        public PathParametersMap10010Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10010Builder(instance);
        }
        public PathParametersMap10100Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10100Builder(instance);
        }
    }
    
    public static class PathParametersMap10111Builder implements SetterForSchema1<PathParametersMap00111Builder>, SetterForAb<PathParametersMap10011Builder>, SetterForAB<PathParametersMap10101Builder>, SetterForSelf<PathParametersMap10110Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap10111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap00111Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap00111Builder(instance);
        }
        public PathParametersMap10011Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10011Builder(instance);
        }
        public PathParametersMap10101Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10101Builder(instance);
        }
        public PathParametersMap10110Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10110Builder(instance);
        }
    }
    
    public static class PathParametersMap11000Builder implements SetterForSchema1<PathParametersMap01000Builder>, SetterForAB1<PathParametersMap10000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01000Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01000Builder(instance);
        }
        public PathParametersMap10000Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10000Builder(instance);
        }
    }
    
    public static class PathParametersMap11001Builder implements SetterForSchema1<PathParametersMap01001Builder>, SetterForAB1<PathParametersMap10001Builder>, SetterForSelf<PathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01001Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01001Builder(instance);
        }
        public PathParametersMap10001Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10001Builder(instance);
        }
        public PathParametersMap11000Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11000Builder(instance);
        }
    }
    
    public static class PathParametersMap11010Builder implements SetterForSchema1<PathParametersMap01010Builder>, SetterForAB1<PathParametersMap10010Builder>, SetterForAB<PathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01010Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01010Builder(instance);
        }
        public PathParametersMap10010Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10010Builder(instance);
        }
        public PathParametersMap11000Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11000Builder(instance);
        }
    }
    
    public static class PathParametersMap11011Builder implements SetterForSchema1<PathParametersMap01011Builder>, SetterForAB1<PathParametersMap10011Builder>, SetterForAB<PathParametersMap11001Builder>, SetterForSelf<PathParametersMap11010Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01011Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01011Builder(instance);
        }
        public PathParametersMap10011Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10011Builder(instance);
        }
        public PathParametersMap11001Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11001Builder(instance);
        }
        public PathParametersMap11010Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11010Builder(instance);
        }
    }
    
    public static class PathParametersMap11100Builder implements SetterForSchema1<PathParametersMap01100Builder>, SetterForAB1<PathParametersMap10100Builder>, SetterForAb<PathParametersMap11000Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01100Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01100Builder(instance);
        }
        public PathParametersMap10100Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10100Builder(instance);
        }
        public PathParametersMap11000Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11000Builder(instance);
        }
    }
    
    public static class PathParametersMap11101Builder implements SetterForSchema1<PathParametersMap01101Builder>, SetterForAB1<PathParametersMap10101Builder>, SetterForAb<PathParametersMap11001Builder>, SetterForSelf<PathParametersMap11100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01101Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01101Builder(instance);
        }
        public PathParametersMap10101Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10101Builder(instance);
        }
        public PathParametersMap11001Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11001Builder(instance);
        }
        public PathParametersMap11100Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11100Builder(instance);
        }
    }
    
    public static class PathParametersMap11110Builder implements SetterForSchema1<PathParametersMap01110Builder>, SetterForAB1<PathParametersMap10110Builder>, SetterForAb<PathParametersMap11010Builder>, SetterForAB<PathParametersMap11100Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMap11110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01110Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01110Builder(instance);
        }
        public PathParametersMap10110Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10110Builder(instance);
        }
        public PathParametersMap11010Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11010Builder(instance);
        }
        public PathParametersMap11100Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11100Builder(instance);
        }
    }
    
    public static class PathParametersMapBuilder implements SetterForSchema1<PathParametersMap01111Builder>, SetterForAB1<PathParametersMap10111Builder>, SetterForAb<PathParametersMap11011Builder>, SetterForAB<PathParametersMap11101Builder>, SetterForSelf<PathParametersMap11110Builder> {
        private final Map<String, @Nullable Object> instance;
        public PathParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PathParametersMap01111Builder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap01111Builder(instance);
        }
        public PathParametersMap10111Builder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return new PathParametersMap10111Builder(instance);
        }
        public PathParametersMap11011Builder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11011Builder(instance);
        }
        public PathParametersMap11101Builder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11101Builder(instance);
        }
        public PathParametersMap11110Builder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return new PathParametersMap11110Builder(instance);
        }
    }
    
    
    public static abstract sealed class PathParameters1Boxed permits PathParameters1BoxedMap {}
    public static final class PathParameters1BoxedMap extends PathParameters1Boxed {
        public final PathParametersMap data;
        private PathParameters1BoxedMap(PathParametersMap data) {
            this.data = data;
        }
    }
    
    
    public static class PathParameters1 extends JsonSchema implements MapSchemaValidator<PathParametersMap> {
        private static @Nullable PathParameters1 instance = null;
    
        protected PathParameters1() {
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
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static PathParameters1 getInstance() {
            if (instance == null) {
                instance = new PathParameters1();
            }
            return instance;
        }
        
        public PathParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PathParametersMap(castProperties);
        }
        
        public PathParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public PathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PathParameters1BoxedMap(validate(arg, configuration));
        }
    }

}
