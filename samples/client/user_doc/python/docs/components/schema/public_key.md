# PublicKey
some_api.components.schema.public_key
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PublicKeyDictInput](#publickeydictinput), [PublicKeyDict](#publickeydict) | [PublicKeyDict](#publickeydict) |

## PublicKeyDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mechanisms** | [key_mechanisms.KeyMechanismsTupleInput](../../components/schema/key_mechanisms.md#keymechanismstupleinput), [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**operations** | int |  |
**restrictions** | [key_restrictions.KeyRestrictionsDictInput](../../components/schema/key_restrictions.md#keyrestrictionsdictinput), [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**key** | [key_public_data.KeyPublicDataDictInput](../../components/schema/key_public_data.md#keypublicdatadictinput), [key_public_data.KeyPublicDataDict](../../components/schema/key_public_data.md#keypublicdatadict) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PublicKeyDict
```
base class: schemas.immutabledict[str, int]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**mechanisms** | [key_mechanisms.KeyMechanismsTupleInput](../../components/schema/key_mechanisms.md#keymechanismstupleinput), [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**operations** | int |  |
**restrictions** | [key_restrictions.KeyRestrictionsDictInput](../../components/schema/key_restrictions.md#keyrestrictionsdictinput), [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**key** | [key_public_data.KeyPublicDataDictInput](../../components/schema/key_public_data.md#keypublicdatadictinput), [key_public_data.KeyPublicDataDict](../../components/schema/key_public_data.md#keypublicdatadict), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**mechanisms** | [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**operations** | int |  |
**restrictions** | [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**key** | [key_public_data.KeyPublicDataDict](../../components/schema/key_public_data.md#keypublicdatadict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PublicKeyDictInput](#publickeydictinput), [PublicKeyDict](#publickeydict) | [PublicKeyDict](#publickeydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
