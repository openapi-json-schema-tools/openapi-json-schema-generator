package org.openapijsonschematools.client.schemas.validation;

import java.text.BreakIterator;

public abstract class LengthValidator {
    protected int getLength(String text) {
        int graphemeCount = 0;
        BreakIterator graphemeCounter = BreakIterator
                .getCharacterInstance();
        graphemeCounter.setText(text);
        while (graphemeCounter.next() != BreakIterator.DONE) {
            graphemeCount++;
        }
        return graphemeCount;
    }
}
