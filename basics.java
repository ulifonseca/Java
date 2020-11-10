import java.util.Scanner;

class fruits {
    public static void main(String[] args) {
        String name;
        int b = 1;
        tuna tuna_object = new tuna();
        orange orange1 = new orange();
        Scanner user = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = user.nextLine();
        for (int i = 0; i < 3; i++) {
            tuna_object.simple_message(name);
        }
        while (b++ <= 5) {
            orange1.orange_info();
        }
    }
}