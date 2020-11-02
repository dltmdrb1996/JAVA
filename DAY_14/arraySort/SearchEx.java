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
		
		String[] names = {"ȫ�浿","���̳�","������","�ű���","��¥��"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "���̳�");
		System.out.println(index);
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ű���");
		Member m3 = new Member("������");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println(index);
	
	}
}
