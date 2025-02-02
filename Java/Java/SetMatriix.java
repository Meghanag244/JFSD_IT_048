package Java;
import java.util.Scanner;

public class SetMatriix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[n];
        
        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Identify rows and columns that need to be set to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        
        // Set the identified rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i] || c[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        
        // Print the modified matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}