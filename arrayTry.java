import java.util.*;

public class arrayTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {20, 40, 60, 70, 80, 90};
        System.out.print("Enter index to access element: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element = " + a[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.. Try Again");
        }
        finally {
            sc.close();
            System.out.println("Array operation successful");
        }
    }
}
