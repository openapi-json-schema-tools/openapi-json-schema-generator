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
    
    
    public static class FaketestqueryparamtersPutadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FaketestqueryparamtersPutadditionalProperties instance = null;
        public static FaketestqueryparamtersPutadditionalProperties getInstance() {
            if (instance == null) {
                instance = new FaketestqueryparamtersPutadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class FaketestqueryparamtersPutQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected FaketestqueryparamtersPutQueryParametersMap(FrozenMap<@Nullable Object> m) {
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
        public static FaketestqueryparamtersPutQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public interface SetterForFaketestqueryparamtersPutcontext <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance);
        
        default T context(List<String> value) {
            var instance = getInstance();
            instance.put("context", value);
            return getBuilderAfterFaketestqueryparamtersPutcontext(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPuthttp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance);
        
        default T http(List<String> value) {
            var instance = getInstance();
            instance.put("http", value);
            return getBuilderAfterFaketestqueryparamtersPuthttp(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutioutil <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance);
        
        default T ioutil(List<String> value) {
            var instance = getInstance();
            instance.put("ioutil", value);
            return getBuilderAfterFaketestqueryparamtersPutioutil(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutpipe <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance);
        
        default T pipe(List<String> value) {
            var instance = getInstance();
            instance.put("pipe", value);
            return getBuilderAfterFaketestqueryparamtersPutpipe(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPutrefParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance);
        
        default T refParam(String value) {
            var instance = getInstance();
            instance.put("refParam", value);
            return getBuilderAfterFaketestqueryparamtersPutrefParam(instance);
        }
    }
    
    public interface SetterForFaketestqueryparamtersPuturl <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance);
        
        default T url(List<String> value) {
            var instance = getInstance();
            instance.put("url", value);
            return getBuilderAfterFaketestqueryparamtersPuturl(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000000Builder implements GenericBuilder<Map<String, @Nullable Object>> {
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
        public FaketestqueryparamtersPutQueryParametersMap000000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000001Builder implements SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000010Builder implements SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000011Builder implements SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap000001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap000010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap000010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000100Builder implements SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000101Builder implements SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap000001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap000100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000110Builder implements SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap000010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap000100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap000111Builder implements SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap000011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap000101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap000110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap000111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap000101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap000110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001000Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001001Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000001Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001010Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000010Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001011Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap001001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap001010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000011Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001100Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000100Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001101Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap001001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000101Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001110Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap001010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000110Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap001111Builder implements SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap000111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap001011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap001101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap001110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap001111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000111Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap001110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010000Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010001Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000001Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010010Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000010Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010011Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap010001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap010010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000011Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010100Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000100Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010101Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap010001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000101Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010110Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap010010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000110Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap010111Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap000111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap010011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap010101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap010110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap010111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000111Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011000Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001000Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001000Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001000Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010000Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011001Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001001Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001001Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010001Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011010Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001010Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001010Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010010Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011011Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001011Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap011001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap011010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001011Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010011Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011100Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001100Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001100Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010100Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011101Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001101Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap011001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001101Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010101Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011110Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001110Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap011010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001110Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010110Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap011111Builder implements SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap001111Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap010111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap011011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap011101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap011110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap011111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001111Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap010111Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap011110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100000Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000000Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100001Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000001Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100010Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000010Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100011Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap100001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap100010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000011Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100100Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000100Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100101Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap100001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000101Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100110Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap100010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000110Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap100111Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap000111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap100011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap100101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap100110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap100111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap000111Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap000111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101000Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001000Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001000Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001000Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100000Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101001Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001001Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001001Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100001Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101010Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001010Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001010Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100010Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101011Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001011Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap101001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap101010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001011Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100011Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101100Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001100Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001100Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100100Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101101Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001101Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap101001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001101Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100101Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101110Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001110Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap101010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001110Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100110Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap101111Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap001111Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap100111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap101011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap101101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap101110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap101111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap001111Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap001111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100111Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110000Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010000Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010000Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010000Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100000Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110001Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010001Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010001Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100001Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110010Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010010Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010010Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100010Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110011Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010011Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap110001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap110010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010011Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100011Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110100Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010100Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010100Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100100Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110101Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010101Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap110001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010101Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100101Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110110Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010110Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap110010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010110Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100110Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap110111Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap010111Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap100111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap110011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap110101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap110110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap110111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap010111Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap010111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap100111Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap100111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110110Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111000Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011000Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101000Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011000Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011000Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101000Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101000Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110000Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111001Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011001Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101001Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011001Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101001Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110001Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111000Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111010Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011010Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101010Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011010Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101010Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110010Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111000Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111011Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011011Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101011Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap111001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap111010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011011Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101011Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110011Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111001Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111010Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111010Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111100Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011100Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101100Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110100Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011100Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101100Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110100Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110100Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111000Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111000Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111101Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011101Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101101Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110101Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap111001Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011101Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101101Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110101Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111001Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111001Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111100Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMap111110Builder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011110Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101110Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110110Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap111010Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMap111110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011110Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101110Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110110Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110110Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111010Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111010Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111100Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111100Builder(instance);
        }
    }
    
    public static class FaketestqueryparamtersPutQueryParametersMapBuilder implements SetterForFaketestqueryparamtersPutcontext<FaketestqueryparamtersPutQueryParametersMap011111Builder>, SetterForFaketestqueryparamtersPuthttp<FaketestqueryparamtersPutQueryParametersMap101111Builder>, SetterForFaketestqueryparamtersPutioutil<FaketestqueryparamtersPutQueryParametersMap110111Builder>, SetterForFaketestqueryparamtersPutpipe<FaketestqueryparamtersPutQueryParametersMap111011Builder>, SetterForFaketestqueryparamtersPutrefParam<FaketestqueryparamtersPutQueryParametersMap111101Builder>, SetterForFaketestqueryparamtersPuturl<FaketestqueryparamtersPutQueryParametersMap111110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FaketestqueryparamtersPutQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FaketestqueryparamtersPutQueryParametersMap011111Builder getBuilderAfterFaketestqueryparamtersPutcontext(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap011111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap101111Builder getBuilderAfterFaketestqueryparamtersPuthttp(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap101111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap110111Builder getBuilderAfterFaketestqueryparamtersPutioutil(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap110111Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111011Builder getBuilderAfterFaketestqueryparamtersPutpipe(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111011Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111101Builder getBuilderAfterFaketestqueryparamtersPutrefParam(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111101Builder(instance);
        }
        public FaketestqueryparamtersPutQueryParametersMap111110Builder getBuilderAfterFaketestqueryparamtersPuturl(Map<String, @Nullable Object> instance) {
            return new FaketestqueryparamtersPutQueryParametersMap111110Builder(instance);
        }
    }
    
    
    public sealed interface FaketestqueryparamtersPutQueryParameters1Boxed permits FaketestqueryparamtersPutQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FaketestqueryparamtersPutQueryParameters1BoxedMap(FaketestqueryparamtersPutQueryParametersMap data) implements FaketestqueryparamtersPutQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FaketestqueryparamtersPutQueryParameters1 extends JsonSchema<FaketestqueryparamtersPutQueryParameters1Boxed> implements MapSchemaValidator<FaketestqueryparamtersPutQueryParametersMap, FaketestqueryparamtersPutQueryParameters1BoxedMap> {
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
                .additionalProperties(FaketestqueryparamtersPutadditionalProperties.class)
            );
        }
    
        public static FaketestqueryparamtersPutQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FaketestqueryparamtersPutQueryParameters1();
            }
            return instance;
        }
        
        public FaketestqueryparamtersPutQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FaketestqueryparamtersPutQueryParametersMap(castProperties);
        }
        
        public FaketestqueryparamtersPutQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
