# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import copy
from http import client as http_client
import logging
import multiprocessing
import sys
import typing
import typing_extensions

import urllib3

from petstore_api import exceptions
from petstore_api.components.security_schemes import security_scheme_api_key
from petstore_api.components.security_schemes import security_scheme_api_key_query
from petstore_api.components.security_schemes import security_scheme_bearer_test
from petstore_api.components.security_schemes import security_scheme_http_basic_test
from petstore_api.components.security_schemes import security_scheme_http_signature_test
from petstore_api.components.security_schemes import security_scheme_open_id_connect_test
from petstore_api.components.security_schemes import security_scheme_petstore_auth

AuthInfo = typing_extensions.TypedDict(
    'AuthInfo',
    {
        'api_key': security_scheme_api_key.ApiKey,
        'api_key_query': security_scheme_api_key_query.ApiKeyQuery,
        'bearer_test': security_scheme_bearer_test.BearerTest,
        'http_basic_test': security_scheme_http_basic_test.HttpBasicTest,
        'http_signature_test': security_scheme_http_signature_test.HttpSignatureTest,
        'openIdConnect_test': security_scheme_open_id_connect_test.OpenIdConnectTest,
        'petstore_auth': security_scheme_petstore_auth.PetstoreAuth,
    }
)


PYTHON_KEYWORD_TO_JSON_SCHEMA_KEYWORD = {
    'types': 'type',
    'enum_value_to_name': 'enum',
    'unique_items': 'uniqueItems',
    'min_items': 'minItems',
    'max_items': 'maxItems',
    'min_properties': 'minProperties',
    'max_properties': 'maxProperties',
    'min_length': 'minLength',
    'max_length': 'maxLength',
    'inclusive_minimum': 'minimum',
    'exclusive_minimum': 'exclusiveMinimum',
    'inclusive_maximum': 'maximum',
    'exclusive_maximum': 'exclusiveMaximum',
    'multiple_of': 'multipleOf',
    'regex': 'pattern',
    'format': 'format',
    'required': 'required',
    'items': 'items',
    'Items': 'items',
    'Properties': 'properties',
    'additional_properties': 'additionalProperties',
    'additionalProperties': 'additionalProperties',
    'OneOf': 'oneOf',
    'AnyOf': 'anyOf',
    'AllOf': 'allOf',
    '_not': 'not',
    '_Not': 'not',
    'discriminator': 'discriminator'
}

class Configuration(object):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator

    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    Do not edit the class manually.

    :param host: Base url
    :param auth_info: The security scheme auth info to use when calling endpoints
      The key is a string that identifies the component security scheme that one is adding auth info for
      The value is an instance of the component security scheme class for that security scheme.
      See the AuthInfo TypedDict definition
    :param disabled_json_schema_keywords (set): Set of
      JSON schema validation keywords to disable JSON schema structural validation
      rules. The following keywords may be specified: multipleOf, maximum,
      exclusiveMaximum, minimum, exclusiveMinimum, maxLength, minLength, pattern,
      maxItems, minItems.
      By default, the validation is performed for data generated locally by the client
      and data received from the server, independent of any validation performed by
      the server side. If the input data does not satisfy the JSON schema validation
      rules specified in the OpenAPI document, an exception is raised.
      If disabled_json_schema_keywords is set, structural validation is
      disabled. This can be useful to troubleshoot data validation problem, such as
      when the OpenAPI document validation rules do not match the actual API data
      received by the server.
    :param server_index: Index to servers configuration.
    :param server_variables: Mapping with string values to replace variables in
      templated server configuration. The validation of enums is performed for
      variables with defined enum values before.
    :param server_operation_index: Mapping from operation ID to an index to server
      configuration.
    :param server_operation_variables: Mapping from operation ID to a mapping with
      string values to replace variables in templated server configuration.
      The validation of enums is performed for variables with defined enum values before.
    """

    _default = None

    def __init__(
        self,
        host: typing.Optional[str] = None,
        auth_info: typing.Optional[AuthInfo] = None,
        disabled_json_schema_keywords = frozenset(),
        server_index: typing.Optional[int] = None,
        server_variables = None,
        server_operation_index = None,
        server_operation_variables = None,
    ):
        """Constructor
        """
        self._base_path = host or "http://petstore.swagger.io:80/v2"
        """Default Base url
        """
        self.server_index = 0 if server_index is None and host is None else server_index
        self.server_operation_index = server_operation_index or {}
        """Default server index
        """
        self.server_variables = server_variables or {}
        self.server_operation_variables = server_operation_variables or {}
        """Default server variables
        """
        self.temp_folder_path = None
        """Temp file folder for downloading files
        """
        # Authentication Settings
        self.auth_info = auth_info or AuthInfo()
        self.disabled_json_schema_keywords = disabled_json_schema_keywords
        self.logger = {}
        """Logging Settings
        """
        self.logger["package_logger"] = logging.getLogger("petstore_api")
        self.logger["urllib3_logger"] = logging.getLogger("urllib3")
        self.logger_format = '%(asctime)s %(levelname)s %(message)s'
        """Log format
        """
        self.logger_stream_handler = None
        """Log stream handler
        """
        self.logger_file_handler = None
        """Log file handler
        """
        self.logger_file = None
        """Debug file location
        """
        self.debug = False
        """Debug switch
        """

        self.verify_ssl = True
        """SSL/TLS verification
           Set this to false to skip verifying SSL certificate when calling API
           from https server.
        """
        self.ssl_ca_cert = None
        """Set this to customize the certificate file to verify the peer.
        """
        self.cert_file = None
        """client certificate file
        """
        self.key_file = None
        """client key file
        """
        self.assert_hostname = None
        """Set this to True/False to enable/disable SSL hostname verification.
        """

        self.connection_pool_maxsize = multiprocessing.cpu_count() * 5
        """urllib3 connection pool's maximum number of connections saved
           per pool. urllib3 uses 1 connection as default value, but this is
           not the best value when you are making a lot of possibly parallel
           requests to the same host, which is often the case here.
           cpu_count * 5 is used as default value to increase performance.
        """

        self.proxy = None
        """Proxy URL
        """
        self.proxy_headers = None
        """Proxy headers
        """
        self.safe_chars_for_path_param = ''
        """Safe chars for path_param
        """
        self.retries = None
        """Adding retries to override urllib3 default value 3
        """
        # Enable client side validation
        self.client_side_validation = True

        # Options to pass down to the underlying urllib3 socket
        self.socket_options = None

    def __deepcopy__(self, memo):
        cls = self.__class__
        result = cls.__new__(cls)
        memo[id(self)] = result
        for k, v in self.__dict__.items():
            if k not in ('logger', 'logger_file_handler'):
                setattr(result, k, copy.deepcopy(v, memo))
        # shallow copy of loggers
        result.logger = copy.copy(self.logger)
        # use setters to configure loggers
        result.logger_file = self.logger_file
        result.debug = self.debug
        return result

    @property
    def disabled_json_schema_keywords(self) -> typing.Set[str]:
        return self.__disabled_json_schema_keywords

    @property
    def disabled_json_schema_python_keywords(self) -> typing.Set[str]:
        return self.__disabled_json_schema_python_keywords

    @disabled_json_schema_keywords.setter
    def disabled_json_schema_keywords(self, json_keywords: typing.Set[str]):
        disabled_json_schema_keywords = set()
        disabled_json_schema_python_keywords = set()
        for k in json_keywords:
            python_keywords = {key for key, val in PYTHON_KEYWORD_TO_JSON_SCHEMA_KEYWORD.items() if val == k}
            if not python_keywords:
                raise exceptions.ApiValueError(
                    "Invalid keyword: '{0}''".format(k))
            disabled_json_schema_keywords.add(k)
            disabled_json_schema_python_keywords.update(python_keywords)
        self.__disabled_json_schema_keywords = disabled_json_schema_keywords
        self.__disabled_json_schema_python_keywords = disabled_json_schema_python_keywords

    @classmethod
    def set_default(cls, default):
        """Set default instance of configuration.

        It stores default configuration, which can be
        returned by get_default_copy method.

        :param default: object of Configuration
        """
        cls._default = copy.deepcopy(default)

    @classmethod
    def get_default_copy(cls):
        """Return new instance of configuration.

        This method returns newly created, based on default constructor,
        object of Configuration class or returns a copy of default
        configuration passed by the set_default method.

        :return: The configuration object.
        """
        if cls._default is not None:
            return copy.deepcopy(cls._default)
        return Configuration()

    @property
    def logger_file(self):
        """The logger file.

        If the logger_file is None, then add stream handler and remove file
        handler. Otherwise, add file handler and remove stream handler.

        :param value: The logger_file path.
        :type: str
        """
        return self.__logger_file

    @logger_file.setter
    def logger_file(self, value):
        """The logger file.

        If the logger_file is None, then add stream handler and remove file
        handler. Otherwise, add file handler and remove stream handler.

        :param value: The logger_file path.
        :type: str
        """
        self.__logger_file = value
        if self.__logger_file:
            # If set logging file,
            # then add file handler and remove stream handler.
            self.logger_file_handler = logging.FileHandler(self.__logger_file)
            self.logger_file_handler.setFormatter(self.logger_formatter)
            for _, logger in self.logger.items():
                logger.addHandler(self.logger_file_handler)

    @property
    def debug(self):
        """Debug status

        :param value: The debug status, True or False.
        :type: bool
        """
        return self.__debug

    @debug.setter
    def debug(self, value):
        """Debug status

        :param value: The debug status, True or False.
        :type: bool
        """
        self.__debug = value
        if self.__debug:
            # if debug status is True, turn on debug logging
            for _, logger in self.logger.items():
                logger.setLevel(logging.DEBUG)
            # turn on http_client debug
            http_client.HTTPConnection.debuglevel = 1
        else:
            # if debug status is False, turn off debug logging,
            # setting log level to default `logging.WARNING`
            for _, logger in self.logger.items():
                logger.setLevel(logging.WARNING)
            # turn off http_client debug
            http_client.HTTPConnection.debuglevel = 0

    @property
    def logger_format(self):
        """The logger format.

        The logger_formatter will be updated when sets logger_format.

        :param value: The format string.
        :type: str
        """
        return self.__logger_format

    @logger_format.setter
    def logger_format(self, value):
        """The logger format.

        The logger_formatter will be updated when sets logger_format.

        :param value: The format string.
        :type: str
        """
        self.__logger_format = value
        self.logger_formatter = logging.Formatter(self.__logger_format)

    def to_debug_report(self):
        """Gets the essential information for debugging.

        :return: The report for debugging.
        """
        return "Python SDK Debug Report:\n"\
               "OS: {env}\n"\
               "Python Version: {pyversion}\n"\
               "Version of the API: 1.0.0\n"\
               "SDK Package Version: 1.0.0".\
               format(env=sys.platform, pyversion=sys.version)

    def get_host_settings(self):
        """Gets an array of host settings

        :return: An array of host settings
        """
        return [
            {
                'url': "http://{server}.swagger.io:{port}/v2",
                'description': "petstore server",
                'variables': {
                    'server': {
                        'description': "No description provided",
                        'default_value': "petstore",
                        'enum_values': [
                            "petstore",
                            "qa-petstore",
                            "dev-petstore"
                        ]
                        },
                    'port': {
                        'description': "No description provided",
                        'default_value': "80",
                        'enum_values': [
                            "80",
                            "8080"
                        ]
                        }
                    }
            },
            {
                'url': "https://localhost:8080/{version}",
                'description': "The local server",
                'variables': {
                    'version': {
                        'description': "No description provided",
                        'default_value': "v2",
                        'enum_values': [
                            "v1",
                            "v2"
                        ]
                        }
                    }
            }
        ]

    def get_host_from_settings(
        self,
        index: typing.Optional[int],
        variables: typing.Optional[typing.Dict[str, dict]] = None,
        servers: typing.Optional[typing.List[dict]] = None
    ) -> str:
        """Gets host URL based on the index and variables
        :param index: array index of the host settings
        :param variables: hash of variable and the corresponding value
        :param servers: an array of host settings or None
        :return: URL based on host settings
        """
        if index is None:
            return self._base_path

        variables = variables or {}
        servers = servers or self.get_host_settings()

        try:
            server = servers[index]
        except IndexError:
            raise ValueError(
                "Invalid index {0} when selecting the host settings. "
                "Must be less than {1}".format(index, len(servers)))

        url = server['url']

        # go through variables and replace placeholders
        for variable_name, variable in server.get('variables', {}).items():
            used_value = variables.get(
                variable_name, variable['default_value'])

            if 'enum_values' in variable \
                    and used_value not in variable['enum_values']:
                raise ValueError(
                    "The variable `{0}` in the host URL has invalid value "
                    "{1}. Must be {2}.".format(
                        variable_name, variables[variable_name],
                        variable['enum_values']))

            url = url.replace("{" + variable_name + "}", used_value)

        return url

    @property
    def host(self) -> str:
        """Return generated host."""
        return self.get_host_from_settings(self.server_index, variables=self.server_variables)

    @host.setter
    def host(self, value):
        """Fix base path."""
        self._base_path = value
        self.server_index = None
