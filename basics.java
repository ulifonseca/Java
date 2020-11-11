import java.util.*;

class fruits {
    public static void display_matrix(int a[][], String text) {
        System.out.println(text);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][2];
        int matrix2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
        display_matrix(matrix, "Matrix 1...");
        display_matrix(matrix2, "Matrix 2...");
    }
}