import java.util.*;

class fruits {

    private static final int TOP_VALUE = 20;
    public static final Random r = new Random();

    public static void displayArray(int array[]) {
        System.out.print("Array : [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("]");
    }

    public static void fillArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i % TOP_VALUE);
        }
    }

    public static void randomArray(int array[], int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(max - min + 1) + min;
        }
    }

    public static void change(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int array[] = { 10, 10, 10, 30 };
        displayArray(array);
        fillArray(array);
        displayArray(array);
        int min = 10;
        int max = 15;
        randomArray(array, max, min);
        displayArray(array);
        change(array);
        displayArray(array);

    }
}