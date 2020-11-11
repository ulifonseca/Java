import java.util.*;

class fruits {

    public static void main(String[] args) {
        int array[] = { 10, 10, 10, 30 };
        orange.displayArray(array);
        orange.fillArray(array);
        orange.displayArray(array);
        int min = 10;
        int max = 15;
        orange.randomArray(array, max, min);
        orange.displayArray(array);
        orange.change(array);
        orange.displayArray(array);

    }
}