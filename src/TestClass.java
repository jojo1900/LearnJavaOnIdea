import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class TestClass {
    public  static  void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println(today);

        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int val = weekday.getValue();
    }
}
