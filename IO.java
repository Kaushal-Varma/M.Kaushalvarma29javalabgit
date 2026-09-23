import java.io.*;
import java.util.*;

class IO {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		String name = br.readLine();
		System.out.print("Enter age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter city: ");
		String city = sc.next();
		
		System.out.println("City: " + city);
		
		java.io.Console c = System.console();
		
		if (c!= null) {
			String username = c.readLine("Username: ");
			char[] pass = c.readPassword("Password: ");
			System.out.println("Welcome " + username);
		}
	}
}		