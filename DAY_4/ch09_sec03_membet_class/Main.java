package ch09_sec03_membet_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Outer.inner in = out.new inner();	
		
		in.print();
	}

}
