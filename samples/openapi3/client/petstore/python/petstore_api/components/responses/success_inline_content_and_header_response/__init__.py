import dataclasses
import urllib3

from petstore_api import api_client
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
from . import parameter_some_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'someHeader': typing.Union[parameter_some_header.schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_some_header.parameter_oapg,
    ]
# body schemas


class application_json(
    schemas.DictSchema
):


    class MetaOapg:
        types = {frozendict.frozendict}
        additional_properties = schemas.Int32Schema
    
    def __getitem__(self, name: str) -> MetaOapg.additional_properties
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    def get_item_oapg(self, name: str) -> MetaOapg.additional_properties
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, decimal.Decimal, int, ],
    ) -> 'application_json':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            schema=application_json,
        ),
    },
    headers=Header.parameters
)
