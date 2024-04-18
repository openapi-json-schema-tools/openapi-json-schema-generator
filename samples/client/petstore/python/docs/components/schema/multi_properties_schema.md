# MultiPropertiesSchema
openapi_client.components.schema.multi_properties_schema
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MultiPropertiesSchemaDictInput](#multipropertiesschemadictinput), [MultiPropertiesSchemaDict](#multipropertiesschemadict) | [MultiPropertiesSchemaDict](#multipropertiesschemadict) |

## MultiPropertiesSchemaDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**status** | int |  | value must be a 32 bit integer
**data** | [DataTupleInput](#datatupleinput), [DataTuple](#datatuple) |  | [optional]
**message** | str |  | [optional]

## MultiPropertiesSchemaDict
```
base class: schemas.immutabledict[str, typing.Union[
    str,
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    int,
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**status** | int |  | value must be a 32 bit integer
**data** | [DataTupleInput](#datatupleinput), [DataTuple](#datatuple), schemas.Unset |  | [optional]
**message** | str, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**status** | int |  | value must be a 32 bit integer
**data** | [DataTuple](#datatuple), schemas.Unset |  | [optional]
**message** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MultiPropertiesSchemaDictInput](#multipropertiesschemadictinput), [MultiPropertiesSchemaDict](#multipropertiesschemadict) | [MultiPropertiesSchemaDict](#multipropertiesschemadict) | a constructor

# Data
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[DataTupleInput](#datatupleinput), [DataTuple](#datatuple) | [DataTuple](#datatuple) |

## DataTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            items_schema.ItemsSchemaDictInput,
            items_schema.ItemsSchemaDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            items_schema.ItemsSchemaDictInput,
            items_schema.ItemsSchemaDict,
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[items_schema.ItemsSchemaDictInput](../../components/schema/items_schema.md#itemsschemadictinput), [items_schema.ItemsSchemaDict](../../components/schema/items_schema.md#itemsschemadict) |  |

## DataTuple
```
base class: typing.Tuple[
    items_schema.ItemsSchemaDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [DataTupleInput](#datatupleinput), [DataTuple](#datatuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [items_schema.ItemsSchemaDict](../../components/schema/items_schema.md#itemsschemadict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
