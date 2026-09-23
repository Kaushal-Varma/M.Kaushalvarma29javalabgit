import java.util.*;

class bankAccount {
    double balance = 5000; // Suppose

    void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful" + "\nRemaining Balance: " + balance);
    }
}

public class bankAccountprg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAccount bA = new bankAccount();

        System.out.print("Enter withdrawal amount: ");
        double amount=sc.nextDouble();

        try {
            bA.withdraw(amount);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Successfulll!!!");
            sc.close();
        }
    }
}
