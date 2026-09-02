class Parent {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	static int d = 40;
	
	void show() {
		System.out.println("Public: " + a + "\nPrivate: " + b + "\nProtected: " + c + "\nStatic: " + d);
	}
}

class sub extends Parent {
	void display() {
		System.out.println("Public: " + a + "\nProtected: " + c + "\nStatic: " + d);
		// Cannot use Private variable 'b' from another class here
	}
}

public class publicprivatestatic {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		p.show();
		
		sub c = new sub();
		c.display();
	}
}
		