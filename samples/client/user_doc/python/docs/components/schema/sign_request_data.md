# SignRequestData
some_api.components.schema.sign_request_data
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SignRequestDataDictInput](#signrequestdatadictinput), [SignRequestDataDict](#signrequestdatadict) | [SignRequestDataDict](#signrequestdatadict) |

## SignRequestDataDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**message** | str |  |
**mode** | typing.Literal["PKCS1", "PSS_MD5", "PSS_SHA1", "PSS_SHA224", "PSS_SHA256", "PSS_SHA384", "PSS_SHA512", "EdDSA", "ECDSA"] |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## SignRequestDataDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**message** | str |  |
**mode** | typing.Literal["PKCS1", "PSS_MD5", "PSS_SHA1", "PSS_SHA224", "PSS_SHA256", "PSS_SHA384", "PSS_SHA512", "EdDSA", "ECDSA"] |  |
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**message** | str |  |
**mode** | typing.Literal["PKCS1", "PSS_MD5", "PSS_SHA1", "PSS_SHA224", "PSS_SHA256", "PSS_SHA384", "PSS_SHA512", "EdDSA", "ECDSA"] |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SignRequestDataDictInput](#signrequestdatadictinput), [SignRequestDataDict](#signrequestdatadict) | [SignRequestDataDict](#signrequestdatadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
