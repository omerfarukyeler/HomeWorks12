package homework_12;



class Person {
	
	public void talk() {
		
		System.out.println("First Program");
	}
}
public class Student extends Person{
	
	public final void talk() {
		
		System.out.println("Second program");
	}
	

	
	
	public static void main(String[] args) {
		
		Person p = new Student ();
		p.talk(); //TAHMİNİM Second program yazdırır
	}

}
