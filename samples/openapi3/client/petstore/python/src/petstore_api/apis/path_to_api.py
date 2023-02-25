import typing_extensions

from petstore_api.apis.paths.foo import Foo
from petstore_api.apis.paths.pet import Pet
from petstore_api.apis.paths.pet_find_by_status import PetFindByStatus
from petstore_api.apis.paths.pet_find_by_tags import PetFindByTags
from petstore_api.apis.paths.pet_pet_id import PetPetId
from petstore_api.apis.paths.pet_pet_id_upload_image import PetPetIdUploadImage
from petstore_api.apis.paths.store_inventory import StoreInventory
from petstore_api.apis.paths.store_order import StoreOrder
from petstore_api.apis.paths.store_order_order_id import StoreOrderOrderId
from petstore_api.apis.paths.user import User
from petstore_api.apis.paths.user_create_with_array import UserCreateWithArray
from petstore_api.apis.paths.user_create_with_list import UserCreateWithList
from petstore_api.apis.paths.user_login import UserLogin
from petstore_api.apis.paths.user_logout import UserLogout
from petstore_api.apis.paths.user_username import UserUsername
from petstore_api.apis.paths.fake_classname_test import FakeClassnameTest
from petstore_api.apis.paths.fake import Fake
from petstore_api.apis.paths.fake_refs_number import FakeRefsNumber
from petstore_api.apis.paths.fake_refs_mammal import FakeRefsMammal
from petstore_api.apis.paths.fake_refs_string import FakeRefsString
from petstore_api.apis.paths.fake_refs_boolean import FakeRefsBoolean
from petstore_api.apis.paths.fake_refs_arraymodel import FakeRefsArraymodel
from petstore_api.apis.paths.fake_refs_composed_one_of_number_with_validations import FakeRefsComposedOneOfNumberWithValidations
from petstore_api.apis.paths.fake_refs_object_model_with_ref_props import FakeRefsObjectModelWithRefProps
from petstore_api.apis.paths.fake_refs_enum import FakeRefsEnum
from petstore_api.apis.paths.fake_refs_array_of_enums import FakeRefsArrayOfEnums
from petstore_api.apis.paths.fake_additional_properties_with_array_of_enums import FakeAdditionalPropertiesWithArrayOfEnums
from petstore_api.apis.paths.fake_json_form_data import FakeJsonFormData
from petstore_api.apis.paths.fake_inline_additional_properties import FakeInlineAdditionalProperties
from petstore_api.apis.paths.fake_body_with_query_params import FakeBodyWithQueryParams
from petstore_api.apis.paths.another_fake_dummy import AnotherFakeDummy
from petstore_api.apis.paths.fake_body_with_file_schema import FakeBodyWithFileSchema
from petstore_api.apis.paths.fake_case_sensitive_params import FakeCaseSensitiveParams
from petstore_api.apis.paths.fake_test_query_paramters import FakeTestQueryParamters
from petstore_api.apis.paths.fake_pet_id_upload_image_with_required_file import FakePetIdUploadImageWithRequiredFile
from petstore_api.apis.paths.fake_parameter_collisions1_abab_self_ab import FakeParameterCollisions1ABAbSelfAB
from petstore_api.apis.paths.fake_upload_file import FakeUploadFile
from petstore_api.apis.paths.fake_upload_files import FakeUploadFiles
from petstore_api.apis.paths.fake_upload_download_file import FakeUploadDownloadFile
from petstore_api.apis.paths.fake_health import FakeHealth
from petstore_api.apis.paths.fake_inline_composition import FakeInlineComposition
from petstore_api.apis.paths.fake_obj_in_query import FakeObjInQuery
from petstore_api.apis.paths.fake_ref_obj_in_query import FakeRefObjInQuery
from petstore_api.apis.paths.fake_json_with_charset import FakeJsonWithCharset
from petstore_api.apis.paths.fake_response_without_schema import FakeResponseWithoutSchema
from petstore_api.apis.paths.fake_json_patch import FakeJsonPatch
from petstore_api.apis.paths.fake_delete_coffee_id import FakeDeleteCoffeeId
from petstore_api.apis.paths.fake_query_param_with_json_content_type import FakeQueryParamWithJsonContentType
from petstore_api.apis.paths.fake_multiple_response_bodies import FakeMultipleResponseBodies

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
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
        "/fake_classname_test": FakeClassnameTest,
        "/fake": Fake,
        "/fake/refs/number": FakeRefsNumber,
        "/fake/refs/mammal": FakeRefsMammal,
        "/fake/refs/string": FakeRefsString,
        "/fake/refs/boolean": FakeRefsBoolean,
        "/fake/refs/arraymodel": FakeRefsArraymodel,
        "/fake/refs/composed_one_of_number_with_validations": FakeRefsComposedOneOfNumberWithValidations,
        "/fake/refs/object_model_with_ref_props": FakeRefsObjectModelWithRefProps,
        "/fake/refs/enum": FakeRefsEnum,
        "/fake/refs/array-of-enums": FakeRefsArrayOfEnums,
        "/fake/additional-properties-with-array-of-enums": FakeAdditionalPropertiesWithArrayOfEnums,
        "/fake/jsonFormData": FakeJsonFormData,
        "/fake/inline-additionalProperties": FakeInlineAdditionalProperties,
        "/fake/body-with-query-params": FakeBodyWithQueryParams,
        "/another-fake/dummy": AnotherFakeDummy,
        "/fake/body-with-file-schema": FakeBodyWithFileSchema,
        "/fake/case-sensitive-params": FakeCaseSensitiveParams,
        "/fake/test-query-paramters": FakeTestQueryParamters,
        "/fake/{petId}/uploadImageWithRequiredFile": FakePetIdUploadImageWithRequiredFile,
        "/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/": FakeParameterCollisions1ABAbSelfAB,
        "/fake/uploadFile": FakeUploadFile,
        "/fake/uploadFiles": FakeUploadFiles,
        "/fake/uploadDownloadFile": FakeUploadDownloadFile,
        "/fake/health": FakeHealth,
        "/fake/inlineComposition/": FakeInlineComposition,
        "/fake/objInQuery": FakeObjInQuery,
        "/fake/refObjInQuery": FakeRefObjInQuery,
        "/fake/jsonWithCharset": FakeJsonWithCharset,
        "/fake/responseWithoutSchema": FakeResponseWithoutSchema,
        "/fake/jsonPatch": FakeJsonPatch,
        "/fake/deleteCoffee/{id}": FakeDeleteCoffeeId,
        "/fake/queryParamWithJsonContentType": FakeQueryParamWithJsonContentType,
        "/fake/multipleResponseBodies": FakeMultipleResponseBodies,
    }
)

path_to_api = PathToApi(
    {
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
        "/fake_classname_test": FakeClassnameTest,
        "/fake": Fake,
        "/fake/refs/number": FakeRefsNumber,
        "/fake/refs/mammal": FakeRefsMammal,
        "/fake/refs/string": FakeRefsString,
        "/fake/refs/boolean": FakeRefsBoolean,
        "/fake/refs/arraymodel": FakeRefsArraymodel,
        "/fake/refs/composed_one_of_number_with_validations": FakeRefsComposedOneOfNumberWithValidations,
        "/fake/refs/object_model_with_ref_props": FakeRefsObjectModelWithRefProps,
        "/fake/refs/enum": FakeRefsEnum,
        "/fake/refs/array-of-enums": FakeRefsArrayOfEnums,
        "/fake/additional-properties-with-array-of-enums": FakeAdditionalPropertiesWithArrayOfEnums,
        "/fake/jsonFormData": FakeJsonFormData,
        "/fake/inline-additionalProperties": FakeInlineAdditionalProperties,
        "/fake/body-with-query-params": FakeBodyWithQueryParams,
        "/another-fake/dummy": AnotherFakeDummy,
        "/fake/body-with-file-schema": FakeBodyWithFileSchema,
        "/fake/case-sensitive-params": FakeCaseSensitiveParams,
        "/fake/test-query-paramters": FakeTestQueryParamters,
        "/fake/{petId}/uploadImageWithRequiredFile": FakePetIdUploadImageWithRequiredFile,
        "/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/": FakeParameterCollisions1ABAbSelfAB,
        "/fake/uploadFile": FakeUploadFile,
        "/fake/uploadFiles": FakeUploadFiles,
        "/fake/uploadDownloadFile": FakeUploadDownloadFile,
        "/fake/health": FakeHealth,
        "/fake/inlineComposition/": FakeInlineComposition,
        "/fake/objInQuery": FakeObjInQuery,
        "/fake/refObjInQuery": FakeRefObjInQuery,
        "/fake/jsonWithCharset": FakeJsonWithCharset,
        "/fake/responseWithoutSchema": FakeResponseWithoutSchema,
        "/fake/jsonPatch": FakeJsonPatch,
        "/fake/deleteCoffee/{id}": FakeDeleteCoffeeId,
        "/fake/queryParamWithJsonContentType": FakeQueryParamWithJsonContentType,
        "/fake/multipleResponseBodies": FakeMultipleResponseBodies,
    }
)
