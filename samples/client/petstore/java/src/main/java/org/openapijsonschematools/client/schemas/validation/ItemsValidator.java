package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class ItemsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var items = data.schema().items;
        if (items == null) {
            return null;
        }
        if (!(data.arg() instanceof List<?> listArg)) {
            return null;
        }
        if (listArg.isEmpty()) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        int minIndex = data.schema().prefixItems != null ? data.schema().prefixItems.size() : 0;
        JsonSchema<?> itemsSchema = JsonSchemaFactory.getInstance(items);
        for(int i = minIndex; i < listArg.size(); i++) {
            List<Object> itemPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            itemPathToItem.add(i);
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
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
