package unit_test_api.schemas.validation;

import java.util.AbstractMap;

@SuppressWarnings("serial")
public class KeywordEntry extends AbstractMap.SimpleEntry<String, KeywordValidator> {
    public KeywordEntry(String key, KeywordValidator value) {
        super(key, value);
    }
}
