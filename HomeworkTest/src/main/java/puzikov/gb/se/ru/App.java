package puzikov.gb.se.ru;

import java.util.Scanner;
import java.sql.Array;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        int [] array1 = {12,2,443,-23,0,12,-15,22,9,9833};
        int i;
        for(i = 0; i < array1.length; i++){
            for(int j = 0; j < array1.length; j++){
                if (array1[i]<array1[j]) {
                    array1[i] = array1[j];
                }
            }

            System.out.print(" "+ array1[i]);
        }
    }
}