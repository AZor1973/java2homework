package lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String s, int i, int j) {
        super(String.format("Невалидная строка -%s- в ячейке массива [%d][%d].", s, i, j));
    }
}
