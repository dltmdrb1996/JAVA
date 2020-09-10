import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = {50,78,96,70,88,68,-1,74,88,90};
		int [] array2 = new int[];
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
			break;
			}
			sum+=array[i];
		}
		
		
		System.out.println(sum);
		
		
		
		
		
	}

}
