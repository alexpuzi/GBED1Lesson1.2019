package GEEKbrains.puzikov.l1p1;

public class Men {
    String name;
    String jump2019;
    String run2019;
    public Men(String name, String jump2019, String run2019) {
        this.name = name;
        this.jump2019=jump2019;
        this.run2019=run2019;
    }

    void printInfo() {
        System.out.println(jump2019 + "\n" + run2019);
    }

    int run() {
        return 1000;
    }

    int jump() {
        return 4;
    }
}
