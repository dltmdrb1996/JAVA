
public class Usingthis {

	public int Field = 10;
	
	class Inner{
		int Field = 20;
		
		void method() {
			MyFunctionalInterface fi = () ->{
				System.out.println("outer Field : " + Usingthis.this.Field);
				System.out.println("inner Field : " + this.Field);
			};
			fi.method();
		}
	}
	
	
}
