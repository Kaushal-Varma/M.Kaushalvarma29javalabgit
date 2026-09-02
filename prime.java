import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number: ");
		int n = sc.nextInt();
		int prime=1;
		for (int i=1; i<n; i++)
		{
			if (n%i==0)
			{
				prime++;
			}
		}
		if (prime == 2)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("The given number is a non-prime number");
		}
	}
}