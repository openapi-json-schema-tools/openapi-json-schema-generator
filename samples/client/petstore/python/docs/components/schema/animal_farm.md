# AnimalFarm
openapi_client.components.schema.animal_farm
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[animal.AnimalDictInput](../../components/schema/animal.md#animaldictinput), [animal.AnimalDict](../../components/schema/animal.md#animaldict) |  |

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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [animal.AnimalDict](../../components/schema/animal.md#animaldict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
