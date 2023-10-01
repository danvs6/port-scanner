package scanner.port;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateTime {
    DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime todaysDate = LocalDateTime.now();
    public String SetDateTime(DateTimeFormatter dateTimeFormat, LocalDateTime todaysDate){
        return dateTimeFormat.format(todaysDate);
    }
}
