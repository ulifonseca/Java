import java.util.*;

class fruits {
    public static void main(String[] args) {
        int array1[] = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Index " + i + " --> " + array1[i]);
        }

    }
}