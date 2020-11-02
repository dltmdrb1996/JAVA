import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LamdaFuntion {
	private static List<Student2> list = Arrays.asList(
		new Student2("ȫ�浿",90,96),
		new Student2("��ö��",65,36)		
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
		System.out.println("�л��̸�");
		printString(t->t.getName());
		
		System.out.println("���� ����");
		printInt(t->t.getEnglishScore());

		System.out.println("���� ����");
		printInt(t->t.getMathScore());
	
		System.out.println("���� ���");
		System.out.println(avg(t->t.getEnglishScore()));
		
		System.out.println();
		System.out.println("���� ���");
		System.out.println(avg(t->t.getMathScore()));
	}

}
