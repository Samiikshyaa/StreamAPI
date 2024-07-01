package LocalDateAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Format {
    public static void main(String[] args) {
        System.out.println("Current date and time is: ");
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dayformat = DateTimeFormatter.ofPattern("MMMM dd , yyyy");
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(today.format(dayformat));
        System.out.println(today.format(timeformat));
    }
}
