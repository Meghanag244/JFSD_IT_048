public class Exp {

    public static void main(String[] args) { 
        if (args.length < 2) { 
            System.out.println("Please provide at least two numbers as arguments.");        
            return; 
        } 
        try {
            int num1 = Integer.parseInt(args[0]); 
            int num2 = Integer.parseInt(args[1]); 
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2)); 
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer numbers as arguments.");
        }
    } 
}