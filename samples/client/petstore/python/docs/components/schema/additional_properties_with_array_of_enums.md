petstore_api.components.schema.additional_properties_with_array_of_enums
# Schema AdditionalPropertiesWithArrayOfEnums

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesWithArrayOfEnumsDictInput](#additionalpropertieswitharrayofenumsdictinput), [AdditionalPropertiesWithArrayOfEnumsDict](#additionalpropertieswitharrayofenumsdict) | [AdditionalPropertiesWithArrayOfEnumsDict](#additionalpropertieswitharrayofenumsdict) |

## AdditionalPropertiesWithArrayOfEnumsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | list, tuple | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesWithArrayOfEnumsDict
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | list, tuple | [AdditionalProperties](#additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalPropertiesWithArrayOfEnumsDictInput](#additionalpropertieswitharrayofenumsdictinput), [AdditionalPropertiesWithArrayOfEnumsDict](#additionalpropertieswitharrayofenumsdict) | [AdditionalPropertiesWithArrayOfEnumsDict](#additionalpropertieswitharrayofenumsdict) | a constructor
get_additional_property_ | str | [AdditionalProperties](#additionalproperties) | provides type safety for additional properties

# AdditionalProperties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesTupleInput](#additionalproperties-additionalpropertiestupleinput), [AdditionalPropertiesTuple](#additionalproperties-additionalpropertiestuple) | [AdditionalPropertiesTuple](#additionalproperties-additionalpropertiestuple) |

## AdditionalProperties AdditionalPropertiesTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**EnumClass**](enum_class.md) |  |

## AdditionalProperties AdditionalPropertiesTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**EnumClass**](enum_class.md) | [**EnumClass**](enum_class.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
