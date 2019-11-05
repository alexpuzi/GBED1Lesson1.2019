package lesson2.lesson2;

public class MyArraySizeException extends IllegalAccessException {
    public MyArraySizeException(){
        super("Invalid array size, required 4x4");
    }
}
