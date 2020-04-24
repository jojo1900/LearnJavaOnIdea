
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff= new Employee[3];
        staff[0] = new Employee("chenzhujun",1000.0,2020,4,20);
        staff[1] = new Employee("yadong",2000,2020,4,20);
        staff[2] = new Employee("xuanfeng",3000,2020,4,20);
        for(Employee e:staff){
            e.raiseSalary(10);
        }

        for(Employee e:staff){
            System.out.println(""+e.getName()+" 的收入为"+e.getSalary());
        }
    }
}
