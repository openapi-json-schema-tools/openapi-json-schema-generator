# Migration v2.0.0 to v3.0.0

- DynamicSchema classes are no longer produced,
  all schemas are validated, but only one schema class produces output classes for instantiation
  - the schema that is used is the first schema that is checked
  - so if you depended on .methodName access on a oneOf schema, that will no longer work
  - instead use instance['methodName'] access
- SomeSchema.__new__ no longer validates payloads
  - instead use SomeSchema.validate or SomeSchemaDict.__new__
- SomeSchema.Schema_ inner class has been moved to the class SomeSchema
  - so if you need to access openapi schema info, use SomeSchema
  - so if you depended on SomeSchema.SOME_ENUM, update it to SomeSchema.enums.SOME_ENUM
- instance.get_item_ methods have been removed to reduce amount of generated code
  - optional properties are now generated as @property methods
  - so one can use instance.someProp OR instance.get('someProp', schemas.unset)
- Output classes are only written for json schema type object (dict) and array (tuple) types
  - so if you depended on boolean/null/string/number instances being an instance of a Schema class
    update your code to handle the primitive values instead
- NoneClass instances no longer returned from schema validation, None returned instead
  - so update your code to handle None values
- BoolClass instances no longer returned from schema validation, True/False returned instead
  - so update you code to handle bool values
- Decimal instances are no longer returned from type integer or type number schemas, int or float values are returned
  - so update your code to use the int or float values
