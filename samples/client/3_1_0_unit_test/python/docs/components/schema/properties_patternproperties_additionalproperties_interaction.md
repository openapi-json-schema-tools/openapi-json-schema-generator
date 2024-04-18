# PropertiesPatternpropertiesAdditionalpropertiesInteraction
openapi_client.components.schema.properties_patternproperties_additionalproperties_interaction
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput](#propertiespatternpropertiesadditionalpropertiesinteractiondictinput), [PropertiesPatternpropertiesAdditionalpropertiesInteractionDict](#propertiespatternpropertiesadditionalpropertiesinteractiondict) | [PropertiesPatternpropertiesAdditionalpropertiesInteractionDict](#propertiespatternpropertiesadditionalpropertiesinteractiondict) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
        ],
        typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
        ],
        int,
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**foo** | list, tuple |  | [optional]
**bar** | list, tuple |  | [optional]
**any_string_name** | int | any string name can be used but the value must be the correct type | [optional]

## PropertiesPatternpropertiesAdditionalpropertiesInteractionDict
```
base class: schemas.immutabledict[str, typing.Union[
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    int,
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**foo** | list, tuple, schemas.Unset |  | [optional]
**bar** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | int | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**foo** | tuple, schemas.Unset |  | [optional]
**bar** | tuple, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput](#propertiespatternpropertiesadditionalpropertiesinteractiondictinput), [PropertiesPatternpropertiesAdditionalpropertiesInteractionDict](#propertiespatternpropertiesadditionalpropertiesinteractiondict) | [PropertiesPatternpropertiesAdditionalpropertiesInteractionDict](#propertiespatternpropertiesadditionalpropertiesinteractiondict) | a constructor
get_additional_property_ | str | int, schemas.Unset | provides type safety for additional properties

# Foo
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
list, tuple | tuple |

# Bar
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
list, tuple | tuple |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
