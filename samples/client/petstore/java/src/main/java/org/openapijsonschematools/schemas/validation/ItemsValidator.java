package org.openapijsonschematools.schemas.validation;

import java.util.ArrayList;
import java.util.List;

public class ItemsValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> items;

    public ItemsValidator(Class<? extends JsonSchema> items) {
        this.items = items;
    }

    @Override
    public Object getConstraint() {
        return items;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof List)) {
            return null;
        }
        List<Object> castArg = (List<Object>) arg;
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        // todo add handling for prefixItems
        int i = 0;
        for(Object itemValue: castArg) {
            List<Object> itemPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            itemPathToItem.add(i);
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            if (itemValidationMetadata.validationRanEarlier(items)) {
                // todo add_deeper_validated_schemas
                i +=1;
                continue;
            }
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(items, itemValue, itemValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
            i += 1;
        }
        return pathToSchemas;
    }
}