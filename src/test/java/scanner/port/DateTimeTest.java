package scanner.port;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeTest {

    @Test
    void SetDateTime(){
        DateTime date = new DateTime();

        String formattedDateTime = date.SetDateTime(date.dateTimeFormat,date.todaysDate);

        String expectedDateTime = date.dateTimeFormat.format(date.todaysDate);

        assertEquals(expectedDateTime,formattedDateTime);
    }



}
