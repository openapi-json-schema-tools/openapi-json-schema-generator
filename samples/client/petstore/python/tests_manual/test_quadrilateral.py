# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""
import unittest

from petstore_api import schemas
from petstore_api.components.schema import quadrilateral


class TestQuadrilateral(unittest.TestCase):
    """Quadrilateral unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testQuadrilateral(self):
        """Test Quadrilateral"""
        instance = quadrilateral.Quadrilateral.validate({'shapeType': "Quadrilateral", 'quadrilateralType': "ComplexQuadrilateral"})
        assert isinstance(instance, schemas.immutabledict)


if __name__ == '__main__':
    unittest.main()
