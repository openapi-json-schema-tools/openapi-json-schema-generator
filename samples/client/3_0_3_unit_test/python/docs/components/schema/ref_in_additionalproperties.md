# RefInAdditionalproperties
openapi_client.components.schema.ref_in_additionalproperties
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[RefInAdditionalpropertiesDictInput](#refinadditionalpropertiesdictinput), [RefInAdditionalpropertiesDict](#refinadditionalpropertiesdict) | [RefInAdditionalpropertiesDict](#refinadditionalpropertiesdict) |

## RefInAdditionalpropertiesDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | [property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReferenceDictInput](../../components/schema/property_named_ref_that_is_not_a_reference.md#propertynamedrefthatisnotareferencedictinput), [property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReferenceDict](../../components/schema/property_named_ref_that_is_not_a_reference.md#propertynamedrefthatisnotareferencedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## RefInAdditionalpropertiesDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | [property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReferenceDictInput](../../components/schema/property_named_ref_that_is_not_a_reference.md#propertynamedrefthatisnotareferencedictinput), [property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReferenceDict](../../components/schema/property_named_ref_that_is_not_a_reference.md#propertynamedrefthatisnotareferencedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [RefInAdditionalpropertiesDictInput](#refinadditionalpropertiesdictinput), [RefInAdditionalpropertiesDict](#refinadditionalpropertiesdict) | [RefInAdditionalpropertiesDict](#refinadditionalpropertiesdict) | a constructor
get_additional_property_ | str | [property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReferenceDict](../../components/schema/property_named_ref_that_is_not_a_reference.md#propertynamedrefthatisnotareferencedict), str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
