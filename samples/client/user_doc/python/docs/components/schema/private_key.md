# PrivateKey
some_api.components.schema.private_key
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PrivateKeyDictInput](#privatekeydictinput), [PrivateKeyDict](#privatekeydict) | [PrivateKeyDict](#privatekeydict) |

## PrivateKeyDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**key** | [key_private_data.KeyPrivateDataDictInput](../../components/schema/key_private_data.md#keyprivatedatadictinput), [key_private_data.KeyPrivateDataDict](../../components/schema/key_private_data.md#keyprivatedatadict) |  |
**mechanisms** | [key_mechanisms.KeyMechanismsTupleInput](../../components/schema/key_mechanisms.md#keymechanismstupleinput), [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**restrictions** | [key_restrictions.KeyRestrictionsDictInput](../../components/schema/key_restrictions.md#keyrestrictionsdictinput), [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PrivateKeyDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**key** | [key_private_data.KeyPrivateDataDictInput](../../components/schema/key_private_data.md#keyprivatedatadictinput), [key_private_data.KeyPrivateDataDict](../../components/schema/key_private_data.md#keyprivatedatadict) |  |
**mechanisms** | [key_mechanisms.KeyMechanismsTupleInput](../../components/schema/key_mechanisms.md#keymechanismstupleinput), [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**restrictions** | [key_restrictions.KeyRestrictionsDictInput](../../components/schema/key_restrictions.md#keyrestrictionsdictinput), [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**key** | [key_private_data.KeyPrivateDataDict](../../components/schema/key_private_data.md#keyprivatedatadict) |  |
**mechanisms** | [key_mechanisms.KeyMechanismsTuple](../../components/schema/key_mechanisms.md#keymechanismstuple) |  |
**type** | typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"] |  |
**restrictions** | [key_restrictions.KeyRestrictionsDict](../../components/schema/key_restrictions.md#keyrestrictionsdict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PrivateKeyDictInput](#privatekeydictinput), [PrivateKeyDict](#privatekeydict) | [PrivateKeyDict](#privatekeydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
