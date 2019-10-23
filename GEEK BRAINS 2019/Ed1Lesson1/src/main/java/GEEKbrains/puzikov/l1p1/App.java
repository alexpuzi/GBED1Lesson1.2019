package GEEKbrains.puzikov.l1p1;


/*1. Создайте три класса Человек, Кот, Робот,
которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать
(методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена,
при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
У препятствий есть длина (для дорожки)
 или высота (для стены), а участников ограничения на бег и прыжки.
3. Создайте два массива: с участниками и препятствиями,
и заставьте всех участников пройти этот набор препятствий.
Если участник не смог пройти одно из препятствий,
то дальше по списку он препятствий не идет.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Результат 1 задания:");
        FirstPartOfHW firstPartOfHW = new FirstPartOfHW();
        firstPartOfHW.printInfo();
        System.out.println("----------------------");

        Road road = new Road("M9");

        Cat cat = new Cat("Volt", "jump", "Run");
        int resultR = road.roadInfo();
        int resultW = road.wallInfo();
        int result1 = cat.run();
        int result12 = cat.jump();
        if (result1 >= resultR) {
            System.out.println("Кот не справился с бегом");
        } else {
            System.out.println("Кот справился с бегом");
        }
        if (result12 >= resultW) {
            System.out.println("Кот не справился с прыгом");
        } else {
            System.out.println("Кот справился с прыгом");
        }

        Men men = new Men("Rick", "Men run", "Men jump");
        int result2 = men.run();
        int result21 = men.jump();
        if (result2 <= resultR) {
            System.out.println("Men не справился с бегом");
        } else {
            System.out.println("Men справился с бегом");
        }
        if (result21 <= resultW) {
            System.out.println("MEN не справился с прыгом");
        } else {
            System.out.println("MEN справился с прыгом");
        }
        System.out.println("Работа с массивами: ");

    }
}
