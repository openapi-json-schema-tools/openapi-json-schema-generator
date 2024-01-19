package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemsValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> items;

    public ItemsValidator(Class<? extends JsonSchema> items) {
        this.items = items;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas
    ) {
        if (!(arg instanceof List<?> listArg)) {
            return null;
        }
        if (listArg.isEmpty()) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        int minIndex = schema.prefixItems != null ? schema.prefixItems.size() : 0;
        JsonSchema itemsSchema = JsonSchemaFactory.getInstance(items);
        for(int i = minIndex; i < listArg.size(); i++) {
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
                continue;
            }
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(itemsSchema, listArg.get(i), itemValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
