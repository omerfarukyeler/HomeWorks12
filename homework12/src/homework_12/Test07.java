package homework_12;

class Super {
	public Integer getLength() {
		
	return new Integer (4);
	}
}

public class Test07 extends  Super {

	public Integer getLength() {
		return (5);
	}

	public static void main(String[] args) {
		
		Super sooper = new Super();
		Test07 sub =new Test07();
		System.out.println(sooper.getLength().toString()+" ,"+sub.getLength().toString());//tahminim ; 4,5 yazdırır.
}
}
