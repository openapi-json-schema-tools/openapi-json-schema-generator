package org.openapijsonschematools.client.schemas.validation;

import java.util.LinkedHashMap;

public abstract class NonCollectionJsonSchema extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
   protected NonCollectionJsonSchema(LinkedHashMap<String, KeywordValidator> keywordToValidator) {
      super(keywordToValidator);
   }

   protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
      return arg;
   }

   protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
      return arg;
   }
}