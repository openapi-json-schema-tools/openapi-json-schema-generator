package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class PatternIsNotAnchoredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMatchesASubstringPasses() {
        // matches a substring
        final var schema = PatternIsNotAnchored.PatternIsNotAnchored1.getInstance();
        schema.validate(
            "xxaayy",
            configuration
        );
    }
}
