package objects;

import java.util.Objects;

public class EqualsAndDeepEequals {
	
	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println(Objects.deepEquals(o1, null));
		System.out.println(Objects.deepEquals(null, o2));
		System.out.println(Objects.deepEquals(null, null));

		System.out.println();

		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		
		System.out.println();

		Integer[] arr1 = {1 , 2 , 3};
		Integer[] arr2 = {1 , 2 , 3};
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.equals(arr1, arr2));
		
	}
}
