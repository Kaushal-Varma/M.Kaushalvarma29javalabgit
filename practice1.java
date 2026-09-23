interface Bird {
	void fly();
}
	
class parrot implements Bird {
	@Override
	public void fly() {
		System.out.println("Inside Parrot");
	}
	
}
	
public class practice1 {
	public static void main(String[] args) {
		parrot p = new parrot();
		
		p.fly();
	}
}
