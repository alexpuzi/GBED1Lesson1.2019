package GEEKbrains.puzikov.l1p1;

public class Cat {
    String name;
    String jump2019;
    String run2019;
    Cat(String name, String jump2019, String run2019) {
        this.name = name;
        this.jump2019=jump2019;
        this.run2019=run2019;
    }


    void printInfo() {
        System.out.println(jump2019 + "\n" + run2019);
    }

    int run() {
        return 100;
    }

    int jump() {
        return 2;
    }
}


