import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();  
        String str1 = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        
        if (str.equals(str1)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}