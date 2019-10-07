package GEEKbrains.puzikov.l1p1;

public class FirstPartOfHW {
    void printInfo() {
        Cat objectCat = new Cat("Volt", "Cat run", "Cat jump");
        objectCat.printInfo();
        Men objectMen = new Men("Rick", "Men run", "Men jump");
        objectMen.run2019 = "Men run";
        objectMen.jump2019 = "Men jump";
        objectMen.printInfo();
        Robot ironMen2019 = new Robot("Vasja", "Robot run", "Robot jump");
        ironMen2019.run2019 = "Robot run";
        ironMen2019.jump2019 = "Robot jump";
        ironMen2019.printInfo();
    }
}