class mainInheritance {
	String Make;
	String Model;
	int price;
	mainInheritance() {
		this.Make = "Unknown";
		this.Model = "Unknown";
		this.price = -1;
	}
	
	mainInheritance(String Make, String Model, int price) {
		this.Make = Make;
		this.Model = Model;
		this.price = price;
	}
}

class Inheritance{
	public static void main(String[] args) {
		mainInheritance I1 = new mainInheritance();
		mainInheritance I2 = new mainInheritance("Ford", "Mustang", 30000);
		
		System.out.println("The " + I1.Make + " " + I1.Model + " is worth " + "$" + I1.price);
		System.out.println("The " + I2.Make + " " + I2.Model + " is worth " + "$" + I2.price);
	}
}
	