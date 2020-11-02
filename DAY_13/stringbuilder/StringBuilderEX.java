package stringbuilder;

public class StringBuilderEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("JAVA");
		System.out.println(sb);
		
		sb.append(" Program Study");
		System.out.println(sb);
		
		sb.insert(4,2);
		System.out.println(sb);
		
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("ÃÑ ¹®ÀÚ¼ö : "+length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
