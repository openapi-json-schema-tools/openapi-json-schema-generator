package org.openapijsonschematools.client.schemas.validation

import java.text.BreakIterator

abstract class LengthValidator {
    protected fun getLength(text: String?): Int {
        var graphemeCount = 0
        val graphemeCounter = BreakIterator
            .getCharacterInstance()
        graphemeCounter.setText(text)
        while (graphemeCounter.next() != BreakIterator.DONE) {
            graphemeCount++
        }
        return graphemeCount
    }
}
