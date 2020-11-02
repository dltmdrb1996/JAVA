package DAY_25;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeset = new TreeSet<Person>();
		
		treeset.add(new Person("È«±æµ¿",45));
		treeset.add(new Person("±èÄ¡±¹",25));
		treeset.add(new Person("¹ÚÇÏ³ª",31));
		
		Iterator<Person> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : "+ person.age);
		}
		
	}	

}
