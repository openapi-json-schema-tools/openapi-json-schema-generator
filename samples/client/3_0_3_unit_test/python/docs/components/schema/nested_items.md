# NestedItems
unit_test_api.components.schema.nested_items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NestedItemsTupleInput](#nesteditemstupleinput), [NestedItemsTuple](#nesteditemstuple) | [NestedItemsTuple](#nesteditemstuple) |

## NestedItemsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput3,
            ItemsTuple3
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput3,
            ItemsTuple3
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[ItemsTupleInput3](#itemstupleinput3), [ItemsTuple3](#itemstuple3) |  |

## NestedItemsTuple
```
base class: typing.Tuple[
    ItemsTuple3,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [NestedItemsTupleInput](#nesteditemstupleinput), [NestedItemsTuple](#nesteditemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple3](#itemstuple3) | This method is used under the hood when instance[0] is called

# Items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput3](#itemstupleinput3), [ItemsTuple3](#itemstuple3) | [ItemsTuple3](#itemstuple3) |

## ItemsTupleInput3
```
type: typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2) |  |

## ItemsTuple3
```
base class: typing.Tuple[
    ItemsTuple2,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsTupleInput3](#itemstupleinput3), [ItemsTuple3](#itemstuple3)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple2](#itemstuple2) | This method is used under the hood when instance[0] is called

# Items2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2) | [ItemsTuple2](#itemstuple2) |

## ItemsTupleInput2
```
type: typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple) |  |

## ItemsTuple2
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple](#itemstuple) | This method is used under the hood when instance[0] is called

# Items3
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple) | [ItemsTuple](#itemstuple) |

## ItemsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            int,
            float
        ],
    ],
    typing.Tuple[
        typing.Union[
            int,
            float
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
float, int |  |

## ItemsTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | float, int | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
