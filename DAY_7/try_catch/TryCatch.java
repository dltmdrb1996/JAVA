package try_catch;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=35;
		int n2=0;
		try {
		int result = n / n2;
		System.out.println(result);
		}catch(ArithmeticException e) {
			String str= "0À¸·Î ³ª´®";
			System.out.println(str);
		}

	}
}
