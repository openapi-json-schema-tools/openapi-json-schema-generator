<a name="top"></a>
# **update_pet**
<a name="update_pet"></a>

Update an existing pet

## Table of Contents
- [Arguments](#Arguments)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_pet.md) | typing.Union[[Pet.content.application_json.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_jsonschema), [Pet.content.application_xml.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_xmlschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
host_index | typing.Optional[int] | default is None | Allows one to select a different host
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Pet not found
405 | [ResponseFor405.response_cls](#response_405response_cls) | Validation exception

#### <a id="response_400response_cls" >ResponseFor400.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="response_404response_cls" >ResponseFor404.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="response_405response_cls" >ResponseFor405.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Authorization

[http_signature_test](../../../../README.md#http_signature_test), [petstore_auth](../../../../README.md#petstore_auth)

## Code Sample

* OAuth Authentication (petstore_auth):
```python
import petstore_api
from petstore_api.apis.tags import pet_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP message signature: http_signature_test
# The HTTP Signature Header mechanism that can be used by a client to
# authenticate the sender of a message and ensure that particular headers
# have not been modified in transit.
#
# You can specify the signing key-id, private key path, signing scheme,
# signing algorithm, list of signed headers and signature max validity.
# The 'key_id' parameter is an opaque string that the API server can use
# to lookup the client and validate the signature.
# The 'private_key_path' parameter should be the path to a file that
# contains a DER or base-64 encoded private key.
# The 'private_key_passphrase' parameter is optional. Set the passphrase
# if the private key is encrypted.
# The 'signed_headers' parameter is used to specify the list of
# HTTP headers included when generating the signature for the message.
# You can specify HTTP headers that you want to protect with a cryptographic
# signature. Note that proxies may add, modify or remove HTTP headers
# for legitimate reasons, so you should only add headers that you know
# will not be modified. For example, if you want to protect the HTTP request
# body, you can specify the Digest header. In that case, the client calculates
# the digest of the HTTP request body and includes the digest in the message
# signature.
# The 'signature_max_validity' parameter is optional. It is configured as a
# duration to express when the signature ceases to be valid. The client calculates
# the expiration date every time it generates the cryptographic signature
# of an HTTP request. The API server may have its own security policy
# that controls the maximum validity of the signature. The client max validity
# must be lower than the server max validity.
# The time on the client and server must be synchronized, otherwise the
# server may reject the client signature.
#
# The client must use a combination of private key, signing scheme,
# signing algorithm and hash algorithm that matches the security policy of
# the API server.
#
# See petstore_api.signing for a list of all supported parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2",
    signing_info = petstore_api.signing.HttpSigningConfiguration(
        key_id = 'my-key-id',
        private_key_path = 'private_key.pem',
        private_key_passphrase = 'YOUR_PASSPHRASE',
        signing_scheme = petstore_api.signing.SCHEME_HS2019,
        signing_algorithm = petstore_api.signing.ALGORITHM_ECDSA_MODE_FIPS_186_3,
        hash_algorithm = petstore_api.signing.SCHEME_RSA_SHA256,
        signed_headers = [
                            petstore_api.signing.HEADER_REQUEST_TARGET,
                            petstore_api.signing.HEADER_CREATED,
                            petstore_api.signing.HEADER_EXPIRES,
                            petstore_api.signing.HEADER_HOST,
                            petstore_api.signing.HEADER_DATE,
                            petstore_api.signing.HEADER_DIGEST,
                            'Content-Type',
                            'Content-Length',
                            'User-Agent'
                         ],
        signature_max_validity = datetime.timedelta(minutes=5)
    )
)

# Configure OAuth2 access token for authorization: petstore_auth
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2",
    access_token = 'YOUR_ACCESS_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    body = pet.Pet(
        id=1,
        category=category.Category(
            id=1,
            name="default-name",
        ),
        name="doggie",
        photo_urls=[
            "photo_urls_example"
        ],
        tags=[
            tag.Tag(
                id=1,
                name="name_example",
            )
        ],
        status="available",
    )
    try:
        # Update an existing pet
        api_response = api_instance.update_pet(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->update_pet: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
