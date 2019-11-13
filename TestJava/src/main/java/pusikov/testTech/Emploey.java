package pusikov.testTech;

import java.util.Date;
import java.util.GregorianCalendar;

public class Emploey {
    private String Name;
    private double salary;
    private Date hiredate;

    public Emploey(String name, double salary, int year, int month, int day) {
        Name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month,day);
        hiredate = calendar.getTime();
    }
    public String getName(){
        return Name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHiredate(){
        return hiredate;
    }
    public void raiseSalary(double byPersent){
        double raise = salary*byPersent/-1;
        salary += raise;
    }
}
