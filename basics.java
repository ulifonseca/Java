import java.util.*;

class fruits {
    public static void main(String[] args) {
        Scanner user1 = new Scanner(System.in);
        System.out.println("Grades of the semester calculator");
        int grades;
        double total = 0;
        double avg;
        System.out.print("Enter the number of subjects: ");
        grades = user1.nextInt();

        for (int i = 1; i <= grades; i++) {
            System.out.println("Enter grade " + i + ": ");
            avg = user1.nextDouble();
            total += avg;
        }
        System.out.println("Your average is: " + total / grades);

    }
}