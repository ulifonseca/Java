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

    public static void main(String[] args) {
        int array[] = { 10, 10, 10, 30 };
        displayArray(array);
        fillArray(array);
        displayArray(array);
    }
}