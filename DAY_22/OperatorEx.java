import java.util.function.IntBinaryOperator;

public class OperatorEx {
	private static int[] scores = {82,95,78,69,82};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = maxOrMin((a,b)->{if(a>=b) return a; else return b;});
		int min = maxOrMin((a,b)->{if(a<=b) return a; else return b;});
			
	}

}
