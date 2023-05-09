# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class JSONPatchRequestMoveCopy(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "from",
            "op",
            "path",
        }
        
        class Properties:
            _From = schemas.StrSchema
            Path = schemas.StrSchema
            
            
            class Op(
                schemas.StrSchema
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "move": "MOVE",
                        "copy": "COPY",
                    }
                
                @schemas.classproperty
                def MOVE(cls):
                    return cls("move")
                
                @schemas.classproperty
                def COPY(cls):
                    return cls("copy")
            __annotations__ = {
                "from": _From,
                "path": Path,
                "op": Op,
            }
        AdditionalProperties = schemas.NotAnyTypeSchema
    
    op: Schema_.Properties.Op
    path: Schema_.Properties.Path
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["from"]) -> Schema_.Properties._From: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> Schema_.Properties.Op: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> Schema_.Properties.Path: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["from"],
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        op: typing.Union[Schema_.Properties.Op, str],
        path: typing.Union[Schema_.Properties.Path, str],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> 'JSONPatchRequestMoveCopy':
        return super().__new__(
            cls,
            *args_,
            op=op,
            path=path,
            configuration_=configuration_,
        )
