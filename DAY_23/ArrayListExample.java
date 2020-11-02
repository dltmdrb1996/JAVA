import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.add(2,"Database");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}	
}
