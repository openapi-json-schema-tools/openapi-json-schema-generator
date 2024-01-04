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
    
    public static class RequiredWithEscapedCharacters000000MapBuilder extends UnsetAddPropsSetter<RequiredWithEscapedCharacters000000MapBuilder> implements BaseBuilder<@Nullable Object> {
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
        public RequiredWithEscapedCharacters000000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class RequiredWithEscapedCharacters000001MapBuilder implements SetterForFoobar1<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000010MapBuilder implements SetterForFoobar<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000011MapBuilder implements SetterForFoobar<RequiredWithEscapedCharacters000001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters000010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters000010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000100MapBuilder implements SetterForFoorbar<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000101MapBuilder implements SetterForFoorbar<RequiredWithEscapedCharacters000001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters000100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters000100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000110MapBuilder implements SetterForFoorbar<RequiredWithEscapedCharacters000010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters000100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters000100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters000111MapBuilder implements SetterForFoorbar<RequiredWithEscapedCharacters000011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters000101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters000110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters000111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters000101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters000110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001000MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001001MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters001000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001010MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters001000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001011MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters001001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters001010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001100MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters001000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001101MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters001001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters001100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001110MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters001010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters001100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters001111MapBuilder implements SetterForFoofbar<RequiredWithEscapedCharacters000111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters001011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters001101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters001110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters001111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters001110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010000MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010001MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters010000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010010MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters010000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010011MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters010001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters010010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010100MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters010000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010101MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters010001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters010100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010110MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters010010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters010100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters010111MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters000111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters010011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters010101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters010110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters010111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011000MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001000MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001000MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010000MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011001MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001001MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters011000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001001MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010001MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011010MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001010MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters011000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001010MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010010MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011011MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001011MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters011001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters011010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001011MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010011MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011100MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001100MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters011000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001100MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010100MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011101MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001101MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters011001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters011100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001101MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010101MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011110MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001110MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters011010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters011100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001110MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010110MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters011111MapBuilder implements SetterForFoonbar<RequiredWithEscapedCharacters001111MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters010111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters011011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters011101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters011110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters011111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001111MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters010111MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters011110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100000MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000000MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100001MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters100000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000001MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100010MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters100000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000010MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100011MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters100001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters100010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000011MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100100MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters100000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000100MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100101MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters100001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters100100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000101MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100110MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters100010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters100100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000110MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters100111MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters000111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters100011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters100101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters100110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters100111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters000111MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters000111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101000MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001000MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001000MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001000MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100000MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101001MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001001MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters101000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001001MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100001MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101010MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001010MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters101000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001010MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100010MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101011MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001011MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters101001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters101010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001011MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100011MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101100MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001100MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters101000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001100MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100100MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101101MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001101MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters101001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters101100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001101MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100101MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101110MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001110MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters101010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters101100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001110MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100110MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters101111MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters001111MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters100111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters101011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters101101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters101110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters101111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters001111MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters001111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100111MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110000MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010000MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010000MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010000MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100000MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110001MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010001MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters110000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010001MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100001MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110010MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010010MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters110000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010010MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100010MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110011MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010011MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters110001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters110010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010011MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100011MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110100MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010100MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters110000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010100MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100100MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110101MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010101MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters110001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters110100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010101MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100101MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110110MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010110MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters110010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters110100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010110MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100110MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters110111MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters010111MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters100111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters110011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters110101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters110110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters110111MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters010111MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters010111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters100111MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters100111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110110MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111000MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011000MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101000MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111000MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011000MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011000MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101000MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101000MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110000MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111001MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011001MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101001MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters111000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111001MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011001MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101001MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110001MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111000MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111010MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011010MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101010MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters111000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111010MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011010MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101010MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110010MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111000MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111011MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011011MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101011MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters111001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters111010MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111011MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011011MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101011MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110011MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111001MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111010MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111010MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111100MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011100MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101100MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110100MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters111000MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111100MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011100MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101100MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110100MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110100MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111000MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111000MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111101MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011101MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101101MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110101MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters111001MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters111100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111101MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011101MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101101MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110101MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111001MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111001MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111100MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharacters111110MapBuilder implements SetterForFootbar<RequiredWithEscapedCharacters011110MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101110MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110110MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters111010MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters111100MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharacters111110MapBuilder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011110MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101110MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110110MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110110MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111010MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111010MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111100MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111100MapBuilder(instance);
        }
    }
    
    public static class RequiredWithEscapedCharactersMapBuilder1 implements SetterForFootbar<RequiredWithEscapedCharacters011111MapBuilder>, SetterForFoonbar<RequiredWithEscapedCharacters101111MapBuilder>, SetterForFoofbar<RequiredWithEscapedCharacters110111MapBuilder>, SetterForFoorbar<RequiredWithEscapedCharacters111011MapBuilder>, SetterForFoobar<RequiredWithEscapedCharacters111101MapBuilder>, SetterForFoobar1<RequiredWithEscapedCharacters111110MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredWithEscapedCharactersMapBuilder1() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredWithEscapedCharacters011111MapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters011111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters101111MapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters101111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters110111MapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters110111MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111011MapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111011MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111101MapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111101MapBuilder(instance);
        }
        public RequiredWithEscapedCharacters111110MapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new RequiredWithEscapedCharacters111110MapBuilder(instance);
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
