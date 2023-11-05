package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public interface Schema extends SchemaValidator {
   static Object castToAllowedTypes(Object arg, List<Object> pathToItem, PathToTypeMap pathToType) {
      if (arg == null) {
         pathToType.put(pathToItem, Void.class);
         return null;
      } else if (arg instanceof String) {
         pathToType.put(pathToItem, String.class);
         return (String) arg;
      } else if (arg instanceof Map) {
         pathToType.put(pathToItem, Map.class);
         LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
         for (Map.Entry<?, ?> entry: ((Map<?, ?>) arg).entrySet()) {
            String key = (String) entry.getKey();
            Object val = entry.getValue();
            List<Object> newPathToItem = new ArrayList<>();
            newPathToItem.addAll(pathToItem);
            newPathToItem.add(key);
            Object fixedVal = castToAllowedTypes(val, newPathToItem, pathToType);
            argFixed.put(key, fixedVal);
         }
         return argFixed;
      } else if (arg instanceof Boolean) {
         pathToType.put(pathToItem, Boolean.class);
         return (Boolean) arg;
      } else if (arg instanceof Integer) {
         pathToType.put(pathToItem, Integer.class);
         return (Integer) arg;
      } else if (arg instanceof Float) {
         pathToType.put(pathToItem, Float.class);
         return (Float) arg;
      } else if (arg instanceof Double) {
         pathToType.put(pathToItem, Double.class);
         return (Double) arg;
      } else if (arg instanceof BigDecimal) {
         pathToType.put(pathToItem, BigDecimal.class);
         return (BigDecimal) arg;
      } else if (arg instanceof List) {
         pathToType.put(pathToItem, List.class);
         List<Object> argFixed = new ArrayList<>();
         int i =0;
         for (Object item: ((List<?>) arg).toArray()) {
            List<Object> newPathToItem = new ArrayList<>();
            newPathToItem.addAll(pathToItem);
            newPathToItem.add(i);
            Object fixedVal = castToAllowedTypes(item, newPathToItem, pathToType);
            argFixed.add(fixedVal);
            i += 1;
         }
         return argFixed;
      } else if (arg instanceof ZonedDateTime) {
         pathToType.put(pathToItem, String.class);
         return arg.toString();
      } else if (arg instanceof LocalDate) {
         pathToType.put(pathToItem, String.class);
         return arg.toString();
      } else {
         Class<?> argClass = arg.getClass();
         throw new RuntimeException("Invalid type passed in got input="+arg+" type="+argClass);
      }
   }

   static PathToSchemasMap getPathToSchemas(Class<Schema> cls, Object arg, ValidationMetadata validationMetadata, PathToTypeMap pathToType) {
      PathToSchemasMap pathToSchemasMap = new PathToSchemasMap();
      if (validationMetadata.validationRanEarlier(cls)) {
         // todo add deeper validated schemas
      } else {
         try {
            PathToSchemasMap otherPathToSchemas = SchemaValidator._validate(cls, arg, validationMetadata);
         } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
         } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
         }
         // todo add remainder
      }
      return pathToSchemasMap;
      /**
       *         _path_to_schemas: validation.PathToSchemasType = {}
       *         if validation_metadata.validation_ran_earlier(cls):
       *             validation.add_deeper_validated_schemas(validation_metadata, _path_to_schemas)
       *         else:
       *             other_path_to_schemas = cls._validate(arg, validation_metadata=validation_metadata)
       *             validation.update(_path_to_schemas, other_path_to_schemas)
       *         # loop through it make a new class for each entry
       *         # do not modify the returned result because it is cached and we would be modifying the cached value
       *         path_to_schemas: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]] = {}
       *         for path, schema_classes in _path_to_schemas.items():
       *             schema = typing.cast(typing.Type[Schema], tuple(schema_classes)[-1])
       *             path_to_schemas[path] = schema
       *         """
       *         For locations that validation did not check
       *         the code still needs to store type + schema information for instantiation
       *         All of those schemas will be UnsetAnyTypeSchema
       *         """
       *         missing_paths = path_to_type.keys() - path_to_schemas.keys()
       *         for missing_path in missing_paths:
       *             path_to_schemas[missing_path] = UnsetAnyTypeSchema
       *
       *         return path_to_schemas
       */
   }

   static Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      return null;
   }


   static Object validateBase(Class<Schema> cls, Object arg, SchemaConfiguration configuration) {
      if (arg instanceof Map || arg instanceof List) {
         // todo
      }
      PathToTypeMap pathToType = new PathToTypeMap();
      List<Object> pathToItem = new ArrayList<>();
      pathToItem.add("args[0]");
      Object castArg = castToAllowedTypes(arg, pathToItem, pathToType);
      SchemaConfiguration usedConfiguration;
      if (configuration != null) {
         usedConfiguration = configuration;
      } else {
         usedConfiguration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
      }
      PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
      ValidationMetadata validationMetadata = new ValidationMetadata(
              pathToItem,
              usedConfiguration,
              validatedPathToSchemas,
              new LinkedHashSet<>()
      );
      PathToSchemasMap pathToSchemasMap = getPathToSchemas(cls, castArg, validationMetadata, pathToType);
      return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
   }

}
/**
 * class Schema(typing.Generic[T, U], validation.SchemaValidator, metaclass=SingletonMeta):
 *
 *     @classmethod
 *     def __get_path_to_schemas(
 *         cls,
 *         arg,
 *         validation_metadata: validation.ValidationMetadata,
 *         path_to_type: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type]
 *     ) -> typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]]:
 *         """
 *         Run all validations in the json schema and return a dict of
 *         json schema to tuple of validated schemas
 *         """
 *         _path_to_schemas: validation.PathToSchemasType = {}
 *         if validation_metadata.validation_ran_earlier(cls):
 *             validation.add_deeper_validated_schemas(validation_metadata, _path_to_schemas)
 *         else:
 *             other_path_to_schemas = cls._validate(arg, validation_metadata=validation_metadata)
 *             validation.update(_path_to_schemas, other_path_to_schemas)
 *         # loop through it make a new class for each entry
 *         # do not modify the returned result because it is cached and we would be modifying the cached value
 *         path_to_schemas: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]] = {}
 *         for path, schema_classes in _path_to_schemas.items():
 *             schema = typing.cast(typing.Type[Schema], tuple(schema_classes)[-1])
 *             path_to_schemas[path] = schema
 *         """
 *         For locations that validation did not check
 *         the code still needs to store type + schema information for instantiation
 *         All of those schemas will be UnsetAnyTypeSchema
 *         """
 *         missing_paths = path_to_type.keys() - path_to_schemas.keys()
 *         for missing_path in missing_paths:
 *             path_to_schemas[missing_path] = UnsetAnyTypeSchema
 *
 *         return path_to_schemas
 *
 *     @staticmethod
 *     def __get_items(
 *         arg: tuple,
 *         path_to_item: typing.Tuple[typing.Union[str, int], ...],
 *         path_to_schemas: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]]
 *     ):
 *         '''
 *         Schema __get_items
 *         '''
 *         cast_items = []
 *
 *         for i, value in enumerate(arg):
 *             item_path_to_item = path_to_item + (i,)
 *             item_cls = path_to_schemas[item_path_to_item]
 *             new_value = item_cls._get_new_instance_without_conversion(
 *                 value,
 *                 item_path_to_item,
 *                 path_to_schemas
 *             )
 *             cast_items.append(new_value)
 *
 *         return tuple(cast_items)
 *
 *     @staticmethod
 *     def __get_properties(
 *         arg: validation.immutabledict[str, typing.Any],
 *         path_to_item: typing.Tuple[typing.Union[str, int], ...],
 *         path_to_schemas: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]]
 *     ):
 *         """
 *         Schema __get_properties, this is how properties are set
 *         These values already passed validation
 *         """
 *         dict_items = {}
 *
 *         for property_name_js, value in arg.items():
 *             property_path_to_item = path_to_item + (property_name_js,)
 *             property_cls = path_to_schemas[property_path_to_item]
 *             new_value = property_cls._get_new_instance_without_conversion(
 *                 value,
 *                 property_path_to_item,
 *                 path_to_schemas
 *             )
 *             dict_items[property_name_js] = new_value
 *
 *         return validation.immutabledict(dict_items)
 *
 *     @classmethod
 *     def _get_new_instance_without_conversion(
 *         cls,
 *         arg: typing.Union[int, float, None, Bool, str, validation.immutabledict, tuple, FileIO, bytes],
 *         path_to_item: typing.Tuple[typing.Union[str, int], ...],
 *         path_to_schemas: typing.Dict[typing.Tuple[typing.Union[str, int], ...], typing.Type[Schema]]
 *     ):
 *         # We have a Dynamic class and we are making an instance of it
 *         if isinstance(arg, validation.immutabledict):
 *             used_arg = cls.__get_properties(arg, path_to_item, path_to_schemas)
 *         elif isinstance(arg, tuple):
 *             used_arg = cls.__get_items(arg, path_to_item, path_to_schemas)
 *         elif isinstance(arg, Bool):
 *             return bool(arg)
 *         else:
 *             """
 *             str, int, float, FileIO, bytes
 *             FileIO = openapi binary type and the user inputs a file
 *             bytes = openapi binary type and the user inputs bytes
 *             """
 *             return arg
 *         arg_type = type(arg)
 *         type_to_output_cls = cls.__get_type_to_output_cls()
 *         if type_to_output_cls is None:
 *             return used_arg
 *         if arg_type not in type_to_output_cls:
 *             return used_arg
 *         output_cls = type_to_output_cls[arg_type]
 *         if arg_type is tuple:
 *             inst = super(output_cls, output_cls).__new__(output_cls, used_arg) # type: ignore
 *             inst = typing.cast(U, inst)
 *             return inst
 *         assert issubclass(output_cls, validation.immutabledict)
 *         inst = super(output_cls, output_cls).__new__(output_cls, used_arg) # type: ignore
 *         inst = typing.cast(T, inst)
 *         return inst
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: None,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> None: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Literal[True],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> typing.Literal[True]: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Literal[False],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> typing.Literal[False]: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: bool,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> bool: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: int,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> int: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: float,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> float: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Union[str, datetime.date, datetime.datetime, uuid.UUID],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> str: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: SequenceNotStr[INPUT_TYPES_ALL],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> U: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: U,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> U: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Mapping[str, object],  # object needed as value type for typeddict inputs
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> T: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Union[
 *             typing.Mapping[str, INPUT_TYPES_ALL],
 *             T
 *         ],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> T: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: typing.Union[io.FileIO, io.BufferedReader],
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> FileIO: ...
 *
 *     @typing.overload
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg: bytes,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
 *     ) -> bytes: ...
 *
 *     @classmethod
 *     def validate_base(
 *         cls,
 *         arg,
 *         configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None,
 *     ):
 *         """
 *         Schema validate_base
 *
 *         Args:
 *             arg (int/float/str/list/tuple/dict/validation.immutabledict/bool/None): the value
 *             configuration: contains the schema_configuration.SchemaConfiguration that enables json schema validation keywords
 *                 like minItems, minLength etc
 *         """
 *         if isinstance(arg, (tuple, validation.immutabledict)):
 *             type_to_output_cls = cls.__get_type_to_output_cls()
 *             if type_to_output_cls is not None:
 *                 for output_cls in type_to_output_cls.values():
 *                     if isinstance(arg, output_cls):
 *                         # U + T use case, don't run validations twice
 *                         return arg
 *
 *         from_server = False
 *         validated_path_to_schemas: typing.Dict[
 *             typing.Tuple[typing.Union[str, int], ...],
 *             typing.Set[typing.Union[str, int, float, bool, None, validation.immutabledict, tuple]]
 *         ] = {}
 *         path_to_type: typing.Dict[typing.Tuple[typing.Union[str, int], ...], type] = {}
 *         cast_arg = cast_to_allowed_types(
 *             arg, from_server, validated_path_to_schemas, ('args[0]',), path_to_type)
 *         validation_metadata = validation.ValidationMetadata(
 *             path_to_item=('args[0]',),
 *             configuration=configuration or schema_configuration.SchemaConfiguration(),
 *             validated_path_to_schemas=validation.immutabledict(validated_path_to_schemas)
 *         )
 *         path_to_schemas = cls.__get_path_to_schemas(cast_arg, validation_metadata, path_to_type)
 *         return cls._get_new_instance_without_conversion(
 *             cast_arg,
 *             validation_metadata.path_to_item,
 *             path_to_schemas,
 *         )
 *
 *     @classmethod
 *     def __get_type_to_output_cls(cls) -> typing.Optional[typing.Mapping[type, type]]:
 *         type_to_output_cls = getattr(cls(), 'type_to_output_cls', None)
 *         type_to_output_cls = typing.cast(typing.Optional[typing.Mapping[type, type]], type_to_output_cls)
 *         return type_to_output_cls
 */