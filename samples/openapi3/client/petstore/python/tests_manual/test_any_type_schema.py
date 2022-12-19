# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import unittest
from decimal import Decimal

import frozendict

import petstore_api
from petstore_api.schemas import (
    AnyTypeSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    NumberSchema,
    IntSchema,
    BoolSchema,
    NoneSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    NoneClass,
    BoolClass
)


class TestAnyTypeSchema(unittest.TestCase):

    def testDictSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        DictSchema,
                    ]

        m = Model(a=1, b='hi')
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, DictSchema)
        assert isinstance(m, frozendict.frozendict)
        assert m == frozendict.frozendict(a=Decimal(1), b='hi')

    def testListSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        ListSchema,
                    ]

        m = Model([1, 'hi'])
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, ListSchema)
        assert isinstance(m, tuple)
        assert m == tuple([Decimal(1), 'hi'])

    def testStrSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        StrSchema,
                    ]

        m = Model('hi')
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, StrSchema)
        assert isinstance(m, str)
        assert m == 'hi'

    def testNumberSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        NumberSchema,
                    ]

        m = Model(1)
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, NumberSchema)
        assert isinstance(m, Decimal)
        assert m == Decimal(1)

        m = Model(3.14)
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, NumberSchema)
        assert isinstance(m, Decimal)
        assert m == Decimal(3.14)

    def testIntSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        IntSchema,
                    ]

        m = Model(1)
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, IntSchema)
        assert isinstance(m, Decimal)
        assert m == Decimal(1)

        with self.assertRaises(petstore_api.exceptions.ApiValueError):
            # can't pass in float into Int
            Model(3.14)

    def testBoolSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        BoolSchema,
                    ]

        m = Model(True)
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, BoolSchema)
        assert isinstance(m, BoolClass)
        self.assertTrue(m)

        m = Model(False)
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, BoolSchema)
        assert isinstance(m, BoolClass)
        self.assertFalse(m)

    def testNoneSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        NoneSchema,
                    ]

        m = Model(None)
        self.assertTrue(m.is_none_oapg())
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, NoneSchema)
        assert isinstance(m, NoneClass)

    def testDateSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        DateSchema,
                    ]

        m = Model('1970-01-01')
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, DateSchema)
        assert isinstance(m, str)
        assert m == '1970-01-01'

    def testDateTimeSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        DateTimeSchema,
                    ]

        m = Model('2020-01-01T00:00:00')
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, DateTimeSchema)
        assert isinstance(m, str)
        assert m == '2020-01-01T00:00:00'

    def testDecimalSchema(self):
        class Model(AnyTypeSchema):
            class MetaOapg:

                class AllOf:
                    classes = [
                        AnyTypeSchema,
                        DecimalSchema,
                    ]

        m = Model('12.34')
        assert m == '12.34'
        assert m.as_decimal_oapg == Decimal('12.34')
        assert isinstance(m, Model)
        assert isinstance(m, AnyTypeSchema)
        assert isinstance(m, DecimalSchema)
        assert isinstance(m, str)


if __name__ == '__main__':
    unittest.main()
