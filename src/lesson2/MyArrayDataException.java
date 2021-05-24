package lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j, String s) {
        System.out.printf("Строку массива [%d][%d] нельзя преобразовать в число - %s.\n", i, j, s);
    }
}
