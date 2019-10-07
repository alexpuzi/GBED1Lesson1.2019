package gb.puzikov.lesson1.part2.jse;

public class Road {
    private final String name;

    public Road(String name) {
        this.name = name;
    }

    int roadInfo() {
        return 500;
    }
    int wallInfo(){
        return 5;
    }


    public static void main(String[] args) {
        Road road = new Road("M9");
        Cat cat = new Cat("Volt");
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

        Men men = new Men("Rick");
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
    }
}

