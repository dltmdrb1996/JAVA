import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");
		set.add("iVATIS");
		int size = set.size();
		System.out.println(size);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("JDBC");
		set.remove("iVATIS");
		System.out.println();
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		set.clear();
		size = set.size();
		System.out.println(size);
		System.out.println(set.isEmpty());
	}

}
