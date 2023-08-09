# AnimalFarm
petstore_api.components.schema.animal_farm
```
type: schemas.Schema
```

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
≥ 0 | [animal.AnimalDictInput](../../components/schema/animal.md#animaldictinput), [animal.AnimalDict](../../components/schema/animal.md#animaldict) |  |

## AnimalFarmTuple
```
base class: typing.Tuple[
    animal.AnimalDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [AnimalFarmTupleInput](#animalfarmtupleinput), [AnimalFarmTuple](#animalfarmtuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
