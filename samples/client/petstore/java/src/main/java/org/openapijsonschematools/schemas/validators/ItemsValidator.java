package org.openapijsonschematools.schemas.validators;

import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.ArrayList;
import java.util.List;

public class ItemsValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Object arg, Object value, Object extra, Class<SchemaValidator> cls, ValidationMetadata validationMetadata) {
        if (!(arg instanceof List)) {
            return null;
        }
        List<Object> castArg = (List<Object>) arg;
        Class<Schema> itemsSchema = (Class<Schema>) value;
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
            if (itemValidationMetadata.validationRanEarlier(itemsSchema)) {
                // todo add_deeper_validated_schemas
                i +=1;
                continue;
            }
            PathToSchemasMap otherPathToSchemas = SchemaValidator.validate(itemsSchema, itemValue, itemValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
            i += 1;
        }
        return pathToSchemas;
    }
}
