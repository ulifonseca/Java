import java.util.Scanner;

class fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Basic calculator...");
        System.out.println("Enter number 1: ");
        x = input.nextInt();
        System.out.println("Enter number 2: ");
        y = input.nextInt();
        System.out.println(" " + x + " + " + y + " = " + (x + y));
        System.out.println(" " + x + " - " + y + " = " + (x - y));
        System.out.println(" " + x + " * " + y + " = " + (x * y));
        System.out.println(" " + x + " / " + y + " = " + (x / y));

    }
}