# ArrayWithValidationsInItems
petstore_api.components.schema.array_with_validations_in_items

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayWithValidationsInItemsTupleInput](#arraywithvalidationsinitemstupleinput), [ArrayWithValidationsInItemsTuple](#arraywithvalidationsinitemstuple) | [ArrayWithValidationsInItemsTuple](#arraywithvalidationsinitemstuple) |

## ArrayWithValidationsInItemsTupleInput
```
type: typing.Union[
    typing.List[
        int,
    ],
    typing.Tuple[
        int,
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | int |  | value must be a 64 bit integer

## ArrayWithValidationsInItemsTuple
```
base class: typing.Tuple[
    int,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayWithValidationsInItemsTupleInput](#arraywithvalidationsinitemstupleinput), [ArrayWithValidationsInItemsTuple](#arraywithvalidationsinitemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | int | value must be a 64 bit integer This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
