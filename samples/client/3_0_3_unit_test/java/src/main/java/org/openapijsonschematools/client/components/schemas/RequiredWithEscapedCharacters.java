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
import org.openapijsonschematools.client.schemas.GenericBuilder;
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
        public static RequiredWithEscapedCharactersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        
        default T fooReverseSolidusTbar(Void value) {
            var instance = getInstance();
            instance.put("foo\tbar", null);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(String value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(int value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(float value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(long value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(double value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T fooReverseSolidusTbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
    }
    
    public interface SetterForFoonbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoonbar(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusNbar(Void value) {
            var instance = getInstance();
            instance.put("foo\nbar", null);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(String value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(int value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(float value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(long value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(double value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T fooReverseSolidusNbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
    }
    
    public interface SetterForFoofbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoofbar(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusFbar(Void value) {
            var instance = getInstance();
            instance.put("foo\fbar", null);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(String value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(int value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(float value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(long value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(double value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T fooReverseSolidusFbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
    }
    
    public interface SetterForFoorbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoorbar(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusRbar(Void value) {
            var instance = getInstance();
            instance.put("foo\rbar", null);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(boolean value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(String value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(int value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(float value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(long value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(double value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T fooReverseSolidusRbar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
    }
    
    public interface SetterForFoobar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusQuotationMarkBar(Void value) {
            var instance = getInstance();
            instance.put("foo\"bar", null);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(boolean value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(String value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(int value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(float value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(long value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(double value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
    }
    
    public interface SetterForFoobar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar1(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusReverseSolidusBar(Void value) {
            var instance = getInstance();
            instance.put("foo\\bar", null);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(boolean value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(String value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(int value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(float value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(long value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(double value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusReverseSolidusBar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000000Builder extends UnsetAddPropsSetter<RequiredWithEscapedCharactersMap000000Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
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
        public RequiredWithEscapedCharactersMap000000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000001Builder implements SetterForFoobar1<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000010Builder implements SetterForFoobar<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000011Builder implements SetterForFoobar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap000010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000100Builder implements SetterForFoorbar<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000101Builder implements SetterForFoorbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap000100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000110Builder implements SetterForFoorbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap000100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap000100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap000111Builder implements SetterForFoorbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap000111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap000101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap000110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001000Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001001Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001010Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001011Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001100Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001101Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001110Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap001111Builder implements SetterForFoofbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap001111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap001110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010000Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010001Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010010Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010011Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010100Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010101Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010110Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap010111Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap010111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011000Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001000Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011001Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011010Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011011Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011100Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011101Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011110Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap011111Builder implements SetterForFoonbar<RequiredWithEscapedCharactersMap001111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap010111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap011111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap010111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap011110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100000Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100001Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100010Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100011Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100100Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100101Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100110Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap100111Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap100111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap000111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap000111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101000Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001000Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101001Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101010Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101011Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101100Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101101Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101110Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap101111Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap001111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap101111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap001111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap001111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110000Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010000Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110001Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110010Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110011Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110100Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110101Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110110Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap110111Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap010111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap110111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap010111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap010111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap100111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap100111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110110Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111000Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101000Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011000Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011000Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101000Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101000Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110000Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111001Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011001Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101001Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110001Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111000Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111010Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101010Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011010Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101010Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110010Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111000Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111011Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101011Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011011Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101011Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110011Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111001Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111010Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111010Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111100Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101100Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011100Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101100Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110100Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110100Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111000Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111000Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111101Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101101Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011101Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101101Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110101Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111001Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111001Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111100Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMap111110Builder implements SetterForFootbar<RequiredWithEscapedCharactersMap011110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101110Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMap111110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011110Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101110Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110110Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110110Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111010Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111010Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111100Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111100Builder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMapBuilder implements SetterForFootbar<RequiredWithEscapedCharactersMap011111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101111Builder>, SetterForFoofbar<RequiredWithEscapedCharactersMap110111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharactersMap011111Builder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap011111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap101111Builder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap101111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap110111Builder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap110111Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111011Builder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111011Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111101Builder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111101Builder(instance);
        }
        public RequiredWithEscapedCharactersMap111110Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharactersMap111110Builder(instance);
        }
    }
    
    
    public sealed interface RequiredWithEscapedCharacters1Boxed permits RequiredWithEscapedCharacters1BoxedVoid, RequiredWithEscapedCharacters1BoxedBoolean, RequiredWithEscapedCharacters1BoxedNumber, RequiredWithEscapedCharacters1BoxedString, RequiredWithEscapedCharacters1BoxedList, RequiredWithEscapedCharacters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record RequiredWithEscapedCharacters1BoxedVoid(Void data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredWithEscapedCharacters1BoxedBoolean(boolean data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredWithEscapedCharacters1BoxedNumber(Number data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredWithEscapedCharacters1BoxedString(String data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredWithEscapedCharacters1BoxedMap(RequiredWithEscapedCharactersMap data) implements RequiredWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class RequiredWithEscapedCharacters1 extends JsonSchema<RequiredWithEscapedCharacters1Boxed> implements NullSchemaValidator<RequiredWithEscapedCharacters1BoxedVoid>, BooleanSchemaValidator<RequiredWithEscapedCharacters1BoxedBoolean>, NumberSchemaValidator<RequiredWithEscapedCharacters1BoxedNumber>, StringSchemaValidator<RequiredWithEscapedCharacters1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, RequiredWithEscapedCharacters1BoxedList>, MapSchemaValidator<RequiredWithEscapedCharactersMap, RequiredWithEscapedCharacters1BoxedMap> {
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
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedString(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedList(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredWithEscapedCharacters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public RequiredWithEscapedCharacters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
