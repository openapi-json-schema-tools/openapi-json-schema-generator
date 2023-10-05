# SystemInfo
some_api.components.schema.system_info
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SystemInfoDictInput](#systeminfodictinput), [SystemInfoDict](#systeminfodict) | [SystemInfoDict](#systeminfodict) |

## SystemInfoDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**akPub** | dict, schemas.immutabledict |  |
**deviceId** | str |  |
**firmwareVersion** | str |  |
**hardwareVersion** | str |  |
**pcr** | dict, schemas.immutabledict |  |
**softwareBuild** | str |  |
**softwareVersion** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## SystemInfoDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**akPub** | dict, schemas.immutabledict |  |
**deviceId** | str |  |
**firmwareVersion** | str |  |
**hardwareVersion** | str |  |
**pcr** | dict, schemas.immutabledict |  |
**softwareBuild** | str |  |
**softwareVersion** | str |  |
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**akPub** | schemas.immutabledict |  |
**deviceId** | str |  |
**firmwareVersion** | str |  |
**hardwareVersion** | str |  |
**pcr** | schemas.immutabledict |  |
**softwareBuild** | str |  |
**softwareVersion** | str |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SystemInfoDictInput](#systeminfodictinput), [SystemInfoDict](#systeminfodict) | [SystemInfoDict](#systeminfodict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

# AkPub
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# Pcr
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
