import java.util.Scanner;
class pattern1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("No. of rows: ");
		int n = sc.nextInt();
		for (int i = 0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}