package org.openapijsonschematools.client.schemas.validation;

import java.time.ZonedDateTime;
import java.time.LocalDate;

public final class CustomIsoparser {

    public ZonedDateTime parseIsodatetime(String dateTime) {
        return ZonedDateTime.parse(dateTime);
    }

    public LocalDate parseIsodate(String date) {
        return LocalDate.parse(date);
    }

}