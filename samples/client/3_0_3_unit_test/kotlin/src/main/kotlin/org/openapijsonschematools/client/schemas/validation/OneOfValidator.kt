package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class OneOfValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val oneOf: List<Class<out JsonSchema<*>>> = data.schema.oneOf ?: return null
        val pathToSchemas = PathToSchemasMap()
        val validatedOneOfClasses: MutableList<Class<out JsonSchema<*>>> = ArrayList()
        for (oneOfClass in oneOf) {
            if (oneOfClass == data.schema.javaClass) {
                /*
                optimistically assume that schema will pass validation
                do not invoke validate on it because that is recursive
                */
                validatedOneOfClasses.add(oneOfClass)
                continue
            }
            try {
                val oneOfSchema = JsonSchemaFactory.getInstance(oneOfClass)
                val otherPathToSchemas = JsonSchema.validate(oneOfSchema, data.arg, data.validationMetadata)
                validatedOneOfClasses.add(oneOfClass)
                pathToSchemas.update(otherPathToSchemas)
            } catch (e: ValidationException) {
                // silence exceptions because the code needs to accumulate validatedOneOfClasses
            }
        }
        if (validatedOneOfClasses.isEmpty()) {
            throw ValidationException(
                "Invalid inputs given to generate an instance of " + data.schema.javaClass + ". None " +
                        "of the oneOf schemas matched the input data."
            )
        }
        if (validatedOneOfClasses.size > 1) {
            throw ValidationException(
                "Invalid inputs given to generate an instance of " + data.schema.javaClass +
                ". Multiple oneOf schemas validated the data, but a max of one is allowed."
            )
        }
        return pathToSchemas
    }
}