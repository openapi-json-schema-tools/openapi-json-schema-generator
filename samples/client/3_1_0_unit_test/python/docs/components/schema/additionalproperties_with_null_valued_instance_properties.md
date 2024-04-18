# AdditionalpropertiesWithNullValuedInstanceProperties
unit_test_api.components.schema.additionalproperties_with_null_valued_instance_properties
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalpropertiesWithNullValuedInstancePropertiesDictInput](#additionalpropertieswithnullvaluedinstancepropertiesdictinput), [AdditionalpropertiesWithNullValuedInstancePropertiesDict](#additionalpropertieswithnullvaluedinstancepropertiesdict) | [AdditionalpropertiesWithNullValuedInstancePropertiesDict](#additionalpropertieswithnullvaluedinstancepropertiesdict) |

## AdditionalpropertiesWithNullValuedInstancePropertiesDictInput
```
type: typing.Mapping[
    str,
    None,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None | any string name can be used but the value must be the correct type | [optional]

## AdditionalpropertiesWithNullValuedInstancePropertiesDict
```
base class: schemas.immutabledict[str, None]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | None | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalpropertiesWithNullValuedInstancePropertiesDictInput](#additionalpropertieswithnullvaluedinstancepropertiesdictinput), [AdditionalpropertiesWithNullValuedInstancePropertiesDict](#additionalpropertieswithnullvaluedinstancepropertiesdict) | [AdditionalpropertiesWithNullValuedInstancePropertiesDict](#additionalpropertieswithnullvaluedinstancepropertiesdict) | a constructor
get_additional_property_ | str | None, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
