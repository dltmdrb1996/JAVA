import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String array[]= {"����","�����","�Ŷ��","����","������ġ"};
		int price[]= {2500,1200,1500,3000,3500};
		
		System.out.print("1,���� 2,����� 3,�Ŷ�� 4,���� 5,������ġ");
		int n=sc.nextInt();
		System.out.print("���Լ�����?");
		int cnt=sc.nextInt();
		
		System.out.println(array[n-1]+"��(��) "+cnt+"�� ����  �� �ݾ�="+cnt*price[n-1]);
		
	
		
		
}
}
