package org.openapijsonschematools.client.schemas.validation;

import java.util.LinkedHashMap;

public abstract class NonCollectionJsonSchema extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
   protected NonCollectionJsonSchema(LinkedHashMap<String, KeywordValidator> keywordToValidator) {
      super(keywordToValidator);
   }
}