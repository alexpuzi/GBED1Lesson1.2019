package sample.lesson1;
//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
//        текст вместо числа), должно быть брошено исключение MyArrayDataException – с детализацией,
//        в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения
//        MySizeArrayException и MyArrayDataException и вывести результат расчета.
//        Lesson 3
//


import java.util.ArrayList;

public class MainLesson1 {

    private Cat cat = new Cat("run_Cat", "jump_Cat");
    private Robot robot = new Robot("jump_Robot","Run_robot");
    private Men men = new Men("run_Men", "Jump_men");
    private Cat catInCompetitional = new Cat(600,12);
    public Men menInCompetitional = new Men(1300, 3);
    public Robot robotInCompetentional = new Robot(2400, 2);

    public Wall wall = new Wall(12);
    public Treadmill treadmill = new Treadmill(1200);



    public void getCat() {
        cat.setJump();
        cat.setRun();
    }
    public void getRobot(){
        robot.setJump();
        robot.setRun();
    }
    public void getMen(){
        men.getJump();
        men.getRun();
    }
    public void running(){

        }

    }




