petstore_api.components.schema.map_test
<a id="map_test"></a>
# MapTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_map_of_string** | [dict, frozendict.frozendict, ](#map_testpropertiesmap_map_of_string) | [frozendict.frozendict, ](#map_testpropertiesmap_map_of_string) |  | [optional]
**map_of_enum_string** | [dict, frozendict.frozendict, ](#map_testpropertiesmap_of_enum_string) | [frozendict.frozendict, ](#map_testpropertiesmap_of_enum_string) |  | [optional]
**direct_map** | [dict, frozendict.frozendict, ](#map_testpropertiesdirect_map) | [frozendict.frozendict, ](#map_testpropertiesdirect_map) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.StringBooleanMap.md) | [**StringBooleanMap**](string_boolean_map.StringBooleanMap.md) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

<a id="map_testpropertiesmap_map_of_string"></a>
# MapTest properties MapMapOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="map_testpropertiesmap_map_of_stringadditional_properties"></a>
# MapTest properties MapMapOfString AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional]

<a id="map_testpropertiesmap_map_of_stringadditional_propertiespropertiesmap_of_enum_string"></a>
# MapTest properties MapMapOfString AdditionalProperties properties MapOfEnumString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower", ]

<a id="map_testpropertiesmap_map_of_stringadditional_propertiespropertiesmap_of_enum_stringpropertiesdirect_map"></a>
# MapTest properties MapMapOfString AdditionalProperties properties MapOfEnumString properties DirectMap

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | bool,  | BoolClass,  | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
