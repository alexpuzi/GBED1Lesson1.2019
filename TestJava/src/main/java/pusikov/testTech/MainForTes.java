package pusikov.testTech;

public class MainForTes {
    public static void main(String[] args) {
        Emploey[] staff = new Emploey[3];
        staff[0] = new Emploey("Kuzja", 78000, 1986, 12, 22);
        staff[1] = new Emploey("vas", 90000, 1988, 12, 45);
        staff[2] = new Emploey("h", 555555, 1798, 11, 12);
        for (Emploey e : staff) {
            e.raiseSalary(5);
        }
        for (Emploey e : staff) {
            System.out.println("name :" + e.getName() + ", salary: " + e.getSalary() + ", hideDate" + e.getHiredate());
        }


    }

}
