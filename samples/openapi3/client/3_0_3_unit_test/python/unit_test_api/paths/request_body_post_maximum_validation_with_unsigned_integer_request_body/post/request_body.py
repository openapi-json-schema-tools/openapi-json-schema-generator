# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from unit_test_api import api_client, exceptions
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

from unit_test_api.components.schema import maximum_validation_with_unsigned_integer


ApplicationJson = maximum_validation_with_unsigned_integer.MaximumValidationWithUnsignedInteger

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=ApplicationJson
        ),
    },
    required=True,
)
