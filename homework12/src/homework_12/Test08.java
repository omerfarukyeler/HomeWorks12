package homework_12;

public class Test08 {
	
	public static void main(String[] args) {
		
		X x = new X();
		Y y = new Y();
		y.m2();
		x.m1();
		y.m1();
		x=y;
		x.m1();
		}
}

class X{
	public void m1 () {
		
		System.out.println("m1, X class");//2.
	}
}

class Y extends X{
	
	public void m1() {
		
		System.out.println("m1, Y class");//3. ve 4. x= y oldu.
			}

	public void m2() {
		
		System.out.println("m2, Y class");//1.
}
	
}	