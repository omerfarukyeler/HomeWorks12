package homework_12;

class Derive04{
	protected   void getDetails () { // final kaldırılırsa hata geçer .final olduğunda class yazdırılamaz .
		
		System.out.println("Derived class");
	}
}




public class Test04 extends Derive04{
	
	protected final void getDetails () {
		
		System.out.println("Test Class");
		
		
	}
	public static void main(String[] args ) {
		
		Derive04 obj = new Derive04();
		obj.getDetails();
	}
	
}
	