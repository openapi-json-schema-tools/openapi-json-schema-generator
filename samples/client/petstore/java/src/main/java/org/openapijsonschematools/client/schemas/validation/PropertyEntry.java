package org.openapijsonschematools.client.schemas.validation;

import java.util.AbstractMap;

@SuppressWarnings("serial")
public class PropertyEntry extends AbstractMap.SimpleEntry<String, Class<? extends JsonSchema<?>>> {
    public PropertyEntry(String key, Class<? extends JsonSchema<?>> value) {
        super(key, value);
    }
}