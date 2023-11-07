# PaginatedResultMyObjectDto
petstore_api.components.schema.paginated_result_my_object_dto
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PaginatedResultMyObjectDtoDictInput](#paginatedresultmyobjectdtodictinput), [PaginatedResultMyObjectDtoDict](#paginatedresultmyobjectdtodict) | [PaginatedResultMyObjectDtoDict](#paginatedresultmyobjectdtodict) |

## PaginatedResultMyObjectDtoDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**count** | int |  |
**results** | [ResultsTupleInput](#resultstupleinput), [ResultsTuple](#resultstuple) |  |

## PaginatedResultMyObjectDtoDict
```
base class: schemas.immutabledict[str, typing.Union[
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    int,
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**count** | int |  |
**results** | [ResultsTupleInput](#resultstupleinput), [ResultsTuple](#resultstuple) |  |

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**count** | int |  |
**results** | [ResultsTuple](#resultstuple) |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PaginatedResultMyObjectDtoDictInput](#paginatedresultmyobjectdtodictinput), [PaginatedResultMyObjectDtoDict](#paginatedresultmyobjectdtodict) | [PaginatedResultMyObjectDtoDict](#paginatedresultmyobjectdtodict) | a constructor

# Results
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ResultsTupleInput](#resultstupleinput), [ResultsTuple](#resultstuple) | [ResultsTuple](#resultstuple) |

## ResultsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            my_object_dto.MyObjectDtoDictInput,
            my_object_dto.MyObjectDtoDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            my_object_dto.MyObjectDtoDictInput,
            my_object_dto.MyObjectDtoDict,
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[my_object_dto.MyObjectDtoDictInput](../../components/schema/my_object_dto.md#myobjectdtodictinput), [my_object_dto.MyObjectDtoDict](../../components/schema/my_object_dto.md#myobjectdtodict) |  |

## ResultsTuple
```
base class: typing.Tuple[
    my_object_dto.MyObjectDtoDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ResultsTupleInput](#resultstupleinput), [ResultsTuple](#resultstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [my_object_dto.MyObjectDtoDict](../../components/schema/my_object_dto.md#myobjectdtodict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
