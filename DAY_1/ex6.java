import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[2][3];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print("숫자입력>");
				num[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"  ");
			}
			System.out.println("");
		}
			
		
		
		
		
		
		
	}

}
