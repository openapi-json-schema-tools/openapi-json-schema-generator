package org.openapijsonschematools.client.paths.faketestqueryparamters.put;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;
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

public class FaketestqueryparamtersPutQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FaketestqueryparamtersPutQueryParameters9 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FaketestqueryparamtersPutQueryParameters9 instance = null;
        public static FaketestqueryparamtersPutQueryParameters9 getInstance() {
            if (instance == null) {
                instance = new FaketestqueryparamtersPutQueryParameters9();
            }
            return instance;
        }
    }
    
    
    public static class FaketestqueryparamtersPutQueryParameters14 extends FrozenMap<@Nullable Object> {
        protected FaketestqueryparamtersPutQueryParameters14(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "context",
            "http",
            "ioutil",
            "pipe",
            "refParam",
            "url"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FaketestqueryparamtersPutQueryParameters14 of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FaketestqueryparamtersPutQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema4.SchemaList4 context() {
                        @Nullable Object value = get("context");
            if (!(value instanceof Schema4.SchemaList4)) {
                throw new RuntimeException("Invalid value stored for context");
            }
            return (Schema4.SchemaList4) value;
        }
        
        public Schema2.SchemaList2 http() {
                        @Nullable Object value = get("http");
            if (!(value instanceof Schema2.SchemaList2)) {
                throw new RuntimeException("Invalid value stored for http");
            }
            return (Schema2.SchemaList2) value;
        }
        
        public Schema1.SchemaList1 ioutil() {
                        @Nullable Object value = get("ioutil");
            if (!(value instanceof Schema1.SchemaList1)) {
                throw new RuntimeException("Invalid value stored for ioutil");
            }
            return (Schema1.SchemaList1) value;
        }
        
        public Schema0.SchemaList0 pipe() {
                        @Nullable Object value = get("pipe");
            if (!(value instanceof Schema0.SchemaList0)) {
                throw new RuntimeException("Invalid value stored for pipe");
            }
            return (Schema0.SchemaList0) value;
        }
        
        public String refParam() {
                        @Nullable Object value = get("refParam");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for refParam");
            }
            return (String) value;
        }
        
        public Schema3.SchemaList3 url() {
                        @Nullable Object value = get("url");
            if (!(value instanceof Schema3.SchemaList3)) {
                throw new RuntimeException("Invalid value stored for url");
            }
            return (Schema3.SchemaList3) value;
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters4 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance);
        
        default T context(List<String> value) {
            var instance = getInstance();
            instance.put("context", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters4(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters5 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance);
        
        default T http(List<String> value) {
            var instance = getInstance();
            instance.put("http", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters5(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters3 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance);
        
        default T ioutil(List<String> value) {
            var instance = getInstance();
            instance.put("ioutil", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters3(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters6 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance);
        
        default T pipe(List<String> value) {
            var instance = getInstance();
            instance.put("pipe", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters6(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance);
        
        default T refParam(String value) {
            var instance = getInstance();
            instance.put("refParam", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters2(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutQueryParameters7 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance);
        
        default T url(List<String> value) {
            var instance = getInstance();
            instance.put("url", value);
            return getBuilderAfterFaketestqueryparamtersPutQueryParameters7(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters15 implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "context",
            "http",
            "ioutil",
            "pipe",
            "refParam",
            "url"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FaketestqueryparamtersPutQueryParameters15(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters16 implements SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters16(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters17 implements SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters17(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters18 implements SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters16>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters17> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters18(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters16 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters16(instance);
        }
        public FaketestqueryparamtersPutQueryParameters17 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters17(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters19 implements SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters19(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters20 implements SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters16>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters19> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters20(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters16 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters16(instance);
        }
        public FaketestqueryparamtersPutQueryParameters19 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters19(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters21 implements SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters17>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters19> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters21(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters17 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters17(instance);
        }
        public FaketestqueryparamtersPutQueryParameters19 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters19(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters22 implements SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters18>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters20>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters21> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters22(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters18 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters18(instance);
        }
        public FaketestqueryparamtersPutQueryParameters20 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters20(instance);
        }
        public FaketestqueryparamtersPutQueryParameters21 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters21(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters23 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters23(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters24 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters16>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters23> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters24(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters16 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters16(instance);
        }
        public FaketestqueryparamtersPutQueryParameters23 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters23(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters25 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters17>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters23> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters25(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters17 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters17(instance);
        }
        public FaketestqueryparamtersPutQueryParameters23 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters23(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters26 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters18>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters24>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters25> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters26(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters18 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters18(instance);
        }
        public FaketestqueryparamtersPutQueryParameters24 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters24(instance);
        }
        public FaketestqueryparamtersPutQueryParameters25 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters25(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters27 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters19>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters23> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters27(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters19 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters19(instance);
        }
        public FaketestqueryparamtersPutQueryParameters23 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters23(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters28 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters20>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters24>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters27> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters28(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters20 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters20(instance);
        }
        public FaketestqueryparamtersPutQueryParameters24 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters24(instance);
        }
        public FaketestqueryparamtersPutQueryParameters27 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters27(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters29 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters21>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters25>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters27> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters29(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters21 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters21(instance);
        }
        public FaketestqueryparamtersPutQueryParameters25 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters25(instance);
        }
        public FaketestqueryparamtersPutQueryParameters27 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters27(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters30 implements SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters22>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters26>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters28>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters29> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters30(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters22 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters22(instance);
        }
        public FaketestqueryparamtersPutQueryParameters26 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters26(instance);
        }
        public FaketestqueryparamtersPutQueryParameters28 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters28(instance);
        }
        public FaketestqueryparamtersPutQueryParameters29 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters29(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters31 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters31(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters32 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters16>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters31> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters32(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters16 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters16(instance);
        }
        public FaketestqueryparamtersPutQueryParameters31 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters31(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters33 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters17>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters31> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters33(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters17 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters17(instance);
        }
        public FaketestqueryparamtersPutQueryParameters31 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters31(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters34 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters18>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters32>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters33> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters34(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters18 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters18(instance);
        }
        public FaketestqueryparamtersPutQueryParameters32 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters32(instance);
        }
        public FaketestqueryparamtersPutQueryParameters33 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters33(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters35 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters19>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters31> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters35(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters19 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters19(instance);
        }
        public FaketestqueryparamtersPutQueryParameters31 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters31(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters36 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters20>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters32>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters35> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters36(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters20 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters20(instance);
        }
        public FaketestqueryparamtersPutQueryParameters32 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters32(instance);
        }
        public FaketestqueryparamtersPutQueryParameters35 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters35(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters37 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters21>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters33>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters35> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters37(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters21 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters21(instance);
        }
        public FaketestqueryparamtersPutQueryParameters33 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters33(instance);
        }
        public FaketestqueryparamtersPutQueryParameters35 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters35(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters38 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters22>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters34>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters36>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters37> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters38(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters22 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters22(instance);
        }
        public FaketestqueryparamtersPutQueryParameters34 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters34(instance);
        }
        public FaketestqueryparamtersPutQueryParameters36 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters36(instance);
        }
        public FaketestqueryparamtersPutQueryParameters37 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters37(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters39 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters23>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters31> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters39(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters23 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters23(instance);
        }
        public FaketestqueryparamtersPutQueryParameters31 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters31(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters40 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters24>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters32>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters39> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters40(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters24 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters24(instance);
        }
        public FaketestqueryparamtersPutQueryParameters32 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters32(instance);
        }
        public FaketestqueryparamtersPutQueryParameters39 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters39(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters41 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters25>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters33>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters39> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters41(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters25 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters25(instance);
        }
        public FaketestqueryparamtersPutQueryParameters33 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters33(instance);
        }
        public FaketestqueryparamtersPutQueryParameters39 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters39(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters42 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters26>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters34>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters40>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters41> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters42(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters26 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters26(instance);
        }
        public FaketestqueryparamtersPutQueryParameters34 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters34(instance);
        }
        public FaketestqueryparamtersPutQueryParameters40 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters40(instance);
        }
        public FaketestqueryparamtersPutQueryParameters41 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters41(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters43 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters27>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters35>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters39> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters43(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters27 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters27(instance);
        }
        public FaketestqueryparamtersPutQueryParameters35 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters35(instance);
        }
        public FaketestqueryparamtersPutQueryParameters39 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters39(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters44 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters28>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters36>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters40>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters43> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters44(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters28 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters28(instance);
        }
        public FaketestqueryparamtersPutQueryParameters36 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters36(instance);
        }
        public FaketestqueryparamtersPutQueryParameters40 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters40(instance);
        }
        public FaketestqueryparamtersPutQueryParameters43 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters43(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters45 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters29>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters37>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters41>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters43> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters45(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters29 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters29(instance);
        }
        public FaketestqueryparamtersPutQueryParameters37 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters37(instance);
        }
        public FaketestqueryparamtersPutQueryParameters41 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters41(instance);
        }
        public FaketestqueryparamtersPutQueryParameters43 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters43(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters46 implements SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters30>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters38>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters42>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters44>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters45> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters46(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters30 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters30(instance);
        }
        public FaketestqueryparamtersPutQueryParameters38 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters38(instance);
        }
        public FaketestqueryparamtersPutQueryParameters42 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters42(instance);
        }
        public FaketestqueryparamtersPutQueryParameters44 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters44(instance);
        }
        public FaketestqueryparamtersPutQueryParameters45 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters45(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters47 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters15> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters47(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters15 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters15(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters48 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters16>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters47> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters48(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters16 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters16(instance);
        }
        public FaketestqueryparamtersPutQueryParameters47 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters47(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters49 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters17>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters47> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters49(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters17 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters17(instance);
        }
        public FaketestqueryparamtersPutQueryParameters47 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters47(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters50 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters18>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters48>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters49> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters50(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters18 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters18(instance);
        }
        public FaketestqueryparamtersPutQueryParameters48 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters48(instance);
        }
        public FaketestqueryparamtersPutQueryParameters49 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters49(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters51 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters19>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters47> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters51(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters19 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters19(instance);
        }
        public FaketestqueryparamtersPutQueryParameters47 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters47(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters52 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters20>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters48>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters51> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters52(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters20 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters20(instance);
        }
        public FaketestqueryparamtersPutQueryParameters48 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters48(instance);
        }
        public FaketestqueryparamtersPutQueryParameters51 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters51(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters53 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters21>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters49>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters51> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters53(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters21 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters21(instance);
        }
        public FaketestqueryparamtersPutQueryParameters49 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters49(instance);
        }
        public FaketestqueryparamtersPutQueryParameters51 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters51(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters54 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters22>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters50>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters52>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters53> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters54(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters22 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters22(instance);
        }
        public FaketestqueryparamtersPutQueryParameters50 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters50(instance);
        }
        public FaketestqueryparamtersPutQueryParameters52 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters52(instance);
        }
        public FaketestqueryparamtersPutQueryParameters53 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters53(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters55 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters23>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters47> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters55(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters23 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters23(instance);
        }
        public FaketestqueryparamtersPutQueryParameters47 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters47(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters56 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters24>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters48>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters55> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters56(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters24 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters24(instance);
        }
        public FaketestqueryparamtersPutQueryParameters48 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters48(instance);
        }
        public FaketestqueryparamtersPutQueryParameters55 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters55(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters57 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters25>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters49>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters55> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters57(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters25 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters25(instance);
        }
        public FaketestqueryparamtersPutQueryParameters49 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters49(instance);
        }
        public FaketestqueryparamtersPutQueryParameters55 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters55(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters58 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters26>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters50>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters56>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters57> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters58(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters26 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters26(instance);
        }
        public FaketestqueryparamtersPutQueryParameters50 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters50(instance);
        }
        public FaketestqueryparamtersPutQueryParameters56 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters56(instance);
        }
        public FaketestqueryparamtersPutQueryParameters57 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters57(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters59 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters27>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters51>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters55> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters59(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters27 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters27(instance);
        }
        public FaketestqueryparamtersPutQueryParameters51 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters51(instance);
        }
        public FaketestqueryparamtersPutQueryParameters55 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters55(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters60 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters28>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters52>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters56>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters59> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters60(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters28 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters28(instance);
        }
        public FaketestqueryparamtersPutQueryParameters52 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters52(instance);
        }
        public FaketestqueryparamtersPutQueryParameters56 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters56(instance);
        }
        public FaketestqueryparamtersPutQueryParameters59 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters59(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters61 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters29>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters53>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters57>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters59> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters61(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters29 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters29(instance);
        }
        public FaketestqueryparamtersPutQueryParameters53 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters53(instance);
        }
        public FaketestqueryparamtersPutQueryParameters57 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters57(instance);
        }
        public FaketestqueryparamtersPutQueryParameters59 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters59(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters62 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters30>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters54>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters58>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters60>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters61> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters62(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters30 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters30(instance);
        }
        public FaketestqueryparamtersPutQueryParameters54 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters54(instance);
        }
        public FaketestqueryparamtersPutQueryParameters58 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters58(instance);
        }
        public FaketestqueryparamtersPutQueryParameters60 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters60(instance);
        }
        public FaketestqueryparamtersPutQueryParameters61 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters61(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters63 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters31>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters47> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters63(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters31 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters31(instance);
        }
        public FaketestqueryparamtersPutQueryParameters47 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters47(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters64 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters32>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters48>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters63> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters64(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters32 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters32(instance);
        }
        public FaketestqueryparamtersPutQueryParameters48 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters48(instance);
        }
        public FaketestqueryparamtersPutQueryParameters63 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters63(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters65 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters33>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters49>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters63> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters65(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters33 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters33(instance);
        }
        public FaketestqueryparamtersPutQueryParameters49 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters49(instance);
        }
        public FaketestqueryparamtersPutQueryParameters63 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters63(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters66 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters34>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters50>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters64>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters65> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters66(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters34 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters34(instance);
        }
        public FaketestqueryparamtersPutQueryParameters50 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters50(instance);
        }
        public FaketestqueryparamtersPutQueryParameters64 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters64(instance);
        }
        public FaketestqueryparamtersPutQueryParameters65 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters65(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters67 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters35>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters51>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters63> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters67(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters35 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters35(instance);
        }
        public FaketestqueryparamtersPutQueryParameters51 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters51(instance);
        }
        public FaketestqueryparamtersPutQueryParameters63 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters63(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters68 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters36>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters52>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters64>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters67> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters68(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters36 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters36(instance);
        }
        public FaketestqueryparamtersPutQueryParameters52 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters52(instance);
        }
        public FaketestqueryparamtersPutQueryParameters64 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters64(instance);
        }
        public FaketestqueryparamtersPutQueryParameters67 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters67(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters69 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters37>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters53>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters65>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters67> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters69(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters37 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters37(instance);
        }
        public FaketestqueryparamtersPutQueryParameters53 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters53(instance);
        }
        public FaketestqueryparamtersPutQueryParameters65 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters65(instance);
        }
        public FaketestqueryparamtersPutQueryParameters67 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters67(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters70 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters38>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters54>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters66>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters68>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters69> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters70(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters38 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters38(instance);
        }
        public FaketestqueryparamtersPutQueryParameters54 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters54(instance);
        }
        public FaketestqueryparamtersPutQueryParameters66 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters66(instance);
        }
        public FaketestqueryparamtersPutQueryParameters68 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters68(instance);
        }
        public FaketestqueryparamtersPutQueryParameters69 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters69(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters71 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters39>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters55>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters63> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters71(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters39 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters39(instance);
        }
        public FaketestqueryparamtersPutQueryParameters55 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters55(instance);
        }
        public FaketestqueryparamtersPutQueryParameters63 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters63(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters72 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters40>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters56>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters64>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters71> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters72(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters40 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters40(instance);
        }
        public FaketestqueryparamtersPutQueryParameters56 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters56(instance);
        }
        public FaketestqueryparamtersPutQueryParameters64 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters64(instance);
        }
        public FaketestqueryparamtersPutQueryParameters71 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters71(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters73 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters41>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters57>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters65>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters71> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters73(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters41 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters41(instance);
        }
        public FaketestqueryparamtersPutQueryParameters57 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters57(instance);
        }
        public FaketestqueryparamtersPutQueryParameters65 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters65(instance);
        }
        public FaketestqueryparamtersPutQueryParameters71 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters71(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters74 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters42>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters58>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters66>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters72>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters73> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters74(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters42 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters42(instance);
        }
        public FaketestqueryparamtersPutQueryParameters58 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters58(instance);
        }
        public FaketestqueryparamtersPutQueryParameters66 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters66(instance);
        }
        public FaketestqueryparamtersPutQueryParameters72 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters72(instance);
        }
        public FaketestqueryparamtersPutQueryParameters73 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters73(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters75 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters43>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters59>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters67>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters71> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters75(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters43 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters43(instance);
        }
        public FaketestqueryparamtersPutQueryParameters59 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters59(instance);
        }
        public FaketestqueryparamtersPutQueryParameters67 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters67(instance);
        }
        public FaketestqueryparamtersPutQueryParameters71 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters71(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters76 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters44>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters60>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters68>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters72>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters75> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters76(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters44 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters44(instance);
        }
        public FaketestqueryparamtersPutQueryParameters60 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters60(instance);
        }
        public FaketestqueryparamtersPutQueryParameters68 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters68(instance);
        }
        public FaketestqueryparamtersPutQueryParameters72 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters72(instance);
        }
        public FaketestqueryparamtersPutQueryParameters75 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters75(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters77 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters45>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters61>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters69>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters73>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters75> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters77(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters45 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters45(instance);
        }
        public FaketestqueryparamtersPutQueryParameters61 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters61(instance);
        }
        public FaketestqueryparamtersPutQueryParameters69 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters69(instance);
        }
        public FaketestqueryparamtersPutQueryParameters73 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters73(instance);
        }
        public FaketestqueryparamtersPutQueryParameters75 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters75(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParameters13 implements SetterForFaketestqueryparamtersPutQueryParameters4<FaketestqueryparamtersPutQueryParameters46>, SetterForFaketestqueryparamtersPutQueryParameters5<FaketestqueryparamtersPutQueryParameters62>, SetterForFaketestqueryparamtersPutQueryParameters3<FaketestqueryparamtersPutQueryParameters70>, SetterForFaketestqueryparamtersPutQueryParameters6<FaketestqueryparamtersPutQueryParameters74>, SetterForFaketestqueryparamtersPutQueryParameters2<FaketestqueryparamtersPutQueryParameters76>, SetterForFaketestqueryparamtersPutQueryParameters7<FaketestqueryparamtersPutQueryParameters77> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParameters13() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParameters46 getBuilderAfterFaketestqueryparamtersPutQueryParameters4(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters46(instance);
        }
        public FaketestqueryparamtersPutQueryParameters62 getBuilderAfterFaketestqueryparamtersPutQueryParameters5(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters62(instance);
        }
        public FaketestqueryparamtersPutQueryParameters70 getBuilderAfterFaketestqueryparamtersPutQueryParameters3(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters70(instance);
        }
        public FaketestqueryparamtersPutQueryParameters74 getBuilderAfterFaketestqueryparamtersPutQueryParameters6(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters74(instance);
        }
        public FaketestqueryparamtersPutQueryParameters76 getBuilderAfterFaketestqueryparamtersPutQueryParameters2(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters76(instance);
        }
        public FaketestqueryparamtersPutQueryParameters77 getBuilderAfterFaketestqueryparamtersPutQueryParameters7(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParameters77(instance);
        }
    }
    
    
    public sealed interface FaketestqueryparamtersPutQueryParameters1Boxed permits FaketestqueryparamtersPutQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FaketestqueryparamtersPutQueryParameters1BoxedMap(FaketestqueryparamtersPutQueryParameters14 data) implements FaketestqueryparamtersPutQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FaketestqueryparamtersPutQueryParameters1 extends JsonSchema<FaketestqueryparamtersPutQueryParameters1Boxed> implements MapSchemaValidator<FaketestqueryparamtersPutQueryParameters14, FaketestqueryparamtersPutQueryParameters1BoxedMap> {
        private static @Nullable FaketestqueryparamtersPutQueryParameters1 instance = null;
    
        protected FaketestqueryparamtersPutQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("refParam", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("ioutil", Schema1.Schema11.class),
                    new PropertyEntry("context", Schema4.Schema41.class),
                    new PropertyEntry("http", Schema2.Schema21.class),
                    new PropertyEntry("pipe", Schema0.Schema01.class),
                    new PropertyEntry("url", Schema3.Schema31.class)
                ))
                .required(Set.of(
                    "context",
                    "http",
                    "ioutil",
                    "pipe",
                    "refParam",
                    "url"
                ))
                .additionalProperties(FaketestqueryparamtersPutQueryParameters9.class)
            );
        }
    
        public static FaketestqueryparamtersPutQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FaketestqueryparamtersPutQueryParameters1();
            }
            return instance;
        }
        
        public FaketestqueryparamtersPutQueryParameters14 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FaketestqueryparamtersPutQueryParameters14(castProperties);
        }
        
        public FaketestqueryparamtersPutQueryParameters14 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FaketestqueryparamtersPutQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FaketestqueryparamtersPutQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FaketestqueryparamtersPutQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
