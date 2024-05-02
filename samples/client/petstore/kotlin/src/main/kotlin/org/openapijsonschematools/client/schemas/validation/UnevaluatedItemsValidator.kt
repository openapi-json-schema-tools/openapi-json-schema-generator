package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class UnevaluatedItemsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var unevaluatedItems = data.schema().unevaluatedItems;
        if (unevaluatedItems == null) {
            return null;
        }
        var knownPathToSchemas = data.knownPathToSchemas();
        if (knownPathToSchemas == null) {
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
        JsonSchema<?> unevaluatedItemsSchema = JsonSchemaFactory.getInstance(unevaluatedItems);
        for(int i = minIndex; i < listArg.size(); i++) {
            List<Object> itemPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            itemPathToItem.add(i);
            if (knownPathToSchemas.containsKey(itemPathToItem)) {
                continue;
            }
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
            );
            if (itemValidationMetadata.validationRanEarlier(unevaluatedItemsSchema)) {
                // todo add_deeper_validated_schemas
                continue;
            }
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(unevaluatedItemsSchema, listArg.get(i), itemValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
