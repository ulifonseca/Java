import java.util.Scanner;

class fruits {
    public static void main(String[] args) {
        int i = 1;
        tuna tuna_object = new tuna();
        orange orange1 = new orange();
        while (i <= 5) {
            tuna_object.simple_message();
            orange1.orange_info();
            i++;
        }
    }
}