import java.util.*;

class fruits {
    public static void main(String[] args) {
        System.out.println(average(100, 90, 100));
    }

    public static double average(double... numbers) {
        double result = 0;
        int count = 0;
        for (double i : numbers) {
            result += i;
            count++;
        }
        return result / count;
    }
}