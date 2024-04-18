# ObjectWithOnlyOptionalProps
openapi_client.components.schema.object_with_only_optional_props
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithOnlyOptionalPropsDictInput](#objectwithonlyoptionalpropsdictinput), [ObjectWithOnlyOptionalPropsDict](#objectwithonlyoptionalpropsdict) | [ObjectWithOnlyOptionalPropsDict](#objectwithonlyoptionalpropsdict) |

## ObjectWithOnlyOptionalPropsDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | str |  | [optional]
**b** | float, int |  | [optional]
**ArrayProperty** | None, [ArrayPropertyTupleInput](#arraypropertytupleinput), [ArrayPropertyTuple](#arraypropertytuple) |  | [optional]

## ObjectWithOnlyOptionalPropsDict
```
base class: schemas.immutabledict[str, typing.Union[
    None,
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    typing.Union[int, float],
    str,
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**a** | str, schemas.Unset |  | [optional]
**b** | float, int, schemas.Unset |  | [optional]
**ArrayProperty** | None, [ArrayPropertyTupleInput](#arraypropertytupleinput), [ArrayPropertyTuple](#arraypropertytuple), schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | str, schemas.Unset |  | [optional]
**b** | float, int, schemas.Unset |  | [optional]
**ArrayProperty** | None, [ArrayPropertyTuple](#arraypropertytuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithOnlyOptionalPropsDictInput](#objectwithonlyoptionalpropsdictinput), [ObjectWithOnlyOptionalPropsDict](#objectwithonlyoptionalpropsdict) | [ObjectWithOnlyOptionalPropsDict](#objectwithonlyoptionalpropsdict) | a constructor

# ArrayProperty
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayPropertyTupleInput](#arraypropertytupleinput), [ArrayPropertyTuple](#arraypropertytuple) | None, [ArrayPropertyTuple](#arraypropertytuple) |

## ArrayPropertyTupleInput
```
type: typing.Union[
    typing.List[
        typing.Literal[
            "_abc",
            "-efg",
            "(xyz)",
            "COUNT_1M",
            "COUNT_50M"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            "_abc",
            "-efg",
            "(xyz)",
            "COUNT_1M",
            "COUNT_50M"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal["_abc", "-efg", "(xyz)", "COUNT_1M", "COUNT_50M"] |  |

## ArrayPropertyTuple
```
base class: typing.Tuple[
    typing.Literal["_abc", "-efg", "(xyz)", "COUNT_1M", "COUNT_50M"],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | None, [ArrayPropertyTupleInput](#arraypropertytupleinput), [ArrayPropertyTuple](#arraypropertytuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal["_abc", "-efg", "(xyz)", "COUNT_1M", "COUNT_50M"] | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
