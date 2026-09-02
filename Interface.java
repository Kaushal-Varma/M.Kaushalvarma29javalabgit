class MainINTERFACE {
	public static void main (String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		sbi.review();
		sbi.InterestRate();
		hdfc.review();
		hdfc.InterestRate();
	}
}
	
interface Bank {
	void review();
	void InterestRate();	
}

class SBI implements Bank {
	
	@Override
	public void review() {
		System.out.println("SBI is an excellent bank");
	}
	
	@Override
	public void InterestRate() {
		System.out.println("The interest rate is: 7.5%");
	}
}

class HDFC implements Bank {
	
	@Override
	public void review() {
		System.out.println("HDFC is a good bank");
	}
	
	@Override
	public void InterestRate() {
		System.out.println("The interest rate is: 8%");
	}
}

class Interface {
	public static void main (String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		sbi.review();
		sbi.InterestRate();
		hdfc.review();
		hdfc.InterestRate();
	}
}
