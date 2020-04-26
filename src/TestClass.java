import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TestClass {
    public  static  void main(String[] args){
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("name",1000,2010,2,11));
        staff.ensureCapacity(100);
        System.out.println(staff.size());
        staff.trimToSize();
    }
}
