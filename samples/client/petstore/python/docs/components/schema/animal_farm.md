petstore_api.components.schema.animal_farm
# Schema AnimalFarm

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AnimalFarmTupleInput](#animalfarmtupleinput), [AnimalFarmTuple](#animalfarmtuple) | [AnimalFarmTuple](#animalfarmtuple) |

## AnimalFarmTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            animal.AnimalDictInput,
            animal.AnimalDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            animal.AnimalDictInput,
            animal.AnimalDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**Animal**](animal.md) |  |

## AnimalFarmTuple
```
base class: typing.Tuple[
    animal.AnimalDict,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**Animal**](animal.md) | [**Animal**](animal.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
