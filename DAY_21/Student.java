
public class Student {
	private String name;
	private int mathScore;
	private int EnglishScore;
	
	public Student(String name,int mathScore,int EnglishScore) {
		this.name=name; this.mathScore=mathScore; this.EnglishScore=EnglishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEnglishScore() {
		return EnglishScore;
	}
	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
