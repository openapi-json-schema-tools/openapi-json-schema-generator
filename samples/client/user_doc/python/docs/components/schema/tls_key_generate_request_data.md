# TlsKeyGenerateRequestData
some_api.components.schema.tls_key_generate_request_data
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TlsKeyGenerateRequestDataDictInput](#tlskeygeneraterequestdatadictinput), [TlsKeyGenerateRequestDataDict](#tlskeygeneraterequestdatadict) | [TlsKeyGenerateRequestDataDict](#tlskeygeneraterequestdatadict) |

## TlsKeyGenerateRequestDataDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521"] |  |
**length** | int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## TlsKeyGenerateRequestDataDict
```
base class: schemas.immutabledict[str, int]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521"] |  |
**length** | int, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521"] |  |
**length** | int, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [TlsKeyGenerateRequestDataDictInput](#tlskeygeneraterequestdatadictinput), [TlsKeyGenerateRequestDataDict](#tlskeygeneraterequestdatadict) | [TlsKeyGenerateRequestDataDict](#tlskeygeneraterequestdatadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
