package newinstance;

public class ByteToStringdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asd = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		int a=asd.length();
		int s=97;
		for(int i=0;i<a;i++) {
		asd += asd.charAt(0);
		asd = asd.substring (1);
		System.out.println(asd);
		}
		
	}

}
