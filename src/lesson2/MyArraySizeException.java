package lesson2;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException() {
        super("Невалидный размер массива.");
    }
}
