package api_1;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("blue","ȫ�浿","12345",25,true);
		
		Member cloned = original.getMember();
		
		cloned.password="77777";
		
		
		System.out.println("������ü�� �ʵ尪");
		System.out.println("id : "+	original.id);
		System.out.println("name : "+original.name);
		System.out.println("password : "+original.password);
		System.out.println("age : "+original.age);
		System.out.println("adult : "+original.adult);
		

		System.out.println("������ü�� �ʵ尪");
		System.out.println("id : "+cloned.id);
		System.out.println("name : "+cloned.name);
		System.out.println("password : "+cloned.password);
		System.out.println("age : "+cloned.age);
		System.out.println("adult : "+cloned.adult);
	}

}
