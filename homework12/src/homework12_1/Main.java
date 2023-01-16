package homework12_1;

public class Main {

	public static void main(String[] args) {
	
		
		Basekredi zam1 = new pazarlama();
		System.out.println("pazarlama kismi yeni maasi:"+zam1.hesapla(10000));
		
		Basekredi zam2 = new bakım();
		System.out.println("bakim kismi yeni maasi:"+zam2.hesapla(15000));
		
		Basekredi zam3 = new satin_alma();
		System.out.println("satin_alma kismi yeni maasi:" +zam3.hesapla(12000));
		
		Basekredi zam4 = new uretim_planlama();
		System.out.println("uretim_planlama kismi yeni maasi:"+zam4.hesapla(20000));
	}

}
