class TypePromote
{
	public static void main(String[] args)
	{
		byte a = 40, b = 50;
		byte c = (byte)(a + b);  

		char ch = 'A';
		int val = ch + 1;
		System.out.println(val);
		System.out.println((char) val);
	}
}