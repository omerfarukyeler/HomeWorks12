package homework_12;

public class Test06 {
	
	public static void main(String[] args ) {
		
		new C().create();
		new D().update();
		new R().read();
		new D().delete();
	}

}
class C{
	public void create() {
		System.out.println("c");
}
}
class U{
	private void update() {
		System.out.println("u");
		
	}
	}
class R extends C{
	
	public void create () {
		System.out.println("C");
		
	}
	protected void read() {
		System.out.println("R");
	}
}

class D extends U {
	
	void update() {
		System.out.println("U");
	}
	
	void delete() {
		System.out.println("D");//Tahminim  ; CURD  yazdırır.
	}
}

