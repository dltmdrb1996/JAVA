import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LamdaFuntion {
	private static List<Student2> list = Arrays.asList(
		new Student2("È«±æµ¿",90,96),
		new Student2("±èÃ¶¼ö",65,36)		
	);
	
	public static void printString(Function<Student2,String> function) {
		for(Student2 student : list) {
			System.out.println(function.apply(student)+" ");
		}
		System.out.println();
	}
	public static void printInt( ToIntFunction<Student2> function) {
		for(Student2 student : list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	public static double avg(ToIntFunction<Student2> function) {
		int sum=0;
		for(Student2 student : list) {
			sum+=function.applyAsInt(student);
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇÐ»ýÀÌ¸§");
		printString(t->t.getName());
		
		System.out.println("¿µ¾î Á¡¼ö");
		printInt(t->t.getEnglishScore());

		System.out.println("¼öÇÐ Á¡¼ö");
		printInt(t->t.getMathScore());
	
		System.out.println("¿µ¾î Æò±Õ");
		System.out.println(avg(t->t.getEnglishScore()));
		
		System.out.println();
		System.out.println("¼öÇÐ Æò±Õ");
		System.out.println(avg(t->t.getMathScore()));
	}

}
