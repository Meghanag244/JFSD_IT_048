import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ROW number:");
        int row= sc.nextInt();
        System.out.println("Enter COL number:");
        int col = sc.nextInt();
        System.out.println("Enter tree number:");
        int t = sc.nextInt();
        int n=row*col;
            if(t <= n || t % n == 1 || t % n == 0)
                {
                    System.out.println("Mango Tree ");
                }
                else
                {
                    System.out.println("Not a Mango Tree");
                }
            }
        }
