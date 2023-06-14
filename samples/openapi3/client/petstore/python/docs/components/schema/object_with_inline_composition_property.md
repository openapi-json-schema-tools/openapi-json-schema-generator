petstore_api.components.schema.object_with_inline_composition_property
# Schema ObjectWithInlineCompositionProperty

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**someProp** | dict, immutabledict.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [properties.SomeProp](#properties-someprop) |  | [optional]
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties SomeProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | immutabledict.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#properties-someprop-allof-_0) | str | str |  |

# properties SomeProp allof _0

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str | str |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
