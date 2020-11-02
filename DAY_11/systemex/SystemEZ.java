package systemex;

public class SystemEZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]" + javaHome);
		String path = System.getenv("path");
		System.out.println("[path] "+path);
	
		
	}

}
