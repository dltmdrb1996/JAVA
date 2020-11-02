package DAY_25;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeset = new TreeSet<Fruit>(new DescendingComparator());
		
		treeset.add(new Fruit("포도" , 3000));
		treeset.add(new Fruit("수박" , 10000));
		treeset.add(new Fruit("딸기" , 6000));
		
		Iterator<Fruit> iterator = treeset.descendingIterator();
		
		while(iterator.hasNext()) {
			Fruit fruit =  iterator.next();
			System.out.println(fruit.name+ " : "+fruit.price);
			
		}
		
	}

}
