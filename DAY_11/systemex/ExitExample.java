package systemex;

public class ExitExample {
	
	public static void main(String []args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status !=5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		
			try 
			{	
			if(i==5)System.exit(i);
			
			}catch(SecurityException e) {}	
		}
	}
}
