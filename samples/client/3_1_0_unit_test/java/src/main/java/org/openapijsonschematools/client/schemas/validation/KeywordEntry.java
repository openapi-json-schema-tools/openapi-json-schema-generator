package org.openapijsonschematools.client.schemas.validation;

import java.util.AbstractMap;

@SuppressWarnings("serial")
public class KeywordEntry extends AbstractMap.SimpleEntry<String, KeywordValidator> {
    public KeywordEntry(String key, KeywordValidator value) {
        super(key, value);
    }
}
