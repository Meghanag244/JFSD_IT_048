import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=0;i<=n;i++)
        
        if (n <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

        sc.close(); 
    }
}
