# coding: utf-8
import decimal
from decimal import Decimal
from unittest.mock import patch, call
import unittest

import immutabledict

from petstore_api.components.schema import string_with_validation
from petstore_api.components.schema import string_enum
from petstore_api.components.schema import number_with_validations
from petstore_api.components.schema import array_holding_any_type
from petstore_api.components.schema import array_with_validations_in_items

from petstore_api.components.schema import foo
from petstore_api.components.schema.bar import Bar
from petstore_api.components.schema import animal
from petstore_api.components.schema import dog
from petstore_api.components.schema.boolean_enum import BooleanEnum
from petstore_api.components.schema.pig import Pig
from petstore_api.components.schema import danish_pig
from petstore_api.components.schema.gm_fruit import GmFruit
from petstore_api.components.schema import apple
from petstore_api.components.schema.banana import Banana
from petstore_api import schemas
from petstore_api.configurations import schema_configuration

from petstore_api.schemas import (
    AnyTypeSchema,
    StrSchema,
    NumberSchema,
    Schema,
)
from petstore_api.schemas.validation import ValidationMetadata


class TestValidateResults(unittest.TestCase):
    def test_str_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_with_validation.StringWithValidation._validate(
            "abcdefg", validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {str: None, string_with_validation.StringWithValidation: None}}

    def test_number_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = number_with_validations.NumberWithValidations._validate(
            11, validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {int: None, number_with_validations.NumberWithValidations: None}}

    def test_str_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_enum.StringEnum._validate(
            "placed",
            validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {str: None, string_enum.StringEnum: None}}

    def test_nullable_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_enum.StringEnum._validate(None, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {schemas.none_type_: None, string_enum.StringEnum: None}}

    def test_empty_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = array_holding_any_type.ArrayHoldingAnyType._validate((), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {tuple: None, array_holding_any_type.ArrayHoldingAnyType: None}}

    def test_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = array_holding_any_type.ArrayHoldingAnyType._validate(
            (1, "a"), validation_metadata=vm
        )
        assert path_to_schemas == {
            ("args[0]",): {tuple: None, array_holding_any_type.ArrayHoldingAnyType: None},
            ("args[0]", 0): {int: None, AnyTypeSchema: None},
            ("args[0]", 1): {str: None, AnyTypeSchema: None},
        }

    def test_empty_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = foo.Foo._validate(immutabledict.immutabledict({}), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {immutabledict.immutabledict: None, foo.Foo: None}}

    def test_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = foo.Foo._validate(
            immutabledict.immutabledict({"bar": "a", "additional": Decimal(0)}),
            validation_metadata=vm,
        )
        assert path_to_schemas == {
            ("args[0]",): {immutabledict.immutabledict: None, foo.Foo: None},
            ("args[0]", "bar"): {str: None, Bar: None},
        }

    def test_discriminated_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = animal.Animal._validate(
            immutabledict.immutabledict(
                className="Dog",
                color="black"
            ),
            validation_metadata=vm
        )
        assert path_to_schemas == {
            ("args[0]",): {immutabledict.immutabledict: None, dog._1: None, dog.Dog: None, animal.Animal: None},
            ("args[0]", "className"): {str: None, StrSchema: None},
            ("args[0]", "color"): {str: None, animal.Color: None},
        }

    def test_bool_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = BooleanEnum._validate(True, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {bool: None, BooleanEnum: None}}

    def test_oneof_composition_pig_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = Pig._validate(
            immutabledict.immutabledict(className=str("DanishPig")),
            validation_metadata=vm
        )
        assert path_to_schemas == {
            ("args[0]",): {immutabledict.immutabledict: None, danish_pig.DanishPig: None, Pig: None},
            ("args[0]", "className"): {str: None, danish_pig.ClassName: None},
        }

    def test_anyof_composition_gm_fruit_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = GmFruit._validate(
            immutabledict.immutabledict(
                {
                    'cultivar': "GoldenDelicious",
                    'lengthCm': 10
                }
            ),
            validation_metadata=vm,
        )
        assert path_to_schemas == {
            ("args[0]",): {immutabledict.immutabledict: None, apple.Apple: None, Banana: None, GmFruit: None},
            ("args[0]", "cultivar"): {str: None, apple.Cultivar: None},
            ("args[0]", "lengthCm"): {int: None, NumberSchema: None},
        }


class TestValidateCalls(unittest.TestCase):
    def test_empty_list_validate(self):
        return_value = {("args[0]",): {tuple: None, array_holding_any_type.ArrayHoldingAnyType: None}}
        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            array_holding_any_type.ArrayHoldingAnyType.validate([])
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            array_holding_any_type.ArrayHoldingAnyType.validate([])
            assert mock_validate.call_count == 1

    def test_empty_dict_validate(self):
        return_value = {("args[0]",): {immutabledict.immutabledict: None, foo.Foo: None}}
        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            foo.Foo.validate({})
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            foo.Foo.validate({})
            assert mock_validate.call_count == 1

    def test_list_validate_instantiation(self):
        with patch.object(
            array_with_validations_in_items.ArrayWithValidationsInItems,
            "_validate",
            side_effect=array_with_validations_in_items.ArrayWithValidationsInItems._validate,
        ) as mock_outer_validate:
            with patch.object(
                array_with_validations_in_items.Items,
                "_validate",
                side_effect=array_with_validations_in_items.Items._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                array_with_validations_in_items.ArrayWithValidationsInItems.validate([7], configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    (7,),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]",), configuration=used_configuration)
                )
                mock_inner_validate.assert_called_once_with(
                    7,
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]", 0), configuration=used_configuration)
                )

    def test_list_validate_with_already_validated(self):
        # validation is skipped if arg is of the output type
        # because validation were already run
        used_configuration = schema_configuration.SchemaConfiguration()
        inst = array_with_validations_in_items.ArrayWithValidationsInItems.validate([7], configuration=used_configuration)
        with patch.object(
            array_with_validations_in_items.ArrayWithValidationsInItems,
            "_validate",
            side_effect=array_with_validations_in_items.ArrayWithValidationsInItems._validate,
        ) as mock_outer_validate:
            with patch.object(
                array_with_validations_in_items.Items,
                "_validate",
                side_effect=array_with_validations_in_items.Items._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                new_inst = array_with_validations_in_items.ArrayWithValidationsInItems.validate(inst, configuration=used_configuration)
                mock_outer_validate.assert_not_called()
                mock_inner_validate.assert_not_called()
                assert isinstance(new_inst, array_with_validations_in_items.ArrayWithValidationsInItemsTuple)
                assert new_inst == inst

    def test_dict_validate_direct_instantiation(self):
        with patch.object(foo.Foo, "_validate", side_effect=foo.Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                foo.Foo.validate({'bar': "a"}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    immutabledict.immutabledict({"bar": "a"}),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=used_configuration
                    )
                )
                mock_inner_validate.assert_called_once_with(
                    "a",
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]", "bar"),
                        configuration=used_configuration
                    ),
                )

    def test_dict_validate_direct_instantiation_cast_item(self):
        bar = Bar.validate("a")
        used_configuration = schema_configuration.SchemaConfiguration()
        # Foo and Bar are validated because instances do not store past validations
        with patch.object(foo.Foo, "_validate", side_effect=foo.Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                foo.Foo.validate({'bar': bar}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    immutabledict.immutabledict(dict(bar='a')),
                    validation_metadata=ValidationMetadata(
                        path_to_item=('args[0]',),
                        configuration=used_configuration,
                        validated_path_to_schemas={}
                    )
                )
                mock_inner_validate.assert_called_once_with(
                    "a",
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]", "bar"),
                        configuration=used_configuration
                    ),
                )

    def test_dict_validate_instantiation_non_class_inst_data(self):
        with patch.object(foo.Foo, "_validate", side_effect=foo.Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                foo.Foo.validate({"bar": "a"}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    immutabledict.immutabledict({"bar": "a"}),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=used_configuration
                    )
                )
                mock_inner_validate.assert_called_once_with(
                    "a",
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]", "bar"),
                        configuration=used_configuration
                    ),
                )

    def test_dict_validate_with_already_validated(self):
        used_configuration = schema_configuration.SchemaConfiguration()
        inst = foo.Foo.validate({"bar": "a"}, configuration=used_configuration)
        with patch.object(foo.Foo, "_validate", side_effect=foo.Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                new_inst = foo.Foo.validate(inst, configuration=used_configuration)
                mock_outer_validate.assert_not_called()
                mock_inner_validate.assert_not_called()
                assert isinstance(new_inst, foo.FooDict)
                assert new_inst == inst


if __name__ == "__main__":
    unittest.main()
