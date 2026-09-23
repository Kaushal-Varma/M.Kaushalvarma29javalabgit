import java.util.*;

public class tryCatchFinally {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            double result = a/b;
            System.out.println(result);

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide with zero");
        }
        finally {
            System.out.println("Program Completed...");
            sc.close();
        }

        
    }
}
