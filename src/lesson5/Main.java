package lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        try {
            System.out.println("The final arrays are equal: " + Arrays.equals(method1(), method2()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static float[] method1() {
        float[] array = createArray();
        long a = System.currentTimeMillis();
        computation(array, 0);
        long b = System.currentTimeMillis();
        System.out.println("Sequential method execution time: " + (b - a));
        return array;
    }

    private static float[] method2() throws InterruptedException {
        float[] array = createArray();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, a1, 0, h);
        System.arraycopy(array, h, a2, 0, h);
        Thread thread1 = new Thread(() -> computation(a1, 0));
        Thread thread2 = new Thread(() -> computation(a2, h));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(a1, 0, array, 0, h);
        System.arraycopy(a2, 0, array, h, h);
        long b = System.currentTimeMillis();
        System.out.println("Execution time of a two-threaded method: " + (b - a));
        return array;
    }

    private static float[] createArray() {
        float[] array = new float[size];
        Arrays.fill(array, 1);
        return array;
    }

    private static void computation(float[] arr, int shift) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + shift) / 5) * Math.cos(0.2f + (i + shift) / 5) * Math.cos(0.4f + (i + shift) / 2));
        }
    }
}
