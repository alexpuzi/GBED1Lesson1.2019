package lesson2.lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String cellValue,int rowIndex, int colIndex){
        super(String.format("Invalid value '%s' in array sell[%d][%d], required iteger", cellValue, rowIndex, colIndex));
    }
}
