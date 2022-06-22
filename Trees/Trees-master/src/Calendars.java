import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendars {
    public static void main(String[] args) {


        Calendar calendar = new GregorianCalendar();
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String sDate = simpleDateFormat.format(dateNow);
        System.out.println(dateNow + "\n" + sDate);

        calendar.add(Calendar.MONTH, 10);
        Date dateAfter = calendar.getTime();
        sDate = simpleDateFormat.format(dateAfter);
        System.out.println(sDate);

        calendar = new GregorianCalendar(2020, Calendar.DECEMBER, 3);
        Date specDate= calendar.getTime();
        sDate = simpleDateFormat.format(specDate);
        System.out.println(sDate);

        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        System.out.println("TimeZone : " + timeZone.getID() + " ("
                + timeZone.getDisplayName() + ")\n");
    }
}
