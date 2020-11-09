import java.util.Scanner;

class fruits {
    public static void main(String[] args) {
        int day = 0;
        Scanner input1 = new Scanner(System.in);

        do {
            System.out.println("Enter the number day (1-7) 0 to exit: ");
            day = input1.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }

        } while (day != 0);

    }
}