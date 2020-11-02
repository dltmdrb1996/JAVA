
public class MyFunctionalIntefaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		
		fi.method(5);
		
		fi = (x) ->	System.out.println(x*6);
		
		fi.method(5);
		
	}	
}
