package gb.puzikov.lesson1.part2.jse;

public class Road {
    private final int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }

    public boolean doRun(Cat catrun) {
        int runlength = catrun.run();
        return runlength >= lenght;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(8888);
        Road road = new Road(900);
        boolean result1 = road.doRun(cat);
        if (result1 == false) {
            System.out.println("Кот не справился с бегом");
        } else {
            System.out.println("Кот справился с бегом");
        }
    }
}

