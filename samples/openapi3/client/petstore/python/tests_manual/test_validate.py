# coding: utf-8
import decimal
from decimal import Decimal
from unittest.mock import patch, call
import unittest

import frozendict

from petstore_api.components.schema.string_with_validation import StringWithValidation
from petstore_api.components.schema.string_enum import StringEnum
from petstore_api.components.schema.number_with_validations import NumberWithValidations
from petstore_api.components.schema.array_holding_any_type import ArrayHoldingAnyType
from petstore_api.components.schema.array_with_validations_in_items import (
    ArrayWithValidationsInItems,
)
from petstore_api.components.schema.foo import Foo
from petstore_api.components.schema.bar import Bar
from petstore_api.components.schema.animal import Animal
from petstore_api.components.schema.dog import Dog
from petstore_api.components.schema.boolean_enum import BooleanEnum
from petstore_api.components.schema.pig import Pig
from petstore_api.components.schema.danish_pig import DanishPig
from petstore_api.components.schema.gm_fruit import GmFruit
from petstore_api.components.schema.apple import Apple
from petstore_api.components.schema.banana import Banana
from petstore_api import schemas, configuration

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
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = StringWithValidation._validate_oapg(
            "abcdefg", validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {StringWithValidation, str}}

    def test_number_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = NumberWithValidations._validate_oapg(
            Decimal(11), validation_metadata=vm
        )
        assert path_to_schemas == {("args[0]",): {NumberWithValidations, Decimal}}

    def test_str_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = StringEnum._validate_oapg("placed", validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {str, StringEnum}}

    def test_nullable_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = StringEnum._validate_oapg(NoneClass.NONE, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {NoneClass, StringEnum}}

    def test_empty_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = ArrayHoldingAnyType._validate_oapg((), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {ArrayHoldingAnyType, tuple}}

    def test_list_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = ArrayHoldingAnyType._validate_oapg(
            (Decimal(1), "a"), validation_metadata=vm
        )
        assert path_to_schemas == {
            ("args[0]",): {ArrayHoldingAnyType, tuple},
            ("args[0]", 0): {AnyTypeSchema, Decimal},
            ("args[0]", 1): {AnyTypeSchema, str},
        }

    def test_empty_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = Foo._validate_oapg(frozendict.frozendict({}), validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {Foo, frozendict.frozendict}}

    def test_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = Foo._validate_oapg(
            frozendict.frozendict({"bar": "a", "additional": Decimal(0)}),
            validation_metadata=vm,
        )
        assert path_to_schemas == {
            ("args[0]",): {Foo, frozendict.frozendict},
            ("args[0]", "bar"): {StrSchema, str},
        }

    def test_discriminated_dict_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = Animal._validate_oapg(
            frozendict.frozendict(className="Dog", color="black"), validation_metadata=vm
        )
        for schema_classes in path_to_schemas.values():
            Animal._process_schema_classes_oapg(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {Animal, Dog, Dog.MetaOapg.AllOf.classes[1], frozendict.frozendict},
            ("args[0]", "className"): {StrSchema, str},
            ("args[0]", "color"): {StrSchema, str},
        }

    def test_bool_enum_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = BooleanEnum._validate_oapg(BoolClass.TRUE, validation_metadata=vm)
        assert path_to_schemas == {("args[0]",): {BoolClass, BooleanEnum}}

    def test_oneof_composition_pig_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = Pig._validate_oapg(
            frozendict.frozendict(className="DanishPig"), validation_metadata=vm
        )
        for schema_classes in path_to_schemas.values():
            Pig._process_schema_classes_oapg(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {Pig, DanishPig, frozendict.frozendict},
            ("args[0]", "className"): {DanishPig.MetaOapg.Properties.ClassName, str},
        }

    def test_anyof_composition_gm_fruit_validate(self):
        vm = ValidationMetadata(path_to_item=("args[0]",), configuration=configuration.Configuration())
        path_to_schemas = GmFruit._validate_oapg(
            frozendict.frozendict(cultivar="GoldenDelicious", lengthCm=Decimal(10)),
            validation_metadata=vm,
        )
        for schema_classes in path_to_schemas.values():
            GmFruit._process_schema_classes_oapg(schema_classes)
        assert path_to_schemas == {
            ("args[0]",): {GmFruit, Apple, Banana, frozendict.frozendict},
            ("args[0]", "cultivar"): {Apple.MetaOapg.Properties.Cultivar, str},
            ("args[0]", "lengthCm"): {NumberSchema, Decimal},
        }


class TestValidateCalls(unittest.TestCase):
    def test_empty_list_validate(self):
        return_value = {("args[0]",): {ArrayHoldingAnyType, tuple}}
        with patch.object(
            Schema, "_validate_oapg", return_value=return_value
        ) as mock_validate:
            ArrayHoldingAnyType([])
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate_oapg", return_value=return_value
        ) as mock_validate:
            ArrayHoldingAnyType.from_openapi_data_oapg([])
            assert mock_validate.call_count == 1

    def test_empty_dict_validate(self):
        return_value = {("args[0]",): {Foo, frozendict.frozendict}}
        with patch.object(
            Schema, "_validate_oapg", return_value=return_value
        ) as mock_validate:
            Foo({})
            assert mock_validate.call_count == 1

        with patch.object(
            Schema, "_validate_oapg", return_value=return_value
        ) as mock_validate:
            Foo.from_openapi_data_oapg({})
            assert mock_validate.call_count == 1

    def test_list_validate_direct_instantiation(self):
        with patch.object(
            ArrayWithValidationsInItems,
            "_validate_oapg",
            side_effect=ArrayWithValidationsInItems._validate_oapg,
        ) as mock_outer_validate:
            with patch.object(
                ArrayWithValidationsInItems.MetaOapg.Items,
                "_validate_oapg",
                side_effect=ArrayWithValidationsInItems.MetaOapg.Items._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                ArrayWithValidationsInItems([7], _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    (Decimal("7"),),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]",), configuration=configuration)
                )
                mock_inner_validate.assert_called_once_with(
                    Decimal("7"),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]", 0), configuration=configuration)
                )

    def test_list_validate_direct_instantiation_cast_item(self):
        # item validation is skipped if items are of the correct type
        item = ArrayWithValidationsInItems.MetaOapg.Items(7)
        with patch.object(
            ArrayWithValidationsInItems,
            "_validate_oapg",
            side_effect=ArrayWithValidationsInItems._validate_oapg,
        ) as mock_outer_validate:
            with patch.object(
                ArrayWithValidationsInItems.MetaOapg.Items,
                "_validate_oapg",
                side_effect=ArrayWithValidationsInItems.MetaOapg.Items._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                ArrayWithValidationsInItems([item], _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    tuple([Decimal('7')]),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=configuration,
                        validated_path_to_schemas={('args[0]', 0): {ArrayWithValidationsInItems.MetaOapg.Items, Decimal}}
                    )
                )
                mock_inner_validate.assert_not_called

    def test_list_validate_from_openai_data_instantiation(self):
        with patch.object(
            ArrayWithValidationsInItems,
            "_validate_oapg",
            side_effect=ArrayWithValidationsInItems._validate_oapg,
        ) as mock_outer_validate:
            with patch.object(
                ArrayWithValidationsInItems.MetaOapg.Items,
                "_validate_oapg",
                side_effect=ArrayWithValidationsInItems.MetaOapg.Items._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                ArrayWithValidationsInItems.from_openapi_data_oapg([7], _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    (Decimal("7"),),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]",), configuration=configuration)
                )
                mock_inner_validate.assert_called_once_with(
                    Decimal("7"),
                    validation_metadata=ValidationMetadata(path_to_item=("args[0]", 0), configuration=configuration)
                )

    def test_dict_validate_direct_instantiation(self):
        with patch.object(Foo, "_validate_oapg", side_effect=Foo._validate_oapg) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate_oapg",
                side_effect=Bar._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                Foo(bar="a", _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict({"bar": "a"}),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=configuration
                    )
                )
                mock_inner_validate.assert_called_once_with(
                    "a",
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]", "bar"),
                        configuration=configuration
                    ),
                )

    def test_dict_validate_direct_instantiation_cast_item(self):
        bar = StrSchema("a")
        # only the Foo dict is validated because the bar property value was already validated
        with patch.object(Foo, "_validate_oapg", side_effect=Foo._validate_oapg) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate_oapg",
                side_effect=Bar._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                Foo(bar=bar, _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict(dict(bar='a')),
                    validation_metadata=ValidationMetadata(
                        path_to_item=('args[0]',),
                        configuration=configuration,
                        validated_path_to_schemas={('args[0]', 'bar'): {str, StrSchema}}
                    )
                )
                mock_inner_validate.assert_not_called()

    def test_dict_validate_from_openapi_data_instantiation(self):
        with patch.object(Foo, "_validate_oapg", side_effect=Foo._validate_oapg) as mock_outer_validate:
            with patch.object(
                Bar,
                "_validate_oapg",
                side_effect=Bar._validate_oapg,
            ) as mock_inner_validate:
                configuration = configuration.Configuration()
                Foo.from_openapi_data_oapg({"bar": "a"}, _configuration=configuration)
                mock_outer_validate.assert_called_once_with(
                    frozendict.frozendict({"bar": "a"}),
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]",),
                        configuration=configuration
                    )
                )
                mock_inner_validate.assert_called_once_with(
                    "a",
                    validation_metadata=ValidationMetadata(
                        path_to_item=("args[0]", "bar"),
                        configuration=configuration
                    ),
                )


if __name__ == "__main__":
    unittest.main()
