
public class MyFunctionalIntefaceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str="Method Call1";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			String str="Method Call2";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			String str="Method Call3";
			System.out.println(str);
		};
		fi.method();
		
	}	
}
