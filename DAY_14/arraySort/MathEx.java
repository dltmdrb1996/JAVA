package arraySort;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		
		System.out.println();
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = "+v3);
		System.out.println("v4 = "+v3);
		
		System.out.println();
		
		double v5 = Math.floor(5.3);
		double v6 = Math.abs(-5.3);
		System.out.println("v5 = "+v5);
		System.out.println("v6 = "+v6);

		System.out.println();
		
		int v7 = Math.max(5,9);
		double v8 = Math.max(4.3 ,6.4);
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
	
		System.out.println();
		
		int v9 = Math.min(5,9);
		double v10 = Math.min(5.3,2.5);
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		
		System.out.println();
		
		double v11 = (int)(
				Math.random()*100)+1;
		System.out.println("v11 = "+v11);
		
		System.out.println();
		
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		
		double value =12.3456;
		value *=1000.0;
		value =Math.round(value);
		value /=1000.0;
		System.out.println(value);
	}
	
	

}
