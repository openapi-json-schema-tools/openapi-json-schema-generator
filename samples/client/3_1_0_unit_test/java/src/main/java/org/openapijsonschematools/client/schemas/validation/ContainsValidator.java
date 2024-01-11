package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ContainsValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> contains;

    public ItemsValidator(Class<? extends JsonSchema> contains) {
        this.contains = contains;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (!(arg instanceof List)) {
            return null;
        }
        many_path_to_schemas = contains_cls_path_to_schemas[1]
        if (containsPathToSchemas.isEmpty()) {
            throw new ApiValueError(
                "Validation failed for contains keyword in class={} at pathToItem={}. No "
                "items validated to the contains schema.".format(cls, validation_metadata.path_to_item)
            )
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for (PathToSchemasMap otherPathToSchema: containsPathToSchemas) {
            pathToSchemas.update(other_path_to_schema)
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
        List<PathToSchemasMap> containsPathToSchemas = new ArrayList<>();
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
            if (itemValidationMetadata.validationRanEarlier(itemsSchema)) {
                // todo add_deeper_validated_schemas
                containsPathToSchemas.add(thesePathToSchemas);
                i +=1;
                continue;
            }

            JsonSchema containsSchema = JsonSchemaFactory.getInstance(contains);
            try {
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(
                    containsSchema, itemValue, itemValidationMetadata)
                containsPathToSchemas.append(otherPathToSchemas)
            } except (exceptions.OpenApiException ignored) {
                ;
            }
        return containsPathToSchemas;
    }
}
