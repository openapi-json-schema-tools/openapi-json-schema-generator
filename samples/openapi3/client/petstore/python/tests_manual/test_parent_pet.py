# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import unittest

from petstore_api.components.schema.grandparent_animal import GrandparentAnimal
from petstore_api.components.schema.parent_pet import ParentPet


class TestParentPet(unittest.TestCase):
    """ParentPet unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testParentPet(self):
        """Test ParentPet"""

        # test that we can make a ParentPet from a ParentPet
        # which requires that we travel back through ParentPet's allOf descendant
        # GrandparentAnimal, and we use the descendant's discriminator to make ParentPet
        model = ParentPet({'pet_type': "ParentPet"})
        assert isinstance(model, ParentPet)
        assert isinstance(model, GrandparentAnimal)


if __name__ == '__main__':
    unittest.main()
