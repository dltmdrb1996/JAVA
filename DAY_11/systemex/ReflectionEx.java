package systemex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			Class clazz = Class.forName("systemex.Car");
			
			System.out.println("[Ŭ���� �̸�]");
			System.out.println(clazz.getName());
			System.out.println();
			System.out.println("[������ ����]");
			
			Constructor[] cons = clazz.getDeclaredConstructors();
			for(Constructor con : cons) {
				System.out.print(con.getName() + "(");
				Class[] parameters = con.getParameterTypes();
				
				for(int i =0; i<parameters.length;i++) {
					System.out.print(parameters[i].getName());
					if(i<(parameters.length-1)) {
						System.out.print(",");
					}
				}
				System.out.println(")");
			}
			System.out.println();
			System.out.println("[�ʵ�����]");
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			
			System.out.println();
			System.out.println("[�޼ҵ� ����]");
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName() + "(");
				Class[] parameters = method.getParameterTypes();
				for(int i =0; i<parameters.length;i++) {
					System.out.print(parameters[i].getName());
					if(i<(parameters.length-1)) {
						System.out.print(",");
					}
				}
				System.out.println(")");
			}
			
	}

}
