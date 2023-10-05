# Schema
some_api.paths.keys_key_id.put.parameters.parameter_0.schema
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#schematupleinput), [SchemaTuple](#schematuple) | [SchemaTuple](#schematuple) |

## SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Literal[
            "RSA_Decryption_RAW",
            "RSA_Decryption_PKCS1",
            "RSA_Decryption_OAEP_MD5",
            "RSA_Decryption_OAEP_SHA1",
            "RSA_Decryption_OAEP_SHA224",
            "RSA_Decryption_OAEP_SHA256",
            "RSA_Decryption_OAEP_SHA384",
            "RSA_Decryption_OAEP_SHA512",
            "RSA_Signature_PKCS1",
            "RSA_Signature_PSS_MD5",
            "RSA_Signature_PSS_SHA1",
            "RSA_Signature_PSS_SHA224",
            "RSA_Signature_PSS_SHA256",
            "RSA_Signature_PSS_SHA384",
            "RSA_Signature_PSS_SHA512",
            "EdDSA_Signature",
            "ECDSA_Signature",
            "AES_Encryption_CBC",
            "AES_Decryption_CBC"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            "RSA_Decryption_RAW",
            "RSA_Decryption_PKCS1",
            "RSA_Decryption_OAEP_MD5",
            "RSA_Decryption_OAEP_SHA1",
            "RSA_Decryption_OAEP_SHA224",
            "RSA_Decryption_OAEP_SHA256",
            "RSA_Decryption_OAEP_SHA384",
            "RSA_Decryption_OAEP_SHA512",
            "RSA_Signature_PKCS1",
            "RSA_Signature_PSS_MD5",
            "RSA_Signature_PSS_SHA1",
            "RSA_Signature_PSS_SHA224",
            "RSA_Signature_PSS_SHA256",
            "RSA_Signature_PSS_SHA384",
            "RSA_Signature_PSS_SHA512",
            "EdDSA_Signature",
            "ECDSA_Signature",
            "AES_Encryption_CBC",
            "AES_Decryption_CBC"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal["RSA_Decryption_RAW", "RSA_Decryption_PKCS1", "RSA_Decryption_OAEP_MD5", "RSA_Decryption_OAEP_SHA1", "RSA_Decryption_OAEP_SHA224", "RSA_Decryption_OAEP_SHA256", "RSA_Decryption_OAEP_SHA384", "RSA_Decryption_OAEP_SHA512", "RSA_Signature_PKCS1", "RSA_Signature_PSS_MD5", "RSA_Signature_PSS_SHA1", "RSA_Signature_PSS_SHA224", "RSA_Signature_PSS_SHA256", "RSA_Signature_PSS_SHA384", "RSA_Signature_PSS_SHA512", "EdDSA_Signature", "ECDSA_Signature", "AES_Encryption_CBC", "AES_Decryption_CBC"] |  |

## SchemaTuple
```
base class: typing.Tuple[
    typing.Literal["RSA_Decryption_RAW", "RSA_Decryption_PKCS1", "RSA_Decryption_OAEP_MD5", "RSA_Decryption_OAEP_SHA1", "RSA_Decryption_OAEP_SHA224", "RSA_Decryption_OAEP_SHA256", "RSA_Decryption_OAEP_SHA384", "RSA_Decryption_OAEP_SHA512", "RSA_Signature_PKCS1", "RSA_Signature_PSS_MD5", "RSA_Signature_PSS_SHA1", "RSA_Signature_PSS_SHA224", "RSA_Signature_PSS_SHA256", "RSA_Signature_PSS_SHA384", "RSA_Signature_PSS_SHA512", "EdDSA_Signature", "ECDSA_Signature", "AES_Encryption_CBC", "AES_Decryption_CBC"],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#schematupleinput), [SchemaTuple](#schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal["RSA_Decryption_RAW", "RSA_Decryption_PKCS1", "RSA_Decryption_OAEP_MD5", "RSA_Decryption_OAEP_SHA1", "RSA_Decryption_OAEP_SHA224", "RSA_Decryption_OAEP_SHA256", "RSA_Decryption_OAEP_SHA384", "RSA_Decryption_OAEP_SHA512", "RSA_Signature_PKCS1", "RSA_Signature_PSS_MD5", "RSA_Signature_PSS_SHA1", "RSA_Signature_PSS_SHA224", "RSA_Signature_PSS_SHA256", "RSA_Signature_PSS_SHA384", "RSA_Signature_PSS_SHA512", "EdDSA_Signature", "ECDSA_Signature", "AES_Encryption_CBC", "AES_Decryption_CBC"] | This method is used under the hood when instance[0] is called
