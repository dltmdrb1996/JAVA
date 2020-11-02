package arraySort;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,86,24,38,62};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 38);
		System.out.println(index);
		System.out.println();
		
		String[] names = {"홍길동","윤이나","정말로","신기해","진짜로"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "윤이나");
		System.out.println(index);
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신기해");
		Member m3 = new Member("마지막");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println(index);
	
	}
}
