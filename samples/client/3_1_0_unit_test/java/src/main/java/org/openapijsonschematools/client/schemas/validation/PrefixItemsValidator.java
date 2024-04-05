package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class PrefixItemsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var prefixItems = data.schema().prefixItems;
        if (prefixItems == null) {
            return null;
        }
        if (!(data.arg() instanceof List<?> listArg)) {
            return null;
        }
        if (listArg.isEmpty()) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        int maxIndex = Math.min(listArg.size(), prefixItems.size());
        for (int i=0; i < maxIndex; i++) {
            List<Object> itemPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            itemPathToItem.add(i);
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
            );
            JsonSchema<?> itemsSchema = JsonSchemaFactory.getInstance(prefixItems.get(i));
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(itemsSchema, listArg.get(i), itemValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
