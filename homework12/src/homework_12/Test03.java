package homework_12;

class Derived03{
	
	public void getDetails() {
		
		System.out.println("Derived class");
	}
}

public class Test03 extends Derived03{

	public void getDetails() {
		
		System.out.println("Test class");
		super.getDetails();
	}

	public static void main (String[] args ) {
		
		Derived03 obj =new Test03();//önce en günceline gitti sonra superle bir üst classa gitti ve yazdırdı.
		obj.getDetails();
	}
}
