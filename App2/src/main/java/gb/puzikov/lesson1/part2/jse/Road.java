package gb.puzikov.lesson1.part2.jse;

public class Road {
    private final int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }

    int roadInfo() {
        return 500;
    }


    public static void main(String[] args) {
        Road road = new Road(8888);
        Cat cat = new Cat(8888);
        int resultR = road.roadInfo();
        int result1 = cat.run();
        if (result1 >= resultR) {
            System.out.println("Кот не справился с бегом");
        } else {
            System.out.println("Кот справился с бегом");
        }
        Men men = new Men(9000);
        int result2 = men.run();
        if (result2 >= resultR) {
            System.out.println("Men не справился с бегом");
        } else {
            System.out.println("Men справился с бегом");
        }
    }
}

