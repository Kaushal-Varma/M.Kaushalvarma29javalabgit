import java.util.Scanner;
class pattern3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("No. of rows: ");
		int n = sc.nextInt();
		for (int i = n; i!=0; i--)
		{
			for (int j=0; j<i; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}