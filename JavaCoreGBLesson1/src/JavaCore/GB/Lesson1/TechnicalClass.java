package JavaCore.GB.Lesson1;

public class TechnicalClass <T,N> {
    private T part;
    private int number_1;
    private int number_2;
    private int number_3;

    public TechnicalClass(String part, int i, int i1, int i2) {
        this.part = (T) part;
        this.number_1 = i;
        this.number_2 = i1;
        this.number_3 = i2;
    }


    public void inform(){
        System.out.println("-----------------");
    }
    public T getPart(){
        return part;
    }
    public int getNumber_1(){
        return number_1;
    }
    public int getNumber_2(){
        return number_2;
    }
    public int getNumber_3(){
        return number_3;
    }
}
