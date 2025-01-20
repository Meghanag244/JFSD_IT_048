import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
     {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of rcolumns");
        int c=sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++) 
        {
            for(int j = 0; j < (r*c); j++)
                {
                if (arr[i][j]%2==0)
                {
                    System.out.println("*");
                }
                System.out.println(" ");

            }
        }     
    }
}
