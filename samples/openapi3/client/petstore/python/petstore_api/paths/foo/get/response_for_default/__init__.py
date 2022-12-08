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

from petstore_api.components.schema import foo

# body schemas


class schema(
    schemas.DictSchema
):


    class MetaOapg:
        types = {frozendict.frozendict}
        
        class properties:
        
            @staticmethod
            def string() -> typing.Type['foo.Foo']:
                return foo.Foo
            __annotations__ = {
                "string": string,
            }
    # type hints for optional __getitem__
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> 'foo.Foo': ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["string"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["string"]) -> typing.Union['foo.Foo', schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["string"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        string: typing.Union['foo.Foo', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'schema':
        return super().__new__(
            cls,
            *_args,
            string=string,
            _configuration=_configuration,
            **kwargs,
        )


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schema,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            schema=schema,
        ),
    },
)
