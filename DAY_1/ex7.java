import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [][] ma = new int[5][5];
		
		int num=1;
		
		int row=0;
		int col=ma.length/2;
		ma[row][col]=num;
		
		for(num=2;num<=ma.length*2;num++) {	
			row--; col++;
			if(row==-1) row=ma.length-1;
			if(col==ma.length) col=0;
			if(ma[row][col]!=0 ) 
			{
				row+=2; col--;
			}
			if(col==-1)col=ma.length-1;
			if(row==ma.length)row=0;
			if(row==ma.length+1)row=1;
			ma[row][col]=num;		
		}
			
		for(int i=0;i<ma.length;i++) {
			for(int j=0;j<ma[i].length;j++) {
				System.out.print(ma[i][j]+"  ");
			}	
			System.out.println(" ");
		}	
		
		
		
		
	
	}
}
