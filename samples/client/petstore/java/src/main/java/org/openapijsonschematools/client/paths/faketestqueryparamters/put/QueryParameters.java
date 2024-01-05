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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BaseBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class QueryParameters {
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
    
    
    public static class QueryParametersMap extends FrozenMap<@Nullable Object> {
        protected QueryParametersMap(FrozenMap<@Nullable Object> m) {
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
        public static QueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema4.SchemaList4 context() {
                        @Nullable Object value = get("context");
            if (!(value instanceof Schema4.SchemaList4)) {
                throw new InvalidTypeException("Invalid value stored for context");
            }
            return (Schema4.SchemaList4) value;
        }
        
        public Schema2.SchemaList2 http() {
                        @Nullable Object value = get("http");
            if (!(value instanceof Schema2.SchemaList2)) {
                throw new InvalidTypeException("Invalid value stored for http");
            }
            return (Schema2.SchemaList2) value;
        }
        
        public Schema1.SchemaList1 ioutil() {
                        @Nullable Object value = get("ioutil");
            if (!(value instanceof Schema1.SchemaList1)) {
                throw new InvalidTypeException("Invalid value stored for ioutil");
            }
            return (Schema1.SchemaList1) value;
        }
        
        public Schema0.SchemaList0 pipe() {
                        @Nullable Object value = get("pipe");
            if (!(value instanceof Schema0.SchemaList0)) {
                throw new InvalidTypeException("Invalid value stored for pipe");
            }
            return (Schema0.SchemaList0) value;
        }
        
        public String refParam() {
                        @Nullable Object value = get("refParam");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for refParam");
            }
            return (String) value;
        }
        
        public Schema3.SchemaList3 url() {
                        @Nullable Object value = get("url");
            if (!(value instanceof Schema3.SchemaList3)) {
                throw new InvalidTypeException("Invalid value stored for url");
            }
            return (Schema3.SchemaList3) value;
        }
    }
    
    public interface SetterForContext <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterContext(Map<String, @Nullable Object> instance);
        
        default T context(List<String> value) {
            var instance = getInstance();
            instance.put("context", value);
            return getBuilderAfterContext(instance);
        }
    }
    
    public interface SetterForHttp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterHttp(Map<String, @Nullable Object> instance);
        
        default T http(List<String> value) {
            var instance = getInstance();
            instance.put("http", value);
            return getBuilderAfterHttp(instance);
        }
    }
    
    public interface SetterForIoutil <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIoutil(Map<String, @Nullable Object> instance);
        
        default T ioutil(List<String> value) {
            var instance = getInstance();
            instance.put("ioutil", value);
            return getBuilderAfterIoutil(instance);
        }
    }
    
    public interface SetterForPipe <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPipe(Map<String, @Nullable Object> instance);
        
        default T pipe(List<String> value) {
            var instance = getInstance();
            instance.put("pipe", value);
            return getBuilderAfterPipe(instance);
        }
    }
    
    public interface SetterForRefParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRefParam(Map<String, @Nullable Object> instance);
        
        default T refParam(String value) {
            var instance = getInstance();
            instance.put("refParam", value);
            return getBuilderAfterRefParam(instance);
        }
    }
    
    public interface SetterForUrl <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUrl(Map<String, @Nullable Object> instance);
        
        default T url(List<String> value) {
            var instance = getInstance();
            instance.put("url", value);
            return getBuilderAfterUrl(instance);
        }
    }
    
    public static class QueryParametersMap000000Builder implements BaseBuilder<@Nullable Object> {
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
        public QueryParametersMap000000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class QueryParametersMap000001Builder implements SetterForUrl<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap000010Builder implements SetterForRefParam<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap000011Builder implements SetterForRefParam<QueryParametersMap000001Builder>, SetterForUrl<QueryParametersMap000010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000001Builder(instance);
        }
        public QueryParametersMap000010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000010Builder(instance);
        }
    }
    
    public static class QueryParametersMap000100Builder implements SetterForPipe<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap000101Builder implements SetterForPipe<QueryParametersMap000001Builder>, SetterForUrl<QueryParametersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000001Builder(instance);
        }
        public QueryParametersMap000100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000100Builder(instance);
        }
    }
    
    public static class QueryParametersMap000110Builder implements SetterForPipe<QueryParametersMap000010Builder>, SetterForRefParam<QueryParametersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000010Builder(instance);
        }
        public QueryParametersMap000100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000100Builder(instance);
        }
    }
    
    public static class QueryParametersMap000111Builder implements SetterForPipe<QueryParametersMap000011Builder>, SetterForRefParam<QueryParametersMap000101Builder>, SetterForUrl<QueryParametersMap000110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap000111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000011Builder(instance);
        }
        public QueryParametersMap000101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000101Builder(instance);
        }
        public QueryParametersMap000110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000110Builder(instance);
        }
    }
    
    public static class QueryParametersMap001000Builder implements SetterForIoutil<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap001001Builder implements SetterForIoutil<QueryParametersMap000001Builder>, SetterForUrl<QueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000001Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000001Builder(instance);
        }
        public QueryParametersMap001000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001000Builder(instance);
        }
    }
    
    public static class QueryParametersMap001010Builder implements SetterForIoutil<QueryParametersMap000010Builder>, SetterForRefParam<QueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000010Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000010Builder(instance);
        }
        public QueryParametersMap001000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001000Builder(instance);
        }
    }
    
    public static class QueryParametersMap001011Builder implements SetterForIoutil<QueryParametersMap000011Builder>, SetterForRefParam<QueryParametersMap001001Builder>, SetterForUrl<QueryParametersMap001010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000011Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000011Builder(instance);
        }
        public QueryParametersMap001001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001001Builder(instance);
        }
        public QueryParametersMap001010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001010Builder(instance);
        }
    }
    
    public static class QueryParametersMap001100Builder implements SetterForIoutil<QueryParametersMap000100Builder>, SetterForPipe<QueryParametersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000100Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000100Builder(instance);
        }
        public QueryParametersMap001000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001000Builder(instance);
        }
    }
    
    public static class QueryParametersMap001101Builder implements SetterForIoutil<QueryParametersMap000101Builder>, SetterForPipe<QueryParametersMap001001Builder>, SetterForUrl<QueryParametersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000101Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000101Builder(instance);
        }
        public QueryParametersMap001001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001001Builder(instance);
        }
        public QueryParametersMap001100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001100Builder(instance);
        }
    }
    
    public static class QueryParametersMap001110Builder implements SetterForIoutil<QueryParametersMap000110Builder>, SetterForPipe<QueryParametersMap001010Builder>, SetterForRefParam<QueryParametersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000110Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000110Builder(instance);
        }
        public QueryParametersMap001010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001010Builder(instance);
        }
        public QueryParametersMap001100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001100Builder(instance);
        }
    }
    
    public static class QueryParametersMap001111Builder implements SetterForIoutil<QueryParametersMap000111Builder>, SetterForPipe<QueryParametersMap001011Builder>, SetterForRefParam<QueryParametersMap001101Builder>, SetterForUrl<QueryParametersMap001110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap001111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000111Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000111Builder(instance);
        }
        public QueryParametersMap001011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001011Builder(instance);
        }
        public QueryParametersMap001101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001101Builder(instance);
        }
        public QueryParametersMap001110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001110Builder(instance);
        }
    }
    
    public static class QueryParametersMap010000Builder implements SetterForHttp<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap010001Builder implements SetterForHttp<QueryParametersMap000001Builder>, SetterForUrl<QueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000001Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000001Builder(instance);
        }
        public QueryParametersMap010000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010000Builder(instance);
        }
    }
    
    public static class QueryParametersMap010010Builder implements SetterForHttp<QueryParametersMap000010Builder>, SetterForRefParam<QueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000010Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000010Builder(instance);
        }
        public QueryParametersMap010000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010000Builder(instance);
        }
    }
    
    public static class QueryParametersMap010011Builder implements SetterForHttp<QueryParametersMap000011Builder>, SetterForRefParam<QueryParametersMap010001Builder>, SetterForUrl<QueryParametersMap010010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000011Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000011Builder(instance);
        }
        public QueryParametersMap010001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010001Builder(instance);
        }
        public QueryParametersMap010010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010010Builder(instance);
        }
    }
    
    public static class QueryParametersMap010100Builder implements SetterForHttp<QueryParametersMap000100Builder>, SetterForPipe<QueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000100Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000100Builder(instance);
        }
        public QueryParametersMap010000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010000Builder(instance);
        }
    }
    
    public static class QueryParametersMap010101Builder implements SetterForHttp<QueryParametersMap000101Builder>, SetterForPipe<QueryParametersMap010001Builder>, SetterForUrl<QueryParametersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000101Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000101Builder(instance);
        }
        public QueryParametersMap010001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010001Builder(instance);
        }
        public QueryParametersMap010100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010100Builder(instance);
        }
    }
    
    public static class QueryParametersMap010110Builder implements SetterForHttp<QueryParametersMap000110Builder>, SetterForPipe<QueryParametersMap010010Builder>, SetterForRefParam<QueryParametersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000110Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000110Builder(instance);
        }
        public QueryParametersMap010010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010010Builder(instance);
        }
        public QueryParametersMap010100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010100Builder(instance);
        }
    }
    
    public static class QueryParametersMap010111Builder implements SetterForHttp<QueryParametersMap000111Builder>, SetterForPipe<QueryParametersMap010011Builder>, SetterForRefParam<QueryParametersMap010101Builder>, SetterForUrl<QueryParametersMap010110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap010111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000111Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000111Builder(instance);
        }
        public QueryParametersMap010011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010011Builder(instance);
        }
        public QueryParametersMap010101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010101Builder(instance);
        }
        public QueryParametersMap010110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010110Builder(instance);
        }
    }
    
    public static class QueryParametersMap011000Builder implements SetterForHttp<QueryParametersMap001000Builder>, SetterForIoutil<QueryParametersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001000Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001000Builder(instance);
        }
        public QueryParametersMap010000Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010000Builder(instance);
        }
    }
    
    public static class QueryParametersMap011001Builder implements SetterForHttp<QueryParametersMap001001Builder>, SetterForIoutil<QueryParametersMap010001Builder>, SetterForUrl<QueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001001Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001001Builder(instance);
        }
        public QueryParametersMap010001Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010001Builder(instance);
        }
        public QueryParametersMap011000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011000Builder(instance);
        }
    }
    
    public static class QueryParametersMap011010Builder implements SetterForHttp<QueryParametersMap001010Builder>, SetterForIoutil<QueryParametersMap010010Builder>, SetterForRefParam<QueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001010Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001010Builder(instance);
        }
        public QueryParametersMap010010Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010010Builder(instance);
        }
        public QueryParametersMap011000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011000Builder(instance);
        }
    }
    
    public static class QueryParametersMap011011Builder implements SetterForHttp<QueryParametersMap001011Builder>, SetterForIoutil<QueryParametersMap010011Builder>, SetterForRefParam<QueryParametersMap011001Builder>, SetterForUrl<QueryParametersMap011010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001011Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001011Builder(instance);
        }
        public QueryParametersMap010011Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010011Builder(instance);
        }
        public QueryParametersMap011001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011001Builder(instance);
        }
        public QueryParametersMap011010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011010Builder(instance);
        }
    }
    
    public static class QueryParametersMap011100Builder implements SetterForHttp<QueryParametersMap001100Builder>, SetterForIoutil<QueryParametersMap010100Builder>, SetterForPipe<QueryParametersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001100Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001100Builder(instance);
        }
        public QueryParametersMap010100Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010100Builder(instance);
        }
        public QueryParametersMap011000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011000Builder(instance);
        }
    }
    
    public static class QueryParametersMap011101Builder implements SetterForHttp<QueryParametersMap001101Builder>, SetterForIoutil<QueryParametersMap010101Builder>, SetterForPipe<QueryParametersMap011001Builder>, SetterForUrl<QueryParametersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001101Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001101Builder(instance);
        }
        public QueryParametersMap010101Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010101Builder(instance);
        }
        public QueryParametersMap011001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011001Builder(instance);
        }
        public QueryParametersMap011100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011100Builder(instance);
        }
    }
    
    public static class QueryParametersMap011110Builder implements SetterForHttp<QueryParametersMap001110Builder>, SetterForIoutil<QueryParametersMap010110Builder>, SetterForPipe<QueryParametersMap011010Builder>, SetterForRefParam<QueryParametersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001110Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001110Builder(instance);
        }
        public QueryParametersMap010110Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010110Builder(instance);
        }
        public QueryParametersMap011010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011010Builder(instance);
        }
        public QueryParametersMap011100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011100Builder(instance);
        }
    }
    
    public static class QueryParametersMap011111Builder implements SetterForHttp<QueryParametersMap001111Builder>, SetterForIoutil<QueryParametersMap010111Builder>, SetterForPipe<QueryParametersMap011011Builder>, SetterForRefParam<QueryParametersMap011101Builder>, SetterForUrl<QueryParametersMap011110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap011111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001111Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001111Builder(instance);
        }
        public QueryParametersMap010111Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010111Builder(instance);
        }
        public QueryParametersMap011011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011011Builder(instance);
        }
        public QueryParametersMap011101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011101Builder(instance);
        }
        public QueryParametersMap011110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011110Builder(instance);
        }
    }
    
    public static class QueryParametersMap100000Builder implements SetterForContext<QueryParametersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000000Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000000Builder(instance);
        }
    }
    
    public static class QueryParametersMap100001Builder implements SetterForContext<QueryParametersMap000001Builder>, SetterForUrl<QueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000001Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000001Builder(instance);
        }
        public QueryParametersMap100000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100000Builder(instance);
        }
    }
    
    public static class QueryParametersMap100010Builder implements SetterForContext<QueryParametersMap000010Builder>, SetterForRefParam<QueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000010Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000010Builder(instance);
        }
        public QueryParametersMap100000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100000Builder(instance);
        }
    }
    
    public static class QueryParametersMap100011Builder implements SetterForContext<QueryParametersMap000011Builder>, SetterForRefParam<QueryParametersMap100001Builder>, SetterForUrl<QueryParametersMap100010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000011Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000011Builder(instance);
        }
        public QueryParametersMap100001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100001Builder(instance);
        }
        public QueryParametersMap100010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100010Builder(instance);
        }
    }
    
    public static class QueryParametersMap100100Builder implements SetterForContext<QueryParametersMap000100Builder>, SetterForPipe<QueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000100Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000100Builder(instance);
        }
        public QueryParametersMap100000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100000Builder(instance);
        }
    }
    
    public static class QueryParametersMap100101Builder implements SetterForContext<QueryParametersMap000101Builder>, SetterForPipe<QueryParametersMap100001Builder>, SetterForUrl<QueryParametersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000101Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000101Builder(instance);
        }
        public QueryParametersMap100001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100001Builder(instance);
        }
        public QueryParametersMap100100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100100Builder(instance);
        }
    }
    
    public static class QueryParametersMap100110Builder implements SetterForContext<QueryParametersMap000110Builder>, SetterForPipe<QueryParametersMap100010Builder>, SetterForRefParam<QueryParametersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000110Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000110Builder(instance);
        }
        public QueryParametersMap100010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100010Builder(instance);
        }
        public QueryParametersMap100100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100100Builder(instance);
        }
    }
    
    public static class QueryParametersMap100111Builder implements SetterForContext<QueryParametersMap000111Builder>, SetterForPipe<QueryParametersMap100011Builder>, SetterForRefParam<QueryParametersMap100101Builder>, SetterForUrl<QueryParametersMap100110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap100111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap000111Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap000111Builder(instance);
        }
        public QueryParametersMap100011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100011Builder(instance);
        }
        public QueryParametersMap100101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100101Builder(instance);
        }
        public QueryParametersMap100110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100110Builder(instance);
        }
    }
    
    public static class QueryParametersMap101000Builder implements SetterForContext<QueryParametersMap001000Builder>, SetterForIoutil<QueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001000Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001000Builder(instance);
        }
        public QueryParametersMap100000Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100000Builder(instance);
        }
    }
    
    public static class QueryParametersMap101001Builder implements SetterForContext<QueryParametersMap001001Builder>, SetterForIoutil<QueryParametersMap100001Builder>, SetterForUrl<QueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001001Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001001Builder(instance);
        }
        public QueryParametersMap100001Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100001Builder(instance);
        }
        public QueryParametersMap101000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101000Builder(instance);
        }
    }
    
    public static class QueryParametersMap101010Builder implements SetterForContext<QueryParametersMap001010Builder>, SetterForIoutil<QueryParametersMap100010Builder>, SetterForRefParam<QueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001010Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001010Builder(instance);
        }
        public QueryParametersMap100010Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100010Builder(instance);
        }
        public QueryParametersMap101000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101000Builder(instance);
        }
    }
    
    public static class QueryParametersMap101011Builder implements SetterForContext<QueryParametersMap001011Builder>, SetterForIoutil<QueryParametersMap100011Builder>, SetterForRefParam<QueryParametersMap101001Builder>, SetterForUrl<QueryParametersMap101010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001011Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001011Builder(instance);
        }
        public QueryParametersMap100011Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100011Builder(instance);
        }
        public QueryParametersMap101001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101001Builder(instance);
        }
        public QueryParametersMap101010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101010Builder(instance);
        }
    }
    
    public static class QueryParametersMap101100Builder implements SetterForContext<QueryParametersMap001100Builder>, SetterForIoutil<QueryParametersMap100100Builder>, SetterForPipe<QueryParametersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001100Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001100Builder(instance);
        }
        public QueryParametersMap100100Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100100Builder(instance);
        }
        public QueryParametersMap101000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101000Builder(instance);
        }
    }
    
    public static class QueryParametersMap101101Builder implements SetterForContext<QueryParametersMap001101Builder>, SetterForIoutil<QueryParametersMap100101Builder>, SetterForPipe<QueryParametersMap101001Builder>, SetterForUrl<QueryParametersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001101Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001101Builder(instance);
        }
        public QueryParametersMap100101Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100101Builder(instance);
        }
        public QueryParametersMap101001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101001Builder(instance);
        }
        public QueryParametersMap101100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101100Builder(instance);
        }
    }
    
    public static class QueryParametersMap101110Builder implements SetterForContext<QueryParametersMap001110Builder>, SetterForIoutil<QueryParametersMap100110Builder>, SetterForPipe<QueryParametersMap101010Builder>, SetterForRefParam<QueryParametersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001110Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001110Builder(instance);
        }
        public QueryParametersMap100110Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100110Builder(instance);
        }
        public QueryParametersMap101010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101010Builder(instance);
        }
        public QueryParametersMap101100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101100Builder(instance);
        }
    }
    
    public static class QueryParametersMap101111Builder implements SetterForContext<QueryParametersMap001111Builder>, SetterForIoutil<QueryParametersMap100111Builder>, SetterForPipe<QueryParametersMap101011Builder>, SetterForRefParam<QueryParametersMap101101Builder>, SetterForUrl<QueryParametersMap101110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap101111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap001111Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap001111Builder(instance);
        }
        public QueryParametersMap100111Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100111Builder(instance);
        }
        public QueryParametersMap101011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101011Builder(instance);
        }
        public QueryParametersMap101101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101101Builder(instance);
        }
        public QueryParametersMap101110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101110Builder(instance);
        }
    }
    
    public static class QueryParametersMap110000Builder implements SetterForContext<QueryParametersMap010000Builder>, SetterForHttp<QueryParametersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010000Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010000Builder(instance);
        }
        public QueryParametersMap100000Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100000Builder(instance);
        }
    }
    
    public static class QueryParametersMap110001Builder implements SetterForContext<QueryParametersMap010001Builder>, SetterForHttp<QueryParametersMap100001Builder>, SetterForUrl<QueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010001Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010001Builder(instance);
        }
        public QueryParametersMap100001Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100001Builder(instance);
        }
        public QueryParametersMap110000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110000Builder(instance);
        }
    }
    
    public static class QueryParametersMap110010Builder implements SetterForContext<QueryParametersMap010010Builder>, SetterForHttp<QueryParametersMap100010Builder>, SetterForRefParam<QueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010010Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010010Builder(instance);
        }
        public QueryParametersMap100010Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100010Builder(instance);
        }
        public QueryParametersMap110000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110000Builder(instance);
        }
    }
    
    public static class QueryParametersMap110011Builder implements SetterForContext<QueryParametersMap010011Builder>, SetterForHttp<QueryParametersMap100011Builder>, SetterForRefParam<QueryParametersMap110001Builder>, SetterForUrl<QueryParametersMap110010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010011Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010011Builder(instance);
        }
        public QueryParametersMap100011Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100011Builder(instance);
        }
        public QueryParametersMap110001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110001Builder(instance);
        }
        public QueryParametersMap110010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110010Builder(instance);
        }
    }
    
    public static class QueryParametersMap110100Builder implements SetterForContext<QueryParametersMap010100Builder>, SetterForHttp<QueryParametersMap100100Builder>, SetterForPipe<QueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010100Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010100Builder(instance);
        }
        public QueryParametersMap100100Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100100Builder(instance);
        }
        public QueryParametersMap110000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110000Builder(instance);
        }
    }
    
    public static class QueryParametersMap110101Builder implements SetterForContext<QueryParametersMap010101Builder>, SetterForHttp<QueryParametersMap100101Builder>, SetterForPipe<QueryParametersMap110001Builder>, SetterForUrl<QueryParametersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010101Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010101Builder(instance);
        }
        public QueryParametersMap100101Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100101Builder(instance);
        }
        public QueryParametersMap110001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110001Builder(instance);
        }
        public QueryParametersMap110100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110100Builder(instance);
        }
    }
    
    public static class QueryParametersMap110110Builder implements SetterForContext<QueryParametersMap010110Builder>, SetterForHttp<QueryParametersMap100110Builder>, SetterForPipe<QueryParametersMap110010Builder>, SetterForRefParam<QueryParametersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010110Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010110Builder(instance);
        }
        public QueryParametersMap100110Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100110Builder(instance);
        }
        public QueryParametersMap110010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110010Builder(instance);
        }
        public QueryParametersMap110100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110100Builder(instance);
        }
    }
    
    public static class QueryParametersMap110111Builder implements SetterForContext<QueryParametersMap010111Builder>, SetterForHttp<QueryParametersMap100111Builder>, SetterForPipe<QueryParametersMap110011Builder>, SetterForRefParam<QueryParametersMap110101Builder>, SetterForUrl<QueryParametersMap110110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap110111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap010111Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap010111Builder(instance);
        }
        public QueryParametersMap100111Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap100111Builder(instance);
        }
        public QueryParametersMap110011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110011Builder(instance);
        }
        public QueryParametersMap110101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110101Builder(instance);
        }
        public QueryParametersMap110110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110110Builder(instance);
        }
    }
    
    public static class QueryParametersMap111000Builder implements SetterForContext<QueryParametersMap011000Builder>, SetterForHttp<QueryParametersMap101000Builder>, SetterForIoutil<QueryParametersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011000Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011000Builder(instance);
        }
        public QueryParametersMap101000Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101000Builder(instance);
        }
        public QueryParametersMap110000Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110000Builder(instance);
        }
    }
    
    public static class QueryParametersMap111001Builder implements SetterForContext<QueryParametersMap011001Builder>, SetterForHttp<QueryParametersMap101001Builder>, SetterForIoutil<QueryParametersMap110001Builder>, SetterForUrl<QueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011001Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011001Builder(instance);
        }
        public QueryParametersMap101001Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101001Builder(instance);
        }
        public QueryParametersMap110001Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110001Builder(instance);
        }
        public QueryParametersMap111000Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111000Builder(instance);
        }
    }
    
    public static class QueryParametersMap111010Builder implements SetterForContext<QueryParametersMap011010Builder>, SetterForHttp<QueryParametersMap101010Builder>, SetterForIoutil<QueryParametersMap110010Builder>, SetterForRefParam<QueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011010Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011010Builder(instance);
        }
        public QueryParametersMap101010Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101010Builder(instance);
        }
        public QueryParametersMap110010Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110010Builder(instance);
        }
        public QueryParametersMap111000Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111000Builder(instance);
        }
    }
    
    public static class QueryParametersMap111011Builder implements SetterForContext<QueryParametersMap011011Builder>, SetterForHttp<QueryParametersMap101011Builder>, SetterForIoutil<QueryParametersMap110011Builder>, SetterForRefParam<QueryParametersMap111001Builder>, SetterForUrl<QueryParametersMap111010Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011011Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011011Builder(instance);
        }
        public QueryParametersMap101011Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101011Builder(instance);
        }
        public QueryParametersMap110011Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110011Builder(instance);
        }
        public QueryParametersMap111001Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111001Builder(instance);
        }
        public QueryParametersMap111010Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111010Builder(instance);
        }
    }
    
    public static class QueryParametersMap111100Builder implements SetterForContext<QueryParametersMap011100Builder>, SetterForHttp<QueryParametersMap101100Builder>, SetterForIoutil<QueryParametersMap110100Builder>, SetterForPipe<QueryParametersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011100Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011100Builder(instance);
        }
        public QueryParametersMap101100Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101100Builder(instance);
        }
        public QueryParametersMap110100Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110100Builder(instance);
        }
        public QueryParametersMap111000Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111000Builder(instance);
        }
    }
    
    public static class QueryParametersMap111101Builder implements SetterForContext<QueryParametersMap011101Builder>, SetterForHttp<QueryParametersMap101101Builder>, SetterForIoutil<QueryParametersMap110101Builder>, SetterForPipe<QueryParametersMap111001Builder>, SetterForUrl<QueryParametersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011101Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011101Builder(instance);
        }
        public QueryParametersMap101101Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101101Builder(instance);
        }
        public QueryParametersMap110101Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110101Builder(instance);
        }
        public QueryParametersMap111001Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111001Builder(instance);
        }
        public QueryParametersMap111100Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111100Builder(instance);
        }
    }
    
    public static class QueryParametersMap111110Builder implements SetterForContext<QueryParametersMap011110Builder>, SetterForHttp<QueryParametersMap101110Builder>, SetterForIoutil<QueryParametersMap110110Builder>, SetterForPipe<QueryParametersMap111010Builder>, SetterForRefParam<QueryParametersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap111110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011110Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011110Builder(instance);
        }
        public QueryParametersMap101110Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101110Builder(instance);
        }
        public QueryParametersMap110110Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110110Builder(instance);
        }
        public QueryParametersMap111010Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111010Builder(instance);
        }
        public QueryParametersMap111100Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111100Builder(instance);
        }
    }
    
    public static class QueryParametersMapBuilder implements SetterForContext<QueryParametersMap011111Builder>, SetterForHttp<QueryParametersMap101111Builder>, SetterForIoutil<QueryParametersMap110111Builder>, SetterForPipe<QueryParametersMap111011Builder>, SetterForRefParam<QueryParametersMap111101Builder>, SetterForUrl<QueryParametersMap111110Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap011111Builder getBuilderAfterContext(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap011111Builder(instance);
        }
        public QueryParametersMap101111Builder getBuilderAfterHttp(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap101111Builder(instance);
        }
        public QueryParametersMap110111Builder getBuilderAfterIoutil(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap110111Builder(instance);
        }
        public QueryParametersMap111011Builder getBuilderAfterPipe(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111011Builder(instance);
        }
        public QueryParametersMap111101Builder getBuilderAfterRefParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111101Builder(instance);
        }
        public QueryParametersMap111110Builder getBuilderAfterUrl(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap111110Builder(instance);
        }
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements MapSchemaValidator<QueryParametersMap> {
        private static @Nullable QueryParameters1 instance = null;
    
        protected QueryParameters1() {
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
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static QueryParameters1 getInstance() {
            if (instance == null) {
                instance = new QueryParameters1();
            }
            return instance;
        }
        
        public QueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new QueryParametersMap(castProperties);
        }
        
        public QueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    }

}
