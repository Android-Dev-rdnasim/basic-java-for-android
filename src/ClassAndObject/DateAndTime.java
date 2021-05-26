package ClassAndObject;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class DateAndTime {

    //LocalDate, LocalTime, LocalDateTime, DateTimeFormatter
    public static void main(String[] args){
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println(myDate);
        System.out.println(myTime.getHour() + ":" + myTime.getMinute());
        System.out.println(myDateTime);

        DateTimeFormatter myDateTimeFormat = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");
        String formatDate = myDateTime.format(myDateTimeFormat);

        System.out.println(formatDate);
    }

}
