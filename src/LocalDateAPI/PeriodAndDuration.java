package LocalDateAPI;

import java.time.*;

public class PeriodAndDuration {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2001,9, 13);
        Period gap = Period.between(today, birthday);
        System.out.println(gap);

        LocalTime current = LocalTime.now();
        Duration duration = Duration.ofHours(15);
        LocalTime somedays = current.plus(duration);
        System.out.println(somedays);
        Duration daygap = Duration.between(somedays,current);
        System.out.println(daygap.toHoursPart());
    }
}
