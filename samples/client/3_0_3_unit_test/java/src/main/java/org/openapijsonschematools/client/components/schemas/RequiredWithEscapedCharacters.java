package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class RequiredWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class RequiredWithEscapedCharactersMap extends FrozenMap<@Nullable Object> {
        protected RequiredWithEscapedCharactersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "foo\tbar",
            "foo\nbar",
            "foo\fbar",
            "foo\rbar",
            "foo\"bar",
            "foo\\bar"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static RequiredWithEscapedCharactersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return RequiredWithEscapedCharacters1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForFootbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFootbar(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\tbar", null);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
    }
    
    public interface SetterForFoonbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoonbar(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\nbar", null);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
    }
    
    public interface SetterForFoofbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoofbar(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\fbar", null);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
    }
    
    public interface SetterForFoorbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoorbar(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\rbar", null);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
    }
    
    public interface SetterForFoobar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\"bar", null);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
    }
    
    public interface SetterForFoobar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar1(Map<String, @Nullable Object> instance);
        
        default T todoFixThis(Void value) {
            var instance = getInstance();
            instance.put("foo\\bar", null);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(boolean value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(String value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(int value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(float value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(long value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(double value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(List<?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T todoFixThis(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000000Builder implements BaseBuilder<@Nullable Object> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000001Builder implements SetterForFoobar1<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000010Builder implements SetterForFoobar<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000011Builder implements SetterForFoobar<RequiredWithEscapedCharactersReqProps000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps000010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps000010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000100Builder implements SetterForFoorbar<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000101Builder implements SetterForFoorbar<RequiredWithEscapedCharactersReqProps000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps000100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000110Builder implements SetterForFoorbar<RequiredWithEscapedCharactersReqProps000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps000100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps000111Builder implements SetterForFoorbar<RequiredWithEscapedCharactersReqProps000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps000101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps000110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps000111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps000101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps000110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001000Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001001Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001010Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001011Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps001010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001100Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001101Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001110Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps001010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps001111Builder implements SetterForFoofbar<RequiredWithEscapedCharactersReqProps000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps001011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps001101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps001110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps001111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps001110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010000Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010001Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010010Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010011Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps010010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010100Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010101Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010110Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps010111Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps010101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps010110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps010111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011000Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001000Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011001Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011010Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011011Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps011010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011100Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011101Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011110Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps011010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps011111Builder implements SetterForFoonbar<RequiredWithEscapedCharactersReqProps001111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps010111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps011011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps011101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps011110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps011111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps010111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps011110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100000Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100001Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100010Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100011Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps100010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100100Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100101Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100110Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps100111Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps100101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps100110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps100111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps000111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps000111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101000Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001000Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101001Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101010Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101011Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps101010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101100Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101101Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101110Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps101010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps101111Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps001111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps101011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps101101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps101110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps101111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps001111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps001111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110000Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010000Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110001Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110010Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110011Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps110010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110100Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110101Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110110Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps110111Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps010111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps110101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps110110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps110111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps010111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps010111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps100111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps100111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111000Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011000Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101000Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111001Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111010Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111011Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps111010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111100Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110100Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111101Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111001Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111110Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps111010Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110110Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111010Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersReqProps111111Builder implements SetterForFootbar<RequiredWithEscapedCharactersReqProps011111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersReqProps101111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersReqProps110111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersReqProps111011Builder>, SetterForFoobar<RequiredWithEscapedCharactersReqProps111101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersReqProps111110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersReqProps111111Builder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersReqProps011111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps011111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps101111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps101111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps110111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps110111Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111011Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111101Builder(instance);
        }
        public RequiredWithEscapedCharactersReqProps111110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersReqProps111110Builder(instance);
        }
    }
    public static class RequiredWithEscapedCharactersMapBuilder {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class RequiredWithEscapedCharacters1 extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<FrozenList<@Nullable Object>>, MapSchemaValidator<RequiredWithEscapedCharactersMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable RequiredWithEscapedCharacters1 instance = null;
    
        protected RequiredWithEscapedCharacters1() {
            super(new JsonSchemaInfo()
                .required(Set.of(
                    "foo\tbar",
                    "foo\nbar",
                    "foo\fbar",
                    "foo\rbar",
                    "foo\"bar",
                    "foo\\bar"
                ))
            );
        }
    
        public static RequiredWithEscapedCharacters1 getInstance() {
            if (instance == null) {
                instance = new RequiredWithEscapedCharacters1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public RequiredWithEscapedCharactersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new RequiredWithEscapedCharactersMap(castProperties);
        }
        
        public RequiredWithEscapedCharactersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
}
