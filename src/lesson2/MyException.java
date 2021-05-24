package lesson2;

public class MyException {
    public static void main(String[] args) {
        /*
         * Статическая инициализация удобна для проверки*/
        String[][] arr = {
                {"1", "2", "3", "1"},
                {"4", "6", "0", "9", "0"},
                {"3", "3", "5", "7"},
                {"1", "2", "4i", "5"}
        };
        try {
            System.out.println(arraySum(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int arraySum(String[][] array) {
        int sum = 0;
        for (String[] strings : array) {
            if (array.length != 4 || strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
        /*
         * Тройной цикл! Ничего умнее придумать не смог.*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (!Character.isDigit(array[i][j].charAt(k))) {
                        throw new MyArrayDataException(i, j, array[i][j]);
                    }
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }
}
