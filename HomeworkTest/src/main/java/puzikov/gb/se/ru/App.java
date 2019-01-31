package puzikov.gb.se.ru;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("умножение 1");
        System.out.println("Деление 2");
        System.out.println("Вычитание 3");
        System.out.println("сложение 4");

        int enter, a, b, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери тип операции:");
        enter = scanner.nextInt();
        if(enter == 1){
            System.out.println("Введи число 1:  ");
            a = scanner.nextInt();
            System.out.println("Введи число 2:  ");
            b = scanner.nextInt();
            result = a*b;
            System.out.println("Результат умножения = " + result);
        } else if(enter == 2){
            System.out.println("Введи число 1:  ");
            a = scanner.nextInt();
            System.out.println("Введи число 2:  ");
            b = scanner.nextInt();
            result = a/b;
            System.out.println("Результат деления = " + result);
        } else if(enter == 3){
            System.out.println("Введи число 1:  ");
            a = scanner.nextInt();
            System.out.println("Введи число 2:  ");
            b = scanner.nextInt();
            result = a-b;
            System.out.println("Результат вычитания = " + result);
        } else if(enter == 4){
            System.out.println("Введи число 1:  ");
            a = scanner.nextInt();
            System.out.println("Введи число 2:  ");
            b = scanner.nextInt();
            result = a+b;
            System.out.println("Результат сложения = " + result);
        }

    }
}