# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
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

from unit_test_api import schemas  # noqa: F401


class RefInItems(
    schemas.ListSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        @staticmethod
        def items() -> typing.Type['PropertyNamedRefThatIsNotAReference']:
            return PropertyNamedRefThatIsNotAReference

    def __new__(
        cls,
        _arg: typing.Union[typing.Tuple['PropertyNamedRefThatIsNotAReference'], typing.List['PropertyNamedRefThatIsNotAReference']],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'RefInItems':
        return super().__new__(
            cls,
            _arg,
            _configuration=_configuration,
        )
    def __getitem__(self, i: int) -> 'PropertyNamedRefThatIsNotAReference':
        return super().__getitem__(i)

from unit_test_api.model.property_named_ref_that_is_not_a_reference import PropertyNamedRefThatIsNotAReference
