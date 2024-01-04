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
import org.openapijsonschematools.client.schemas.BaseBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
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
        
        default T setFooReverseSolidusTbar(Void value) {
            var instance = getInstance();
            instance.put("foo\tbar", null);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(String value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(int value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(float value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(long value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(double value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
    }
    
    public interface SetterForFoonbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoonbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusNbar(Void value) {
            var instance = getInstance();
            instance.put("foo\nbar", null);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(String value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(int value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(float value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(long value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(double value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
    }
    
    public interface SetterForFoofbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoofbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusFbar(Void value) {
            var instance = getInstance();
            instance.put("foo\fbar", null);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(String value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(int value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(float value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(long value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(double value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
    }
    
    public interface SetterForFoorbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoorbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusRbar(Void value) {
            var instance = getInstance();
            instance.put("foo\rbar", null);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(String value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(int value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(float value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(long value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(double value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
    }
    
    public interface SetterForFoobar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusQuotationMarkBar(Void value) {
            var instance = getInstance();
            instance.put("foo\"bar", null);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(boolean value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(String value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(int value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(float value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(long value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(double value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
    }
    
    public interface SetterForFoobar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar1(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusReverseSolidusBar(Void value) {
            var instance = getInstance();
            instance.put("foo\\bar", null);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(boolean value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(String value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(int value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(float value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(long value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(double value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000000Builder extends UnsetAddPropsSetter<RequiredWithEscapedCharacters000000Builder> implements BaseBuilder<@Nullable Object> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "foo\tbar",
            "foo\nbar",
            "foo\fbar",
            "foo\rbar",
            "foo\"bar",
            "foo\\bar"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public RequiredWithEscapedCharacters000000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class RequiredWithEscapedCharacters000001Builder implements SetterForFoobar1<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000010Builder implements SetterForFoobar<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000011Builder implements SetterForFoobar<RequiredWithEscapedCharacters000001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters000010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001Builder(instance);
        }
        public RequiredWithEscapedCharacters000010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000100Builder implements SetterForFoorbar<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000101Builder implements SetterForFoorbar<RequiredWithEscapedCharacters000001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001Builder(instance);
        }
        public RequiredWithEscapedCharacters000100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000110Builder implements SetterForFoorbar<RequiredWithEscapedCharacters000010Builder>, SetterForFoobar<RequiredWithEscapedCharacters000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010Builder(instance);
        }
        public RequiredWithEscapedCharacters000100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000111Builder implements SetterForFoorbar<RequiredWithEscapedCharacters000011Builder>, SetterForFoobar<RequiredWithEscapedCharacters000101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters000110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011Builder(instance);
        }
        public RequiredWithEscapedCharacters000101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101Builder(instance);
        }
        public RequiredWithEscapedCharacters000110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001000Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001001Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001Builder(instance);
        }
        public RequiredWithEscapedCharacters001000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001010Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000010Builder>, SetterForFoobar<RequiredWithEscapedCharacters001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010Builder(instance);
        }
        public RequiredWithEscapedCharacters001000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001011Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000011Builder>, SetterForFoobar<RequiredWithEscapedCharacters001001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters001010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011Builder(instance);
        }
        public RequiredWithEscapedCharacters001001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001Builder(instance);
        }
        public RequiredWithEscapedCharacters001010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001100Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100Builder(instance);
        }
        public RequiredWithEscapedCharacters001000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001101Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters001001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101Builder(instance);
        }
        public RequiredWithEscapedCharacters001001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001Builder(instance);
        }
        public RequiredWithEscapedCharacters001100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001110Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters001010Builder>, SetterForFoobar<RequiredWithEscapedCharacters001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110Builder(instance);
        }
        public RequiredWithEscapedCharacters001010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010Builder(instance);
        }
        public RequiredWithEscapedCharacters001100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001111Builder implements SetterForFoofbar<RequiredWithEscapedCharacters000111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters001011Builder>, SetterForFoobar<RequiredWithEscapedCharacters001101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters001110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111Builder(instance);
        }
        public RequiredWithEscapedCharacters001011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011Builder(instance);
        }
        public RequiredWithEscapedCharacters001101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101Builder(instance);
        }
        public RequiredWithEscapedCharacters001110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010000Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010001Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001Builder(instance);
        }
        public RequiredWithEscapedCharacters010000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010010Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000010Builder>, SetterForFoobar<RequiredWithEscapedCharacters010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010Builder(instance);
        }
        public RequiredWithEscapedCharacters010000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010011Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000011Builder>, SetterForFoobar<RequiredWithEscapedCharacters010001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters010010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011Builder(instance);
        }
        public RequiredWithEscapedCharacters010001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001Builder(instance);
        }
        public RequiredWithEscapedCharacters010010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010100Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100Builder(instance);
        }
        public RequiredWithEscapedCharacters010000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010101Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters010001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101Builder(instance);
        }
        public RequiredWithEscapedCharacters010001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001Builder(instance);
        }
        public RequiredWithEscapedCharacters010100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010110Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters010010Builder>, SetterForFoobar<RequiredWithEscapedCharacters010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110Builder(instance);
        }
        public RequiredWithEscapedCharacters010010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010Builder(instance);
        }
        public RequiredWithEscapedCharacters010100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010111Builder implements SetterForFoonbar<RequiredWithEscapedCharacters000111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters010011Builder>, SetterForFoobar<RequiredWithEscapedCharacters010101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters010110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111Builder(instance);
        }
        public RequiredWithEscapedCharacters010011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011Builder(instance);
        }
        public RequiredWithEscapedCharacters010101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101Builder(instance);
        }
        public RequiredWithEscapedCharacters010110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011000Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001000Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000Builder(instance);
        }
        public RequiredWithEscapedCharacters010000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011001Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001001Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001Builder(instance);
        }
        public RequiredWithEscapedCharacters010001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001Builder(instance);
        }
        public RequiredWithEscapedCharacters011000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011010Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001010Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010010Builder>, SetterForFoobar<RequiredWithEscapedCharacters011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010Builder(instance);
        }
        public RequiredWithEscapedCharacters010010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010Builder(instance);
        }
        public RequiredWithEscapedCharacters011000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011011Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001011Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010011Builder>, SetterForFoobar<RequiredWithEscapedCharacters011001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters011010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011Builder(instance);
        }
        public RequiredWithEscapedCharacters010011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011Builder(instance);
        }
        public RequiredWithEscapedCharacters011001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001Builder(instance);
        }
        public RequiredWithEscapedCharacters011010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011100Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001100Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100Builder(instance);
        }
        public RequiredWithEscapedCharacters010100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100Builder(instance);
        }
        public RequiredWithEscapedCharacters011000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011101Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001101Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters011001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101Builder(instance);
        }
        public RequiredWithEscapedCharacters010101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101Builder(instance);
        }
        public RequiredWithEscapedCharacters011001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001Builder(instance);
        }
        public RequiredWithEscapedCharacters011100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011110Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001110Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters011010Builder>, SetterForFoobar<RequiredWithEscapedCharacters011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110Builder(instance);
        }
        public RequiredWithEscapedCharacters010110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110Builder(instance);
        }
        public RequiredWithEscapedCharacters011010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010Builder(instance);
        }
        public RequiredWithEscapedCharacters011100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011111Builder implements SetterForFoonbar<RequiredWithEscapedCharacters001111Builder>, SetterForFoofbar<RequiredWithEscapedCharacters010111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters011011Builder>, SetterForFoobar<RequiredWithEscapedCharacters011101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters011110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001111Builder(instance);
        }
        public RequiredWithEscapedCharacters010111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010111Builder(instance);
        }
        public RequiredWithEscapedCharacters011011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011011Builder(instance);
        }
        public RequiredWithEscapedCharacters011101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011101Builder(instance);
        }
        public RequiredWithEscapedCharacters011110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100000Builder implements SetterForFootbar<RequiredWithEscapedCharacters000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100001Builder implements SetterForFootbar<RequiredWithEscapedCharacters000001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001Builder(instance);
        }
        public RequiredWithEscapedCharacters100000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100010Builder implements SetterForFootbar<RequiredWithEscapedCharacters000010Builder>, SetterForFoobar<RequiredWithEscapedCharacters100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010Builder(instance);
        }
        public RequiredWithEscapedCharacters100000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100011Builder implements SetterForFootbar<RequiredWithEscapedCharacters000011Builder>, SetterForFoobar<RequiredWithEscapedCharacters100001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters100010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011Builder(instance);
        }
        public RequiredWithEscapedCharacters100001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001Builder(instance);
        }
        public RequiredWithEscapedCharacters100010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100100Builder implements SetterForFootbar<RequiredWithEscapedCharacters000100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100Builder(instance);
        }
        public RequiredWithEscapedCharacters100000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100101Builder implements SetterForFootbar<RequiredWithEscapedCharacters000101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters100001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101Builder(instance);
        }
        public RequiredWithEscapedCharacters100001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001Builder(instance);
        }
        public RequiredWithEscapedCharacters100100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100110Builder implements SetterForFootbar<RequiredWithEscapedCharacters000110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters100010Builder>, SetterForFoobar<RequiredWithEscapedCharacters100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110Builder(instance);
        }
        public RequiredWithEscapedCharacters100010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010Builder(instance);
        }
        public RequiredWithEscapedCharacters100100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100111Builder implements SetterForFootbar<RequiredWithEscapedCharacters000111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters100011Builder>, SetterForFoobar<RequiredWithEscapedCharacters100101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters100110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111Builder(instance);
        }
        public RequiredWithEscapedCharacters100011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011Builder(instance);
        }
        public RequiredWithEscapedCharacters100101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101Builder(instance);
        }
        public RequiredWithEscapedCharacters100110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101000Builder implements SetterForFootbar<RequiredWithEscapedCharacters001000Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000Builder(instance);
        }
        public RequiredWithEscapedCharacters100000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101001Builder implements SetterForFootbar<RequiredWithEscapedCharacters001001Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001Builder(instance);
        }
        public RequiredWithEscapedCharacters100001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001Builder(instance);
        }
        public RequiredWithEscapedCharacters101000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101010Builder implements SetterForFootbar<RequiredWithEscapedCharacters001010Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100010Builder>, SetterForFoobar<RequiredWithEscapedCharacters101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010Builder(instance);
        }
        public RequiredWithEscapedCharacters100010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010Builder(instance);
        }
        public RequiredWithEscapedCharacters101000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101011Builder implements SetterForFootbar<RequiredWithEscapedCharacters001011Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100011Builder>, SetterForFoobar<RequiredWithEscapedCharacters101001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters101010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011Builder(instance);
        }
        public RequiredWithEscapedCharacters100011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011Builder(instance);
        }
        public RequiredWithEscapedCharacters101001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001Builder(instance);
        }
        public RequiredWithEscapedCharacters101010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101100Builder implements SetterForFootbar<RequiredWithEscapedCharacters001100Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100Builder(instance);
        }
        public RequiredWithEscapedCharacters100100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100Builder(instance);
        }
        public RequiredWithEscapedCharacters101000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101101Builder implements SetterForFootbar<RequiredWithEscapedCharacters001101Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters101001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101Builder(instance);
        }
        public RequiredWithEscapedCharacters100101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101Builder(instance);
        }
        public RequiredWithEscapedCharacters101001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001Builder(instance);
        }
        public RequiredWithEscapedCharacters101100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101110Builder implements SetterForFootbar<RequiredWithEscapedCharacters001110Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters101010Builder>, SetterForFoobar<RequiredWithEscapedCharacters101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110Builder(instance);
        }
        public RequiredWithEscapedCharacters100110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110Builder(instance);
        }
        public RequiredWithEscapedCharacters101010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010Builder(instance);
        }
        public RequiredWithEscapedCharacters101100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101111Builder implements SetterForFootbar<RequiredWithEscapedCharacters001111Builder>, SetterForFoofbar<RequiredWithEscapedCharacters100111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters101011Builder>, SetterForFoobar<RequiredWithEscapedCharacters101101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters101110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001111Builder(instance);
        }
        public RequiredWithEscapedCharacters100111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100111Builder(instance);
        }
        public RequiredWithEscapedCharacters101011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101011Builder(instance);
        }
        public RequiredWithEscapedCharacters101101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101101Builder(instance);
        }
        public RequiredWithEscapedCharacters101110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110000Builder implements SetterForFootbar<RequiredWithEscapedCharacters010000Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000Builder(instance);
        }
        public RequiredWithEscapedCharacters100000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110001Builder implements SetterForFootbar<RequiredWithEscapedCharacters010001Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001Builder(instance);
        }
        public RequiredWithEscapedCharacters100001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001Builder(instance);
        }
        public RequiredWithEscapedCharacters110000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110010Builder implements SetterForFootbar<RequiredWithEscapedCharacters010010Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100010Builder>, SetterForFoobar<RequiredWithEscapedCharacters110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010Builder(instance);
        }
        public RequiredWithEscapedCharacters100010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010Builder(instance);
        }
        public RequiredWithEscapedCharacters110000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110011Builder implements SetterForFootbar<RequiredWithEscapedCharacters010011Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100011Builder>, SetterForFoobar<RequiredWithEscapedCharacters110001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters110010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011Builder(instance);
        }
        public RequiredWithEscapedCharacters100011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011Builder(instance);
        }
        public RequiredWithEscapedCharacters110001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001Builder(instance);
        }
        public RequiredWithEscapedCharacters110010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110100Builder implements SetterForFootbar<RequiredWithEscapedCharacters010100Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100Builder(instance);
        }
        public RequiredWithEscapedCharacters100100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100Builder(instance);
        }
        public RequiredWithEscapedCharacters110000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110101Builder implements SetterForFootbar<RequiredWithEscapedCharacters010101Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters110001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101Builder(instance);
        }
        public RequiredWithEscapedCharacters100101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101Builder(instance);
        }
        public RequiredWithEscapedCharacters110001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001Builder(instance);
        }
        public RequiredWithEscapedCharacters110100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110110Builder implements SetterForFootbar<RequiredWithEscapedCharacters010110Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters110010Builder>, SetterForFoobar<RequiredWithEscapedCharacters110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110Builder(instance);
        }
        public RequiredWithEscapedCharacters100110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110Builder(instance);
        }
        public RequiredWithEscapedCharacters110010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010Builder(instance);
        }
        public RequiredWithEscapedCharacters110100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110111Builder implements SetterForFootbar<RequiredWithEscapedCharacters010111Builder>, SetterForFoonbar<RequiredWithEscapedCharacters100111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters110011Builder>, SetterForFoobar<RequiredWithEscapedCharacters110101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters110110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010111Builder(instance);
        }
        public RequiredWithEscapedCharacters100111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100111Builder(instance);
        }
        public RequiredWithEscapedCharacters110011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110011Builder(instance);
        }
        public RequiredWithEscapedCharacters110101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110101Builder(instance);
        }
        public RequiredWithEscapedCharacters110110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111000Builder implements SetterForFootbar<RequiredWithEscapedCharacters011000Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101000Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000Builder(instance);
        }
        public RequiredWithEscapedCharacters101000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000Builder(instance);
        }
        public RequiredWithEscapedCharacters110000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111001Builder implements SetterForFootbar<RequiredWithEscapedCharacters011001Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101001Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001Builder(instance);
        }
        public RequiredWithEscapedCharacters101001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001Builder(instance);
        }
        public RequiredWithEscapedCharacters110001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001Builder(instance);
        }
        public RequiredWithEscapedCharacters111000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111010Builder implements SetterForFootbar<RequiredWithEscapedCharacters011010Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101010Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110010Builder>, SetterForFoobar<RequiredWithEscapedCharacters111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010Builder(instance);
        }
        public RequiredWithEscapedCharacters101010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010Builder(instance);
        }
        public RequiredWithEscapedCharacters110010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010Builder(instance);
        }
        public RequiredWithEscapedCharacters111000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111011Builder implements SetterForFootbar<RequiredWithEscapedCharacters011011Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101011Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110011Builder>, SetterForFoobar<RequiredWithEscapedCharacters111001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters111010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011011Builder(instance);
        }
        public RequiredWithEscapedCharacters101011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101011Builder(instance);
        }
        public RequiredWithEscapedCharacters110011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110011Builder(instance);
        }
        public RequiredWithEscapedCharacters111001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111001Builder(instance);
        }
        public RequiredWithEscapedCharacters111010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111100Builder implements SetterForFootbar<RequiredWithEscapedCharacters011100Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101100Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110100Builder>, SetterForFoorbar<RequiredWithEscapedCharacters111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100Builder(instance);
        }
        public RequiredWithEscapedCharacters101100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100Builder(instance);
        }
        public RequiredWithEscapedCharacters110100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100Builder(instance);
        }
        public RequiredWithEscapedCharacters111000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111101Builder implements SetterForFootbar<RequiredWithEscapedCharacters011101Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101101Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110101Builder>, SetterForFoorbar<RequiredWithEscapedCharacters111001Builder>, SetterForFoobar1<RequiredWithEscapedCharacters111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011101Builder(instance);
        }
        public RequiredWithEscapedCharacters101101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101101Builder(instance);
        }
        public RequiredWithEscapedCharacters110101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110101Builder(instance);
        }
        public RequiredWithEscapedCharacters111001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111001Builder(instance);
        }
        public RequiredWithEscapedCharacters111100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111110Builder implements SetterForFootbar<RequiredWithEscapedCharacters011110Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101110Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110110Builder>, SetterForFoorbar<RequiredWithEscapedCharacters111010Builder>, SetterForFoobar<RequiredWithEscapedCharacters111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011110Builder(instance);
        }
        public RequiredWithEscapedCharacters101110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101110Builder(instance);
        }
        public RequiredWithEscapedCharacters110110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110110Builder(instance);
        }
        public RequiredWithEscapedCharacters111010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111010Builder(instance);
        }
        public RequiredWithEscapedCharacters111100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111111Builder implements SetterForFootbar<RequiredWithEscapedCharacters011111Builder>, SetterForFoonbar<RequiredWithEscapedCharacters101111Builder>, SetterForFoofbar<RequiredWithEscapedCharacters110111Builder>, SetterForFoorbar<RequiredWithEscapedCharacters111011Builder>, SetterForFoobar<RequiredWithEscapedCharacters111101Builder>, SetterForFoobar1<RequiredWithEscapedCharacters111110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111111Builder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011111Builder(instance);
        }
        public RequiredWithEscapedCharacters101111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101111Builder(instance);
        }
        public RequiredWithEscapedCharacters110111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110111Builder(instance);
        }
        public RequiredWithEscapedCharacters111011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111011Builder(instance);
        }
        public RequiredWithEscapedCharacters111101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111101Builder(instance);
        }
        public RequiredWithEscapedCharacters111110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111110Builder(instance);
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
