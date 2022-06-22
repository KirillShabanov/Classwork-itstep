import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter sdt = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
        LocalDateTime dt = LocalDateTime.now();
        String sd = sdt.format(dt);
        System.out.println(dt + "\n" + sd);


    }
}
