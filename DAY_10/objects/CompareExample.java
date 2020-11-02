package objects;
import java.util.Comparator;
import java.util.Objects;;
public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1, s3,new StudentComparetor());
		System.out.println(result);
		
		int result2 = Objects.compare(s1, s2,new StudentComparetor());
		System.out.println(result2);
		
	}
	
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	static class StudentComparetor implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.sno<o2.sno)return -1;
			else if(o1.sno==o2.sno)return 0;
			else return 1;
		}
	}
}
