import typing
import typing_extensions

from openapi_client.apis.paths.solidus import Solidus
from openapi_client.apis.paths.another_fake_dummy import AnotherFakeDummy
from openapi_client.apis.paths.common_param_sub_dir import CommonParamSubDir
from openapi_client.apis.paths.fake import Fake
from openapi_client.apis.paths.fake_additional_properties_with_array_of_enums import FakeAdditionalPropertiesWithArrayOfEnums
from openapi_client.apis.paths.fake_body_with_file_schema import FakeBodyWithFileSchema
from openapi_client.apis.paths.fake_body_with_query_params import FakeBodyWithQueryParams
from openapi_client.apis.paths.fake_case_sensitive_params import FakeCaseSensitiveParams
from openapi_client.apis.paths.fake_delete_coffee_id import FakeDeleteCoffeeId
from openapi_client.apis.paths.fake_health import FakeHealth
from openapi_client.apis.paths.fake_inline_additional_properties import FakeInlineAdditionalProperties
from openapi_client.apis.paths.fake_inline_composition import FakeInlineComposition
from openapi_client.apis.paths.fake_json_form_data import FakeJsonFormData
from openapi_client.apis.paths.fake_json_patch import FakeJsonPatch
from openapi_client.apis.paths.fake_json_with_charset import FakeJsonWithCharset
from openapi_client.apis.paths.fake_multiple_request_body_content_types import FakeMultipleRequestBodyContentTypes
from openapi_client.apis.paths.fake_multiple_response_bodies import FakeMultipleResponseBodies
from openapi_client.apis.paths.fake_multiple_securities import FakeMultipleSecurities
from openapi_client.apis.paths.fake_obj_in_query import FakeObjInQuery
from openapi_client.apis.paths.fake_parameter_collisions1_abab_self_ab import FakeParameterCollisions1AbabSelfAb
from openapi_client.apis.paths.fake_pem_content_type import FakePemContentType
from openapi_client.apis.paths.fake_query_param_with_json_content_type import FakeQueryParamWithJsonContentType
from openapi_client.apis.paths.fake_redirection import FakeRedirection
from openapi_client.apis.paths.fake_ref_obj_in_query import FakeRefObjInQuery
from openapi_client.apis.paths.fake_refs_array_of_enums import FakeRefsArrayOfEnums
from openapi_client.apis.paths.fake_refs_arraymodel import FakeRefsArraymodel
from openapi_client.apis.paths.fake_refs_boolean import FakeRefsBoolean
from openapi_client.apis.paths.fake_refs_composed_one_of_number_with_validations import FakeRefsComposedOneOfNumberWithValidations
from openapi_client.apis.paths.fake_refs_enum import FakeRefsEnum
from openapi_client.apis.paths.fake_refs_mammal import FakeRefsMammal
from openapi_client.apis.paths.fake_refs_number import FakeRefsNumber
from openapi_client.apis.paths.fake_refs_object_model_with_ref_props import FakeRefsObjectModelWithRefProps
from openapi_client.apis.paths.fake_refs_string import FakeRefsString
from openapi_client.apis.paths.fake_response_without_schema import FakeResponseWithoutSchema
from openapi_client.apis.paths.fake_test_query_paramters import FakeTestQueryParamters
from openapi_client.apis.paths.fake_upload_download_file import FakeUploadDownloadFile
from openapi_client.apis.paths.fake_upload_file import FakeUploadFile
from openapi_client.apis.paths.fake_upload_files import FakeUploadFiles
from openapi_client.apis.paths.fake_wild_card_responses import FakeWildCardResponses
from openapi_client.apis.paths.fake_pet_id_upload_image_with_required_file import FakePetIdUploadImageWithRequiredFile
from openapi_client.apis.paths.fake_classname_test import FakeClassnameTest
from openapi_client.apis.paths.foo import Foo
from openapi_client.apis.paths.pet import Pet
from openapi_client.apis.paths.pet_find_by_status import PetFindByStatus
from openapi_client.apis.paths.pet_find_by_tags import PetFindByTags
from openapi_client.apis.paths.pet_pet_id import PetPetId
from openapi_client.apis.paths.pet_pet_id_upload_image import PetPetIdUploadImage
from openapi_client.apis.paths.store_inventory import StoreInventory
from openapi_client.apis.paths.store_order import StoreOrder
from openapi_client.apis.paths.store_order_order_id import StoreOrderOrderId
from openapi_client.apis.paths.user import User
from openapi_client.apis.paths.user_create_with_array import UserCreateWithArray
from openapi_client.apis.paths.user_create_with_list import UserCreateWithList
from openapi_client.apis.paths.user_login import UserLogin
from openapi_client.apis.paths.user_logout import UserLogout
from openapi_client.apis.paths.user_username import UserUsername

PathToApi = typing.TypedDict(
    'PathToApi',
    {
    "/": typing.Type[Solidus],
    "/another-fake/dummy": typing.Type[AnotherFakeDummy],
    "/commonParam/{subDir}/": typing.Type[CommonParamSubDir],
    "/fake": typing.Type[Fake],
    "/fake/additional-properties-with-array-of-enums": typing.Type[FakeAdditionalPropertiesWithArrayOfEnums],
    "/fake/body-with-file-schema": typing.Type[FakeBodyWithFileSchema],
    "/fake/body-with-query-params": typing.Type[FakeBodyWithQueryParams],
    "/fake/case-sensitive-params": typing.Type[FakeCaseSensitiveParams],
    "/fake/deleteCoffee/{id}": typing.Type[FakeDeleteCoffeeId],
    "/fake/health": typing.Type[FakeHealth],
    "/fake/inline-additionalProperties": typing.Type[FakeInlineAdditionalProperties],
    "/fake/inlineComposition/": typing.Type[FakeInlineComposition],
    "/fake/jsonFormData": typing.Type[FakeJsonFormData],
    "/fake/jsonPatch": typing.Type[FakeJsonPatch],
    "/fake/jsonWithCharset": typing.Type[FakeJsonWithCharset],
    "/fake/multipleRequestBodyContentTypes/": typing.Type[FakeMultipleRequestBodyContentTypes],
    "/fake/multipleResponseBodies": typing.Type[FakeMultipleResponseBodies],
    "/fake/multipleSecurities": typing.Type[FakeMultipleSecurities],
    "/fake/objInQuery": typing.Type[FakeObjInQuery],
    "/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/": typing.Type[FakeParameterCollisions1AbabSelfAb],
    "/fake/pemContentType": typing.Type[FakePemContentType],
    "/fake/queryParamWithJsonContentType": typing.Type[FakeQueryParamWithJsonContentType],
    "/fake/redirection": typing.Type[FakeRedirection],
    "/fake/refObjInQuery": typing.Type[FakeRefObjInQuery],
    "/fake/refs/array-of-enums": typing.Type[FakeRefsArrayOfEnums],
    "/fake/refs/arraymodel": typing.Type[FakeRefsArraymodel],
    "/fake/refs/boolean": typing.Type[FakeRefsBoolean],
    "/fake/refs/composed_one_of_number_with_validations": typing.Type[FakeRefsComposedOneOfNumberWithValidations],
    "/fake/refs/enum": typing.Type[FakeRefsEnum],
    "/fake/refs/mammal": typing.Type[FakeRefsMammal],
    "/fake/refs/number": typing.Type[FakeRefsNumber],
    "/fake/refs/object_model_with_ref_props": typing.Type[FakeRefsObjectModelWithRefProps],
    "/fake/refs/string": typing.Type[FakeRefsString],
    "/fake/responseWithoutSchema": typing.Type[FakeResponseWithoutSchema],
    "/fake/test-query-paramters": typing.Type[FakeTestQueryParamters],
    "/fake/uploadDownloadFile": typing.Type[FakeUploadDownloadFile],
    "/fake/uploadFile": typing.Type[FakeUploadFile],
    "/fake/uploadFiles": typing.Type[FakeUploadFiles],
    "/fake/wildCardResponses": typing.Type[FakeWildCardResponses],
    "/fake/{petId}/uploadImageWithRequiredFile": typing.Type[FakePetIdUploadImageWithRequiredFile],
    "/fake_classname_test": typing.Type[FakeClassnameTest],
    "/foo": typing.Type[Foo],
    "/pet": typing.Type[Pet],
    "/pet/findByStatus": typing.Type[PetFindByStatus],
    "/pet/findByTags": typing.Type[PetFindByTags],
    "/pet/{petId}": typing.Type[PetPetId],
    "/pet/{petId}/uploadImage": typing.Type[PetPetIdUploadImage],
    "/store/inventory": typing.Type[StoreInventory],
    "/store/order": typing.Type[StoreOrder],
    "/store/order/{order_id}": typing.Type[StoreOrderOrderId],
    "/user": typing.Type[User],
    "/user/createWithArray": typing.Type[UserCreateWithArray],
    "/user/createWithList": typing.Type[UserCreateWithList],
    "/user/login": typing.Type[UserLogin],
    "/user/logout": typing.Type[UserLogout],
    "/user/{username}": typing.Type[UserUsername],
    }
)

path_to_api = PathToApi(
    {
    "/": Solidus,
    "/another-fake/dummy": AnotherFakeDummy,
    "/commonParam/{subDir}/": CommonParamSubDir,
    "/fake": Fake,
    "/fake/additional-properties-with-array-of-enums": FakeAdditionalPropertiesWithArrayOfEnums,
    "/fake/body-with-file-schema": FakeBodyWithFileSchema,
    "/fake/body-with-query-params": FakeBodyWithQueryParams,
    "/fake/case-sensitive-params": FakeCaseSensitiveParams,
    "/fake/deleteCoffee/{id}": FakeDeleteCoffeeId,
    "/fake/health": FakeHealth,
    "/fake/inline-additionalProperties": FakeInlineAdditionalProperties,
    "/fake/inlineComposition/": FakeInlineComposition,
    "/fake/jsonFormData": FakeJsonFormData,
    "/fake/jsonPatch": FakeJsonPatch,
    "/fake/jsonWithCharset": FakeJsonWithCharset,
    "/fake/multipleRequestBodyContentTypes/": FakeMultipleRequestBodyContentTypes,
    "/fake/multipleResponseBodies": FakeMultipleResponseBodies,
    "/fake/multipleSecurities": FakeMultipleSecurities,
    "/fake/objInQuery": FakeObjInQuery,
    "/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/": FakeParameterCollisions1AbabSelfAb,
    "/fake/pemContentType": FakePemContentType,
    "/fake/queryParamWithJsonContentType": FakeQueryParamWithJsonContentType,
    "/fake/redirection": FakeRedirection,
    "/fake/refObjInQuery": FakeRefObjInQuery,
    "/fake/refs/array-of-enums": FakeRefsArrayOfEnums,
    "/fake/refs/arraymodel": FakeRefsArraymodel,
    "/fake/refs/boolean": FakeRefsBoolean,
    "/fake/refs/composed_one_of_number_with_validations": FakeRefsComposedOneOfNumberWithValidations,
    "/fake/refs/enum": FakeRefsEnum,
    "/fake/refs/mammal": FakeRefsMammal,
    "/fake/refs/number": FakeRefsNumber,
    "/fake/refs/object_model_with_ref_props": FakeRefsObjectModelWithRefProps,
    "/fake/refs/string": FakeRefsString,
    "/fake/responseWithoutSchema": FakeResponseWithoutSchema,
    "/fake/test-query-paramters": FakeTestQueryParamters,
    "/fake/uploadDownloadFile": FakeUploadDownloadFile,
    "/fake/uploadFile": FakeUploadFile,
    "/fake/uploadFiles": FakeUploadFiles,
    "/fake/wildCardResponses": FakeWildCardResponses,
    "/fake/{petId}/uploadImageWithRequiredFile": FakePetIdUploadImageWithRequiredFile,
    "/fake_classname_test": FakeClassnameTest,
    "/foo": Foo,
    "/pet": Pet,
    "/pet/findByStatus": PetFindByStatus,
    "/pet/findByTags": PetFindByTags,
    "/pet/{petId}": PetPetId,
    "/pet/{petId}/uploadImage": PetPetIdUploadImage,
    "/store/inventory": StoreInventory,
    "/store/order": StoreOrder,
    "/store/order/{order_id}": StoreOrderOrderId,
    "/user": User,
    "/user/createWithArray": UserCreateWithArray,
    "/user/createWithList": UserCreateWithList,
    "/user/login": UserLogin,
    "/user/logout": UserLogout,
    "/user/{username}": UserUsername,
    }
)
