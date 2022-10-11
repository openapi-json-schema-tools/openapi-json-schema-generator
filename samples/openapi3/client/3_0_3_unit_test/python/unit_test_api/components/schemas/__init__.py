# coding: utf-8

# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from unit_test_api.components.schema.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from unit_test_api.components.schema.additionalproperties_allows_a_schema_which_should_validate import AdditionalpropertiesAllowsASchemaWhichShouldValidate
from unit_test_api.components.schema.additionalproperties_are_allowed_by_default import AdditionalpropertiesAreAllowedByDefault
from unit_test_api.components.schema.additionalproperties_can_exist_by_itself import AdditionalpropertiesCanExistByItself
from unit_test_api.components.schema.additionalproperties_should_not_look_in_applicators import AdditionalpropertiesShouldNotLookInApplicators
from unit_test_api.components.schema.allof import Allof
from unit_test_api.components.schema.allof_combined_with_anyof_oneof import AllofCombinedWithAnyofOneof
from unit_test_api.components.schema.allof_simple_types import AllofSimpleTypes
from unit_test_api.components.schema.allof_with_base_schema import AllofWithBaseSchema
from unit_test_api.components.schema.allof_with_one_empty_schema import AllofWithOneEmptySchema
from unit_test_api.components.schema.allof_with_the_first_empty_schema import AllofWithTheFirstEmptySchema
from unit_test_api.components.schema.allof_with_the_last_empty_schema import AllofWithTheLastEmptySchema
from unit_test_api.components.schema.allof_with_two_empty_schemas import AllofWithTwoEmptySchemas
from unit_test_api.components.schema.anyof import Anyof
from unit_test_api.components.schema.anyof_complex_types import AnyofComplexTypes
from unit_test_api.components.schema.anyof_with_base_schema import AnyofWithBaseSchema
from unit_test_api.components.schema.anyof_with_one_empty_schema import AnyofWithOneEmptySchema
from unit_test_api.components.schema.array_type_matches_arrays import ArrayTypeMatchesArrays
from unit_test_api.components.schema.boolean_type_matches_booleans import BooleanTypeMatchesBooleans
from unit_test_api.components.schema.by_int import ByInt
from unit_test_api.components.schema.by_number import ByNumber
from unit_test_api.components.schema.by_small_number import BySmallNumber
from unit_test_api.components.schema.date_time_format import DateTimeFormat
from unit_test_api.components.schema.email_format import EmailFormat
from unit_test_api.components.schema.enum_with0_does_not_match_false import EnumWith0DoesNotMatchFalse
from unit_test_api.components.schema.enum_with1_does_not_match_true import EnumWith1DoesNotMatchTrue
from unit_test_api.components.schema.enum_with_escaped_characters import EnumWithEscapedCharacters
from unit_test_api.components.schema.enum_with_false_does_not_match0 import EnumWithFalseDoesNotMatch0
from unit_test_api.components.schema.enum_with_true_does_not_match1 import EnumWithTrueDoesNotMatch1
from unit_test_api.components.schema.enums_in_properties import EnumsInProperties
from unit_test_api.components.schema.forbidden_property import ForbiddenProperty
from unit_test_api.components.schema.hostname_format import HostnameFormat
from unit_test_api.components.schema.integer_type_matches_integers import IntegerTypeMatchesIntegers
from unit_test_api.components.schema.invalid_instance_should_not_raise_error_when_float_division_inf import InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf
from unit_test_api.components.schema.invalid_string_value_for_default import InvalidStringValueForDefault
from unit_test_api.components.schema.ipv4_format import Ipv4Format
from unit_test_api.components.schema.ipv6_format import Ipv6Format
from unit_test_api.components.schema.json_pointer_format import JsonPointerFormat
from unit_test_api.components.schema.maximum_validation import MaximumValidation
from unit_test_api.components.schema.maximum_validation_with_unsigned_integer import MaximumValidationWithUnsignedInteger
from unit_test_api.components.schema.maxitems_validation import MaxitemsValidation
from unit_test_api.components.schema.maxlength_validation import MaxlengthValidation
from unit_test_api.components.schema.maxproperties0_means_the_object_is_empty import Maxproperties0MeansTheObjectIsEmpty
from unit_test_api.components.schema.maxproperties_validation import MaxpropertiesValidation
from unit_test_api.components.schema.minimum_validation import MinimumValidation
from unit_test_api.components.schema.minimum_validation_with_signed_integer import MinimumValidationWithSignedInteger
from unit_test_api.components.schema.minitems_validation import MinitemsValidation
from unit_test_api.components.schema.minlength_validation import MinlengthValidation
from unit_test_api.components.schema.minproperties_validation import MinpropertiesValidation
from unit_test_api.components.schema.model_not import ModelNot
from unit_test_api.components.schema.nested_allof_to_check_validation_semantics import NestedAllofToCheckValidationSemantics
from unit_test_api.components.schema.nested_anyof_to_check_validation_semantics import NestedAnyofToCheckValidationSemantics
from unit_test_api.components.schema.nested_items import NestedItems
from unit_test_api.components.schema.nested_oneof_to_check_validation_semantics import NestedOneofToCheckValidationSemantics
from unit_test_api.components.schema.not_more_complex_schema import NotMoreComplexSchema
from unit_test_api.components.schema.nul_characters_in_strings import NulCharactersInStrings
from unit_test_api.components.schema.null_type_matches_only_the_null_object import NullTypeMatchesOnlyTheNullObject
from unit_test_api.components.schema.number_type_matches_numbers import NumberTypeMatchesNumbers
from unit_test_api.components.schema.object_properties_validation import ObjectPropertiesValidation
from unit_test_api.components.schema.object_type_matches_objects import ObjectTypeMatchesObjects
from unit_test_api.components.schema.oneof import Oneof
from unit_test_api.components.schema.oneof_complex_types import OneofComplexTypes
from unit_test_api.components.schema.oneof_with_base_schema import OneofWithBaseSchema
from unit_test_api.components.schema.oneof_with_empty_schema import OneofWithEmptySchema
from unit_test_api.components.schema.oneof_with_required import OneofWithRequired
from unit_test_api.components.schema.pattern_is_not_anchored import PatternIsNotAnchored
from unit_test_api.components.schema.pattern_validation import PatternValidation
from unit_test_api.components.schema.properties_with_escaped_characters import PropertiesWithEscapedCharacters
from unit_test_api.components.schema.property_named_ref_that_is_not_a_reference import PropertyNamedRefThatIsNotAReference
from unit_test_api.components.schema.ref_in_additionalproperties import RefInAdditionalproperties
from unit_test_api.components.schema.ref_in_allof import RefInAllof
from unit_test_api.components.schema.ref_in_anyof import RefInAnyof
from unit_test_api.components.schema.ref_in_items import RefInItems
from unit_test_api.components.schema.ref_in_not import RefInNot
from unit_test_api.components.schema.ref_in_oneof import RefInOneof
from unit_test_api.components.schema.ref_in_property import RefInProperty
from unit_test_api.components.schema.required_default_validation import RequiredDefaultValidation
from unit_test_api.components.schema.required_validation import RequiredValidation
from unit_test_api.components.schema.required_with_empty_array import RequiredWithEmptyArray
from unit_test_api.components.schema.required_with_escaped_characters import RequiredWithEscapedCharacters
from unit_test_api.components.schema.simple_enum_validation import SimpleEnumValidation
from unit_test_api.components.schema.string_type_matches_strings import StringTypeMatchesStrings
from unit_test_api.components.schema.the_default_keyword_does_not_do_anything_if_the_property_is_missing import TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
from unit_test_api.components.schema.uniqueitems_false_validation import UniqueitemsFalseValidation
from unit_test_api.components.schema.uniqueitems_validation import UniqueitemsValidation
from unit_test_api.components.schema.uri_format import UriFormat
from unit_test_api.components.schema.uri_reference_format import UriReferenceFormat
from unit_test_api.components.schema.uri_template_format import UriTemplateFormat
