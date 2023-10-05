# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from some_api.shared_imports.response_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .headers import header_location
from . import header_parameters
parameters: typing.Dict[str, typing.Type[api_client.HeaderParameterWithoutName]] = {
    'location': header_location.Location,
}


class ApiResponse(api_response.ApiResponse):
    def __init__(
        self,
        *,
        response: urllib3.HTTPResponse,
        headers: header_parameters.HeadersDict,
        body: schemas.Unset = schemas.unset,
    ):
        self.response = response
        self.body = body
        self.headers = headers


class ResponseFor201(api_client.OpenApiResponse[ApiResponse]):
    @classmethod
    def get_response(cls, response, headers, body) -> ApiResponse:
        return ApiResponse(response=response, body=body, headers=headers)
    headers=parameters
    headers_schema = header_parameters.Headers
