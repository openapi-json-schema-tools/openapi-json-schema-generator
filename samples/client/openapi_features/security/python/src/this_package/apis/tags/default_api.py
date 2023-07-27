# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from this_package.paths.path_with_one_explicit_security.get.operation import PathWithOneExplicitSecurity
from this_package.paths.path_with_no_explicit_security.get.operation import PathWithNoExplicitSecurity
from this_package.paths.path_with_security_from_root.get.operation import PathWithSecurityFromRoot
from this_package.paths.path_with_two_explicit_security.get.operation import PathWithTwoExplicitSecurity


class DefaultApi(
    PathWithOneExplicitSecurity,
    PathWithNoExplicitSecurity,
    PathWithSecurityFromRoot,
    PathWithTwoExplicitSecurity,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    pass