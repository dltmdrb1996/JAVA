package systemex;

public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=1; i<100000000; i++) {
			for(int j=1;j<100000000;j++) {
				for(int a=0;a<5;a++) {
				sum+=i;}	
			}
			
		}
		long time2 = System.nanoTime();
		System.out.println("1~100000��"+sum);
		System.out.println("��꿡"+(time2-time1)+"�ʰ� �ɸ��ϴ�");
		
	}

}
