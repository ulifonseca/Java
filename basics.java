import java.util.*;

class fruits {
    public static void main(String[] args) {
        Scanner user1 = new Scanner(System.in);
        System.out.println("Grades of the semester calculator");
        int grades = 0;
        double total = 0;
        double avg;

        do {
            System.out.println("Enter grade " + (++grades) + " (0 to exit) :");
            avg = user1.nextDouble();
            total += avg;
            if (avg == 0)
                grades--;

        } while (avg != 0);
        System.out.println("Your average is: " + total / grades);

    }
}