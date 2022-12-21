# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class BananaReq(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "lengthCm",
        }
        
        class Properties:
            LengthCm = schemas.NumberSchema
            Sweet = schemas.BoolSchema
            __annotations__ = {
                "lengthCm": LengthCm,
                "sweet": Sweet,
            }
        AdditionalProperties = schemas.NotAnyTypeSchema
    
    lengthCm: MetaOapg.Properties.LengthCm
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lengthCm"]) -> MetaOapg.Properties.LengthCm: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sweet"]) -> MetaOapg.Properties.Sweet: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["lengthCm"],
            typing_extensions.Literal["sweet"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lengthCm"]) -> MetaOapg.Properties.LengthCm: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sweet"]) -> typing.Union[MetaOapg.Properties.Sweet, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["lengthCm"],
            typing_extensions.Literal["sweet"],
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        lengthCm: typing.Union[MetaOapg.Properties.LengthCm, decimal.Decimal, int, float, ],
        sweet: typing.Union[MetaOapg.Properties.Sweet, bool, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'BananaReq':
        return super().__new__(
            cls,
            *_args,
            lengthCm=lengthCm,
            sweet=sweet,
            _configuration=_configuration,
        )
