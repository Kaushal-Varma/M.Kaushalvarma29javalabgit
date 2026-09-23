import java.util.*;

class InvalidMarksException extends Exception { // User-created Exception
    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 0) {
            throw new InvalidMarksException("Marks must be between 0 and 100 only!!");
        }
        System.out.println("Valid marks: " + marks);
    }
}

public class studentEH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            s.checkMarks(marks);
        }
        catch (InvalidMarksException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            System.out.println("Marks are checked.");
            sc.close();
        }
    }
}
