package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Невалидный размер массива.");
    }
}
