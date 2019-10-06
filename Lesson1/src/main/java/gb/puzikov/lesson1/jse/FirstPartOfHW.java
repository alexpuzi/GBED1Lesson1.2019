package gb.puzikov.lesson1.jse;

public class FirstPartOfHW {
    void printInfo() {
        Cat2019 objectCat = new Cat2019();
        objectCat.run2019 = "Cat run";
        objectCat.jump2019 = "Cat jump";
        objectCat.printInfo();
        Men2019 objectMen = new Men2019();
        objectMen.run2019 = "Men run";
        objectMen.jump2019 = "Men jump";
        objectMen.printInfo();
        IronMen2019 ironMen2019 = new IronMen2019();
        ironMen2019.run2019 = "Robot run";
        ironMen2019.jump2019 = "Robot jump";
        ironMen2019.printInfo();
    }
}
