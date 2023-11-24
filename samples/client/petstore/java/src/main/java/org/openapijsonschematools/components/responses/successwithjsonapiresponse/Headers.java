package org.openapijsonschematools.components.responses.successwithjsonapiresponse;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;
import org.openapijsonschematools.components.headers.numberheader.NumberHeaderSchema;
import org.openapijsonschematools.components.headers.stringheader.StringHeaderSchema;
import org.openapijsonschematools.components.schemas.StringWithValidation;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeadersMap extends FrozenMap<String, Object> {


        HeadersMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static HeadersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Headers1.validate(arg, configuration);
        }
        
        public int:

            return typing.cast(
                int,

                self.__getitem__("int32")
            )
        
        public String:

            return typing.cast(
                String,

                self.__getitem__("stringHeader")
            )
        
        public String numberHeader() {

            val = self.get("numberHeader", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
    }    
    
    public class Headers1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("ref-schema-header", StringWithValidation.StringWithValidation1.class),
                new PropertyEntry("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
                new PropertyEntry("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
                new PropertyEntry("stringHeader", StringHeaderSchema.StringHeaderSchema1.class),
                new PropertyEntry("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "int32",
                "ref-content-schema-header",
                "ref-schema-header",
                "stringHeader"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static HeadersMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new HeadersMap(arg);
        }
        public static HeadersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Headers1.class, arg, configuration);
        }
    }
}
