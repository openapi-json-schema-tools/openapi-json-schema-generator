petstore_api.components.schema.req_props_from_explicit_add_props
# Schema ReqPropsFromExplicitAddProps

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ReqPropsFromExplicitAddPropsDictInput](#reqpropsfromexplicitaddpropsdictinput), [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) | [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) |

## ReqPropsFromExplicitAddPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | str |  |
**validName** | str |  |
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromExplicitAddPropsDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ReqPropsFromExplicitAddPropsDictInput](#reqpropsfromexplicitaddpropsdictinput), [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict) | [ReqPropsFromExplicitAddPropsDict](#reqpropsfromexplicitaddpropsdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**invalid-name** | str | str |  | value must be accessed with instance["invalid-name"] because the key is not a valid identifier 
**validName** | str | str |  |
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
