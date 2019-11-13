package JavaCore.GB.Lesson1;

public class TechnicalClass {
    private String part;
    private int number_1;
    private int number_2;
    private int number_3;

    public TechnicalClass(String part, int i, int i1, int i2) {
        this.part = part;
        this.number_1 = i;
        this.number_2 = i1;
        this.number_3 = i2;
    }


    public void inform() {
        System.out.println("-----------------");
    }

    public String getPart() {
        return part;
    }

    public int getNumber_1() {
        return number_1;
    }

    public int getNumber_2() {
        return number_2;
    }

    public int getNumber_3() {
        return number_3;
    }
}
