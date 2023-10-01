package scanner.port;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateTime {
    DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // date format
    LocalDateTime todaysDate = LocalDateTime.now(); // obtains today's date
    public String SetDateTime(DateTimeFormatter dateTimeFormat, LocalDateTime todaysDate) // set the date and time using the date format and today's date
    {
        return dateTimeFormat.format(todaysDate);
    }
}
