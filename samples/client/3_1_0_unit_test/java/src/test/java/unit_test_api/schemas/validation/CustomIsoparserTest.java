package unit_test_api.schemas.validation;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import org.junit.Assert;
import org.junit.Test;

public final class CustomIsoparserTest {

    @Test
    public void testParseIsodatetime() {
        final CustomIsoparser parser = new CustomIsoparser();
        ZonedDateTime dateTime = parser.parseIsodatetime("2017-07-21T17:32:28Z");
        ZoneId zone = ZoneId.of("Z");
        ZonedDateTime expectedDateTime = ZonedDateTime.of(2017, 7, 21, 17, 32, 28, 0, zone);
        Assert.assertEquals(dateTime, expectedDateTime);
    }

    @Test
    public void testParseIsodate() {
        final CustomIsoparser parser = new CustomIsoparser();
        LocalDate date = parser.parseIsodate("2017-07-21");
        LocalDate expectedDate = LocalDate.of(2017, 7, 21);
        Assert.assertEquals(date, expectedDate);
    }

}