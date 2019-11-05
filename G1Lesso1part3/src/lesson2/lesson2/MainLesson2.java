package lesson2.lesson2;

public class MainLesson2 {
    private static final int REQUIRED_ARRAY_SIZE = 4;
    private static final String[][] ARRAYHOMEWORK2CORRECT = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    private static final String[][] INCORRCT_SIZE_DAT = new String[][]{
            {"!", "3", "1", "12"},
            {"!", "3", "1", "12"},
            {"!", "3", "1",},
            {"!", "3", "1", "12"},
    };
    private static final String[][] INCORRECT_VALUE_DATA = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "17"}
    };

    public static void main(String[] args) {

    try
    {
//        int result = sumArrayValues(ARRAYHOMEWORK2CORRECT);
        int result = sumArrayValues(INCORRECT_VALUE_DATA);
//        int result = sumArrayValues(INCORRCT_SIZE_DAT);
        System.out.println("Array summ: " + result);
    } catch(MyArrayDataException | MyArraySizeException e){
        System.out.println("Некорректные данные в массиве");
//        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}


    private static int sumArrayValues(String[][] data) throws MyArraySizeException {
        checkArraySize(data);
        int sumResult = 0;
        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            String[] row = data[rowIndex];
            for (int colIndex = 0; colIndex < row.length; colIndex++) {
                String value = row[colIndex];
                try {
                    sumResult += Integer.parseInt(value);
//                    sumResult = sumResult + Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(value, rowIndex, colIndex);
                }
            }
        }
        return sumResult;
    }

    private static void checkArraySize(String[][] data) throws MyArraySizeException {
        if (data.length != REQUIRED_ARRAY_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] row : data) {
            if (row.length != REQUIRED_ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}
