import java.util.Scanner; // Import the Scanner class

public class Even {
  public static void main(String[] args) {

    while(true){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("Sorry Brother");
            break;
        }
        else
        {
            System.out.println("Even_Congrats");
        }
    }
    }
}