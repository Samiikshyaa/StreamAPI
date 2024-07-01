package LocalDateAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterPractice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate firstDayOfTheMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfTheMonth);

        LocalDate nextFriday = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Next friday is in:" + nextFriday);

        Period gap = Period.between(date, nextFriday);
        System.out.println(gap.getDays() + " days");
    }
}
