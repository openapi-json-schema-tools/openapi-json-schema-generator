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
    
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters8 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Fakeparametercollisions1ababselfabPostPathParameters8 instance = null;
        public static Fakeparametercollisions1ababselfabPostPathParameters8 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostPathParameters8();
            }
            return instance;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters13 extends FrozenMap<@Nullable Object> {
        protected Fakeparametercollisions1ababselfabPostPathParameters13(FrozenMap<@Nullable Object> m) {
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
        public static Fakeparametercollisions1ababselfabPostPathParameters13 of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public interface SetterForFakeparametercollisions1ababselfabPostPathParameters2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostPathParameters5 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostPathParameters4 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostPathParameters3 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostPathParameters6 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters14 implements GenericBuilder<Map<String, @Nullable Object>> {
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
        public Fakeparametercollisions1ababselfabPostPathParameters14(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters15 implements SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters14> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters15(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters14 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters14(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters16 implements SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters14> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters16(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters14 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters14(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters17 implements SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters15>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters16> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters17(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters15 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters15(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters16 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters16(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters18 implements SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters14> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters18(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters14 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters14(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters19 implements SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters15>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters18> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters19(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters15 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters15(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters18 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters18(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters20 implements SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters16>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters18> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters20(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters16 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters16(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters18 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters18(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters21 implements SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters17>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters19>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters20> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters21(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters17 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters17(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters19 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters19(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters20 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters20(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters22 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters14> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters22(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters14 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters14(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters23 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters15>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters22> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters23(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters15 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters15(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters22 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters22(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters24 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters16>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters22> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters24(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters16 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters16(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters22 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters22(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters25 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters17>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters23>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters24> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters25(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters17 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters17(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters23 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters23(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters24 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters24(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters26 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters18>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters22> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters26(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters18 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters18(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters22 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters22(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters27 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters19>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters23>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters26> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters27(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters19 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters19(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters23 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters23(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters26 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters26(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters28 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters20>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters24>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters26> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters28(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters20 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters20(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters24 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters24(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters26 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters26(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters29 implements SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters21>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters25>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters27>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters28> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters29(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters21 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters21(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters25 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters25(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters27 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters27(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters28 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters28(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters30 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters14> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters30(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters14 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters14(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters31 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters15>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters30> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters31(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters15 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters15(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters30 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters30(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters32 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters16>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters30> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters32(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters16 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters16(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters30 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters30(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters33 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters17>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters31>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters32> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters33(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters17 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters17(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters31 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters31(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters32 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters32(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters34 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters18>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters30> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters34(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters18 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters18(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters30 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters30(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters35 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters19>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters31>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters34> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters35(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters19 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters19(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters31 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters31(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters34 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters34(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters36 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters20>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters32>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters34> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters36(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters20 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters20(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters32 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters32(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters34 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters34(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters37 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters21>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters33>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters35>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters36> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters37(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters21 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters21(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters33 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters33(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters35 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters35(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters36 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters36(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters38 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters22>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters30> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters38(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters22 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters22(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters30 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters30(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters39 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters23>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters31>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters38> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters39(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters23 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters23(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters31 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters31(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters38 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters38(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters40 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters24>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters32>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters38> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters40(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters24 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters24(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters32 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters32(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters38 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters38(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters41 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters25>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters33>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters39>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters40> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters41(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters25 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters25(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters33 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters33(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters39 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters39(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters40 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters40(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters42 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters26>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters34>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters38> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters42(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters26 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters26(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters34 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters34(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters38 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters38(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters43 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters27>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters35>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters39>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters42> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters43(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters27 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters27(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters35 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters35(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters39 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters39(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters42 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters42(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters44 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters28>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters36>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters40>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters42> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters44(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters28 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters28(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters36 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters36(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters40 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters40(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters42 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters42(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters12 implements SetterForFakeparametercollisions1ababselfabPostPathParameters2<Fakeparametercollisions1ababselfabPostPathParameters29>, SetterForFakeparametercollisions1ababselfabPostPathParameters5<Fakeparametercollisions1ababselfabPostPathParameters37>, SetterForFakeparametercollisions1ababselfabPostPathParameters4<Fakeparametercollisions1ababselfabPostPathParameters41>, SetterForFakeparametercollisions1ababselfabPostPathParameters3<Fakeparametercollisions1ababselfabPostPathParameters43>, SetterForFakeparametercollisions1ababselfabPostPathParameters6<Fakeparametercollisions1ababselfabPostPathParameters44> {
        private final Map<String, @Nullable Object> instance;
        public Fakeparametercollisions1ababselfabPostPathParameters12() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostPathParameters29 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters2(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters29(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters37 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters5(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters37(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters41 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters4(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters41(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters43 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters3(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters43(instance);
        }
        public Fakeparametercollisions1ababselfabPostPathParameters44 getBuilderAfterFakeparametercollisions1ababselfabPostPathParameters6(Map<String, @Nullable Object> instance) {
            return new Fakeparametercollisions1ababselfabPostPathParameters44(instance);
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostPathParameters1Boxed permits Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap(Fakeparametercollisions1ababselfabPostPathParameters13 data) implements Fakeparametercollisions1ababselfabPostPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostPathParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostPathParameters1Boxed> implements MapSchemaValidator<Fakeparametercollisions1ababselfabPostPathParameters13, Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap> {
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
                .additionalProperties(Fakeparametercollisions1ababselfabPostPathParameters8.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostPathParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostPathParameters1();
            }
            return instance;
        }
        
        public Fakeparametercollisions1ababselfabPostPathParameters13 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Fakeparametercollisions1ababselfabPostPathParameters13(castProperties);
        }
        
        public Fakeparametercollisions1ababselfabPostPathParameters13 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
