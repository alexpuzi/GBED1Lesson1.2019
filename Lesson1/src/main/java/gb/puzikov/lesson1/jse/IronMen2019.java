package gb.puzikov.lesson1.jse;

public class IronMen2019 {
    String jump2019;
    String run2019;
    int runLenght;
    int jumpHight;

    public int run() {
        return 5000;
    }

    public int jump() {
        return 10;
    }

    void printInfo() {
        System.out.println(jump2019 + "\n" + run2019);
    }
}
