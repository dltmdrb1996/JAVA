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
		
		String[] names = {"홍길동","정말로","신기해","나인","마지막"};
		Arrays.sort(names);
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신기해");
		Member m3 = new Member("마지막");
		Member[] members = { m1, m2 ,m3};
		Arrays.sort(members);
		for(int i=0; i<members.length;i++) {
			System.out.println(members[i].name);
		
			
		}
						
	}

	

}
