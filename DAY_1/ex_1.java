import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = {86,99,80,70,63};
		String [] name = {"��ö��","�̿���","ȫ�浿","����ȣ","�̿�ǥ"};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];	String temp2=name[i];
					num[i]=num[j];  	name[i]=name[j];
					num[j]=temp;		name[j]=temp2;
				}
			}
		}
		System.out.println("====����ǥ====");
		for(int i=0;i<num.length;i++) 
			System.out.println(i+1+"�� "+name[i]+" - "+num[i]+"��   ");
		
}////////////////////////////////////////////////////////////////////
}
