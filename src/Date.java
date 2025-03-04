import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        DateTimeFormatter d=DateTimeFormatter.ofPattern("MMMM dd YYYY EEEE");
        String s=d.format(date);
        System.out.println(s);
    }
}
