package LocalDateAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zoned {
    public static void main(String[] args) {
        ZonedDateTime current = ZonedDateTime.now();
        System.out.println(current.getZone());

        ZoneId zone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyo = current.withZoneSameInstant(zone);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd , EEE | hh:mm:ss a");


        System.out.println(current.withZoneSameInstant(zone));


        System.out.println("\nTokyo's Time and Date is: "+tokyo.format(format));
    }
}
