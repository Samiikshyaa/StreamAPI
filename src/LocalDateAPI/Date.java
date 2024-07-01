package LocalDateAPI;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("The date is: "+date);

        LocalTime time = LocalTime.now();
        System.out.println("The time is: "+time);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("The current date and time is: "+current);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEE, dd MMMM yyyy hh:mm:ss a");
        String formatted = current.format(dt);
        System.out.println("Formatted date and time is: "+formatted);

        LocalDate birthday = LocalDate.of(2001,9,13);
        System.out.println(birthday);

        LocalDate twintower = LocalDate.parse("2001-09-11");
        System.out.println("Twin Tower date is: "+twintower);


        LocalDateTime back23 = LocalDateTime.now().withYear(2001).withDayOfYear(365);
        System.out.println(back23);

    }
}
