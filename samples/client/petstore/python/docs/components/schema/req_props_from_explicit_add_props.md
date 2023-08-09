# ReqPropsFromExplicitAddProps
petstore_api.components.schema.req_props_from_explicit_add_props

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ReqPropsFromExplicitAddPropsDictInput](#reqpropsfromexplicitaddpropsdictinput), [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) | [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) |

## ReqPropsFromExplicitAddPropsDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        str,
        str,
        str,
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | str |  |
**validName** | str |  |
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromExplicitAddPropsDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**validName** | str |  |
**kwargs** | str | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**validName** | str |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ReqPropsFromExplicitAddPropsDictInput](#reqpropsfromexplicitaddpropsdictinput), [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) | [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | str | This model has invalid python names so this method is used under the hood when you access instance["invalid-name"], 
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
