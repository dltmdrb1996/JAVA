package deep_clone;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("ȫ�浿",25,new int[] {90,85},new Car("�ҳ�Ÿ"));
		
		Member cloned = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model="�׷���";
		
		System.out.println("���� �ʵ尪");
		System.out.println("name : "+ original.name);
		System.out.println("age :"+ original.age);
		for(int i=0;i<original.scores.length;i++) 
		{
			System.out.println("scores["+i+"] : "+original.scores[i]);
		}
		System.out.println("Car : "+original.car.model);
	
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		
		System.out.println("���� �ʵ尪");
		System.out.println("name : "+ cloned.name);
		System.out.println("age :"+ cloned.age);
		for(int i=0;i<cloned.scores.length;i++) 
		{
			System.out.println("scores["+i+"] : "+cloned.scores[i]);
		}
		System.out.println("Car : "+cloned.car.model);
	
		
	}

}
