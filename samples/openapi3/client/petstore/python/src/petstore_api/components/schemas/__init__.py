# coding: utf-8

# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from petstore_api.components.schema.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from petstore_api.components.schema._200_response import _200Response
from petstore_api.components.schema.abstract_step_message import AbstractStepMessage
from petstore_api.components.schema.additional_properties_class import AdditionalPropertiesClass
from petstore_api.components.schema.additional_properties_validator import AdditionalPropertiesValidator
from petstore_api.components.schema.additional_properties_with_array_of_enums import AdditionalPropertiesWithArrayOfEnums
from petstore_api.components.schema.address import Address
from petstore_api.components.schema.animal import Animal
from petstore_api.components.schema.animal_farm import AnimalFarm
from petstore_api.components.schema.any_type_and_format import AnyTypeAndFormat
from petstore_api.components.schema.any_type_not_string import AnyTypeNotString
from petstore_api.components.schema.api_response import ApiResponse
from petstore_api.components.schema.array_holding_any_type import ArrayHoldingAnyType
from petstore_api.components.schema.array_of_array_of_number_only import ArrayOfArrayOfNumberOnly
from petstore_api.components.schema.array_of_enums import ArrayOfEnums
from petstore_api.components.schema.array_of_number_only import ArrayOfNumberOnly
from petstore_api.components.schema.array_test import ArrayTest
from petstore_api.components.schema.array_with_validations_in_items import ArrayWithValidationsInItems
from petstore_api.components.schema.bar import Bar
from petstore_api.components.schema.basque_pig import BasquePig
from petstore_api.components.schema.boolean import Boolean
from petstore_api.components.schema.boolean_enum import BooleanEnum
from petstore_api.components.schema.capitalization import Capitalization
from petstore_api.components.schema.cat import Cat
from petstore_api.components.schema.category import Category
from petstore_api.components.schema.child_cat import ChildCat
from petstore_api.components.schema.class_model import ClassModel
from petstore_api.components.schema.client import Client
from petstore_api.components.schema.complex_quadrilateral import ComplexQuadrilateral
from petstore_api.components.schema.composed_any_of_different_types_no_validations import ComposedAnyOfDifferentTypesNoValidations
from petstore_api.components.schema.composed_array import ComposedArray
from petstore_api.components.schema.composed_bool import ComposedBool
from petstore_api.components.schema.composed_none import ComposedNone
from petstore_api.components.schema.composed_number import ComposedNumber
from petstore_api.components.schema.composed_object import ComposedObject
from petstore_api.components.schema.composed_one_of_different_types import ComposedOneOfDifferentTypes
from petstore_api.components.schema.composed_string import ComposedString
from petstore_api.components.schema.currency import Currency
from petstore_api.components.schema.danish_pig import DanishPig
from petstore_api.components.schema.date_time_test import DateTimeTest
from petstore_api.components.schema.date_time_with_validations import DateTimeWithValidations
from petstore_api.components.schema.date_with_validations import DateWithValidations
from petstore_api.components.schema.decimal_payload import DecimalPayload
from petstore_api.components.schema.dog import Dog
from petstore_api.components.schema.drawing import Drawing
from petstore_api.components.schema.enum_arrays import EnumArrays
from petstore_api.components.schema.enum_class import EnumClass
from petstore_api.components.schema.enum_test import EnumTest
from petstore_api.components.schema.equilateral_triangle import EquilateralTriangle
from petstore_api.components.schema.file import File
from petstore_api.components.schema.file_schema_test_class import FileSchemaTestClass
from petstore_api.components.schema.foo import Foo
from petstore_api.components.schema.format_test import FormatTest
from petstore_api.components.schema.from_schema import FromSchema
from petstore_api.components.schema.grandparent_animal import GrandparentAnimal
from petstore_api.components.schema.health_check_result import HealthCheckResult
from petstore_api.components.schema.integer_enum import IntegerEnum
from petstore_api.components.schema.integer_enum_big import IntegerEnumBig
from petstore_api.components.schema.integer_enum_one_value import IntegerEnumOneValue
from petstore_api.components.schema.integer_enum_with_default_value import IntegerEnumWithDefaultValue
from petstore_api.components.schema.integer_max10 import IntegerMax10
from petstore_api.components.schema.integer_min15 import IntegerMin15
from petstore_api.components.schema.isosceles_triangle import IsoscelesTriangle
from petstore_api.components.schema.items import Items
from petstore_api.components.schema.json_patch_request import JSONPatchRequest
from petstore_api.components.schema.json_patch_request_add_replace_test import JSONPatchRequestAddReplaceTest
from petstore_api.components.schema.json_patch_request_move_copy import JSONPatchRequestMoveCopy
from petstore_api.components.schema.json_patch_request_remove import JSONPatchRequestRemove
from petstore_api.components.schema.map_test import MapTest
from petstore_api.components.schema.mixed_properties_and_additional_properties_class import MixedPropertiesAndAdditionalPropertiesClass
from petstore_api.components.schema.money import Money
from petstore_api.components.schema.name import Name
from petstore_api.components.schema.no_additional_properties import NoAdditionalProperties
from petstore_api.components.schema.nullable_class import NullableClass
from petstore_api.components.schema.nullable_shape import NullableShape
from petstore_api.components.schema.nullable_string import NullableString
from petstore_api.components.schema.number import Number
from petstore_api.components.schema.number_only import NumberOnly
from petstore_api.components.schema.number_with_validations import NumberWithValidations
from petstore_api.components.schema.obj_with_required_props import ObjWithRequiredProps
from petstore_api.components.schema.obj_with_required_props_base import ObjWithRequiredPropsBase
from petstore_api.components.schema.object_interface import ObjectInterface
from petstore_api.components.schema.object_model_with_arg_and_args_properties import ObjectModelWithArgAndArgsProperties
from petstore_api.components.schema.object_model_with_ref_props import ObjectModelWithRefProps
from petstore_api.components.schema.object_with_all_of_with_req_test_prop_from_unset_add_prop import ObjectWithAllOfWithReqTestPropFromUnsetAddProp
from petstore_api.components.schema.object_with_colliding_properties import ObjectWithCollidingProperties
from petstore_api.components.schema.object_with_decimal_properties import ObjectWithDecimalProperties
from petstore_api.components.schema.object_with_difficultly_named_props import ObjectWithDifficultlyNamedProps
from petstore_api.components.schema.object_with_inline_composition_property import ObjectWithInlineCompositionProperty
from petstore_api.components.schema.object_with_invalid_named_refed_properties import ObjectWithInvalidNamedRefedProperties
from petstore_api.components.schema.object_with_only_optional_props import ObjectWithOnlyOptionalProps
from petstore_api.components.schema.object_with_optional_test_prop import ObjectWithOptionalTestProp
from petstore_api.components.schema.object_with_validations import ObjectWithValidations
from petstore_api.components.schema.order import Order
from petstore_api.components.schema.parent_pet import ParentPet
from petstore_api.components.schema.pet import Pet
from petstore_api.components.schema.pig import Pig
from petstore_api.components.schema.player import Player
from petstore_api.components.schema.quadrilateral import Quadrilateral
from petstore_api.components.schema.quadrilateral_interface import QuadrilateralInterface
from petstore_api.components.schema.read_only_first import ReadOnlyFirst
from petstore_api.components.schema.ref_pet import RefPet
from petstore_api.components.schema.req_props_from_explicit_add_props import ReqPropsFromExplicitAddProps
from petstore_api.components.schema.req_props_from_true_add_props import ReqPropsFromTrueAddProps
from petstore_api.components.schema.req_props_from_unset_add_props import ReqPropsFromUnsetAddProps
from petstore_api.components.schema._return import _Return
from petstore_api.components.schema.scalene_triangle import ScaleneTriangle
from petstore_api.components.schema.self_referencing_array_model import SelfReferencingArrayModel
from petstore_api.components.schema.self_referencing_object_model import SelfReferencingObjectModel
from petstore_api.components.schema.shape import Shape
from petstore_api.components.schema.shape_or_null import ShapeOrNull
from petstore_api.components.schema.simple_quadrilateral import SimpleQuadrilateral
from petstore_api.components.schema.some_object import SomeObject
from petstore_api.components.schema.string import String
from petstore_api.components.schema.string_boolean_map import StringBooleanMap
from petstore_api.components.schema.string_enum import StringEnum
from petstore_api.components.schema.string_enum_with_default_value import StringEnumWithDefaultValue
from petstore_api.components.schema.string_with_validation import StringWithValidation
from petstore_api.components.schema.tag import Tag
from petstore_api.components.schema.triangle import Triangle
from petstore_api.components.schema.triangle_interface import TriangleInterface
from petstore_api.components.schema.uuid_string import UUIDString
from petstore_api.components.schema.user import User
from petstore_api.components.schema.special_model_name import SpecialModelName
from petstore_api.components.schema.apple import Apple
from petstore_api.components.schema.apple_req import AppleReq
from petstore_api.components.schema.banana import Banana
from petstore_api.components.schema.banana_req import BananaReq
from petstore_api.components.schema.fruit import Fruit
from petstore_api.components.schema.fruit_req import FruitReq
from petstore_api.components.schema.gm_fruit import GmFruit
from petstore_api.components.schema.has_only_read_only import HasOnlyReadOnly
from petstore_api.components.schema.mammal import Mammal
from petstore_api.components.schema.whale import Whale
from petstore_api.components.schema.zebra import Zebra
