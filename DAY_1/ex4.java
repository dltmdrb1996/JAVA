import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
				ArrayList<Object> donate = new ArrayList<Object>();
				int sum=0;
				for(int i=0;;i=i+2) {
					System.out.print("��αݾ� �Է�  or ��γ��� 0�Է�");
					int money = sc.nextInt();
					if(money==0)break;
					donate.add(i, money);
					sum+=money;
					System.out.print("�̸��� �Է��ϼ���");
					donate.add(i+1,sc.next());
				
				}
				for(int i=0;i<donate.size();i=i+2) {
					System.out.print(donate.get(i+1)+"���� ��ξ�="+donate.get(i));
					System.out.println("");
				}
				
		
		
		
		
		
		
	}

}
