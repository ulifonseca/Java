import java.util.*;

class fruits {
    public static void main(String[] args) {
        int array2[] = { 10, 10, 10, 30 };
        int sum = 0;
        int counter = 0;
        System.out.println("Index    Value");
        for (int i : array2) {
            System.out.println(" [" + (counter++) + "] ---> " + i);
            sum += i;
        }
        System.out.println("\n  Sum : " + sum);

    }
}