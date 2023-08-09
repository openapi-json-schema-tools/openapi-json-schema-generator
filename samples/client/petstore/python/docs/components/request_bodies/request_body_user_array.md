petstore_api.components.request_bodies.request_body_user_array
# RequestBody UserArray

## Description
List of user object

## Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## content ApplicationJson Schema
petstore_api.components.request_bodies.request_body_user_array.content.application_json.schema
```
type: schemas.Schema
```

### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#content-applicationjson-schema-schematupleinput), [SchemaTuple](#content-applicationjson-schema-schematuple) | [SchemaTuple](#content-applicationjson-schema-schematuple) |

### content ApplicationJson Schema SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            user.UserDictInput,
            user.UserDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            user.UserDictInput,
            user.UserDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [user.UserDictInput](../../components/schema/user.md#userdictinput), [user.UserDict](../../components/schema/user.md#userdict) |  |

### content ApplicationJson Schema SchemaTuple
```
base class: typing.Tuple[
    user.UserDict,
    ...
]
```
#### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#content-applicationjson-schema-schematupleinput), [SchemaTuple](#content-applicationjson-schema-schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

#### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
