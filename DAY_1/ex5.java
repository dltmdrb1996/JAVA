import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String array[]= {"우유","새우깡","컵라면","맥주","샌드위치"};
		int price[]= {2500,1200,1500,3000,3500};
		
		System.out.print("1,우유 2,새우깡 3,컵라면 4,맥주 5,샌드위치");
		int n=sc.nextInt();
		System.out.print("구입수량은?");
		int cnt=sc.nextInt();
		
		System.out.println(array[n-1]+"을(를) "+cnt+"개 구입  총 금액="+cnt*price[n-1]);
		
	
		
		
}
}
