# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class SelfReferencingArrayModelTuple(
    typing.Tuple[
        'SelfReferencingArrayModelTuple',
        ...
    ]
):

    def __new__(cls, arg: SelfReferencingArrayModelTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return SelfReferencingArrayModel.validate(arg, configuration=configuration)
SelfReferencingArrayModelTupleInput = typing.Union[
    typing.List[
        typing.Union[
            SelfReferencingArrayModelTupleInput,
            SelfReferencingArrayModelTuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            SelfReferencingArrayModelTupleInput,
            SelfReferencingArrayModelTuple
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class SelfReferencingArrayModel(
    schemas.Schema[schemas.immutabledict, SelfReferencingArrayModelTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[SelfReferencingArrayModel] = dataclasses.field(default_factory=lambda: SelfReferencingArrayModel) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: SelfReferencingArrayModelTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SelfReferencingArrayModelTupleInput,
            SelfReferencingArrayModelTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SelfReferencingArrayModelTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
