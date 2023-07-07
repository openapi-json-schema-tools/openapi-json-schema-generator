# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import sys
import unittest

import immutabledict

import petstore_api
from petstore_api.components.schema import shape
from petstore_api.components.schema import complex_quadrilateral
from petstore_api.components.schema import simple_quadrilateral
from petstore_api.components.schema import triangle
from petstore_api.components.schema import triangle_interface
from petstore_api.components.schema import equilateral_triangle
from petstore_api.components.schema import isosceles_triangle
from petstore_api.components.schema import scalene_triangle


class TestShape(unittest.TestCase):
    """Shape unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_recursionlimit(self):
        """Test case for recursionlimit

        """
        assert sys.getrecursionlimit() == 1234

    def testShape(self):
        """Test Shape"""

        tri = shape.Shape.validate({
            'shapeType': "Triangle",
            'triangleType': "EquilateralTriangle"
        })
        assert isinstance(tri, immutabledict.immutabledict)
        assert isinstance(tri['shapeType'], str)

        tri = shape.Shape.validate({
            'shapeType': "Triangle",
            'triangleType': "IsoscelesTriangle"
        })
        assert isinstance(tri, immutabledict.immutabledict)

        tri = shape.Shape.validate({
            'shapeType': "Triangle",
            'triangleType': "ScaleneTriangle"
        })
        assert isinstance(tri, immutabledict.immutabledict)

        quad = shape.Shape.validate({
            'shapeType': "Quadrilateral",
            'quadrilateralType': "ComplexQuadrilateral"
        })
        assert isinstance(quad, immutabledict.immutabledict)

        quad = shape.Shape.validate({
            'shapeType': "Quadrilateral",
            'quadrilateralType': "SimpleQuadrilateral"
        })
        assert isinstance(quad, immutabledict.immutabledict)

        # data missing
        with self.assertRaisesRegex(
                petstore_api.ApiValueError,
                r"Cannot deserialize input data due to missing discriminator. The discriminator "
                r"property 'shapeType' is missing at path: \('args\[0\]',\)"
        ):
            shape.Shape.validate({})

        # invalid shape_type (first discriminator). 'Circle' does not exist in the model.
        err_msg = (
            r"Invalid discriminator value was passed in to Shape.shapeType Only the values "
            r"\['Quadrilateral', 'Triangle'\] are allowed at \('args\[0\]', 'shapeType'\)"
        )
        with self.assertRaisesRegex(
                petstore_api.ApiValueError,
                err_msg
        ):
            shape.Shape.validate({'shapeType': "Circle"})

        # invalid quadrilateral_type (second discriminator)
        err_msg = (
            r"Invalid discriminator value was passed in to Quadrilateral.quadrilateralType Only the values "
            r"\['ComplexQuadrilateral', 'SimpleQuadrilateral'\] are allowed at \('args\[0\]', 'quadrilateralType'\)"
        )
        with self.assertRaisesRegex(
                petstore_api.ApiValueError,
                err_msg
        ):
            shape.Shape.validate({
                'shapeType': "Quadrilateral",
                'quadrilateralType': "Triangle"
            })

if __name__ == '__main__':
    unittest.main()
