import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int score[]= {70,85,90,80,70,96,88};
			double tot=0;
			double avg;
		
			
			for(int i=0 ;i<score.length;i++) {
				tot+=score[i];
			}
			
			System.out.println("ÃÑÁ¡="+tot);
			System.out.println("Æò±Õ="+(int)((tot/score.length)*100)/100.0);
		
		
		
		
		
	}

}
