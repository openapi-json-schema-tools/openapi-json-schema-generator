# coding: utf-8
import decimal
from decimal import Decimal
from unittest.mock import patch, call
import unittest

import frozendict

from petstore_api.components.schema import string_with_validation
from petstore_api.components.schema import string_enum
from petstore_api.components.schema import number_with_validations
from petstore_api.components.schema import array_holding_any_type
from petstore_api.components.schema import array_with_validations_in_items

from petstore_api.components.schema.foo import Foo
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
    BoolClass,
    NoneClass,
    StrSchema,
    NumberSchema,
    Schema,
    ValidationMetadata,
)


class TestValidateResults(unittest.TestCase):
    def test_str_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_with_validation.StringWithValidation._validate(
            "abcdefg", validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {string_with_validation.StringWithValidation, str}}

    def test_number_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = number_with_validations.NumberWithValidations._validate(
            Decimal(11), validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {number_with_validations.NumberWithValidations, Decimal}}

    def test_str_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_enum.StringEnum._validate("placed", validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {str, string_enum.StringEnum}}

    def test_nullable_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = string_enum.StringEnum._validate(NoneClass.NONE, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {NoneClass, string_enum.StringEnum}}

    def test_empty_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = array_holding_any_type.ArrayHoldingAnyType._validate((), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {array_holding_any_type.ArrayHoldingAnyType, tuple}}

    def test_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = array_holding_any_type.ArrayHoldingAnyType._validate(
            (Decimal(1), "a"), validation_metadata=vm
        )
        assert path_to_schemas == {
            ("args[0]",): {array_holding_any_type.ArrayHoldingAnyType, tuple},
            ("args[0]", 0): {AnyTypeSchema, Decimal},
            ("args[0]", 1): {AnyTypeSchema, str},
        }

    def test_empty_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = Foo._validate(frozendict.frozendict({}), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {Foo, frozendict.frozendict}}

    def test_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = Foo._validate(
            frozendict.frozendict({"bar": "a", "additional": Decimal(0)}),
            validation_metadata=vm,
        )
        assert path_to_schemas == {
            ("args[0]",): {Foo, frozendict.frozendict},
            ("args[0]", "bar"): {Bar, str},
        }

    def test_discriminated_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = animal.Animal._validate(
            frozendict.frozendict(className="Dog", color="black"), validation_metadata=vm
        )
        for schema_classes in path_to_schemas.values():
            animal.Animal._process_schema_classes(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {animal.Animal, dog.Dog, dog._1, frozendict.frozendict},
            ("args[0]", "className"): {StrSchema, str},
            ("args[0]", "color"): {animal.Color, str},
        }

    def test_bool_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = BooleanEnum._validate(BoolClass.TRUE, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {BoolClass, BooleanEnum}}

    def test_oneof_composition_pig_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = Pig._validate(
            frozendict.frozendict(className="DanishPig"), validation_metadata=vm
        )
        for schema_classes in path_to_schemas.values():
            Pig._process_schema_classes(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {Pig, danish_pig.DanishPig, frozendict.frozendict},
            ("args[0]", "className"): {danish_pig.ClassName, str},
        }

    def test_anyof_composition_gm_fruit_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=schema_configuration.SchemaConfiguration())
        path_to_schemas = GmFruit._validate(
            frozendict.frozendict(cultivar="GoldenDelicious", lengthCm=Decimal(10)),
            validation_metadata=vm,
        )
        for schema_classes in path_to_schemas.values():
            GmFruit._process_schema_classes(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {GmFruit, apple.Apple, Banana, frozendict.frozendict},
            ("args[0]", "cultivar"): {apple.Cultivar, str},
            ("args[0]", "lengthCm"): {NumberSchema, Decimal},
        }


class TestValidateCalls(unittest.TestCase):
    def test_empty_list_validate(self):
        return_value = {("args[0]",): {array_holding_any_type.ArrayHoldingAnyType, tuple}}
        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            array_holding_any_type.ArrayHoldingAnyType([])
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            array_holding_any_type.ArrayHoldingAnyType.from_openapi_data_([])
            assert mock_validate.call_count == 1

    def test_empty_dict_validate(self):
        return_value = {("args[0]",): {Foo, frozendict.frozendict}}
        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            Foo({})
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate", return_value=return_value
        ) as mock_validate:
            Foo.from_openapi_data_({})
            assert mock_validate.call_count == 1

    def test_list_validate_direct_instantiation(self):
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
                array_with_validations_in_items.ArrayWithValidationsInItems([7], configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    (Decimal("7"),),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]",), configuration=used_configuration)
                )
                mock_inner_validate.assert_called_once_with(
                    Decimal("7"),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]", 0), configuration=used_configuration)
                )

    def test_list_validate_direct_instantiation_cast_item(self):
        # item validation is skipped if items are of the correct type
        item = array_with_validations_in_items.Items(7)
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
                array_with_validations_in_items.ArrayWithValidationsInItems([item], configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    tuple([Decimal('7')]),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=used_configuration,
                        validated_path_to_schemas={('args[0]', 0): {array_with_validations_in_items.Items, Decimal}}
                    )
                )
                mock_inner_validate.assert_not_called

    def test_list_validate_from_openai_data_instantiation(self):
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
                array_with_validations_in_items.ArrayWithValidationsInItems.from_openapi_data_([7], configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    (Decimal("7"),),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]",), configuration=used_configuration)
                )
                mock_inner_validate.assert_called_once_with(
                    Decimal("7"),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]", 0), configuration=used_configuration)
                )

    def test_dict_validate_direct_instantiation(self):
        with patch.object(Foo, "_validate", side_effect=Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                Foo({'bar': "a"}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict({"bar": "a"}),
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
        bar = Bar("a")
        used_configuration = schema_configuration.SchemaConfiguration()
        # only the Foo dict is validated because the bar property value was already validated
        with patch.object(Foo, "_validate", side_effect=Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                Foo({'bar': bar}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict(dict(bar='a')),
                    validation_metadata=ValidationMetadata(
                        path_to_item=('args[0]',),
                        configuration=used_configuration,
                        validated_path_to_schemas={('args[0]', 'bar'): {str, Bar}}
                    )
                )
                mock_inner_validate.assert_not_called()

    def test_dict_validate_from_openapi_data_instantiation(self):
        with patch.object(Foo, "_validate", side_effect=Foo._validate) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate",
                side_effect=Bar._validate,
            ) as mock_inner_validate:
                used_configuration = schema_configuration.SchemaConfiguration()
                Foo.from_openapi_data_({"bar": "a"}, configuration=used_configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict({"bar": "a"}),
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


if __name__ == "__main__":
    unittest.main()
