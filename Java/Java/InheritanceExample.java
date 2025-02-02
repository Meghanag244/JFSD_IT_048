


public class Exp1A {

    public static void main(String[] args) { 
        if (args.length < 2) { 
            System.out.println("Please provide at least two numbers as arguments.");        
            return; 
        } 
        int num1 = Integer.parseInt(args[0]); 
        int num2 = Integer.parseInt(args[1]); 
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2)); 
    } 
} 

// Part B: Inheritance 
class Base {     
    void display() { 
        System.out.println("This is the base class."); 
    } 
} 

class Derived extends Base {     
    void show() { 
        System.out.println("This is the derived class."); 
    } 
} 

public class InheritanceExample {  
    public static void main(String[] args) {     
        Derived obj = new Derived();        
        obj.display();       
        obj.show(); 
    }
}