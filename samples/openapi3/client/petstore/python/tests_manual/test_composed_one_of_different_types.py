# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import unittest
from datetime import date, datetime, timezone
from dateutil.tz import tzutc

from petstore_api import schemas
from petstore_api.components.schema.animal import Animal
from petstore_api.components.schema.cat import Cat
from petstore_api.components.schema import composed_one_of_different_types
from petstore_api.components.schema.number_with_validations import NumberWithValidations

class TestComposedOneOfDifferentTypes(unittest.TestCase):
    """ComposedOneOfDifferentTypes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_ComposedOneOfDifferentTypes(self):
        """Test ComposedOneOfDifferentTypes"""
        # we can make an instance that stores float data
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate(10.0)
        assert isinstance(inst, float)

        # we can make an instance that stores object (dict) data
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate({'className': "Cat", 'color': "black"})
        assert isinstance(inst, schemas.immutabledict)

        # object that holds 4 properties and is not an Animal
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate({'a': "a", 'b': "b", 'c': "c", 'd': "d"})
        assert isinstance(inst, schemas.immutabledict)

        # None
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate(None)
        assert inst is None

        # date
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate('2019-01-10')
        assert isinstance(inst, str)
        assert schemas.as_date_(inst).year == 2019
        assert schemas.as_date_(inst).month == 1
        assert schemas.as_date_(inst).day == 10

        # date
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate(date(2019, 1, 10))
        assert isinstance(inst, str)
        assert schemas.as_date_(inst).year == 2019
        assert schemas.as_date_(inst).month == 1
        assert schemas.as_date_(inst).day == 10

        # date-time
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate('2020-01-02T03:04:05Z')
        assert isinstance(inst, str)
        assert schemas.as_datetime_(inst).year == 2020
        assert schemas.as_datetime_(inst).month == 1
        assert schemas.as_datetime_(inst).day == 2
        assert schemas.as_datetime_(inst).hour == 3
        assert schemas.as_datetime_(inst).minute == 4
        assert schemas.as_datetime_(inst).second == 5
        utc_tz = tzutc()
        assert schemas.as_datetime_(inst).tzinfo == utc_tz

        # date-time
        inst = composed_one_of_different_types.ComposedOneOfDifferentTypes.validate(datetime(2020, 1, 2, 3, 4, 5, tzinfo=timezone.utc))
        assert isinstance(inst, str)
        assert schemas.as_datetime_(inst).year == 2020
        assert schemas.as_datetime_(inst).month == 1
        assert schemas.as_datetime_(inst).day == 2
        assert schemas.as_datetime_(inst).hour == 3
        assert schemas.as_datetime_(inst).minute == 4
        assert schemas.as_datetime_(inst).second == 5
        assert schemas.as_datetime_(inst).tzinfo == utc_tz


if __name__ == '__main__':
    unittest.main()
