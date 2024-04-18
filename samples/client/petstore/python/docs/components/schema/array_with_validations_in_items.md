# ArrayWithValidationsInItems
openapi_client.components.schema.array_with_validations_in_items
```
type: schemas.Schema
```

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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
int |  | value must be a 64 bit integer

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
