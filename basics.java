import java.util.*;

class fruits {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int max = 10;
        int min = 9;
        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(max - min + 1) + min;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Index " + i + " --> " + array1[i]);
        }

    }
}