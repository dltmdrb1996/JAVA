package arraySort;

import java.util.Arrays;

public class SortEx{

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int[] scores = {98,75,86,54,48};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿","������","�ű���","����","������"};
		Arrays.sort(names);
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ű���");
		Member m3 = new Member("������");
		Member[] members = { m1, m2 ,m3};
		Arrays.sort(members);
		for(int i=0; i<members.length;i++) {
			System.out.println(members[i].name);
		
			
		}
						
	}

	

}
