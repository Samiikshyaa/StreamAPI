package LocalDateAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Try {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime timeplus = time.plus(24, ChronoUnit.HOURS);
        LocalDate date = LocalDate.now();
        LocalDate dateplus = date.plus(1,ChronoUnit.DAYS);
        System.out.println(timeplus);
        System.out.println(dateplus);

    }
}
