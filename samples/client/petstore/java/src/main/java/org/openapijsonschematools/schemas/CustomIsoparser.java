import java.time.ZonedDateTime
import java.time.LocalDate

package org.org.openapijsonschematools.schemas;

public final class CustomIsoparser {

    public ZonedDateTime parseIsodatetime(self, dateTime: String) {
        return ZonedDateTime.parse(dateTime)
    }

    public LocalDate parseIsodate(self, date: String) {
        return LocalDate.parse(dateTime)
    }

}