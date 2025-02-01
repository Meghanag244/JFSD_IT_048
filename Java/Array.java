package Java;
import java.util.Scanner;

public class Array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int sum = 0, sum2 = 0;
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++) 
        {
            sum += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        
        System.out.println(sum);
        System.out.println(sum2);
    }     
}