package gb.puzikov.lesson1.jse;

public class App {
    public static void main(String[] args) {
        Cat2019 objectCat = new Cat2019();
        objectCat.run2019 = "Run good";
        objectCat.jump2019 = "Jump - 2m";
        objectCat.printInfo();
        Men2019 objectMen = new Men2019();
        objectMen.run2019 = "run - 3.4 km/h";
        objectMen.jump2019 = "jump - 3.4m";
        objectMen.printInfo();
        IronMen2019 ironMen2019 = new IronMen2019();
        ironMen2019.run2019 = "10km/h";
        ironMen2019.jump2019 = "5m";
        ironMen2019.printInfo();
    }
}
