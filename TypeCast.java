class TypeCast 
{
    public static void main(String[] args) 
	{
		char ch = 'A'; // implicit 
		int code = ch;
		
		int n = 66; // explicit
		char c = (char) n;
		System.out.println(c);
		
    }
}