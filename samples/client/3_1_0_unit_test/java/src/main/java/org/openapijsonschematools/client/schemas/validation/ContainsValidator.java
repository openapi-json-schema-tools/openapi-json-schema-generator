package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class ContainsValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> contains;

    public ContainsValidator(Class<? extends JsonSchema> contains) {
        this.contains = contains;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof List)) {
            return null;
        }
        var containsPathToSchemas = data.containsPathToSchemas();
        if (containsPathToSchemas == null || containsPathToSchemas.isEmpty()) {
            throw new ValidationException(
                "Validation failed for contains keyword in class="+data.schema().getClass()
                + " at pathToItem="+data.validationMetadata().pathToItem()+". No "
                + "items validated to the contains schema."
            );
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for (PathToSchemasMap otherPathToSchema: containsPathToSchemas) {
            pathToSchemas.update(otherPathToSchema);
        }
        return pathToSchemas;
    }

    public List<PathToSchemasMap> getContainsPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        if (!(arg instanceof List)) {
            return new ArrayList<>();
        }
        @Nullable List<PathToSchemasMap> containsPathToSchemas = new ArrayList<>();
        int i = 0;
        for(Object itemValue: (List<?>) arg) {
            PathToSchemasMap thesePathToSchemas = new PathToSchemasMap();
            List<Object> itemPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            itemPathToItem.add(i);
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            JsonSchema containsSchema = JsonSchemaFactory.getInstance(contains);
            if (itemValidationMetadata.validationRanEarlier(containsSchema)) {
                // todo add_deeper_validated_schemas
                containsPathToSchemas.add(thesePathToSchemas);
                i += 1;
                continue;
            }

            try {
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(
                        containsSchema, itemValue, itemValidationMetadata);
                containsPathToSchemas.add(otherPathToSchemas);
            } catch (ValidationException ignored) {}
        }
        return containsPathToSchemas;
    }
}