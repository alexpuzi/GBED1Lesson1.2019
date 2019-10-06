package puzikov.gb.je.ru;
import java.sql.DriverManager;
public class Newarraynewvaryable {
    public static void main(String[] args) {
        int [] array = new int [8];
        int i;
        for(i = 0; i < array.length; i++){
            System.out.println(array[i]);
            array[i] = array[i]+3;
        }
    }
}
