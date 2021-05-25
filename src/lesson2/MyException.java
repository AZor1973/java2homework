package lesson2;

public class MyException {
    private static final int VALID_SIZE = 4;
    private static final String[][] VALID_ARRAY = {
            {"1", "2", "3", "1"},
            {"4", "6", "0", "9"},
            {"3", "3", "5", "7"},
            {"1", "2", "4", "5"}
    };
    private static final String[][] INVALID_SIZE_ARRAY = {
            {"1", "2", "3", "1", "9"},
            {"4", "6", "0", "9"},
            {"3", "3", "5", "7"},
            {"1", "2", "4", "5"}
    };
    private static final String[][] INVALID_DATA_ARRAY = {
            {"1", "2", "3", "1"},
            {"4", "6", "0", "9"},
            {"3", "3y", "5", "7"},
            {"1", "2", "4", "5"}
    };

    public static void main(String[] args) {
        try {
            System.out.println("Сумма элементов массива = " + arraySum(VALID_ARRAY));
            System.out.println("Сумма элементов массива = " + arraySum(INVALID_SIZE_ARRAY));
            System.out.println("Сумма элементов массива = " + arraySum(INVALID_DATA_ARRAY));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        checkSizeArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(array[i][j], i, j);
                }
            }
        }
        return sum;
    }

    private static void checkSizeArray(String[][] array) {
        if (array.length != VALID_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] strings : array) {
            if (strings.length != VALID_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}
