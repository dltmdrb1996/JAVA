package arraySort;

public class Member implements Comparable<Member>{
	
	String name;
	Member(String name){
		this.name=name;
	}
	@Override
	public int compareTo(Member arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}
	
}
