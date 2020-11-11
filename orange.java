import java.util.*;

public class orange {
    private static final int TOP_VALUE = 5;
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

}
