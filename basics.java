import java.util.Scanner;

class fruits {
    public static void main(String[] args) {
        String sister;
        Scanner user1 = new Scanner(System.in);

        System.out.println("Enter your sister´s name: ");
        sister = user1.nextLine();

        tuna t1 = new tuna();
        t1.set_name(sister);
        System.out.println("Sister : " + t1.get_name());
        t1.saying();
    }
}