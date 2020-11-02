package newinstance;

public class ActionEx {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
			Class clazz = Class.forName("newinstance.SendAction");
			try {
				Action action = (Action)clazz.newInstance();
				action.excute();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
			
	}

}
