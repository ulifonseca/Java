import java.util.*;

class fruits {

    public static void add(int array[], int add) {
        for (int i = 0; i < array.length; i++) {
            array[i] += add;
        }
    }
    public static void main(String[] args) {
        int SIZE = 10;
        int array[] = new int[SIZE];
        orange.displayArray(array);
        orange.fillArray(array);
        orange.displayArray(array);
        int min = 10;
        int max = 15;
        orange.randomArray(array, max, min);
        orange.displayArray(array);
        orange.change(array);
        orange.displayArray(array);
        add(array, 5);
        orange.displayArray(array);

    }
}