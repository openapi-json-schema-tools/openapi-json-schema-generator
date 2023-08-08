petstore_api.components.request_bodies.request_body_user_array
# RequestBody UserArray

## Description
List of user object

## Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## content ApplicationJson Schema

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
≥ 0 | [**User**](../../components/schema/user.md) |  |

### content ApplicationJson Schema SchemaTuple
```
base class: typing.Tuple[
    user.UserDict,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**User**](../../components/schema/user.md) | [**User**](../../components/schema/user.md) |  |

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
