# KeyRestrictions
some_api.components.schema.key_restrictions
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[KeyRestrictionsDictInput](#keyrestrictionsdictinput), [KeyRestrictionsDict](#keyrestrictionsdict) | [KeyRestrictionsDict](#keyrestrictionsdict) |

## KeyRestrictionsDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [tag_list.TagListTupleInput](../../components/schema/tag_list.md#taglisttupleinput), [tag_list.TagListTuple](../../components/schema/tag_list.md#taglisttuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## KeyRestrictionsDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**tags** | [tag_list.TagListTupleInput](../../components/schema/tag_list.md#taglisttupleinput), [tag_list.TagListTuple](../../components/schema/tag_list.md#taglisttuple), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**tags** | [tag_list.TagListTuple](../../components/schema/tag_list.md#taglisttuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [KeyRestrictionsDictInput](#keyrestrictionsdictinput), [KeyRestrictionsDict](#keyrestrictionsdict) | [KeyRestrictionsDict](#keyrestrictionsdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
